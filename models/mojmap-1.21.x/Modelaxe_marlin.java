// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelaxe_marlin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "axe_marlin"), "main");
	private final ModelPart bone;

	public Modelaxe_marlin(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 38).addBox(-2.0F, 0.0F, -5.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-2.0F, 1.0F, -5.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(-2.0F, -4.0F, -5.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -5.0F, -5.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(41, 14).addBox(-1.0F, -6.0F, 6.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 11).addBox(-0.5F, -2.9142F, -0.0858F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.5F, -5.5F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -2.0F, -3.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 58).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, -2.0F, -3.0F, 0.0F, 0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}