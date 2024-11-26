// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelalgorithm_of_semi_intransient_matrix_of_overseer_network<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "algorithm_of_semi_intransient_matrix_of_overseer_network"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;

	public Modelalgorithm_of_semi_intransient_matrix_of_overseer_network(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone6 = this.bone2.getChild("bone6");
		this.bone3 = this.bone.getChild("bone3");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone4 = this.bone.getChild("bone4");
		this.bone7 = this.bone.getChild("bone7");
		this.bone8 = this.bone.getChild("bone8");
		this.bone9 = this.bone.getChild("bone9");
		this.bone10 = this.bone.getChild("bone10");
		this.bone11 = this.bone.getChild("bone11");
		this.bone12 = this.bone.getChild("bone12");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(152, 116).addBox(-8.6F, -20.0F, 0.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(108, 150).addBox(-2.0F, -14.0F, 0.0F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(156, 22).addBox(-2.0F, -20.6F, 0.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 150).addBox(-4.0F, -26.6F, 2.2F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(152, 116).addBox(2.6F, -20.0F, 0.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(76, 150).addBox(-42.8593F, -30.7006F, -11.9531F, 4.0F, 22.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 70).addBox(-56.8593F, -30.7006F, -11.9531F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-54.8593F, -26.7006F, -11.9531F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(52, 110).addBox(-46.8593F, -11.3006F, -11.9531F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.2139F, -7.2994F, 0.2029F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(42, 138).addBox(-46.9757F, -5.7663F, -0.96F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8836F, -16.5391F, -10.9531F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 72).addBox(-5.0F, 0.0F, -1.2F, 62.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-55.8593F, -32.7006F, -10.9531F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.6F, 1.6F, -1.2F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(150, 54).addBox(-7.6F, -0.4F, -1.2F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-46.8593F, -11.7006F, -10.9531F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(154, 96).addBox(-6.8F, 2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(156, 0).addBox(-0.8F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-53.8593F, -22.7006F, -10.9531F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone6 = bone2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(122, 42).addBox(-4.0F, -4.0F, -6.6667F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 144).addBox(-2.0F, -2.0F, -0.6667F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(120, 124).addBox(-8.0F, -8.0F, -0.6667F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-50.8593F, -0.7006F, -17.2864F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(76, 150).addBox(-5.0893F, 3.5056F, -1.0667F, 4.0F, 22.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 70).addBox(-1.0893F, 3.5056F, -1.0667F, 14.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0893F, -41.5056F, 1.0667F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 12).addBox(-0.9757F, -12.5709F, -0.94F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.8864F, 19.6671F, -0.0667F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 138).addBox(-5.9757F, -5.7663F, -0.96F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8864F, 17.6671F, -0.0667F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(154, 88).addBox(-7.9757F, 2.2337F, -0.96F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(142, 154).addBox(-1.9757F, -1.7663F, -0.96F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8864F, 17.6671F, -0.0667F, 0.0F, 0.0F, -2.9671F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(154, 92).addBox(-5.0F, 1.0F, -0.98F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(150, 154).addBox(1.0F, -3.0F, -0.98F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8864F, 23.6671F, -0.0667F, 0.0F, 0.0F, -2.3126F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-3.3686F, -7.3929F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2793F, 21.2984F, -0.0667F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 72).addBox(-57.0F, 0.0F, -0.8F, 62.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9107F, 1.5056F, -0.0667F, 0.0F, 0.0F, 1.0472F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(122, 42).addBox(-4.0F, -4.0F, -6.6667F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(144, 142).addBox(-2.0F, -2.0F, -0.6667F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(120, 124).addBox(-8.0F, -8.0F, -0.6667F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9107F, 33.5056F, -6.4F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 110).addBox(-12.0F, -60.0F, -4.0F, 24.0F, 24.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(128, 0).addBox(-6.0F, -48.0F, -6.0F, 12.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(128, 0).addBox(-6.0F, 3.0F, -1.02F, 12.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -51.0F, -5.0F, 0.0F, 0.0F, -2.2253F));

		PartDefinition cube_r12 = bone4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(128, 0).addBox(-6.0F, 3.0F, -1.2F, 12.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -51.0F, -5.0F, 0.0F, 0.0F, 2.2253F));

		PartDefinition bone7 = bone.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, -51.0F, -5.0F));

		PartDefinition cube_r13 = bone7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, 35.0F, 8.98F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 124).addBox(-4.0F, 17.0F, 6.98F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.2253F));

		PartDefinition bone8 = bone.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -51.0F, -5.0F, 0.0F, 0.0F, -1.7453F));

		PartDefinition cube_r14 = bone8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, 35.0F, 8.98F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 124).addBox(-4.0F, 17.0F, 6.98F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.2253F));

		PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(56, 110).addBox(26.0F, -66.0F, 12.0F, 16.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -56.0F, 22.0F, 0.4349F, 0.0368F, -0.0791F));

		PartDefinition cube_r16 = bone9.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -56.0F, 10.0F, -0.4349F, -0.0368F, -0.0791F));

		PartDefinition cube_r17 = bone9.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -5.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -70.0F, 16.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone10 = bone.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(56, 110).addBox(26.0F, -66.0F, -44.0F, 16.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -24.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = bone10.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -56.0F, -34.0F, 0.4349F, 0.0368F, -0.0791F));

		PartDefinition cube_r19 = bone10.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -56.0F, -46.0F, -0.4349F, -0.0368F, -0.0791F));

		PartDefinition cube_r20 = bone10.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -4.0F, 56.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0F, -70.0F, -40.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bone11 = bone.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 84).addBox(-9.0F, 0.3036F, -9.0F, 18.0F, 8.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 138).addBox(-3.0F, 8.3036F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(9.0F, 4.3036F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(-1.0F, 4.3036F, -15.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(-1.0F, 4.3036F, 9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(-15.0F, 4.3036F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(187, 0).addBox(-5.0F, -54.125F, -5.0F, 10.0F, 40.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.0F, -88.3036F, 31.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r21 = bone11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 138).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6964F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition bone12 = bone.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 84).addBox(-9.0F, 0.3036F, -9.0F, 18.0F, 8.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 138).addBox(-3.0F, 8.3036F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(9.0F, 4.3036F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(-1.0F, 4.3036F, -15.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(-1.0F, 4.3036F, 9.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 98).addBox(-15.0F, 4.3036F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(187, 0).addBox(-5.0F, -54.125F, -5.0F, 10.0F, 40.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.0F, -88.3036F, 31.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r22 = bone12.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 138).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6964F, 0.0F, 0.0F, 0.0F, -3.1416F));

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