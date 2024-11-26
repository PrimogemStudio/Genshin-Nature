// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modeldesert_sumpter_beast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "desert_sumpter_beast"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart left_hand;
	private final ModelPart right_hand;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public Modeldesert_sumpter_beast(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.left_hand = this.bone.getChild("left_hand");
		this.right_hand = this.bone.getChild("right_hand");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -17.0F, -8.0F, 18.0F, 17.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(64, 91).addBox(-9.0F, -18.0F, -7.0F, 18.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(64, 91).addBox(-9.0F, -18.0F, 2.0F, 18.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(80, 2).addBox(-5.5F, -5.0F, -8.5F, 11.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(3, 83).mirror().addBox(-6.5F, -6.0F, -8.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(3, 83).addBox(3.5F, -6.0F, -8.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -8.0F, -8.5F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 29).mirror().addBox(-0.5F, -1.5F, -3.0F, 1.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -3.5F, -3.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 29).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -3.5F, -3.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition left_hand = bone.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, -2.5F, -3.5F));

		PartDefinition right_hand = bone.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, -1.5F, -3.5F));

		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, -1.5F, 7.5F));

		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, -2.5F, 7.5F));

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