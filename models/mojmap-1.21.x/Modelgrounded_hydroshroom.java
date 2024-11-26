// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelgrounded_hydroshroom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "grounded_hydroshroom"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart bone2;
	private final ModelPart decorations;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelgrounded_hydroshroom(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.hat = this.head.getChild("hat");
		this.bone2 = this.hat.getChild("bone2");
		this.decorations = this.bone.getChild("decorations");
		this.bone4 = this.decorations.getChild("bone4");
		this.bone7 = this.decorations.getChild("bone7");
		this.bone6 = this.decorations.getChild("bone6");
		this.bone8 = this.decorations.getChild("bone8");
		this.bone3 = this.decorations.getChild("bone3");
		this.bone5 = this.decorations.getChild("bone5");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_leg = this.bone.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, 6.0F, 0.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-3.0F, 7.0F, -1.0F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(75, 11).addBox(-1.0F, 15.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(33, 50).addBox(-3.5F, -6.6169F, -4.875F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(61, 57).addBox(-2.5F, -0.6169F, -4.875F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.6169F, 1.875F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 40).mirror().addBox(-8.5F, -2.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.6169F, -1.375F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 40).addBox(-1.5F, -2.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.6169F, -1.375F, 0.0F, 0.0F, 0.6981F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -1.0F, -10.0F, 20.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-9.0F, -2.0F, -9.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 40).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(30, 40).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(54, 21).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.6169F, -1.875F));

		PartDefinition bone2 = hat.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 11).addBox(-1.8299F, -4.8631F, -0.6946F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.3892F, 9.6946F, 1.319F, 0.0299F, 0.0477F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 60).addBox(-1.5F, -6.1108F, -0.9946F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.3892F, 14.6946F, 2.2789F, 0.0299F, 0.0477F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(58, 60).addBox(-1.49F, -5.8108F, -1.0939F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.3892F, 14.6946F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 0).addBox(-1.5F, -7.1108F, -1.3946F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -17.3892F, 9.6946F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 47).addBox(-1.49F, -5.7119F, -1.1946F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.3892F, 4.6946F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 21).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition decorations = bone.addOrReplaceChild("decorations", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition bone4 = decorations.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(80, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -1.5F));

		PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 2).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r10 = bone4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(80, 2).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone7 = decorations.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -5.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r11 = bone7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r12 = bone7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(89, 12).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone6 = decorations.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(89, 45).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -5.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = bone6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(89, 45).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r14 = bone6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(89, 45).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone8 = decorations.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -7.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = bone8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r16 = bone8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone3 = decorations.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -1.5F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 51).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone5 = decorations.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r19 = bone5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r20 = bone5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 33).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7619F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 40).addBox(-0.725F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(-0.725F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-1.725F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.275F, 14.1807F, 0.7081F));

		PartDefinition cube_r21 = left_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(30, 40).addBox(-1.1F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.275F, 2.3193F, 0.6919F, 0.48F, 0.0F, 0.0F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 40).addBox(-0.275F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(-1.275F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).mirror().addBox(-1.275F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.275F, 14.1807F, 0.7081F));

		PartDefinition cube_r22 = right_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 40).addBox(-1.9F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.725F, 2.3193F, 0.6919F, 0.48F, 0.0F, 0.0F));

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