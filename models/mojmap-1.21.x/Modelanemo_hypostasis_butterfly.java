// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelanemo_hypostasis_butterfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "anemo_hypostasis_butterfly"), "main");
	private final ModelPart inside_cube;
	private final ModelPart bb_main;

	public Modelanemo_hypostasis_butterfly(ModelPart root) {
		this.inside_cube = root.getChild("inside_cube");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition inside_cube = partdefinition.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -13.0F, -8.0F, 16.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(26, 109).addBox(7.0F, -13.0F, -9.0F, 33.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(26, 109).mirror().addBox(-40.0F, -13.0F, -9.0F, 33.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(66, 109).addBox(-20.0F, -13.0F, 9.0F, 13.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(66, 109).mirror().addBox(7.0F, -13.0F, 9.0F, 13.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		inside_cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}