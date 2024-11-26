// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelperpetual_mechanical_array_defense extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer outside_cubes;
	private final ModelRenderer bb_main;

	public Modelperpetual_mechanical_array_defense() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 10.0F, 0.0F);

		outside_cubes = new ModelRenderer(this);
		outside_cubes.setRotationPoint(0.0F, 9.0F, 0.0F);
		bone.addChild(outside_cubes);
		outside_cubes.setTextureOffset(88, 108).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 45).addBox(-11.0F, -14.0F, -11.0F, 22.0F, 15.0F, 22.0F, 0.0F, false);
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
	}
}