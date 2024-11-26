// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelfrozen_soul<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "frozen_soul"), "main");
	private final ModelPart flower;
	private final ModelPart bb_main;

	public Modelfrozen_soul(ModelPart root) {
		this.flower = root.getChild("flower");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition flower = partdefinition.addOrReplaceChild("flower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.4197F, -4.0462F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r1 = flower.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, -1.0036F));

		PartDefinition cube_r2 = flower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, -2.0944F));

		PartDefinition cube_r3 = flower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, 2.0944F));

		PartDefinition cube_r4 = flower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = flower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = flower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0995F, -0.45F, -0.1745F, 0.0F, 1.0036F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -14.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -34.0774F, 1.5F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -33.0774F, 6.5F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-4.99F, -13.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		flower.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}