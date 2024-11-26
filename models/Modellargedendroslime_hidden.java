// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellargedendroslime_hidden extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modellargedendroslime_hidden() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(29, 25).addBox(-3.5F, -14.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -1.5937F, -4.5774F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(88, 39).addBox(-3.0F, -11.5F, -1.5F, 6.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -1.5937F, 4.4226F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(88, 39).addBox(-3.0F, -11.5F, -1.5F, 6.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.4226F, -0.5937F, 0.4226F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, -0.4363F);
		cube_r3.setTextureOffset(88, 39).addBox(-3.0F, -12.5F, -1.5F, 6.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.5774F, -0.5937F, 0.4226F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.4363F);
		cube_r4.setTextureOffset(88, 39).addBox(-3.0F, -12.5F, -1.5F, 6.0F, 13.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.5F, -1.0937F, 0.4226F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.9599F);
		cube_r5.setTextureOffset(59, 48).addBox(-2.5F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.5F, -1.0937F, 0.4226F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, -0.9599F);
		cube_r6.setTextureOffset(59, 48).addBox(-2.5F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -1.0937F, 5.4226F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(59, 48).addBox(-3.0F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, -1.0937F, -5.5774F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(59, 48).addBox(-3.0F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, 0.0F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}