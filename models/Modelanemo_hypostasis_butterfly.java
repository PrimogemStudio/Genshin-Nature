// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelanemo_hypostasis_butterfly extends EntityModel<Entity> {
	private final ModelRenderer inside_cube;
	private final ModelRenderer bb_main;

	public Modelanemo_hypostasis_butterfly() {
		textureWidth = 128;
		textureHeight = 128;

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(0.0F, 19.0F, 0.0F);
		inside_cube.setTextureOffset(0, 0).addBox(-8.0F, -13.0F, -8.0F, 16.0F, 11.0F, 16.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(26, 109).addBox(7.0F, -13.0F, -9.0F, 33.0F, 1.0F, 18.0F, 0.0F, false);
		bb_main.setTextureOffset(26, 109).addBox(-40.0F, -13.0F, -9.0F, 33.0F, 1.0F, 18.0F, 0.0F, true);
		bb_main.setTextureOffset(66, 109).addBox(-20.0F, -13.0F, 9.0F, 13.0F, 1.0F, 18.0F, 0.0F, false);
		bb_main.setTextureOffset(66, 109).addBox(7.0F, -13.0F, 9.0F, 13.0F, 1.0F, 18.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		inside_cube.render(matrixStack, buffer, packedLight, packedOverlay);
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