// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelendora extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modelendora() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(3.5F, 11.0F, -2.0F);
		setRotationAngle(bone, 0.3491F, 0.0F, 0.0F);
		bone.setTextureOffset(16, 22).addBox(-6.5F, 0.0F, -1.0F, 6.0F, 10.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(48, 1).addBox(-6.5F, 0.0F, -2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(29, 2).addBox(-4.5F, 2.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(57, 13).addBox(-5.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(57, 13).addBox(-2.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(43, 9).addBox(-4.5F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-7.0F, 2.0F, -1.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.5236F, 0.1309F);
		cube_r1.setTextureOffset(1, 1).addBox(0.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 2.0F, -1.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.5236F, -0.1309F);
		cube_r2.setTextureOffset(1, 1).addBox(-1.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, 10.0F, 1.5F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 24).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.0F, 0.0F);
		head.setTextureOffset(14, 8).addBox(-3.0F, -6.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(45, 24).addBox(3.0F, -4.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(45, 24).addBox(-4.0F, -4.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(3.0F, -7.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(-3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(40, 34).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(41, 17).addBox(-3.0F, -7.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 35).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(-3.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(2.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(2.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(17, 40).addBox(-3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(17, 41).addBox(-2.0F, -9.0F, -3.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(17, 41).addBox(-2.0F, -10.0F, -1.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.9F, -6.5F, -2.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(2, 17).addBox(-6.4F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(2, 17).addBox(-0.4F, -3.5F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.4749F, 11.787F, 0.3386F);
		setRotationAngle(left_arm, 0.3491F, 0.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0251F, 0.4606F, -0.9284F);
		left_arm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.5236F);
		cube_r5.setTextureOffset(0, 34).addBox(0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0251F, 0.4606F, -0.9284F);
		left_arm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
		cube_r6.setTextureOffset(0, 51).addBox(0.9F, 0.0F, -2.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.4003F, 11.4705F, 0.2234F);
		setRotationAngle(right_arm, 0.3491F, 0.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0997F, 0.7974F, -0.9284F);
		right_arm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
		cube_r7.setTextureOffset(0, 51).addBox(-0.9F, 0.0F, -2.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0997F, 0.7974F, -0.9284F);
		right_arm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.5236F);
		cube_r8.setTextureOffset(0, 34).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 8.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}