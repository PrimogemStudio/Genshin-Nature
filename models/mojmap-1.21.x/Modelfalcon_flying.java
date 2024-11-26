// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelfalcon_flying<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "falcon_flying"), "main");
	private final ModelPart bone;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart head;
	private final ModelPart wing1;
	private final ModelPart wing2;

	public Modelfalcon_flying(ModelPart root) {
		this.bone = root.getChild("bone");
		this.left_leg = this.bone.getChild("left_leg");
		this.right_leg = this.bone.getChild("right_leg");
		this.head = this.bone.getChild("head");
		this.wing1 = this.bone.getChild("wing1");
		this.wing2 = this.bone.getChild("wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 16.3697F, -2.1707F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 14).addBox(-2.5F, -3.0F, -7.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1303F, 2.1707F, -0.6109F, 0.0F, 0.0F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, 3.75F, -2.25F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.8803F, 0.4207F, 0.5236F, 0.2182F, 0.0F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, 3.75F, -2.25F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.8803F, 0.4207F, 0.5236F, -0.2182F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(31, 0).addBox(-1.5F, -5.25F, -1.75F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(-1.5F, -6.25F, -2.75F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-0.5F, -5.25F, -3.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 0).addBox(-0.5F, -5.25F, -4.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1197F, -3.0793F, 0.1745F, 0.0F, 0.0F));

		PartDefinition wing1 = bone.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -2.9F, -0.2F, 1.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, -1.9F, 13.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, 0.1F, 13.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, -0.9F, 13.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, 1.1F, 13.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0303F, -1.6293F, -0.8492F, -0.2324F, -1.7708F));

		PartDefinition wing2 = bone.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-0.5F, -2.9F, -0.2F, 1.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 32).addBox(-0.5F, -1.9F, 13.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, 0.1F, 13.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, -0.9F, 13.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.5F, 1.1F, 13.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0303F, -1.6293F, -0.8492F, 0.2324F, 1.7708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}