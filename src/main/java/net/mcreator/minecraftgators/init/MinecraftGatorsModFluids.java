
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.minecraftgators.fluid.CatrealmsfluidFluid;
import net.mcreator.minecraftgators.MinecraftGatorsMod;

public class MinecraftGatorsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, MinecraftGatorsMod.MODID);
	public static final RegistryObject<Fluid> CATREALMSFLUID = REGISTRY.register("catrealmsfluid", () -> new CatrealmsfluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CATREALMSFLUID = REGISTRY.register("flowing_catrealmsfluid",
			() -> new CatrealmsfluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CATREALMSFLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CATREALMSFLUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
