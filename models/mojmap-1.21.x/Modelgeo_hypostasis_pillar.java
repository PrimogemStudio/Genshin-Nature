// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelgeo_hypostasis_pillar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "geo_hypostasis_pillar"), "main");
	private final ModelPart bb_main;

	public Modelgeo_hypostasis_pillar(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -40.0F, -6.0F, 12.0F, 40.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -39.0F, 1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -36.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -29.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -32.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -34.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -26.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -18.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -24.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -22.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -13.0F, 1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -9.0F, -1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(6.0F, -4.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -39.0F, 1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -36.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -34.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -32.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -29.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -24.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -26.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -22.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -18.0F, -2.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -14.0F, -6.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -13.0F, 1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -9.0F, -1.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(-7.0F, -4.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 56).addBox(12.5F, 18.5769F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, 13.5769F, -0.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, 9.5769F, 1.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, 8.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, 4.5769F, -1.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, 0.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -3.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -1.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -6.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -9.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -11.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -13.4231F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(12.5F, -16.4231F, 1.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 18.5769F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 13.5769F, -0.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 9.5769F, 1.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 8.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 4.5769F, -1.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, 0.5769F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -3.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -1.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -6.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -9.4231F, -4.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -11.4231F, 0.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -13.4231F, -5.8846F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 56).addBox(0.5F, -16.4231F, 1.1154F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -21.5769F, 6.8846F, -3.1416F, 1.5708F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}