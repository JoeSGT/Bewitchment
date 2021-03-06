package com.bewitchment.common.block;

import com.bewitchment.common.block.decorations.*;
import com.bewitchment.common.block.magic.BlockSaltBarrier;
import com.bewitchment.common.block.magic.plants.BlockEmberGrass;
import com.bewitchment.common.block.magic.plants.BlockRagingGrass;
import com.bewitchment.common.block.magic.plants.BlockTorchwood;
import com.bewitchment.common.block.misc.BlockGoblet;
import com.bewitchment.common.block.natural.BlockBeehive;
import com.bewitchment.common.block.natural.BlockGemOre;
import com.bewitchment.common.block.natural.BlockSaltOre;
import com.bewitchment.common.block.natural.BlockSilverOre;
import com.bewitchment.common.block.natural.crop.*;
import com.bewitchment.common.block.natural.fluid.Fluids;
import com.bewitchment.common.block.natural.plants.BlockMoonbell;
import com.bewitchment.common.block.natural.tree.BlockModLeaves;
import com.bewitchment.common.block.natural.tree.BlockModLog;
import com.bewitchment.common.block.natural.tree.BlockModSapling;
import com.bewitchment.common.block.natural.tree.BlockPlanks;
import com.bewitchment.common.block.tools.*;
import com.bewitchment.common.crafting.VanillaCrafting;
import com.bewitchment.common.lib.LibBlockName;
import com.bewitchment.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * This class was created by <Arekkuusu> on 26/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
@ObjectHolder(LibMod.MOD_ID)
public final class ModBlocks {

	//Todo: Add new gemstone blocks, and meta the existing ones.

	public static final BlockCrop crop_aconitum = null;
	public static final BlockCrop crop_asphodel = null;
	public static final BlockCrop crop_belladonna = null;
	public static final BlockCrop crop_ginger = null;
	public static final BlockCrop crop_kelp = null;
	public static final BlockCrop crop_mint = null;
	public static final BlockCrop crop_white_sage = null;
	public static final BlockCrop crop_mandrake_root = null;
	public static final BlockCrop crop_lavender = null;
	public static final BlockCrop crop_thistle = null;
	public static final BlockCrop crop_tulsi = null;
	public static final BlockCrop crop_kenaf = null;
	public static final BlockCrop crop_silphium = null;
	public static final BlockCrop crop_garlic = null;
	public static final BlockCrop crop_wormwood = null;
	public static final BlockCrop crop_hellebore = null;
	private static Block PLACE_HOLDER = new Block(Material.AIR);
	//--------------------------------Blocks--------------------------------//
	public static final Block silver_block = PLACE_HOLDER;
	public static final Block silver_ore = PLACE_HOLDER;
	public static final Block moldavite_block = PLACE_HOLDER;
	public static final Block coquina = PLACE_HOLDER;
	public static final Block bloodstone_block = PLACE_HOLDER;
	public static final Block tourmaline_block = PLACE_HOLDER;
	public static final Block malachite_block = PLACE_HOLDER;
	public static final Block tigers_eye_block = PLACE_HOLDER;
	public static final Block nuummite_block = PLACE_HOLDER;
	public static final Block alexandrite_block = PLACE_HOLDER;
	public static final Block jasper_block = PLACE_HOLDER;
	public static final Block amethyst_block = PLACE_HOLDER;
	public static final Block garnet_block = PLACE_HOLDER;
	public static final Block cauldron = PLACE_HOLDER;
	public static final Block candle_medium = PLACE_HOLDER;
	public static final Block candle_small = PLACE_HOLDER;
	public static final Block candle_medium_lit = PLACE_HOLDER;
	public static final Block candle_small_lit = PLACE_HOLDER;
	public static final Block salt_barrier = PLACE_HOLDER;
	public static final Block beehive = PLACE_HOLDER;
	public static final Block oven = PLACE_HOLDER;
	public static final Block apiary = PLACE_HOLDER;
	public static final Block salt_ore = PLACE_HOLDER;
	public static final Block gem_ore = PLACE_HOLDER;
	public static final Block nethersteel = PLACE_HOLDER;
	public static final Block fake_ice = PLACE_HOLDER;
	public static final Block fake_ice_fence = PLACE_HOLDER;
	public static final Block fake_ice_stairs = PLACE_HOLDER;
	public static final Block fake_ice_slab_half = PLACE_HOLDER;
	public static final Block fake_ice_slab_double = PLACE_HOLDER;
	public static final Block scorned_brick_stairs = PLACE_HOLDER;
	public static final Block torchwood = PLACE_HOLDER;
	public static final Block ember_grass = PLACE_HOLDER;
	public static final Block raging_grass = PLACE_HOLDER;
	public static final Block log_elder = PLACE_HOLDER;
	public static final Block log_juniper = PLACE_HOLDER;
	public static final Block log_yew = PLACE_HOLDER;
	public static final Block log_cypress = PLACE_HOLDER;
	public static final Block leaves_elder = PLACE_HOLDER;
	public static final Block leaves_juniper = PLACE_HOLDER;
	public static final Block leaves_yew = PLACE_HOLDER;
	public static final Block leaves_cypress = PLACE_HOLDER;
	public static final Block planks_elder = PLACE_HOLDER;
	public static final Block planks_juniper = PLACE_HOLDER;
	public static final Block planks_yew = PLACE_HOLDER;
	public static final Block planks_cypress = PLACE_HOLDER;
	public static final Block sapling = PLACE_HOLDER;
	public static final Block moonbell = PLACE_HOLDER;
	public static final Block witch_altar = PLACE_HOLDER;
	public static final Block thread_spinner = PLACE_HOLDER;
	public static final Block barrel = PLACE_HOLDER;
	public static final Block ritual_glyphs = PLACE_HOLDER;
	public static final Block crystal_ball = PLACE_HOLDER;
	public static final Block embittered_bricks = PLACE_HOLDER;
	public static final Block scorned_bricks = PLACE_HOLDER;
	public static final Block scorned_brick_fence = PLACE_HOLDER;
	public static final Block goblet = PLACE_HOLDER;
	public static final Block tarot_table = PLACE_HOLDER;

