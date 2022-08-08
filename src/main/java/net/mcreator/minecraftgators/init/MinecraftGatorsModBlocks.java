
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecraftgators.block.WetCatLitterBlock;
import net.mcreator.minecraftgators.block.RubyOreBlock;
import net.mcreator.minecraftgators.block.RubyBlockBlock;
import net.mcreator.minecraftgators.block.InfectedCatalystBlock;
import net.mcreator.minecraftgators.block.DustBlockBlock;
import net.mcreator.minecraftgators.block.CompressedcatjesusblockBlock;
import net.mcreator.minecraftgators.block.CompactedCatLitterBlock;
import net.mcreator.minecraftgators.block.CatrealmsfluidBlock;
import net.mcreator.minecraftgators.block.Cat_Jesus_DustOreBlock;
import net.mcreator.minecraftgators.block.Cat_Jesus_DustBlockBlock;
import net.mcreator.minecraftgators.block.Cat_CoalBlockBlock;
import net.mcreator.minecraftgators.block.CatStoneBlock;
import net.mcreator.minecraftgators.block.CatShitBlock;
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
import net.mcreator.minecraftgators.block.CatDirtBlock;
import net.mcreator.minecraftgators.block.CatCoalOreBlock;
import net.mcreator.minecraftgators.block.CatAlterBlockBlock;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

public class MinecraftGatorsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftGatorsMod.MODID);
	public static final RegistryObject<Block> CAT_FOOD_BLOCK = REGISTRY.register("cat_food_block", () -> new CatFoodBlockBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_LOG = REGISTRY.register("cat_log_y_log", () -> new CatLog_yLogBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_PLANKS = REGISTRY.register("cat_log_y_planks", () -> new CatLog_yPlanksBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_LEAVES = REGISTRY.register("cat_log_y_leaves", () -> new CatLog_yLeavesBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_STAIRS = REGISTRY.register("cat_log_y_stairs", () -> new CatLog_yStairsBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_SLAB = REGISTRY.register("cat_log_y_slab", () -> new CatLog_ySlabBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_FENCE = REGISTRY.register("cat_log_y_fence", () -> new CatLog_yFenceBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_FENCE_GATE = REGISTRY.register("cat_log_y_fence_gate", () -> new CatLog_yFenceGateBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_PRESSURE_PLATE = REGISTRY.register("cat_log_y_pressure_plate",
			() -> new CatLog_yPressurePlateBlock());
	public static final RegistryObject<Block> CAT_LOG_Y_BUTTON = REGISTRY.register("cat_log_y_button", () -> new CatLog_yButtonBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> CAT_LITTER = REGISTRY.register("cat_litter", () -> new CatLitterBlock());
	public static final RegistryObject<Block> DUST_BLOCK = REGISTRY.register("dust_block", () -> new DustBlockBlock());
	public static final RegistryObject<Block> CAT_NIP_PLANT = REGISTRY.register("cat_nip_plant", () -> new CatNipPlantBlock());
	public static final RegistryObject<Block> COMPACTED_CAT_LITTER = REGISTRY.register("compacted_cat_litter", () -> new CompactedCatLitterBlock());
	public static final RegistryObject<Block> CAT_ALTER_BLOCK = REGISTRY.register("cat_alter_block", () -> new CatAlterBlockBlock());
	public static final RegistryObject<Block> CAT_JESUS_DUST_ORE = REGISTRY.register("cat_jesus_dust_ore", () -> new Cat_Jesus_DustOreBlock());
	public static final RegistryObject<Block> CAT_JESUS_DUST_BLOCK = REGISTRY.register("cat_jesus_dust_block", () -> new Cat_Jesus_DustBlockBlock());
	public static final RegistryObject<Block> INFECTED_CATALYST = REGISTRY.register("infected_catalyst", () -> new InfectedCatalystBlock());
	public static final RegistryObject<Block> COMPRESSEDCATJESUSBLOCK = REGISTRY.register("compressedcatjesusblock",
			() -> new CompressedcatjesusblockBlock());
	public static final RegistryObject<Block> CAT_REALMS_PORTAL = REGISTRY.register("cat_realms_portal", () -> new CatRealmsPortalBlock());
	public static final RegistryObject<Block> CAT_DIRT = REGISTRY.register("cat_dirt", () -> new CatDirtBlock());
	public static final RegistryObject<Block> CAT_POOP = REGISTRY.register("cat_poop", () -> new CatShitBlock());
	public static final RegistryObject<Block> WET_CAT_LITTER = REGISTRY.register("wet_cat_litter", () -> new WetCatLitterBlock());
	public static final RegistryObject<Block> CATREALMSFLUID = REGISTRY.register("catrealmsfluid", () -> new CatrealmsfluidBlock());
	public static final RegistryObject<Block> CAT_COAL_BLOCK = REGISTRY.register("cat_coal_block", () -> new Cat_CoalBlockBlock());
	public static final RegistryObject<Block> CAT_STONE = REGISTRY.register("cat_stone", () -> new CatStoneBlock());
	public static final RegistryObject<Block> CAT_COAL_ORE = REGISTRY.register("cat_coal_ore", () -> new CatCoalOreBlock());

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
