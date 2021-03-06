package com.bewitchment.common.divination.fortunes;

import com.bewitchment.api.divination.Fortune;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;

public class FortuneMeetZombie extends Fortune {

	public FortuneMeetZombie(int weight, String name, String modid) {
		super(weight, name, modid);
	}

	@Override
	public boolean canBeUsedFor(EntityPlayer player) {
		return true;
	}

	@Override
	public boolean canShouldBeAppliedNow(EntityPlayer player) {
		return player.getRNG().nextDouble() < 0.0001;
	}

	@Override
	public boolean apply(EntityPlayer player) {
		for (int i = 0; i < 10; i++) {
			BlockPos pos = new BlockPos(player.posX + player.getRNG().nextGaussian() * 4, player.posY, player.posZ + player.getRNG().nextGaussian() * 4);
			EntityZombie zombie = new EntityZombie(player.world);
			if (player.world.isAirBlock(pos) && player.world.isAirBlock(pos.up()) && player.world.getBlockState(pos.down()).canEntitySpawn(zombie)) {
				zombie.setPosition(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
				zombie.onInitialSpawn(player.world.getDifficultyForLocation(pos), null);
				player.world.spawnEntity(zombie);
				if (player.getRNG().nextBoolean() && player.getRNG().nextBoolean())
					zombie.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 900, 1));
				if (player.getRNG().nextBoolean() && player.getRNG().nextBoolean())
					zombie.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 900, 1));
				if (player.getRNG().nextBoolean() && player.getRNG().nextBoolean())
					zombie.addPotionEffect(new PotionEffect(MobEffects.SPEED, 900, 1));
				if (player.getRNG().nextBoolean() && player.getRNG().nextBoolean())
					zombie.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 900, 1));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isNegative() {
		return true;
	}

}
