// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelwhirling_cryo_fungus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "whirling_cryo_fungus"), "main");
	private final ModelPart bone;
	private final ModelPart hat;

	public Modelwhirling_cryo_fungus(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hat = this.bone.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(29, 28).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(77, 33).addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 68).addBox(-2.0F, -15.0F, -4.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, 1.0F));

		PartDefinition hat = bone.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(48, 82).addBox(-9.0F, -18.0F, -11.0F, 20.0F, 3.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(56, 40).addBox(-8.0F, -20.0F, -10.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 112).addBox(-6.0F, -22.0F, -8.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(4, 97).addBox(-4.0F, -23.0F, -6.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(57, 14).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(57, 14).addBox(-15.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -18.5F, -10.0F, -1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}