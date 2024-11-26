// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_hunter extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r9;

	public Modelruin_hunter() {
		textureWidth = 160;
		textureHeight = 160;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(70, 0).addBox(-7.0F, -21.0F, -2.0F, 14.0F, 15.0F, 15.0F, 0.0F, false);
		body.setTextureOffset(0, 81).addBox(-17.0F, -47.0F, -5.0F, 34.0F, 26.0F, 21.0F, 0.0F, false);
		body.setTextureOffset(13, 81).addBox(-4.0F, -49.0F, -5.0F, 9.0F, 2.0F, 21.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-11.0667F, -39.3214F, 15.8652F);
		body.addChild(bone3);
		setRotationAngle(bone3, 1.0915F, 0.1128F, -0.7606F);
		bone3.setTextureOffset(130, 0).addBox(-2.9333F, -4.6786F, 0.1348F, 6.0F, 6.0F, 9.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0333F, -15.1786F, 30.6778F);
		bone3.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.0472F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(98, 129).addBox(-2.0F, -1.3301F, -3.3397F, 4.0F, 4.0F, 27.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0667F, -1.6786F, 8.6348F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(98, 50).addBox(-3.1F, -3.0F, -0.5F, 6.0F, 6.0F, 25.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(11.0F, -39.3214F, 16.8652F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.746F, 0.0964F, 0.6996F);
		bone2.setTextureOffset(130, 0).addBox(-3.0F, -4.6786F, -0.8652F, 6.0F, 6.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1F, -15.1786F, 29.6778F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0472F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(98, 129).addBox(-2.0F, -1.3301F, -3.3397F, 4.0F, 4.0F, 27.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.6786F, 7.6348F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(98, 50).addBox(-2.9F, -3.0F, -0.5F, 6.0F, 6.0F, 25.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(bone);
		bone.setTextureOffset(112, 34).addBox(-9.92F, -32.52F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-7.28F, -29.88F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(29, 54).addBox(-8.08F, -43.64F, -6.16F, 16.0F, 14.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-2.36F, -29.88F, -6.16F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-9.92F, -43.08F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-7.28F, -45.72F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-2.36F, -45.72F, -6.16F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(-9.92F, -39.04F, -6.16F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(5.04F, -45.72F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(7.68F, -43.08F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(7.68F, -39.04F, -6.16F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(7.68F, -32.52F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(112, 34).addBox(5.04F, -29.88F, -6.16F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-21.75F, -20.5F, 5.5F);
		left_arm.setTextureOffset(0, 26).addBox(-5.25F, -0.5F, -6.5F, 10.0F, 8.0F, 13.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.2952F, 20.3036F, -3.3064F);
		left_arm.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.0413F, 0.056F, 0.211F);
		cube_r5.setTextureOffset(0, 50).addBox(-2.4548F, 13.38F, -3.6936F, 6.0F, 6.0F, 6.0F, 0.0F, true);
		cube_r5.setTextureOffset(89, 31).addBox(-2.11F, -0.62F, -2.8789F, 5.0F, 14.0F, 5.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.25F, 6.5F, 0.0F);
		left_arm.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2559F, 0.056F, 0.211F);
		cube_r6.setTextureOffset(66, 31).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(21.75F, -20.5F, 5.5F);
		right_arm.setTextureOffset(0, 26).addBox(-4.75F, -0.5F, -6.5F, 10.0F, 8.0F, 13.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.2952F, 20.3036F, -3.3064F);
		right_arm.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.0413F, -0.056F, -0.211F);
		cube_r7.setTextureOffset(0, 50).addBox(-3.0452F, 13.38F, -3.6936F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		cube_r7.setTextureOffset(89, 31).addBox(-2.89F, -0.62F, -2.8789F, 5.0F, 14.0F, 5.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.25F, 6.5F, 0.0F);
		right_arm.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2559F, -0.056F, -0.211F);
		cube_r8.setTextureOffset(66, 31).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 16.0F, 5.0F, 0.0F, true);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(44, 0).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 4).addBox(-7.5F, -1.0F, -2.0F, 1.0F, 1.0F, 15.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 4).addBox(6.5F, -1.0F, -2.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.5F, -1.0F, -2.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(25, 11).addBox(-6.5F, -0.5F, -1.0F, 13.0F, 0.0F, 13.0F, 0.0F, false);
		bb_main.setTextureOffset(25, 4).addBox(4.0F, -1.0F, -6.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(25, 4).addBox(-7.0F, -1.0F, -6.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(44, 26).addBox(7.5F, -2.0F, 3.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(44, 26).addBox(-9.5F, -2.0F, 3.0F, 2.0F, 3.0F, 8.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -0.5F, 12.5F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -3.1416F, 0.0F, 3.1416F);
		cube_r9.setTextureOffset(0, 0).addBox(-6.5F, -0.5F, -0.5F, 13.0F, 1.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}