// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelruin_drake_skywatch<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ruin_drake_skywatch"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart tail;

	public Modelruin_drake_skywatch(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.left_wing = this.bone.getChild("left_wing");
		this.right_wing = this.bone.getChild("right_wing");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
		this.tail = this.bone.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(48, 46).addBox(-10.0F, -10.0F, -14.0F, 20.0F, 10.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-13.0F, -32.0F, -14.0F, 26.0F, 22.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 8.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 88).addBox(-6.0033F, -9.8083F, -20.2854F, 12.0F, 14.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(1.9967F, -17.8083F, -17.2854F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(-5.0033F, -17.8083F, -17.2854F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(-6.0033F, -17.8083F, -8.2854F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(2.9967F, -17.8083F, -8.2854F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0033F, -24.265F, -10.5589F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(199, 98).addBox(-1.0F, 12.2F, -18.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(199, 98).addBox(-1.0F, 3.2F, -18.6F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(153, 143).addBox(-7.0F, 9.2F, -18.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(153, 143).addBox(3.0F, 9.2F, -18.6F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 80).addBox(-6.0F, 4.2F, -17.6F, 12.0F, 13.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0167F, -12.0083F, -24.2854F, 0.5672F, 0.0F, 0.0F));

		PartDefinition left_wing = bone.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 120).addBox(-12.622F, -4.7541F, -3.9306F, 12.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5402F, -33.5393F, -0.0694F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r2 = left_wing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(100, 23).addBox(-0.3397F, 0.1962F, -3.0F, 36.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.3637F, 6.21F, 1.0694F, 0.5672F, 0.0F, 1.3963F));

		PartDefinition cube_r3 = left_wing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 80).addBox(-0.3397F, -0.8038F, -3.0F, 30.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.3637F, 6.21F, 1.0694F, 0.481F, 0.3133F, 0.8628F));

		PartDefinition cube_r4 = left_wing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.622F, 2.2459F, 1.0694F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_wing = bone.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 120).addBox(-12.6904F, -5.2961F, -6.0694F, 12.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.8498F, -34.3858F, 4.0008F, 3.1416F, 0.0F, 2.1817F));

		PartDefinition cube_r5 = right_wing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, 80).addBox(-0.3397F, -0.8038F, -3.0F, 30.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.432F, 5.668F, -1.0694F, -0.481F, -0.3133F, 0.8628F));

		PartDefinition cube_r6 = right_wing.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 23).addBox(-0.3397F, 0.1962F, -3.0F, 36.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.432F, 5.668F, -1.0694F, -0.5672F, 0.0F, 1.3963F));

		PartDefinition cube_r7 = right_wing.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.6904F, 1.7039F, -1.0694F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(112, 44).addBox(-5.01F, 4.421F, -6.9969F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-2.99F, 27.5417F, -6.9969F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(124, 103).addBox(-4.99F, 31.5417F, -8.9969F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(15.01F, -14.421F, -3.0031F));

		PartDefinition cube_r8 = right_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 46).addBox(-3.0F, 0.0F, -6.0F, 5.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 16.421F, 3.0031F, -0.3054F, 0.0F, 0.0F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(112, 44).addBox(-4.01F, 4.421F, -6.9969F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-1.99F, 27.5417F, -6.9969F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(124, 103).addBox(-3.99F, 31.5417F, -8.9969F, 9.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.99F, -14.421F, -3.0031F));

		PartDefinition cube_r9 = left_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -6.0F, 5.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 16.421F, 3.0031F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = bone.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 46).addBox(-2.75F, -3.0F, 0.25F, 6.0F, 6.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -5.0F, 7.75F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(76, 0).addBox(-10.5F, -1.0F, -0.5F, 21.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.0F, 35.75F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}