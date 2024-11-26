// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelwinged_cryoshroom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "winged_cryoshroom"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart hat;
	private final ModelPart bone2;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart decorations;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone6;
	private final ModelPart bone8;
	private final ModelPart bone3;
	private final ModelPart bone5;

	public Modelwinged_cryoshroom(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.hat = this.head.getChild("hat");
		this.bone2 = this.hat.getChild("bone2");
		this.left_arm = this.bone.getChild("left_arm");
		this.right_arm = this.bone.getChild("right_arm");
		this.decorations = this.bone.getChild("decorations");
		this.bone4 = this.decorations.getChild("bone4");
		this.bone7 = this.decorations.getChild("bone7");
		this.bone6 = this.decorations.getChild("bone6");
		this.bone8 = this.decorations.getChild("bone8");
		this.bone3 = this.decorations.getChild("bone3");
		this.bone5 = this.decorations.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 51).addBox(-4.0F, 7.0F, -1.0F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-5.0F, 16.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(2.0F, 16.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -3.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 11).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5F, 5.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -2.375F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.6169F, 1.875F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(81, 94).addBox(-1.5F, -0.1934F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.875F, -0.3229F, -0.3615F, -0.8131F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(81, 94).addBox(-1.5F, -0.1934F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.875F, -0.3229F, 0.3615F, 0.8131F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(81, 94).addBox(-1.5F, -0.1934F, -0.5412F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -1.875F, -0.48F, 0.0F, 0.0F));

		PartDefinition hat = head.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-8.0F, -4.0F, -8.0F, 17.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 112).mirror().addBox(-7.0F, -6.0F, -7.0F, 15.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 12).mirror().addBox(-6.0F, -7.0F, -6.0F, 13.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(86, 116).mirror().addBox(-5.0F, -9.0F, -5.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).mirror().addBox(-8.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).mirror().addBox(-1.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).mirror().addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).mirror().addBox(6.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 49).mirror().addBox(7.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).addBox(6.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(48, 49).mirror().addBox(-8.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 61).mirror().addBox(-8.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, -4.6169F, 1.125F));

		PartDefinition cube_r5 = hat.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -6.5F, -6.5F, -0.845F, 0.2831F, 0.0727F));

		PartDefinition cube_r6 = hat.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-1.5F, -0.5F, -5.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.5F, -6.5F, -6.5F, -0.845F, -0.2831F, -0.0727F));

		PartDefinition bone2 = hat.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition left_arm = bone.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(82, 24).addBox(-10.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(97, 5).addBox(-4.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 8.5F, 2.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition right_arm = bone.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(82, 24).mirror().addBox(0.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(97, 5).mirror().addBox(0.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 8.5F, 2.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition decorations = bone.addOrReplaceChild("decorations", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));

		PartDefinition bone4 = decorations.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(80, 2).addBox(-1.0F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, -1.5F));

		PartDefinition cube_r7 = bone4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 2).addBox(-1.0F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 2).addBox(-0.6F, 0.5F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone7 = decorations.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -5.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone6 = decorations.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -5.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone8 = decorations.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -7.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone3 = decorations.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -1.5F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 51).addBox(-0.6F, 0.5F, -0.51F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition bone5 = decorations.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -7.2381F, 1.5F, 0.0F, -1.5708F, 0.0F));

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