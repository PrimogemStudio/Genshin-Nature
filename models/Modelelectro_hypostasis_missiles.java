// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectro_hypostasis_missiles extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bb_main;

	public Modelelectro_hypostasis_missiles() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(6, 6).addBox(-8.0F, -21.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(10.0F, -16.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(9.0F, -25.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(9.0F, -7.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(-13.0F, -25.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(-14.0F, -16.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(103, 117).addBox(-13.0F, -7.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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