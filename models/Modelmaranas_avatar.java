// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmaranas_avatar extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelmaranas_avatar() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-15.0F, -25.0F, -15.0F, 5.0F, 20.0F, 29.0F, 0.0F, true);
		bone.setTextureOffset(83, 2).addBox(-10.0F, -25.0F, -14.0F, 2.0F, 20.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(83, 2).addBox(8.0F, -25.0F, -14.0F, 2.0F, 20.0F, 0.0F, 0.0F, true);
		bone.setTextureOffset(0, 94).addBox(-15.0F, -30.0F, -15.0F, 30.0F, 5.0F, 29.0F, 0.0F, false);
		bone.setTextureOffset(94, 3).addBox(-8.0F, -7.0F, -14.0F, 16.0F, 2.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(10.0F, -25.0F, -15.0F, 5.0F, 20.0F, 29.0F, 0.0F, false);
		bone.setTextureOffset(0, 52).addBox(-15.0F, -30.0F, 14.0F, 30.0F, 30.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(73, 45).addBox(-5.0F, -19.0F, -8.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -24.0F, -14.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -3.1416F);
		cube_r1.setTextureOffset(94, 3).addBox(-8.0F, -1.0F, 0.0F, 16.0F, 2.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -2.5F, -0.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);
		cube_r2.setTextureOffset(0, 94).addBox(-15.0F, -2.5F, -14.5F, 30.0F, 5.0F, 29.0F, 0.0F, true);
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