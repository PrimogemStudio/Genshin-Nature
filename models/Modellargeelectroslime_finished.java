// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellargeelectroslime_finished extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bb_main;

	public Modellargeelectroslime_finished() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 118).addBox(10.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-6.0F, -22.0F, -8.0F, 12.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(8.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(10.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(10.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(2, 110).addBox(8.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(92, 0).addBox(6.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-12.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-12.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(0, 110).addBox(-10.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(92, 0).addBox(-8.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(30, 104).addBox(-14.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(30, 104).addBox(12.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, 0.0F, true);
		bone.setTextureOffset(0, 110).addBox(-10.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -10.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(32, 112).addBox(-6.0F, -20.0F, -10.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(-10.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 114).addBox(8.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 118).addBox(-12.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(120, 118).addBox(10.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 118).addBox(-12.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(-10.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 110).addBox(-8.0F, -18.0F, 8.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(23, 110).addBox(-6.0F, -20.0F, 8.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 114).addBox(8.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -21.0F, -1.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 66).addBox(-1.0F, -16.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 66).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 114).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(21, 45).addBox(14.03F, -14.0F, -8.0F, 0.0F, 8.0F, 16.0F, 0.0F, false);
		bb_main.setTextureOffset(76, 70).addBox(-14.05F, -14.0F, -8.0F, 0.0F, 8.0F, 16.0F, 0.0F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}