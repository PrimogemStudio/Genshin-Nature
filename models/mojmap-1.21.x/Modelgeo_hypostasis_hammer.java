// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelgeo_hypostasis_hammer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "geo_hypostasis_hammer"), "main");
	private final ModelPart bb_main;

	public Modelgeo_hypostasis_hammer(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -40.0F, -4.0F, 8.0F, 40.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(28, 104).addBox(-19.0F, -52.0F, -6.0F, 38.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(78, 0).addBox(19.0F, -54.0F, -8.0F, 9.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(78, 0).addBox(-28.0F, -54.0F, -8.0F, 9.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}