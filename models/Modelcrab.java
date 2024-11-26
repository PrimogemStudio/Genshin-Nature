// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrab extends EntityModel<Entity> {
	private final ModelRenderer leftleg1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leftleg2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bb_main;

	public Modelcrab() {
		textureWidth = 64;
		textureHeight = 64;

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.5F, 0.0F, -1.5F);
		leftleg1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
		cube_r1.setTextureOffset(0, 61).addBox(-0.5F, -2.0F, 3.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 61).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.5F, 0.0F, 0.5F);
		leftleg1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
		cube_r2.setTextureOffset(0, 61).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, 0.0F, 2.4F);
		leftleg2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
		cube_r3.setTextureOffset(0, 61).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.5F, 0.0F, -1.5F);
		leftleg2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.setTextureOffset(0, 61).addBox(-0.5F, -2.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.1173F, -1.9239F, -1.4F);
		leftleg2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3927F);
		cube_r5.setTextureOffset(0, 61).addBox(-0.1173F, -0.0761F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-2.9846F, 20.3998F, 0.5F);
		setRotationAngle(leftarm, 0.0F, 0.0F, -0.1309F);
		leftarm.setTextureOffset(50, 0).addBox(-4.0154F, 0.6002F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(60, 8).addBox(-4.0154F, -0.3998F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(60, 8).addBox(-4.0154F, -0.3998F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(60, 8).addBox(-2.0154F, -0.3998F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(60, 8).addBox(-2.0154F, -0.3998F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.3846F, -0.0998F, 0.0F);
		leftarm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3054F);
		cube_r6.setTextureOffset(60, 8).addBox(-3.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(60, 8).addBox(-3.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(60, 8).addBox(-1.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(60, 8).addBox(-1.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(50, 0).addBox(-4.4F, -1.3F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(2.9281F, 19.8077F, 0.5F);
		setRotationAngle(rightarm, 3.1416F, 0.0F, -3.0107F);
		rightarm.setTextureOffset(50, 0).addBox(-4.0463F, 0.8007F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(60, 7).addBox(-4.0463F, -0.1993F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(60, 8).addBox(-4.0463F, -0.1993F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(60, 8).addBox(-2.0463F, -0.1993F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightarm.setTextureOffset(60, 7).addBox(-2.0463F, -0.1993F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.3537F, 0.1007F, 0.0F);
		rightarm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3054F);
		cube_r7.setTextureOffset(60, 8).addBox(-3.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(60, 7).addBox(-3.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(60, 8).addBox(-1.4F, -0.3F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(60, 7).addBox(-1.4F, -0.3F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(50, 0).addBox(-4.4F, -1.3F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 3.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 61).addBox(-2.0F, -6.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 61).addBox(1.0F, -6.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}