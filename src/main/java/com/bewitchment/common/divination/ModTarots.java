package com.bewitchment.common.divination;

import com.bewitchment.api.capability.EnumInfusionType;
import com.bewitchment.api.capability.EnumTransformationType;
import com.bewitchment.api.divination.TarotHandler;
import com.bewitchment.common.core.capability.divination.CapabilityDivination;
import com.bewitchment.common.core.capability.energy.DummyIEnergy;
import com.bewitchment.common.core.capability.energy.EnergyHandler;
import com.bewitchment.common.core.capability.transformation.CapabilityTransformationData;
import com.bewitchment.common.divination.tarots.QuickTarot;

public class ModTarots {

	private ModTarots() {
	}

	public static void init() {
		TarotHandler.registerTarot(new QuickTarot("enderman", p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getType() == EnumInfusionType.END, null, null));
		TarotHandler.registerTarot(new QuickTarot("diamonds", p -> p.getCapability(CapabilityDivination.CAPABILITY, null).getFortune() != null, p -> p.getCapability(CapabilityDivination.CAPABILITY, null).getFortune().isNegative(), null));
		TarotHandler.registerTarot(new QuickTarot("iron_golem", p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getType() == EnumInfusionType.OVERWORLD, null, null));
		TarotHandler.registerTarot(new QuickTarot("wither_skeleton", p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getType() == EnumInfusionType.NETHER, null, null));
		TarotHandler.registerTarot(new QuickTarot("star", p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getType() == EnumInfusionType.DREAM, null, null));
		TarotHandler.registerTarot(new QuickTarot("nitwit", p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getMax() / 800 > 0, null, p -> EnergyHandler.getEnergy(p).orElse(DummyIEnergy.INSTANCE).getMax() / 800));
		TarotHandler.registerTarot(new QuickTarot("moon", p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getType() == EnumTransformationType.VAMPIRE || p.getCapability(CapabilityTransformationData.CAPABILITY, null).getType() == EnumTransformationType.WEREWOLF, p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getType() == EnumTransformationType.WEREWOLF, p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getLevel()));
		TarotHandler.registerTarot(new QuickTarot("silver_sword", p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getType() == EnumTransformationType.HUNTER, p -> false, p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getLevel()));
		TarotHandler.registerTarot(new QuickTarot("hermit", p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getType() == EnumTransformationType.SPECTRE, null, p -> p.getCapability(CapabilityTransformationData.CAPABILITY, null).getLevel()));
	}

}
