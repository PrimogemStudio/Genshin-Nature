// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelbutterfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "butterfly"), "main");
	private final ModelPart wing;
	private final ModelPart wing2;
	private final ModelPart bb_main;

	public Modelbutterfly(ModelPart root) {
		this.wing = root.getChild("wing");
		this.wing2 = root.getChild("wing2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wing = partdefinition.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9262F, 22.0F, 0.2462F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r1 = wing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-4.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0738F, 0.0F, -2.2462F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r2 = wing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-4.0F, -0.5F, -2.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0738F, 0.0F, 1.7538F, 0.0F, 0.1745F, 0.0F));

		PartDefinition wing2 = partdefinition.addOrReplaceChild("wing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9262F, 22.0F, 0.2462F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = wing2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0738F, 0.0F, -2.2462F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r4 = wing2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -0.5F, -2.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0738F, 0.0F, 1.7538F, 0.0F, -0.1745F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, -3.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5F, -4.5F, -0.9113F, -0.2485F, 0.3073F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.5F, -4.5F, -0.8897F, 0.1671F, -0.2024F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}