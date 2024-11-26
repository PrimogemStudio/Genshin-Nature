// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscorpion extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_arm2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg2;
	private final ModelRenderer left_leg2;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Modelscorpion() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 22.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(27, 0).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.2512F, -0.2735F, -3.6961F);
		bone.addChild(right_arm);
		right_arm.setTextureOffset(0, 28).addBox(-0.2512F, -0.7265F, -0.3039F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(22, 51).addBox(3.7488F, -0.7265F, -6.3039F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(48, 40).addBox(2.7488F, -3.7265F, -7.3039F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 51).addBox(3.2488F, -2.7265F, -8.3039F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(44, 1).addBox(3.7488F, -1.7265F, -9.3039F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(58, 24).addBox(3.2488F, -2.7265F, -2.3039F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 49).addBox(3.7488F, -1.7265F, -1.3039F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.2488F, 0.7735F, -4.8039F);
		right_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(52, 10).addBox(-0.49F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		left_arm2 = new ModelRenderer(this);
		left_arm2.setRotationPoint(-3.2488F, -0.2735F, -3.6961F);
		bone.addChild(left_arm2);
		left_arm2.setTextureOffset(0, 28).addBox(-4.7512F, -0.7265F, -0.3039F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm2.setTextureOffset(22, 51).addBox(-4.7512F, -0.7265F, -6.3039F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		left_arm2.setTextureOffset(48, 40).addBox(-5.7512F, -3.7265F, -7.3039F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		left_arm2.setTextureOffset(0, 51).addBox(-5.2512F, -2.7265F, -8.3039F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm2.setTextureOffset(44, 1).addBox(-4.7512F, -1.7265F, -9.3039F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm2.setTextureOffset(58, 24).addBox(-5.2512F, -2.7265F, -2.3039F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm2.setTextureOffset(18, 49).addBox(-4.7512F, -1.7265F, -1.3039F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.2512F, 0.7735F, -4.8039F);
		left_arm2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(52, 10).addBox(-0.49F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.5F, -0.5F, -5.5F);
		bone.addChild(bone3);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.3054F, 0.0F);
		cube_r3.setTextureOffset(56, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.5F, -0.5F, -5.5F);
		bone.addChild(bone2);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
		cube_r4.setTextureOffset(56, 0).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 0.5F, -1.5F);
		bone.addChild(left_leg);
		setRotationAngle(left_leg, 0.0F, 0.0F, 0.5236F);
		left_leg.setTextureOffset(24, 26).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(3.0F, 0.5F, 3.5F);
		bone.addChild(right_leg);
		setRotationAngle(right_leg, 0.0F, 0.0F, 0.5236F);
		right_leg.setTextureOffset(24, 26).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(-3.0F, 0.5F, -1.5F);
		bone.addChild(right_leg2);
		setRotationAngle(right_leg2, 0.0F, 0.0F, -0.5236F);
		right_leg2.setTextureOffset(24, 26).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(-3.0F, 0.5F, 3.5F);
		bone.addChild(left_leg2);
		setRotationAngle(left_leg2, 0.0F, 0.0F, -0.5236F);
		left_leg2.setTextureOffset(24, 26).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.0F, 6.5F);
		bone.addChild(tail);
		setRotationAngle(tail, 0.7854F, 0.0F, 0.0F);
		tail.setTextureOffset(28, 50).addBox(-2.99F, -1.0F, -1.5F, 6.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.99F, -8.5711F, 12.9853F);
		tail.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.8762F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 35).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 35).addBox(7.0F, -2.0F, -3.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -2.9497F, 14.0355F);
		tail.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.5708F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(40, 29).addBox(-2.99F, -2.0503F, -0.3787F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.01F, 0.0F, 11.5F);
		tail.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 57).addBox(-3.01F, -2.0F, -1.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_leg2.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_leg2.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}