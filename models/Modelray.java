// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelray extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modelray() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-2.0F, -3.5F, 1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 55).addBox(-1.0F, -3.5F, 4.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.5076F, -2.5868F, 1.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
		cube_r1.setTextureOffset(0, 51).addBox(0.0076F, -0.5F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 59).addBox(-0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.4924F, -2.5868F, 1.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
		cube_r2.setTextureOffset(0, 51).addBox(-1.9924F, -0.5F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 59).addBox(-2.5F, -0.5F, -1.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -2.5F, 11.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(16, 30).addBox(-4.0F, -1.1F, 1.5F, 3.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r3.setTextureOffset(16, 30).addBox(1.0F, -1.1F, 1.5F, 3.0F, 2.0F, 9.0F, 0.0F, true);
		cube_r3.setTextureOffset(46, 42).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5F, -2.5F, -6.5F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(56, 22).addBox(3.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(56, 22).addBox(0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.5F, -2.5F, -3.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
		cube_r5.setTextureOffset(46, 13).addBox(-9.5F, -0.4F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, -2.5F, -3.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
		cube_r6.setTextureOffset(38, 0).addBox(-6.0F, -0.5F, -3.5F, 6.0F, 1.0F, 7.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.5F, -2.5F, -3.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
		cube_r7.setTextureOffset(46, 13).addBox(6.5F, -0.4F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0F, -2.5F, -3.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
		cube_r8.setTextureOffset(38, 0).addBox(0.0F, -0.5F, -3.5F, 6.0F, 1.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}