// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelwithering_tumor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "withering_tumor"), "main");
	private final ModelPart bone;
	private final ModelPart flower;

	public Modelwithering_tumor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.flower = this.bone.getChild("flower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -1.0F, 0.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-15.0F, -2.0F, 1.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-14.0F, -3.0F, 2.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(1, 46).addBox(-12.0F, -13.0F, 4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 41).addBox(-3.0F, -13.7F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 46).addBox(-4.0F, -9.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -15.0F, 8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition flower = bone.addOrReplaceChild("flower", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.426F, -27.2664F, 7.8721F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r2 = flower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 33).addBox(3.0433F, 2.2961F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6257F, -1.6339F, 0.1279F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r3 = flower.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2323F, -0.6504F, -1.9552F, 3.0262F, 0.8329F, 2.7328F));

		PartDefinition cube_r4 = flower.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2158F, 0.5206F, 1.9431F, 0.0898F, -0.5291F, -0.3687F));

		PartDefinition cube_r5 = flower.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2376F, -0.842F, 2.1438F, 0.1086F, 0.7752F, -0.2471F));

		PartDefinition cube_r6 = flower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1921F, 0.6992F, -2.6434F, 3.0159F, -0.9052F, 2.9174F));

		PartDefinition cube_r7 = flower.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3339F, 0.0385F, -3.3464F, 3.0107F, 0.0F, 2.7489F));

		PartDefinition cube_r8 = flower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 28).addBox(-1.449F, 0.0F, 0.5F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -0.1124F, 0.6279F, -0.1309F, 0.0F, -0.3927F));

		PartDefinition cube_r9 = flower.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 33).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0814F, 1.3064F, 0.1279F, 3.1416F, 0.0F, 2.6616F));

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