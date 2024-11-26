// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwhirling_cryo_fungus extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer hat;
	private final ModelRenderer cube_r1;

	public Modelwhirling_cryo_fungus() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, 1.0F);
		bone.setTextureOffset(29, 28).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(77, 33).addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(3, 68).addBox(-2.0F, -15.0F, -4.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(hat);
		hat.setTextureOffset(48, 82).addBox(-9.0F, -18.0F, -11.0F, 20.0F, 3.0F, 20.0F, 0.0F, false);
		hat.setTextureOffset(56, 40).addBox(-8.0F, -20.0F, -10.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);
		hat.setTextureOffset(0, 112).addBox(-6.0F, -22.0F, -8.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(4, 97).addBox(-4.0F, -23.0F, -6.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(8.5F, -18.5F, -10.0F);
		hat.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.2217F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(57, 14).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(57, 14).addBox(-15.5F, -0.5F, -5.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
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