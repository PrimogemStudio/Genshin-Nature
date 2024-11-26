// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelpyro_hypostasis_fist<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pyro_hypostasis_fist"), "main");
	private final ModelPart inside_cube;

	public Modelpyro_hypostasis_fist(ModelPart root) {
		this.inside_cube = root.getChild("inside_cube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition inside_cube = partdefinition.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(92, 111).addBox(-7.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(92, 111).addBox(2.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = inside_cube.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 118).addBox(0.0F, -2.5F, -2.5F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -7.5F, -4.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = inside_cube.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 118).addBox(-10.0F, -2.5F, -2.5F, 11.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -7.5F, -4.5F, 0.0F, -0.5236F, 0.0F));

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