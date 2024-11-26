// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelonikabuto extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r2;

	public Modelonikabuto() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 22.8461F, -2.7083F);
		head.setTextureOffset(0, 29).addBox(-2.0F, -1.3461F, -2.2917F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.8461F, -1.7917F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 50).addBox(-2.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 50).addBox(1.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 62).addBox(0.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 62).addBox(-2.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 59).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(36, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(0.1F, -4.0F, 0.7F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 10).addBox(-3.0F, -4.0F, -2.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 15).addBox(2.4F, -3.0F, 0.7F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 15).addBox(-3.6F, -3.0F, 0.7F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.3F, -4.0F, 0.7F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		bb_main.setTextureOffset(54, 15).addBox(2.4F, -3.0F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 15).addBox(-3.6F, -3.0F, -2.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(3.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 60).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 60).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(-4.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(-5.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(5.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(-7.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(3.0F, -1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(-5.0F, -1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(-6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 61).addBox(5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.5F, -1.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(60, 30).addBox(0.5F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(60, 30).addBox(-1.5F, -3.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(38, 30).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}