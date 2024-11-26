// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelseelie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "seelie"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelseelie(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(18, 34).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 21.0F, 0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 26).addBox(-3.0F, -0.5F, 1.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -4.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 10).addBox(2.3F, -1.9659F, -0.7588F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-0.3F, -1.9659F, -0.7588F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -8.0714F, 0.4576F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -2.5F, 0.0F, 0.2618F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.5F, 0.0F, 0.2618F, 0.0F, -0.2618F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(50, 0).addBox(-2.0F, -6.5F, -4.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 6).addBox(-0.5F, -4.5F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 9).addBox(-2.0F, -6.0F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 0).addBox(0.1431F, -0.8154F, -0.3545F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 30).mirror().addBox(2.1431F, 0.1846F, -0.3545F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.1138F, -5.5352F, -3.6975F, 1.1855F, -1.3311F, -1.1807F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 22).addBox(6.921F, -0.7854F, 0.0041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 60).addBox(-1.079F, -0.7854F, -0.9959F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 40).addBox(-0.079F, -1.7854F, -0.9959F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.12F, -7.6832F, 1.2446F, 2.2149F, -1.292F, -2.2392F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(46, 22).addBox(7.921F, 0.2146F, -1.4446F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 40).addBox(-0.079F, -0.7854F, -2.4446F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 60).addBox(-1.079F, 0.2146F, -2.4446F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.12F, -7.6832F, 1.2446F, 1.5586F, -1.218F, -1.5637F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 22).addBox(7.6338F, -1.8154F, 0.7825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 40).addBox(0.6338F, -2.8154F, -0.2175F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(46, 60).addBox(-0.3662F, -1.8154F, -0.2175F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6614F, -6.5382F, 0.7599F, 1.0321F, -1.3116F, -1.0223F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.1043F, -0.5143F, 0.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -5.5F, -4.0F, 0.3797F, -0.1857F, -0.1849F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -5.5F, -5.0F, 0.3515F, 0.3487F, 0.0082F));

		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 30).addBox(2.1431F, 0.1846F, -0.3545F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(0.1431F, -0.8154F, -0.3545F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8807F, -5.5613F, -3.4636F, 1.7433F, -1.3455F, -1.753F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}