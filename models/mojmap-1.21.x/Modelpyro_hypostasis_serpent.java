// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelpyro_hypostasis_serpent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pyro_hypostasis_serpent"), "main");
	private final ModelPart inside_cube;

	public Modelpyro_hypostasis_serpent(ModelPart root) {
		this.inside_cube = root.getChild("inside_cube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition inside_cube = partdefinition.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(11, 10).addBox(-3.0F, 0.5F, 6.1716F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(95, 116).addBox(-1.0F, -0.5F, 7.1716F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(95, 116).addBox(-1.0F, 0.5F, 17.1716F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(95, 116).addBox(-1.0F, 1.5F, 27.1716F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(11, 10).addBox(-3.0F, 1.5F, 16.1716F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(11, 10).addBox(-2.0F, 2.5F, 26.1716F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition cube_r1 = inside_cube.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(97, 118).addBox(-1.0F, -4.5F, 0.1716F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(11, 10).addBox(-3.0F, -3.5F, -1.8284F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = inside_cube.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 14).addBox(-3.0F, 1.7929F, -6.864F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(114, 126).addBox(-3.0F, 9.753F, -4.864F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 113).addBox(2.0F, 2.753F, -4.864F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 113).addBox(-3.0F, 2.753F, -4.864F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 113).addBox(-3.0F, 2.753F, -2.864F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 113).addBox(2.0F, 2.753F, -2.864F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(114, 126).addBox(-3.0F, 9.753F, -2.864F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 14).addBox(-3.0F, 1.7929F, -1.864F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 14).addBox(-3.0F, -3.2071F, -6.864F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.753F, -10.253F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r3 = inside_cube.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 10).addBox(-3.0F, -2.5F, -9.0F, 6.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, -4.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		inside_cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}