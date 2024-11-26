// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelruin_defender<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ruin_defender"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart right_leg2;
	private final ModelPart left_leg2;

	public Modelruin_defender(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
		this.right_leg2 = root.getChild("right_leg2");
		this.left_leg2 = root.getChild("left_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0435F, -2.1504F, -0.0797F, 12.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(56, 0).addBox(-1.0435F, 2.8496F, -2.0797F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).addBox(-3.0435F, 3.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).addBox(-3.0435F, -2.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).mirror().addBox(0.9565F, -2.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 35).mirror().addBox(-1.0435F, 2.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 35).addBox(-1.0435F, -1.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).addBox(0.9565F, 3.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).mirror().addBox(-4.0435F, 2.3496F, -3.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 35).mirror().addBox(-3.0435F, -0.6504F, -3.0797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(85, 35).addBox(1.9565F, -0.6504F, -3.0797F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).addBox(-4.0435F, -1.6504F, -3.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).addBox(2.9565F, 2.3496F, -3.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 35).mirror().addBox(2.9565F, -1.6504F, -3.0797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(52, 18).addBox(-2.0435F, -1.1504F, -2.0797F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 0).addBox(-1.0435F, -3.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 7).addBox(-4.0435F, -0.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 8).addBox(1.9565F, -0.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-2.0435F, -5.4504F, -2.913F, 4.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0435F, 7.1504F, -3.0036F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.5436F, -2.4808F, 11.1692F, 0.0F, -0.2182F, 0.3491F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.6306F, -2.4403F, 11.1039F, -0.0757F, 0.2048F, -0.3568F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5436F, -2.4403F, 1.07F, 0.0757F, 0.2048F, 0.3568F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6306F, -2.4808F, 1.0048F, 0.0F, -0.2182F, -0.3491F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(-4.7428F, 10.5406F, -1.4504F));

		PartDefinition cube_r5 = left_leg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 68).mirror().addBox(-4.5F, -1.0F, -10.5F, 9.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.6448F, 3.5054F, -13.0383F, -1.9045F, 0.2003F, 0.0342F));

		PartDefinition cube_r6 = left_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 4).addBox(-1.7934F, -1.2963F, -0.8197F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.739F, 4.3293F, -7.7299F, -1.8179F, 0.3013F, 0.3795F));

		PartDefinition cube_r7 = left_leg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9894F, 2.7159F, -3.0407F, -1.2943F, 0.3013F, 0.3795F));

		PartDefinition cube_r8 = left_leg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2428F, -0.0406F, -0.0496F, -0.6398F, 0.3013F, 0.3795F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2572F, 10.5406F, -1.4504F, 0.0F, -0.8727F, 0.0F));

		PartDefinition cube_r9 = right_leg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 68).addBox(-4.5F, -1.0F, -10.5F, 9.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6448F, 3.5054F, -13.0383F, -1.9045F, 0.2003F, 0.0342F));

		PartDefinition cube_r10 = right_leg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(90, 4).addBox(-1.7934F, -1.2963F, -0.8197F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.739F, 4.3293F, -7.7299F, -1.8179F, 0.3013F, 0.3795F));

		PartDefinition cube_r11 = right_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9894F, 2.7159F, -3.0407F, -1.2943F, 0.3013F, 0.3795F));

		PartDefinition cube_r12 = right_leg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2428F, -0.0406F, -0.0496F, -0.6398F, 0.3013F, 0.3795F));

		PartDefinition right_leg2 = partdefinition.addOrReplaceChild("right_leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2572F, 10.5406F, 8.5496F, -3.1416F, -0.0436F, 3.1416F));

		PartDefinition cube_r13 = right_leg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(78, 66).mirror().addBox(-4.5F, -1.0F, -8.0F, 9.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5358F, 5.0374F, -7.3222F, -1.9045F, 0.2003F, 0.0342F));

		PartDefinition cube_r14 = right_leg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9894F, 2.7159F, -3.0407F, -1.2943F, 0.3013F, 0.3795F));

		PartDefinition cube_r15 = right_leg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2428F, -0.0406F, -0.0496F, -0.6398F, 0.3013F, 0.3795F));

		PartDefinition left_leg2 = partdefinition.addOrReplaceChild("left_leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.7428F, 10.5406F, 8.5496F, 3.1375F, 1.0471F, 3.1413F));

		PartDefinition cube_r16 = left_leg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 66).addBox(-4.5F, -1.0F, -8.0F, 9.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5358F, 5.0374F, -7.3222F, -1.9045F, 0.2003F, 0.0342F));

		PartDefinition cube_r17 = left_leg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9894F, 2.7159F, -3.0407F, -1.2943F, 0.3013F, 0.3795F));

		PartDefinition cube_r18 = left_leg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2428F, -0.0406F, -0.0496F, -0.6398F, 0.3013F, 0.3795F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}