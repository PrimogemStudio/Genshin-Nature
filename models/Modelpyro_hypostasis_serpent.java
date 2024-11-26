// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpyro_hypostasis_serpent extends EntityModel<Entity> {
	private final ModelRenderer inside_cube;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelpyro_hypostasis_serpent() {
		textureWidth = 128;
		textureHeight = 128;

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(0.0F, 19.0F, 0.0F);
		inside_cube.setTextureOffset(11, 10).addBox(-3.0F, 0.5F, 6.1716F, 6.0F, 5.0F, 10.0F, 0.0F, false);
		inside_cube.setTextureOffset(95, 116).addBox(-1.0F, -0.5F, 7.1716F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		inside_cube.setTextureOffset(95, 116).addBox(-1.0F, 0.5F, 17.1716F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		inside_cube.setTextureOffset(95, 116).addBox(-1.0F, 1.5F, 27.1716F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		inside_cube.setTextureOffset(11, 10).addBox(-3.0F, 1.5F, 16.1716F, 6.0F, 4.0F, 10.0F, 0.0F, false);
		inside_cube.setTextureOffset(11, 10).addBox(-2.0F, 2.5F, 26.1716F, 4.0F, 3.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.5F, -2.0F);
		inside_cube.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(97, 118).addBox(-1.0F, -4.5F, 0.1716F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		cube_r1.setTextureOffset(11, 10).addBox(-3.0F, -3.5F, -1.8284F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.753F, -10.253F);
		inside_cube.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.3526F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(19, 14).addBox(-3.0F, 1.7929F, -6.864F, 6.0F, 9.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(114, 126).addBox(-3.0F, 9.753F, -4.864F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(102, 113).addBox(2.0F, 2.753F, -4.864F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(102, 113).addBox(-3.0F, 2.753F, -4.864F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(102, 113).addBox(-3.0F, 2.753F, -2.864F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(102, 113).addBox(2.0F, 2.753F, -2.864F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(114, 126).addBox(-3.0F, 9.753F, -2.864F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(19, 14).addBox(-3.0F, 1.7929F, -1.864F, 6.0F, 9.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(19, 14).addBox(-3.0F, -3.2071F, -6.864F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.5F, -4.0F);
		inside_cube.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(13, 10).addBox(-3.0F, -2.5F, -9.0F, 6.0F, 5.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		inside_cube.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}