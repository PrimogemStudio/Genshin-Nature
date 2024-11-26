// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectro_hypostasis_laser extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer inside_cube;
	private final ModelRenderer cube_r1;
	private final ModelRenderer outside_cubes;

	public Modelelectro_hypostasis_laser() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 13.0F);
		setRotationAngle(bone, 0.5672F, 0.0F, 0.0F);

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(-2.0F, -5.0F, 0.0F);
		bone.addChild(inside_cube);
		inside_cube.setTextureOffset(7, 7).addBox(3.0F, -11.0F, -38.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(-12.0F, -11.0F, -36.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(-12.0F, -11.0F, -9.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(3.0F, -11.0F, -11.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(8.0F, -11.0F, 28.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(-7.0F, -11.0F, 31.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(-7.0F, -11.0F, 4.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		inside_cube.setTextureOffset(7, 7).addBox(8.0F, -11.0F, 1.0F, 4.0F, 4.0F, 17.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(29.0F, -9.0F, 9.5F);
		inside_cube.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(7, 7).addBox(14.0F, -2.0F, -32.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-2.0F, -2.0F, -30.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-15.0F, -2.0F, -40.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-15.0F, -2.0F, -14.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(8.0F, -2.0F, -39.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-4.0F, -2.0F, -34.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-19.0F, -2.0F, -29.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-19.0F, -2.0F, -56.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-4.0F, -2.0F, -61.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(8.0F, -2.0F, -66.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(14.0F, -2.0F, -6.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);
		cube_r1.setTextureOffset(7, 7).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 17.0F, 0.0F, false);

		outside_cubes = new ModelRenderer(this);
		outside_cubes.setRotationPoint(-2.0F, -5.0F, 0.0F);
		bone.addChild(outside_cubes);
		outside_cubes.setTextureOffset(88, 108).addBox(-20.0F, -14.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(15.0F, -14.0F, 6.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(-15.0F, -14.0F, -19.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(0.0F, -14.0F, -21.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(13.0F, -14.0F, -11.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(-16.0F, -14.0F, 7.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(5.0F, -14.0F, 18.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(-10.0F, -14.0F, 21.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
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