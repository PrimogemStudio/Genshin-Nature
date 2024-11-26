// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelstretchy_pyro_fungus extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer hat;
	private final ModelRenderer cube_r1;

	public Modelstretchy_pyro_fungus() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, -1.0F);
		bone.setTextureOffset(112, 106).addBox(-1.0F, -18.0F, -1.0F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(2.0F, 2.0F, 0.0F);
		bone.addChild(hat);
		hat.setTextureOffset(36, 45).addBox(-9.0F, -22.0F, -7.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		hat.setTextureOffset(44, 24).addBox(-8.0F, -20.0F, -7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(44, 24).addBox(-8.0F, -20.0F, 8.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(88, 24).addBox(6.0F, -20.0F, -6.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(88, 24).addBox(-9.0F, -20.0F, -6.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(58, 68).addBox(-8.0F, -25.0F, -6.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(4, 75).addBox(-6.0F, -27.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		hat.setTextureOffset(6, 41).addBox(-5.0F, -28.0F, -3.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.5F, -24.5F, -6.0F);
		hat.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.8727F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(29, 106).addBox(8.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(29, 106).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
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