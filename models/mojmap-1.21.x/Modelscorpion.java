// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelscorpion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "scorpion"), "main");
	private final ModelPart bone;
	private final ModelPart right_arm;
	private final ModelPart left_arm2;
	private final ModelPart bone3;
	private final ModelPart bone2;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart right_leg2;
	private final ModelPart left_leg2;
	private final ModelPart tail;

	public Modelscorpion(ModelPart root) {
		this.bone = root.getChild("bone");
		this.right_arm = this.bone.getChild("right_arm");
		this.left_arm2 = this.bone.getChild("left_arm2");
		this.bone3 = this.bone.getChild("bone3");
		this.bone2 = this.bone.getChild("bone2");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_leg = this.bone.getChild("right_leg");
		this.right_leg2 = this.bone.getChild("right_leg2");
		this.left_leg2 = this.bone.getChild("left_leg2");
		this.tail = this.bone.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(27, 0).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-0.2512F, -0.7265F, -0.3039F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 51).addBox(3.7488F, -0.7265F, -6.3039F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(48, 40).addBox(2.7488F, -3.7265F, -7.3039F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(3.2488F, -2.7265F, -8.3039F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 1).addBox(3.7488F, -1.7265F, -9.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 24).addBox(3.2488F, -2.7265F, -2.3039F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 49).addBox(3.7488F, -1.7265F, -1.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.2512F, -0.2735F, -3.6961F));

		PartDefinition cube_r1 = right_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 10).addBox(-0.49F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2488F, 0.7735F, -4.8039F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm2 = bone.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(0, 28).addBox(-4.7512F, -0.7265F, -0.3039F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 51).addBox(-4.7512F, -0.7265F, -6.3039F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(48, 40).addBox(-5.7512F, -3.7265F, -7.3039F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-5.2512F, -2.7265F, -8.3039F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 1).addBox(-4.7512F, -1.7265F, -9.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 24).addBox(-5.2512F, -2.7265F, -2.3039F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 49).addBox(-4.7512F, -1.7265F, -1.3039F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.2488F, -0.2735F, -3.6961F));

		PartDefinition cube_r2 = left_arm2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 10).addBox(-0.49F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2512F, 0.7735F, -4.8039F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.5F, -5.5F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(2.5F, -0.5F, -5.5F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(24, 26).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, 3.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_leg2 = bone.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(24, 26).mirror().addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, -1.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition left_leg2 = bone.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(24, 26).mirror().addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, 3.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition tail = bone.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(28, 50).addBox(-2.99F, -1.0F, -1.5F, 6.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 6.5F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(7.0F, -2.0F, -3.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.99F, -8.5711F, 12.9853F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(40, 29).addBox(-2.99F, -2.0503F, -0.3787F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9497F, 14.0355F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 57).addBox(-3.01F, -2.0F, -1.5F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.0F, 11.5F, 0.7854F, 0.0F, 0.0F));

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