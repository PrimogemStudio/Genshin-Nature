// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectric_tnt extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelelectric_tnt() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 48).addBox(-7.0F, -16.0F, 7.0F, 14.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(34, 35).addBox(7.0F, -16.0F, -7.0F, 1.0F, 15.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(34, 35).addBox(-8.0F, -16.0F, -7.0F, 1.0F, 15.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 48).addBox(-7.0F, -16.0F, -8.0F, 14.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -17.0F, -7.0F, 14.0F, 17.0F, 14.0F, 0.0F, false);
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