// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelattacking_minion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "attacking_minion"), "main");
	private final ModelPart head;

	public Modelattacking_minion(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.9875F, -4.0213F, -9.315F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-4.9875F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-5.9875F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-5.9875F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 0).addBox(5.0125F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(5.0125F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(4.0125F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(4.0125F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(4.0125F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(4.0125F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(4.0125F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(48, 0).addBox(4.0125F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(38, 0).addBox(-3.9875F, -5.0213F, -5.315F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(-3.9875F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(1.0125F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.9875F, -1.0213F, -15.315F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(46, 10).addBox(-1.9875F, -1.0313F, -14.315F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.9875F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(2.0125F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(2.0025F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.9775F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0125F, 11.0213F, 5.315F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(58, 0).addBox(-1.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 0).mirror().addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4875F, -4.0213F, -5.815F, 0.0F, 0.0F, -0.3054F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5125F, -4.0213F, -5.815F, 0.0F, 0.0F, 0.3054F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(0, 16).addBox(1.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(1.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 11).mirror().addBox(-2.0F, 0.01F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 12).mirror().addBox(-1.5F, -1.01F, -6.02F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 16).mirror().addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0125F, 2.9787F, -9.315F, 0.4363F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4875F, -1.5213F, -0.815F, -0.1625F, -1.1777F, -0.966F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4875F, -1.5213F, -0.815F, -0.5145F, -0.7312F, 0.0541F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4875F, -1.5213F, -0.815F, 0.0F, -0.6545F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5125F, -1.5213F, -0.815F, -0.1423F, 1.2483F, 1.1167F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5125F, -1.5213F, -0.815F, -0.4963F, 0.693F, -0.0262F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5125F, -1.5213F, -0.815F, 0.0F, 0.6545F, 0.0F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, 0.9787F, -1.815F, -0.7945F, -0.4891F, 0.3819F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, 0.9787F, -1.815F, -0.6109F, 0.0F, 0.0F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, 0.9787F, -1.815F, -0.8382F, 0.4891F, -0.3819F));

		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.5764F, 0.4891F, 0.3819F));

		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.62F, -0.4891F, -0.3819F));

		PartDefinition head_r15 = head.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}