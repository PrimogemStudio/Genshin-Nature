// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellargeanemoslime_fixed extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer wings;

	public Modellargeanemoslime_fixed() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 110).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(7, 110).addBox(-6.0F, -22.0F, -8.0F, 12.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(8.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(10.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(10.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(8.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(6.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(72, 0).addBox(-12.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(-12.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-10.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-8.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-14.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(12.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(73, 0).addBox(-10.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -10.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(18, 113).addBox(-6.0F, -20.0F, -10.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(-10.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(8.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 118).addBox(-12.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 118).addBox(10.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 118).addBox(-12.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(-10.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(12, 110).addBox(-8.0F, -18.0F, 8.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(19, 114).addBox(-6.0F, -20.0F, 8.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(8.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 118).addBox(10.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 1.0F);
		bone.addChild(wings);
		wings.setTextureOffset(0, 62).addBox(8.0F, -20.0F, -3.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(0, 60).addBox(8.0F, -22.0F, -3.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(0, 58).addBox(8.0F, -24.0F, -3.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(56, 56).addBox(-18.0F, -24.0F, -3.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(66, 82).addBox(-16.0F, -22.0F, -3.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(0, 72).addBox(-14.0F, -20.0F, -3.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}