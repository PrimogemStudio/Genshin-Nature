// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelanemoslime extends EntityModel<Entity> {
	private final ModelRenderer wings;
	private final ModelRenderer bb_main;

	public Modelanemoslime() {
		textureWidth = 64;
		textureHeight = 64;

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 24.0F, 0.0F);
		wings.setTextureOffset(0, 29).addBox(5.0F, -13.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(0, 29).addBox(-9.0F, -13.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		wings.setTextureOffset(0, 31).addBox(5.0F, -11.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(0, 30).addBox(5.0F, -12.0F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(0, 29).addBox(5.0F, -13.0F, -1.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(28, 28).addBox(-10.0F, -13.0F, -1.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(33, 41).addBox(-9.0F, -12.0F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(0, 36).addBox(-8.0F, -11.0F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

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
		bb_main.setTextureOffset(60, 57).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 59).addBox(-6.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 57).addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 59).addBox(5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 57).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 59).addBox(5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 57).addBox(4.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(9, 56).addBox(-3.0F, -10.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 57).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 59).addBox(-6.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		wings.render(matrixStack, buffer, packedLight, packedOverlay);
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