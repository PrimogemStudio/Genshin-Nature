// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgeoslime extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Modelgeoslime() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 55).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-6.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(-7.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-4.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(3.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 0).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 56).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 59).addBox(-6.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 56).addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(30, 59).addBox(5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(12, 55).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 56).addBox(5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(4.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(20, 54).addBox(-3.0F, -10.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 54).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 56).addBox(-6.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 26).addBox(-0.5F, -13.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.0F, -10.0F, -3.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2618F);
		cube_r1.setTextureOffset(0, 26).addBox(-5.0F, -5.5F, 3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, -10.0F, -3.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2618F);
		cube_r2.setTextureOffset(0, 26).addBox(-0.5F, -4.0F, 3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -10.0F, -3.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.48F);
		cube_r3.setTextureOffset(0, 26).addBox(-5.5F, -6.5F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, -10.0F, -3.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.48F);
		cube_r4.setTextureOffset(0, 26).addBox(0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}