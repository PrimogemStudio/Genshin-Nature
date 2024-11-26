// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcoral_butterfly extends EntityModel<Entity> {
	private final ModelRenderer wing;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer wing2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bb_main;

	public Modelcoral_butterfly() {
		textureWidth = 64;
		textureHeight = 64;

		wing = new ModelRenderer(this);
		wing.setRotationPoint(-0.9262F, 22.0F, 0.2462F);
		setRotationAngle(wing, 0.0F, 0.0F, 0.2618F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0738F, 0.0F, -2.2462F);
		wing.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-8.0F, -0.5F, -1.0F, 7.0F, 1.0F, 3.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.0738F, 0.0F, 1.7538F);
		wing.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
		cube_r2.setTextureOffset(46, 0).addBox(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 6.0F, 0.0F, true);

		wing2 = new ModelRenderer(this);
		wing2.setRotationPoint(0.9262F, 22.0F, 0.2462F);
		setRotationAngle(wing2, 0.0F, 0.0F, -0.2618F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0738F, 0.0F, -2.2462F);
		wing2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.1745F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(1.0F, -0.5F, -1.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0738F, 0.0F, 1.7538F);
		wing2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
		cube_r4.setTextureOffset(46, 0).addBox(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 58).addBox(-2.0F, -3.0F, -1.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		wing.render(matrixStack, buffer, packedLight, packedOverlay);
		wing2.render(matrixStack, buffer, packedLight, packedOverlay);
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