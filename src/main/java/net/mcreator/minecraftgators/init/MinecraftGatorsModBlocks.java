
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftgators.block.RubyOreBlock;
import net.mcreator.minecraftgators.block.RubyBlockBlock;
import net.mcreator.minecraftgators.block.InfectedCatalystBlock;
import net.mcreator.minecraftgators.block.DustBlockBlock;
import net.mcreator.minecraftgators.block.CompressedcatjesusblockBlock;
import net.mcreator.minecraftgators.block.CompactedCatLitterBlock;
import net.mcreator.minecraftgators.block.Cat_Jesus_DustOreBlock;
import net.mcreator.minecraftgators.block.Cat_Jesus_DustBlockBlock;
import net.mcreator.minecraftgators.block.CatRealmsPortalBlock;
import net.mcreator.minecraftgators.block.CatNipPlantBlock;
import net.mcreator.minecraftgators.block.CatLog_yStairsBlock;
import net.mcreator.minecraftgators.block.CatLog_ySlabBlock;
import net.mcreator.minecraftgators.block.CatLog_yPressurePlateBlock;
import net.mcreator.minecraftgators.block.CatLog_yPlanksBlock;
import net.mcreator.minecraftgators.block.CatLog_yLogBlock;
import net.mcreator.minecraftgators.block.CatLog_yLeavesBlock;
import net.mcreator.minecraftgators.block.CatLog_yFenceGateBlock;
import net.mcreator.minecraftgators.block.CatLog_yFenceBlock;
import net.mcreator.minecraftgators.block.CatLog_yButtonBlock;
import net.mcreator.minecraftgators.block.CatLitterBlock;
import net.mcreator.minecraftgators.block.CatFoodBlockBlock;
import net.mcreator.minecraftgators.block.CatAlterBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftGatorsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CAT_FOOD_BLOCK = register(new CatFoodBlockBlock());
	public static final Block CAT_LOG_Y_LOG = register(new CatLog_yLogBlock());
	public static final Block CAT_LOG_Y_PLANKS = register(new CatLog_yPlanksBlock());
	public static final Block CAT_LOG_Y_LEAVES = register(new CatLog_yLeavesBlock());
	public static final Block CAT_LOG_Y_STAIRS = register(new CatLog_yStairsBlock());
	public static final Block CAT_LOG_Y_SLAB = register(new CatLog_ySlabBlock());
	public static final Block CAT_LOG_Y_FENCE = register(new CatLog_yFenceBlock());
	public static final Block CAT_LOG_Y_FENCE_GATE = register(new CatLog_yFenceGateBlock());
	public static final Block CAT_LOG_Y_PRESSURE_PLATE = register(new CatLog_yPressurePlateBlock());
	public static final Block CAT_LOG_Y_BUTTON = register(new CatLog_yButtonBlock());
	public static final Block RUBY_ORE = register(new RubyOreBlock());
	public static final Block RUBY_BLOCK = register(new RubyBlockBlock());
	public static final Block CAT_LITTER = register(new CatLitterBlock());
	public static final Block DUST_BLOCK = register(new DustBlockBlock());
	public static final Block CAT_NIP_PLANT = register(new CatNipPlantBlock());
	public static final Block COMPACTED_CAT_LITTER = register(new CompactedCatLitterBlock());
	public static final Block CAT_ALTER_BLOCK = register(new CatAlterBlockBlock());
	public static final Block CAT_JESUS_DUST_ORE = register(new Cat_Jesus_DustOreBlock());
	public static final Block CAT_JESUS_DUST_BLOCK = register(new Cat_Jesus_DustBlockBlock());
	public static final Block INFECTED_CATALYST = register(new InfectedCatalystBlock());
	public static final Block COMPRESSEDCATJESUSBLOCK = register(new CompressedcatjesusblockBlock());
	public static final Block CAT_REALMS_PORTAL = register(new CatRealmsPortalBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			CatNipPlantBlock.blockColorLoad(event);
		}
	}
}
