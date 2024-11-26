// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modeleye_of_the_storm_fixed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "eye_of_the_storm_fixed"), "main");
	private final ModelPart bone2;
	private final ModelPart bone;

	public Modeleye_of_the_storm_fixed(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone = this.bone2.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-7.1F, -25.5F, -6.9F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 146).addBox(-2.7F, -0.85F, 0.46F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7414F, -23.314F, -10.35F, 0.0F, 0.0F, -2.0508F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 140).addBox(-3.5266F, -3.833F, -8.05F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(8, 138).addBox(-3.5266F, -2.7F, -3.45F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1266F, -6.917F, 1.15F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 138).addBox(-0.85F, 1.9F, -5.75F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.65F, -13.8F, 1.15F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 143).addBox(0.2F, -5.0F, -3.45F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.0F, -8.05F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 131).addBox(-1.1338F, -2.7616F, -0.0061F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4626F, -15.9202F, 12.5371F, -2.956F, 1.2573F, -2.2986F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 131).addBox(-3.15F, -2.7F, 0.0F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.65F, -20.7F, 2.3F, -0.3491F, 0.829F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 143).addBox(-14.989F, -4.6027F, 1.15F, 14.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.8F, -18.4F, -10.35F, 0.0F, 1.4399F, -0.3491F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 143).addBox(-14.0F, -5.0F, -3.45F, 14.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.0F, -8.05F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -18.4F, 0.0F, -1.1549F, -1.0529F, -2.131F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 138).addBox(-3.5266F, -2.7F, -3.45F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(9, 140).addBox(-3.5266F, -3.833F, -8.05F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1266F, 11.483F, 1.15F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 138).addBox(-0.85F, 1.9F, -5.75F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.65F, 4.6F, 1.15F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 146).addBox(-2.7F, -2.85F, 0.46F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.7414F, -4.914F, -10.35F, 0.0F, 0.0F, -2.0508F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 131).addBox(-1.1338F, -2.7616F, -0.0061F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4626F, 2.4798F, 12.5371F, -2.956F, 1.2573F, -2.2986F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 131).addBox(-3.15F, -2.7F, 0.0F, 2.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.65F, -2.3F, 2.3F, -0.3491F, 0.829F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 143).addBox(-14.989F, -4.6027F, 1.15F, 14.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.8F, 0.0F, -10.35F, 0.0F, 1.4399F, -0.3491F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 143).addBox(-14.0F, -5.0F, -3.45F, 14.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6F, -8.05F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 143).addBox(0.2F, -5.0F, -3.45F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6F, -8.05F, 0.0F, 0.0F, -0.6981F));

		return LayerDefinition.create(meshdefinition, 150, 150);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}