// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelweapon_primal_construct_reshaper<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "weapon_primal_construct_reshaper"), "main");
	private final ModelPart weapon2;

	public Modelweapon_primal_construct_reshaper(ModelPart root) {
		this.weapon2 = root.getChild("weapon2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition weapon2 = partdefinition.addOrReplaceChild("weapon2", CubeListBuilder.create().texOffs(3, 32).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(29, 15).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 22.5F, 3.5F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		weapon2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}