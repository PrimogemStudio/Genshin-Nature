// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelchilde<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "childe"), "main");
	private final ModelPart bone2;
	private final ModelPart ANIM_HEAD;
	private final ModelPart Body3;
	private final ModelPart ANIM_RIGHT_ARM;
	private final ModelPart ANIM_LEFT_ARM;
	private final ModelPart ANIM_RIGHT_LEG;
	private final ModelPart ANIM_LEFT_LEG;

	public Modelchilde(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.ANIM_HEAD = this.bone2.getChild("ANIM_HEAD");
		this.Body3 = this.bone2.getChild("Body3");
		this.ANIM_RIGHT_ARM = this.bone2.getChild("ANIM_RIGHT_ARM");
		this.ANIM_LEFT_ARM = this.bone2.getChild("ANIM_LEFT_ARM");
		this.ANIM_RIGHT_LEG = this.bone2.getChild("ANIM_RIGHT_LEG");
		this.ANIM_LEFT_LEG = this.bone2.getChild("ANIM_LEFT_LEG");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-2.0F, 24.0F, 0.0F));

		PartDefinition ANIM_HEAD = bone2.addOrReplaceChild("ANIM_HEAD", CubeListBuilder.create().texOffs(32, 43).addBox(-4.0805F, -8.1359F, -4.0428F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 27).addBox(-4.2239F, -8.1308F, -4.2198F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
		.texOffs(32, 26).addBox(4.3261F, -18.0249F, 0.4668F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 26).addBox(-4.1739F, -18.0249F, 0.4668F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9739F, -24.1192F, 0.4698F));

		PartDefinition cube_r1 = ANIM_HEAD.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 26).addBox(0.05F, -3.75F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 26).addBox(8.55F, -3.75F, -0.5F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2239F, -8.1308F, -0.9698F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Body3 = bone2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(0, 54).addBox(-3.9094F, -11.3735F, -0.2623F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(24, 59).addBox(-3.4094F, -5.3735F, -0.2623F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9094F, -12.6265F, -1.7377F));

		PartDefinition cube_r2 = Body3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 69).addBox(-1.75F, 0.0F, 1.5F, 3.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6594F, -1.8735F, -1.2623F, -0.2618F, 0.4363F, 0.0F));

		PartDefinition cube_r3 = Body3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 64).addBox(-1.75F, 0.0F, 1.5F, 3.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8406F, -1.8735F, -1.2623F, -0.2618F, -0.4363F, 0.0F));

		PartDefinition cube_r4 = Body3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 43).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0906F, 2.1265F, -0.7623F, -0.1745F, 0.0F, 0.0F));

		PartDefinition ANIM_RIGHT_ARM = bone2.addOrReplaceChild("ANIM_RIGHT_ARM", CubeListBuilder.create().texOffs(58, 65).addBox(-2.7031F, -0.2348F, -2.3789F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.446F, -22.9466F, 0.3784F, 0.0001F, 0.0004F, 0.2899F));

		PartDefinition RightArmLayer_r1 = ANIM_RIGHT_ARM.addOrReplaceChild("RightArmLayer_r1", CubeListBuilder.create().texOffs(63, 10).addBox(-1.9934F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7031F, 4.7652F, -0.1102F, -0.5236F, 0.0F, 0.0F));

		PartDefinition ANIM_LEFT_ARM = bone2.addOrReplaceChild("ANIM_LEFT_ARM", CubeListBuilder.create().texOffs(64, 0).addBox(-0.2698F, -0.0006F, -1.5021F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2608F, -24.0693F, -0.4979F, 0.0F, 0.0F, -0.2618F));

		PartDefinition LeftArmLayer_r1 = ANIM_LEFT_ARM.addOrReplaceChild("LeftArmLayer_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0873F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7302F, 8.0057F, -0.4979F, -0.3927F, 0.0F, 0.0F));

		PartDefinition ANIM_RIGHT_LEG = bone2.addOrReplaceChild("ANIM_RIGHT_LEG", CubeListBuilder.create().texOffs(61, 55).addBox(-2.0F, 0.6312F, -1.4316F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -12.6312F, -0.4204F, -0.2214F, 0.1704F, -0.0381F));

		PartDefinition RightLegLayer_r1 = ANIM_RIGHT_LEG.addOrReplaceChild("RightLegLayer_r1", CubeListBuilder.create().texOffs(60, 39).addBox(-1.99F, -0.5092F, 0.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1404F, -1.2723F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ANIM_LEFT_LEG = bone2.addOrReplaceChild("ANIM_LEFT_LEG", CubeListBuilder.create().texOffs(60, 23).addBox(-2.007F, 0.1308F, -1.1454F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -12.2757F, -0.5174F, -0.0707F, -0.3737F, -0.0075F));

		PartDefinition LeftLegLayer_r1 = ANIM_LEFT_LEG.addOrReplaceChild("LeftLegLayer_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-1.99F, 0.0F, 0.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.007F, 6.1308F, -1.1454F, 0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}