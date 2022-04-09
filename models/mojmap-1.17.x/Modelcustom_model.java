// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart nyancat;

	public Modelcustom_model(ModelPart root) {
		this.nyancat = root.getChild("nyancat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition nyancat = partdefinition.addOrReplaceChild("nyancat",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -7.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, 7.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = nyancat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -9.5F, 6.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -9.5F, -8.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -7.5F, 0.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition cube_r2 = nyancat.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -8.5F, 9.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -8.5F, -5.5F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -7.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		nyancat.render(poseStack, buffer, packedLight, packedOverlay);
	}
}