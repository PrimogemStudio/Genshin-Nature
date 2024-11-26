// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectro_hypostasis_triangle extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer inside_cube;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;

	public Modelelectro_hypostasis_triangle() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0F);

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(0.0F, 9.0F, 0.0F);
		bone.addChild(inside_cube);
		inside_cube.setTextureOffset(14, 14).addBox(-4.0F, -11.0F, -3.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);
		inside_cube.setTextureOffset(94, 118).addBox(-4.0F, -8.0F, -10.0F, 8.0F, 1.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.0F, -7.5F, 4.5F);
		inside_cube.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.9599F, 0.0F);
		cube_r1.setTextureOffset(94, 118).addBox(-3.0F, -0.5F, -2.5F, 8.0F, 1.0F, 7.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.0F, -7.5F, 3.5F);
		inside_cube.addChild(bone2);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.9599F, 0.0F);
		cube_r2.setTextureOffset(94, 118).addBox(-4.0F, -0.5F, -2.5F, 8.0F, 1.0F, 7.0F, 0.0F, false);
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