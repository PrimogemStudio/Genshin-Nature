// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelelectro_hypostasis_hands extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public Modelelectro_hypostasis_hands() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-12.0F, -9.0F, -1.0F, 12.0F, 9.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-16.0F, -17.0F, -1.0F, 13.0F, 8.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-22.0F, -24.0F, -1.0F, 13.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.6667F, -12.6667F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-10.6667F, 3.6667F, -1.0F, 12.0F, 9.0F, 2.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 0).addBox(-14.6667F, -4.3333F, -1.0F, 13.0F, 8.0F, 2.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 0).addBox(-20.6667F, -11.3333F, -1.0F, 13.0F, 7.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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