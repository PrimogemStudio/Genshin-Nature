// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpyro_hypostasis_missiles extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelpyro_hypostasis_missiles() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-8.44F, -26.28F, -1.32F, 17.0F, 21.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(-7.44F, -4.28F, -5.32F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 60).addBox(-4.44F, -14.28F, 1.68F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(-2.44F, -3.28F, 0.68F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(9.56F, -18.28F, 1.68F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(-7.44F, -28.28F, 1.68F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 60).addBox(-12.44F, -19.28F, -7.32F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 60).addBox(5.56F, -12.28F, -7.32F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(0.56F, -26.28F, -7.32F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 60).addBox(0.56F, -23.28F, 0.68F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(58, 0).addBox(8.56F, -25.28F, -1.32F, 2.0F, 19.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(58, 0).addBox(-10.44F, -25.28F, -1.32F, 2.0F, 19.0F, 1.0F, 0.0F, false);
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