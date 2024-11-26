// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelfloating_hydro_fungi<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "floating_hydro_fungi"), "main");
	private final ModelPart bone;
	private final ModelPart tentacles7;
	private final ModelPart tentaclegroup;
	private final ModelPart tentacles2;
	private final ModelPart tentacles3;
	private final ModelPart tentacles;
	private final ModelPart tentaclegroup2;
	private final ModelPart tentacles4;
	private final ModelPart tentacles5;
	private final ModelPart tentacles6;
	private final ModelPart tentacles8;

	public Modelfloating_hydro_fungi(ModelPart root) {
		this.bone = root.getChild("bone");
		this.tentacles7 = this.bone.getChild("tentacles7");
		this.tentaclegroup = this.bone.getChild("tentaclegroup");
		this.tentacles2 = this.tentaclegroup.getChild("tentacles2");
		this.tentacles3 = this.tentaclegroup.getChild("tentacles3");
		this.tentacles = this.tentaclegroup.getChild("tentacles");
		this.tentaclegroup2 = this.bone.getChild("tentaclegroup2");
		this.tentacles4 = this.tentaclegroup2.getChild("tentacles4");
		this.tentacles5 = this.tentaclegroup2.getChild("tentacles5");
		this.tentacles6 = this.tentaclegroup2.getChild("tentacles6");
		this.tentacles8 = this.bone.getChild("tentacles8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.7F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-8.0F, -10.7F, -8.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(8, 21).addBox(-7.0F, -12.7F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-3.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(2.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.7F, 0.0F));

		PartDefinition tentacles7 = bone.addOrReplaceChild("tentacles7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 0.0F, -0.3491F, -1.5708F, 0.0F));

		PartDefinition cube_r1 = tentacles7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0092F, -7.9188F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r2 = tentacles7.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2941F, -4.6155F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentaclegroup = bone.addOrReplaceChild("tentaclegroup", CubeListBuilder.create(), PartPose.offset(0.0F, 8.3F, 0.0F));

		PartDefinition tentacles2 = tentaclegroup.addOrReplaceChild("tentacles2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -8.7407F, -4.0064F, -0.4942F, 0.7654F, -0.3572F));

		PartDefinition cube_r3 = tentacles2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r4 = tentacles2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentacles3 = tentaclegroup.addOrReplaceChild("tentacles3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -8.7407F, -4.0064F, -0.4942F, -0.7654F, 0.3572F));

		PartDefinition cube_r5 = tentacles3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 9).addBox(-1.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r6 = tentacles3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentacles = tentaclegroup.addOrReplaceChild("tentacles", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.7407F, -4.0064F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tentacles.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tentacles.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentaclegroup2 = bone.addOrReplaceChild("tentaclegroup2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 8.3F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition tentacles4 = tentaclegroup2.addOrReplaceChild("tentacles4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -8.7407F, -4.0064F, -0.4942F, 0.7654F, -0.3572F));

		PartDefinition cube_r9 = tentacles4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tentacles4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentacles5 = tentaclegroup2.addOrReplaceChild("tentacles5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -8.7407F, -4.0064F, -0.4942F, -0.7654F, 0.3572F));

		PartDefinition cube_r11 = tentacles5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 9).addBox(-1.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tentacles5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentacles6 = tentaclegroup2.addOrReplaceChild("tentacles6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.7407F, -4.0064F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r13 = tentacles6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.044F, -3.7969F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tentacles6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2593F, -0.4936F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tentacles8 = bone.addOrReplaceChild("tentacles8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3F, 0.0F, -0.3491F, 1.5708F, 0.0F));

		PartDefinition cube_r15 = tentacles8.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0092F, -7.9188F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tentacles8.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2941F, -4.6155F, -0.7854F, 0.0F, 0.0F));

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