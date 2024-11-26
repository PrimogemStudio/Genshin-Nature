// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelhydro_cicin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "hydro_cicin"), "main");
	private final ModelPart RIG_wing3;
	private final ModelPart bone;
	private final ModelPart RIG_wing1;
	private final ModelPart wing2;
	private final ModelPart bb_main;

	public Modelhydro_cicin(ModelPart root) {
		this.RIG_wing3 = root.getChild("RIG_wing3");
		this.bone = this.RIG_wing3.getChild("bone");
		this.RIG_wing1 = root.getChild("RIG_wing1");
		this.wing2 = this.RIG_wing1.getChild("wing2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RIG_wing3 = partdefinition.addOrReplaceChild("RIG_wing3", CubeListBuilder.create().texOffs(52, 0).addBox(-0.0947F, -0.3066F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 5).addBox(1.9053F, -3.3066F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 24).addBox(6.9053F, -1.3066F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 19).addBox(2.9053F, -4.3066F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5867F, 18.0586F, -0.5F, 0.0F, 3.1416F, 0.0873F));

		PartDefinition bone = RIG_wing3.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(52, 62).addBox(-0.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-0.25F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.011F, 3.9491F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition RIG_wing1 = partdefinition.addOrReplaceChild("RIG_wing1", CubeListBuilder.create().texOffs(52, 0).addBox(0.0796F, -2.299F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 5).addBox(2.0796F, -5.299F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 24).addBox(7.0796F, -3.299F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 19).addBox(3.0796F, -6.299F, -0.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5905F, 20.1457F, -0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition wing2 = RIG_wing1.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(52, 62).addBox(2.0F, -4.3076F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(2.0F, -3.3076F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4162F, 3.8619F, 0.5F, 0.0F, 0.0F, 0.1309F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 27).mirror().addBox(-1.5F, -9.15F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(36, 27).addBox(1.5F, -9.15F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 30).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -9.0F, -0.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 30).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -9.0F, -0.5F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RIG_wing3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RIG_wing1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}