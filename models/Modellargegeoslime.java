// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellargegeoslime extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer helmet;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Modellargegeoslime() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 118).addBox(10.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(72, 0).addBox(-6.0F, -22.0F, -8.0F, 12.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(31, 110).addBox(8.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(31, 110).addBox(10.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(10.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(8.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(6.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(31, 110).addBox(-12.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(-12.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-10.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(82, 0).addBox(-8.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-14.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(12.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(31, 110).addBox(-10.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -10.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(23, 108).addBox(-6.0F, -20.0F, -10.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(-10.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(8.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(120, 116).addBox(-12.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(120, 116).addBox(10.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 118).addBox(-12.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(-10.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(9, 110).addBox(-8.0F, -18.0F, 8.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(18, 112).addBox(-6.0F, -20.0F, 8.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(8.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.setTextureOffset(0, 43).addBox(14.0F, -23.0F, -11.0F, 2.0F, 10.0F, 21.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-16.0F, -23.0F, -11.0F, 2.0F, 10.0F, 21.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-15.0F, -23.0F, 9.0F, 30.0F, 10.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-14.0F, -26.0F, -10.0F, 28.0F, 3.0F, 19.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(2.0F, -23.0F, -12.0F, 13.0F, 9.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-1.0F, -23.0F, -12.0F, 3.0F, 11.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-15.0F, -23.0F, -12.0F, 14.0F, 9.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-13.0F, -14.0F, -12.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(8.0F, -14.0F, -12.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(-15.0F, -14.0F, -12.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		helmet.setTextureOffset(0, 43).addBox(13.0F, -14.0F, -12.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -25.0F, 4.0F);
		helmet.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 70).addBox(6.0F, -14.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, true);
		cube_r1.setTextureOffset(60, 70).addBox(-12.0F, -14.0F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(15.0F, -22.5F, -4.0F);
		helmet.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6109F);
		cube_r2.setTextureOffset(60, 70).addBox(-3.0F, -11.5F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-15.0F, -22.5F, -4.0F);
		helmet.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.setTextureOffset(60, 70).addBox(-3.0F, -11.5F, -3.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -25.5F, -2.0F);
		helmet.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(60, 70).addBox(-3.0F, -10.5F, -11.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		helmet.render(matrixStack, buffer, packedLight, packedOverlay);
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