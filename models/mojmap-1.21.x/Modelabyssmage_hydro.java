// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelabyssmage_hydro<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "abyssmage_hydro"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart bone2;
	private final ModelPart bone;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelabyssmage_hydro(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.bone2 = this.Body.getChild("bone2");
		this.bone = this.Body.getChild("bone");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(37, 9).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -8.0F, -1.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, -1.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 0.0F, -3.0F, 12.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(50, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 12.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(41, 19).addBox(2.5F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 17).mirror().addBox(4.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 17).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 12.0F, -2.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.5F, 12.0F, 0.0F));

		PartDefinition Body_r3 = bone2.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(50, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.5F, 12.0F, 2.5F));

		PartDefinition Body_r4 = bone.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(41, 19).addBox(2.5F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 17).mirror().addBox(4.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 17).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 48).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 48).mirror().addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-1.0F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}