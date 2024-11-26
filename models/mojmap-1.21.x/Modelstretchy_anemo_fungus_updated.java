// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelstretchy_anemo_fungus_updated<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stretchy_anemo_fungus_updated"), "main");
	private final ModelPart bone;
	private final ModelPart hat;

	public Modelstretchy_anemo_fungus_updated(ModelPart root) {
		this.bone = root.getChild("bone");
		this.hat = this.bone.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(112, 106).addBox(-1.0F, -18.0F, -1.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 24.0F, -1.0F));

		PartDefinition hat = bone.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(36, 45).addBox(-9.0F, -21.0F, -7.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(58, 68).addBox(-8.0F, -22.0F, -6.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(4, 75).addBox(-6.0F, -23.0F, -4.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, 0.0F));

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