	private static Block STAIRS_ICE = new Block(Material.ICE);
	private static Block STAIRS_SCORNED_BRICK = new Block(Material.ROCK);

	private ModBlocks() {

	}

	public static void register(final IForgeRegistry<Block> registry) {
		for (final IFluidBlock fluidBlock : Fluids.MOD_FLUID_BLOCKS) {
			registry.register((Block) fluidBlock);
		}
		//Crops
		registry.registerAll(
				new BlockCrop(LibBlockName.CROP_ACONITUM),
				new BlockCrop(LibBlockName.CROP_ASPHODEL),
				new BlockCrop(LibBlockName.CROP_GINGER),
				new BlockCrop(LibBlockName.CROP_WHITE_SAGE),
				new BlockCrop(LibBlockName.CROP_MANDRAKE),
				new BlockCrop(LibBlockName.CROP_LAVENDER),
				new BlockCrop(LibBlockName.CROP_TULSI),
				new BlockCrop(LibBlockName.CROP_GARLIC),
				new BlockCrop(LibBlockName.CROP_HELLEBORE),
				new CropWormwood(),
				new CropSilphium(),
				new CropKenaf(),
				new CropThistle(),
				new CropKelp(),
				new CropBelladonna(),
				new CropMint(),
				new BlockMoonbell()
		);
		//Ore
		registry.register(new BlockSilverOre());
		registry.register(new BlockSaltOre());
		registry.register(new BlockGemOre());
		//Tool Blocks
		registry.registerAll(
				new BlockCauldron(),
				new BlockOven(),
				new BlockCandleMedium(LibBlockName.CANDLE_MEDIUM, false),
				new BlockCandleSmall(LibBlockName.CANDLE_SMALL, false),
				new BlockCandleMedium(LibBlockName.CANDLE_MEDIUM_LIT, true),
				new BlockCandleSmall(LibBlockName.CANDLE_SMALL_LIT, true),
				new BlockSaltBarrier(),
				new BlockApiary(),
				new BlockTorchwood(),
				new BlockEmberGrass(),
				new BlockRagingGrass(),
				new BlockFakeIce(),
				new BlockFakeIceFence(),
				new BlockScornedBrickFence(),
				new BlockFakeIceStairs("fake_ice_stairs", STAIRS_ICE.getDefaultState(), Material.ICE),
				new BlockScornedBrickStairs("scorned_brick_stairs", STAIRS_SCORNED_BRICK.getDefaultState(), Material.ROCK),
				new BlockFakeIceSlabDouble("fake_ice_slab_double"),
				new BlockFakeIceSlabHalf("fake_ice_slab_half"),
				new BlockBeehive(),
				new BlockWitchAltar(LibBlockName.WITCH_ALTAR, Material.ROCK),
				new BlockThreadSpinner(LibBlockName.THREAD_SPINNER),
				new BlockBarrel(LibBlockName.BARREL),
				new BlockCircleGlyph(LibBlockName.GLYPHS),
				new BlockCrystalBall(LibBlockName.CRYSTAL_BALL),
				new BlockGoblet(LibBlockName.GOBLET),
				new BlockTarotTable()
		);
		//Normal Blocks
		registry.registerAll(
				new BlockMod(LibBlockName.MOLDAVITE_BLOCK, Material.ROCK).setSound(SoundType.GLASS).setHardness(5.0F),
				new BlockMod(LibBlockName.SILVER_BLOCK, Material.IRON).setSound(SoundType.METAL).setHardness(5.0F),
				new BlockMod(LibBlockName.NETHERSTEEL, Material.IRON).setSound(SoundType.METAL).setHardness(5.0F),
				new BlockMod(LibBlockName.TOURMALINE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.BLOODSTONE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.MALACHITE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.TIGERS_EYE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.NUUMMITE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.ALEXANDRITE_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.JASPER_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.AMETHYST_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.GARNET_BLOCK, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.COQUINA, Material.ROCK).setHardness(5.0F),
				new BlockMod(LibBlockName.EMBITTERED_BRICKS, Material.ROCK).setSound(SoundType.STONE).setHardness(5.0F),
				new BlockMod(LibBlockName.SCORNED_BRICKS, Material.ROCK).setSound(SoundType.STONE).setHardness(5.0F)
		);

		//Trees
		registry.registerAll(
				new BlockModLog(LibBlockName.LOG_ELDER),
				new BlockModLog(LibBlockName.LOG_JUNIPER),
				new BlockModLog(LibBlockName.LOG_YEW),
				new BlockModLog(LibBlockName.LOG_CYPRESS),
				new BlockModLeaves(LibBlockName.LEAVES_ELDER),
				new BlockModLeaves(LibBlockName.LEAVES_JUNIPER),
				new BlockModLeaves(LibBlockName.LEAVES_YEW),
				new BlockModLeaves(LibBlockName.LEAVES_CYPRESS),
				new BlockPlanks(LibBlockName.PLANKS_ELDER),
				new BlockPlanks(LibBlockName.PLANKS_JUNIPER),
				new BlockPlanks(LibBlockName.PLANKS_YEW),
				new BlockPlanks(LibBlockName.PLANKS_CYPRESS),
				new BlockModSapling(LibBlockName.SAPLING)
		);
	}

