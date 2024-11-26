// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelperpetual_mechanical_array_sword extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer outside_cubes;

	public Modelperpetual_mechanical_array_sword() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.1347F, 0.0435F, 0.0873F);

		outside_cubes = new ModelRenderer(this);
		outside_cubes.setRotationPoint(0.0F, -13.5F, 0.745F);
		bone.addChild(outside_cubes);
		outside_cubes.setTextureOffset(88, 108).addBox(-5.0F, -21.5F, -4.745F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(92, 112).addBox(-5.0F, -31.5F, -2.755F, 10.0F, 10.0F, 6.0F, 0.0F, true);
		outside_cubes.setTextureOffset(94, 114).addBox(-5.0F, -41.5F, -1.755F, 10.0F, 10.0F, 4.0F, 0.0F, true);
		outside_cubes.setTextureOffset(94, 114).addBox(-5.0F, -51.5F, -1.755F, 10.0F, 10.0F, 4.0F, 0.0F, true);
		outside_cubes.setTextureOffset(88, 108).addBox(4.0F, -19.5F, -4.755F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(-14.0F, -19.5F, -4.755F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		outside_cubes.setTextureOffset(88, 108).addBox(-5.0F, -11.5F, -4.745F, 10.0F, 10.0F, 10.0F, 0.0F, true);
		outside_cubes.setTextureOffset(90, 114).addBox(-5.0F, -1.5F, -3.745F, 10.0F, 5.0F, 8.0F, 0.0F, true);
		outside_cubes.setTextureOffset(94, 112).addBox(-4.0F, 3.5F, -2.745F, 8.0F, 10.0F, 6.0F, 0.0F, true);
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