
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftgators.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.minecraftgators.client.renderer.StormFollowerRenderer;
import net.mcreator.minecraftgators.client.renderer.BlazeKingRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftGatorsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftGatorsModEntities.BLAZE_KING.get(), BlazeKingRenderer::new);
		event.registerEntityRenderer(MinecraftGatorsModEntities.BLAZE_KING_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftGatorsModEntities.STORM_FOLLOWER.get(), StormFollowerRenderer::new);
		event.registerEntityRenderer(MinecraftGatorsModEntities.STORM_FOLLOWER_MINI_CROSSBOW.get(), ThrownItemRenderer::new);
	}
}