	public static void init() {
		VanillaCrafting.blocks();
		initOreDictionary();
	}

	private static void initOreDictionary() {
		//Crystals, Minerals, and Metals
		OreDictionary.registerOre("coquina", new ItemStack(ModBlocks.coquina));
		OreDictionary.registerOre("limestone", new ItemStack(ModBlocks.coquina));
		OreDictionary.registerOre("blockSilver", new ItemStack(ModBlocks.silver_block));
		OreDictionary.registerOre("blockMoldavite", new ItemStack(ModBlocks.moldavite_block));
		OreDictionary.registerOre("blockBloodstone", new ItemStack(ModBlocks.bloodstone_block));
		OreDictionary.registerOre("oreGarnet", new ItemStack(ModBlocks.gem_ore, 1, 0));
		OreDictionary.registerOre("oreNuummite", new ItemStack(ModBlocks.gem_ore, 1, 2));
		OreDictionary.registerOre("oreAmethyst", new ItemStack(ModBlocks.gem_ore, 1, 8));
		OreDictionary.registerOre("oreAlexandrite", new ItemStack(ModBlocks.gem_ore, 1, 9));
		OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.silver_ore));
		OreDictionary.registerOre("oreMoldavite", new ItemStack(ModBlocks.gem_ore, 1, 1));
		OreDictionary.registerOre("oreBloodstone", new ItemStack(ModBlocks.gem_ore, 1, 5));
		OreDictionary.registerOre("oreTourmaline", new ItemStack(ModBlocks.gem_ore, 1, 4));
		OreDictionary.registerOre("oreMalachite", new ItemStack(ModBlocks.gem_ore, 1, 7));
		OreDictionary.registerOre("oreTigersEye", new ItemStack(ModBlocks.gem_ore, 1, 3));
		OreDictionary.registerOre("oreJasper", new ItemStack(ModBlocks.gem_ore, 1, 6));
		OreDictionary.registerOre("blockNethersteel", new ItemStack(ModBlocks.nethersteel));
		OreDictionary.registerOre("oreSalt", new ItemStack(ModBlocks.salt_ore));
		OreDictionary.registerOre("blockTourmaline", new ItemStack(ModBlocks.tourmaline_block));
		//Candles
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 0));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 1));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 2));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 3));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 4));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 5));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 6));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 7));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 8));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 9));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 10));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 11));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 12));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 13));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 14));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_small, 1, 15));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 0));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 1));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 2));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 3));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 4));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 5));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 6));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 7));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 8));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 9));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 10));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 11));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 12));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 13));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 14));
		OreDictionary.registerOre("blockCandle", new ItemStack(ModBlocks.candle_medium, 1, 15));

		//Wool oredicts, used for coloring brews
		OreDictionary.registerOre("blockWoolWHITE", new ItemStack(Blocks.WOOL, 1, 0));
		OreDictionary.registerOre("blockWoolORANGE", new ItemStack(Blocks.WOOL, 1, 1));
		OreDictionary.registerOre("blockWoolMAGENTA", new ItemStack(Blocks.WOOL, 1, 2));
		OreDictionary.registerOre("blockWoolLIGHT_BLUE", new ItemStack(Blocks.WOOL, 1, 3));
		OreDictionary.registerOre("blockWoolYELLOW", new ItemStack(Blocks.WOOL, 1, 4));
		OreDictionary.registerOre("blockWoolLIME", new ItemStack(Blocks.WOOL, 1, 5));
		OreDictionary.registerOre("blockWoolPINK", new ItemStack(Blocks.WOOL, 1, 6));
		OreDictionary.registerOre("blockWoolGRAY", new ItemStack(Blocks.WOOL, 1, 7));
		OreDictionary.registerOre("blockWoolSILVER", new ItemStack(Blocks.WOOL, 1, 8));
		OreDictionary.registerOre("blockWoolCYAN", new ItemStack(Blocks.WOOL, 1, 9));
		OreDictionary.registerOre("blockWoolPURPLE", new ItemStack(Blocks.WOOL, 1, 10));
		OreDictionary.registerOre("blockWoolBLUE", new ItemStack(Blocks.WOOL, 1, 11));
		OreDictionary.registerOre("blockWoolBROWN", new ItemStack(Blocks.WOOL, 1, 12));
		OreDictionary.registerOre("blockWoolGREEN", new ItemStack(Blocks.WOOL, 1, 13));
		OreDictionary.registerOre("blockWoolRED", new ItemStack(Blocks.WOOL, 1, 14));
		OreDictionary.registerOre("blockWoolBLACK", new ItemStack(Blocks.WOOL, 1, 15));

		//Imported oredicts
		OreDictionary.registerOre("logWood", ModBlocks.log_elder);
		OreDictionary.registerOre("logWood", ModBlocks.log_juniper);
		OreDictionary.registerOre("logWood", ModBlocks.log_yew);
		OreDictionary.registerOre("logWood", ModBlocks.log_cypress);
		OreDictionary.registerOre("plankWood", ModBlocks.planks_elder);
		OreDictionary.registerOre("plankWood", ModBlocks.planks_juniper);
		OreDictionary.registerOre("plankWood", ModBlocks.planks_yew);
		OreDictionary.registerOre("plankWood", ModBlocks.planks_cypress);
		OreDictionary.registerOre("treeLeaves", ModBlocks.leaves_elder);
		OreDictionary.registerOre("treeLeaves", ModBlocks.leaves_juniper);
		OreDictionary.registerOre("treeLeaves", ModBlocks.leaves_yew);
		OreDictionary.registerOre("treeLeaves", ModBlocks.leaves_cypress);
		OreDictionary.registerOre("treeSapling", ModBlocks.sapling);
	}
}
