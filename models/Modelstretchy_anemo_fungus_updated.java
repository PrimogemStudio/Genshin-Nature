// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelstretchy_anemo_fungus_updated extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer hat;

	public Modelstretchy_anemo_fungus_updated() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, -1.0F);
		bone.setTextureOffset(112, 106).addBox(-1.0F, -18.0F, -1.0F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(2.0F, 2.0F, 0.0F);
		bone.addChild(hat);
		hat.setTextureOffset(36, 45).addBox(-9.0F, -21.0F, -7.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		hat.setTextureOffset(58, 68).addBox(-8.0F, -22.0F, -6.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(4, 75).addBox(-6.0F, -23.0F, -4.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}