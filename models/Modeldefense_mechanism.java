// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldefense_mechanism extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer triangle;
	private final ModelRenderer triangle2;
	private final ModelRenderer triangle3;

	public Modeldefense_mechanism() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-9.0F, -18.0F, 0.0F, 18.0F, 18.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(23, 33).addBox(-4.0F, -12.0F, -1.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);

		triangle = new ModelRenderer(this);
		triangle.setRotationPoint(0.0F, -12.0F, 0.0F);
		bone.addChild(triangle);
		triangle.setTextureOffset(34, 47).addBox(-7.0F, -17.0F, -1.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);
		triangle.setTextureOffset(0, 57).addBox(-5.0F, -23.0F, -1.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);

		triangle2 = new ModelRenderer(this);
		triangle2.setRotationPoint(-5.0F, -8.0F, 0.0F);
		bone.addChild(triangle2);
		setRotationAngle(triangle2, 0.0F, 0.0F, -2.1817F);
		triangle2.setTextureOffset(34, 47).addBox(-7.0F, -17.0F, -1.01F, 14.0F, 16.0F, 1.0F, 0.0F, false);
		triangle2.setTextureOffset(0, 57).addBox(-5.0F, -23.0F, -1.01F, 10.0F, 6.0F, 1.0F, 0.0F, false);

		triangle3 = new ModelRenderer(this);
		triangle3.setRotationPoint(4.0F, -8.0F, 0.0F);
		bone.addChild(triangle3);
		setRotationAngle(triangle3, 0.0F, 0.0F, 2.1817F);
		triangle3.setTextureOffset(34, 47).addBox(-7.0F, -17.0F, -1.1F, 14.0F, 16.0F, 1.0F, 0.0F, false);
		triangle3.setTextureOffset(0, 57).addBox(-5.0F, -23.0F, -1.1F, 10.0F, 6.0F, 1.0F, 0.0F, false);
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