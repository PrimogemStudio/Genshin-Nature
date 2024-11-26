// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelthe_great_snowboar_king<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "the_great_snowboar_king"), "main");
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;

	public Modelthe_great_snowboar_king(ModelPart root) {
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.head = this.bone.getChild("head");
		this.leg0 = this.bone.getChild("leg0");
		this.leg1 = this.bone.getChild("leg1");
		this.leg2 = this.bone.getChild("leg2");
		this.leg3 = this.bone.getChild("leg3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(84, 24).addBox(-15.0F, -30.0F, -21.0F, 30.0F, 48.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 6.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -12.0F, -24.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(48, 48).addBox(-6.0F, 0.0F, -27.0F, 12.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -36.0F, -18.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 73).addBox(-1.5F, -3.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 73).addBox(-1.5F, 0.0F, -4.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, 3.0F, -25.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(63, 70).addBox(-1.5F, -3.0F, -7.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(63, 71).addBox(-1.5F, 0.0F, -4.5F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5F, 3.0F, -25.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leg0 = bone.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -18.0F, 21.0F));

		PartDefinition leg1 = bone.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(9.0F, -18.0F, 21.0F));

		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -18.0F, -15.0F));

		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(9.0F, -18.0F, -15.0F));

		return LayerDefinition.create(meshdefinition, 192, 96);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}