// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgeo_hypostasis_hammer extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelgeo_hypostasis_hammer() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -40.0F, -4.0F, 8.0F, 40.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 104).addBox(-19.0F, -52.0F, -6.0F, 38.0F, 12.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(78, 0).addBox(19.0F, -54.0F, -8.0F, 9.0F, 16.0F, 16.0F, 0.0F, false);
		bb_main.setTextureOffset(78, 0).addBox(-28.0F, -54.0F, -8.0F, 9.0F, 16.0F, 16.0F, 0.0F, false);
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