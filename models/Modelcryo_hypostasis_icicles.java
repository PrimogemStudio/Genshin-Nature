// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcryo_hypostasis_icicles extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelcryo_hypostasis_icicles() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-14.7F, -33.0F, 0.0F, 29.0F, 29.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-12.0F, -4.0F, 1.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3927F, 0.2182F);
		cube_r1.setTextureOffset(35, 53).addBox(16.0F, -37.0F, -10.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(35, 53).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(18.0F, -4.0F, 1.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3054F, 0.4363F, 0.3054F);
		cube_r2.setTextureOffset(35, 53).addBox(-36.0F, -17.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(35, 53).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-18.5F, -19.5F, 0.5F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3615F, -0.5823F, -0.0997F);
		cube_r3.setTextureOffset(33, 52).addBox(-3.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(20.5F, -19.5F, 0.5F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4498F, -0.2368F, -0.2799F);
		cube_r4.setTextureOffset(33, 52).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, -20.5F, 0.5F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.48F, 0.4363F);
		cube_r5.setTextureOffset(33, 52).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
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