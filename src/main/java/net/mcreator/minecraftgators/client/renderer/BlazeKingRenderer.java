package net.mcreator.minecraftgators.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.minecraftgators.entity.BlazeKingEntity;

public class BlazeKingRenderer extends HumanoidMobRenderer<BlazeKingEntity, HumanoidModel<BlazeKingEntity>> {
	public BlazeKingRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(BlazeKingEntity entity) {
		return new ResourceLocation("minecraft_gators:textures/2021_12_08_blaze-king-19483264.png");
	}
}
