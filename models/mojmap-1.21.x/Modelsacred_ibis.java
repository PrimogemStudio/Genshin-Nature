// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelsacred_ibis<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sacred_ibis"), "main");
	private final ModelPart bone;
	private final ModelPart leftleg;
	private final ModelPart rightleg;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart wing1;
	private final ModelPart wing2;

	public Modelsacred_ibis(ModelPart root) {
		this.bone = root.getChild("bone");
		this.leftleg = this.bone.getChild("leftleg");
		this.rightleg = this.bone.getChild("rightleg");
		this.body = this.bone.getChild("body");
		this.head = this.bone.getChild("head");
		this.wing1 = this.bone.getChild("wing1");
		this.wing2 = this.bone.getChild("wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = bone.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(42, 60).addBox(-1.0F, 12.6156F, -5.3882F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 58).addBox(-0.5F, -0.3844F, -0.8882F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -13.6156F, 3.3882F));

		PartDefinition cube_r1 = leftleg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 40).addBox(-0.5F, -9.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1156F, -2.8882F, -0.2618F, 0.0F, 0.0F));

		PartDefinition rightleg = bone.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(42, 60).addBox(-1.0F, 12.6156F, -5.3882F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 58).addBox(-0.5F, -0.3844F, -0.8882F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -13.6156F, 3.3882F));

		PartDefinition cube_r2 = rightleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 40).addBox(-0.5F, -9.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.1156F, -2.8882F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 45).addBox(-4.0F, -18.0F, 1.0F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(-4.0F, -27.0F, -2.0F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -9.25F, -1.4F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-2.0F, -12.25F, -3.4F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(35, 7).addBox(-0.5F, -10.25F, -9.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(29, 0).addBox(-0.5F, -11.25F, -7.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.75F, -0.5F));

		PartDefinition wing1 = bone.addOrReplaceChild("wing1", CubeListBuilder.create().texOffs(54, 0).addBox(-0.5F, -0.6667F, -2.5F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(56, 17).addBox(-0.5F, 12.3333F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, 23).addBox(-0.5F, 15.3333F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -26.3333F, 2.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition wing2 = bone.addOrReplaceChild("wing2", CubeListBuilder.create().texOffs(54, 0).mirror().addBox(-0.5F, -0.6667F, -2.5F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 17).mirror().addBox(-0.5F, 12.3333F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(58, 23).mirror().addBox(-0.5F, 15.3333F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5F, -26.3333F, 2.5F, 0.3491F, 0.0F, 0.0F));

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