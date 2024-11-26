// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelscarab_ball<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "scarab_ball"), "main");
	private final ModelPart bone2;
	private final ModelPart ball;
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart ANIM_LEFT_LEG;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg5;
	private final ModelPart ANIM_RIGHT_LEG;

	public Modelscarab_ball(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.ball = this.bone2.getChild("ball");
		this.bone = this.bone2.getChild("bone");
		this.head = this.bone.getChild("head");
		this.ANIM_LEFT_LEG = this.bone.getChild("ANIM_LEFT_LEG");
		this.leg2 = this.bone.getChild("leg2");
		this.leg3 = this.bone.getChild("leg3");
		this.leg4 = this.bone.getChild("leg4");
		this.leg5 = this.bone.getChild("leg5");
		this.ANIM_RIGHT_LEG = this.bone.getChild("ANIM_RIGHT_LEG");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -5.0F));

		PartDefinition ball = bone2.addOrReplaceChild("ball", CubeListBuilder.create().texOffs(30, 28).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 8.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(40, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 3.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, -1.8461F, -2.2917F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8461F, -2.7083F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 50).addBox(-2.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 50).addBox(1.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 62).addBox(0.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 62).addBox(-2.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 59).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8461F, -1.7917F, 0.5236F, 0.0F, 0.0F));

		PartDefinition ANIM_LEFT_LEG = bone.addOrReplaceChild("ANIM_LEFT_LEG", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.5F, -2.0F, 0.0F, -1.0036F, -0.5236F));

		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.866F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, 0.0F, -0.1407F, 0.3678F, -0.8989F));

		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.75F, -1.0F, -0.933F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, 2.0F, 0.3215F, 0.6958F, -0.0188F));

		PartDefinition leg4 = bone.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.113F, -0.5F, -0.0383F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, 1.0F, 0.7256F, -0.9056F, -0.3216F));

		PartDefinition leg5 = bone.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.134F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.5F, 0.0F, -0.2166F, -0.4318F, 1.0076F));

		PartDefinition ANIM_RIGHT_LEG = bone.addOrReplaceChild("ANIM_RIGHT_LEG", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, -2.0F, 0.0F, 0.9163F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}