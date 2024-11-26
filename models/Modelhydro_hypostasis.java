// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhydro_hypostasis extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer inside_cube;
	private final ModelRenderer outside_cubes;

	public Modelhydro_hypostasis() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(bone, -3.1416F, 0.0F, -3.098F);

		inside_cube = new ModelRenderer(this);
		inside_cube.setRotationPoint(0.0F, 9.0F, 0.0F);
		bone.addChild(inside_cube);
		inside_cube.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		outside_cubes = new ModelRenderer(this);
		outside_cubes.setRotationPoint(0.0F, 9.0F, 0.0F);
		bone.addChild(outside_cubes);
		outside_cubes.setTextureOffset(88, 108).addBox(-11.0F, -20.0F, 1.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(1.0F, -20.0F, 1.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(-12.0F, -22.0F, -12.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(1.0F, -20.0F, -11.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(-11.0F, -8.0F, -11.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(1.0F, -8.0F, -11.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(-11.0F, -8.0F, 1.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(2.0F, -6.0F, 2.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
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