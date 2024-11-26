// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpyro_hypostasis_fist extends EntityModel<Entity> {
	private final ModelRenderer inside_cube;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelpyro_hypostasis_fist() {
		textureWidth = 128;
		textureHeight = 128;

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(0.0F, 22.0F, 0.0F);
		inside_cube.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		inside_cube.setTextureOffset(92, 111).addBox(-7.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, 0.0F, false);
		inside_cube.setTextureOffset(92, 111).addBox(2.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(8.0F, -7.5F, -4.5F);
		inside_cube.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
		cube_r1.setTextureOffset(94, 118).addBox(0.0F, -2.5F, -2.5F, 10.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-8.0F, -7.5F, -4.5F);
		inside_cube.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
		cube_r2.setTextureOffset(94, 118).addBox(-10.0F, -2.5F, -2.5F, 11.0F, 5.0F, 5.0F, 0.0F, false);
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