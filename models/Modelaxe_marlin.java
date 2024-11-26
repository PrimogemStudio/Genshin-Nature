// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelaxe_marlin extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelaxe_marlin() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 22.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 20).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(44, 38).addBox(-2.0F, 0.0F, -5.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 47).addBox(-2.0F, 1.0F, -5.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(44, 0).addBox(-2.0F, -4.0F, -5.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -5.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(41, 14).addBox(-1.0F, -6.0F, 6.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 0.5F, -5.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(33, 11).addBox(-0.5F, -2.9142F, -0.0858F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -2.0F, -3.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
		cube_r2.setTextureOffset(56, 58).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.1F, -2.0F, -3.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
		cube_r3.setTextureOffset(56, 58).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, false);
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