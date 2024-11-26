// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfrozen_soul extends EntityModel<Entity> {
	private final ModelRenderer flower;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modelfrozen_soul() {
		textureWidth = 64;
		textureHeight = 64;

		flower = new ModelRenderer(this);
		flower.setRotationPoint(0.0F, -18.4197F, -4.0462F);
		setRotationAngle(flower, -0.6109F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 0.0F, -1.0036F);
		cube_r1.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1745F, 0.0F, -2.0944F);
		cube_r2.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 0.0F, 2.0944F);
		cube_r3.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, -3.1416F);
		cube_r5.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0995F, -0.45F);
		flower.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1745F, 0.0F, 1.0036F);
		cube_r6.setTextureOffset(43, 48).addBox(-5.0F, -15.5F, 1.2962F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -14.0F, -5.0F, 10.0F, 14.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-5.0F, -34.0774F, 1.5F, 10.0F, 14.0F, 10.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -33.0774F, 6.5F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.829F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 25).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 14.0F, 8.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -12.0F, 0.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(-4.99F, -13.0F, -5.0F, 10.0F, 14.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		flower.render(matrixStack, buffer, packedLight, packedOverlay);
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