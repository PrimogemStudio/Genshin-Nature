// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelperpetual_mechanical_array<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "perpetual_mechanical_array"), "main");
	private final ModelPart bone;
	private final ModelPart inside_cube;
	private final ModelPart outside_cubes;

	public Modelperpetual_mechanical_array(ModelPart root) {
		this.bone = root.getChild("bone");
		this.inside_cube = this.bone.getChild("inside_cube");
		this.outside_cubes = this.bone.getChild("outside_cubes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.0F, 0.0F, 2.4702F, -0.5156F, -2.6325F));

		PartDefinition inside_cube = bone.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition outside_cubes = bone.addOrReplaceChild("outside_cubes", CubeListBuilder.create().texOffs(88, 108).mirror().addBox(-11.0F, -20.0F, 1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(88, 108).addBox(1.0F, -20.0F, 1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(88, 108).mirror().addBox(-12.0F, -22.0F, -12.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(88, 108).addBox(1.0F, -20.0F, -11.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(88, 108).addBox(-11.0F, -8.0F, -11.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(88, 108).mirror().addBox(1.0F, -8.0F, -11.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(88, 108).addBox(-11.0F, -8.0F, 1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(88, 108).mirror().addBox(2.0F, -6.0F, 2.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 9.0F, 0.0F));

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