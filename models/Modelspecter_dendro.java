// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspecter_dendro extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modelspecter_dendro() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-6.6735F, 7.9412F, 6.8185F);
		setRotationAngle(bone, 2.4435F, 0.1534F, -2.6057F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0249F, -0.5567F, 3.1597F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.6591F, -0.8138F, 0.0017F);
		cube_r1.setTextureOffset(10, 51).addBox(-5.5F, -6.0F, 1.0218F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 51).addBox(-2.5F, -6.0F, 1.0218F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		cube_r1.setTextureOffset(48, 31).addBox(-3.5F, -5.0F, 1.0218F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(6.6948F, 7.4807F, 6.6878F);
		setRotationAngle(bone2, 2.3067F, -0.2039F, 2.47F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.153F, 0.0591F, 0.1575F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, -2.5102F, 0.7879F, 0.1022F);
		cube_r2.setTextureOffset(10, 51).addBox(-2.5F, -6.0F, -0.3453F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 51).addBox(0.5F, -6.0F, -0.3453F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		cube_r2.setTextureOffset(48, 31).addBox(-0.5F, -5.0F, -0.3453F, 1.0F, 11.0F, 1.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 20.0F, -1.5F);
		bone3.setTextureOffset(31, 38).addBox(-1.5F, 2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(28, 47).addBox(-1.5F, 0.5F, 1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(24, 39).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(31, 38).addBox(0.5F, 2.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -19.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(39, 0).addBox(-1.0F, -23.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 0).addBox(-3.0F, -21.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(56, 0).addBox(1.0F, -21.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(40, 53).addBox(-1.0F, -20.0F, -5.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(40, 61).addBox(-5.0F, -20.0F, -1.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -20.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.0F, -20.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(1.0F, -20.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -20.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0F, -19.0F, -5.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.3736F, 0.5236F, -0.0349F);
		cube_r3.setTextureOffset(48, 31).addBox(-1.0F, -9.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.0F, true);
		cube_r3.setTextureOffset(0, 51).addBox(-3.0F, -10.0F, 0.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(10, 51).addBox(0.0F, -10.0F, 0.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.5F, -19.0F, -4.5F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.3736F, -0.5236F, -0.0349F);
		cube_r4.setTextureOffset(48, 31).addBox(-0.5F, -9.0F, 1.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(10, 51).addBox(0.5F, -10.0F, 1.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 51).addBox(-2.5F, -10.0F, 1.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -7.0F, 1.5F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 33).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -7.0F, -1.5F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 33).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.5F, -7.0F, 0.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
		cube_r7.setTextureOffset(0, 33).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -7.0F, 0.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.2618F);
		cube_r8.setTextureOffset(0, 33).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -20.5F, 2.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -1.5708F, 0.0F);
		cube_r9.setTextureOffset(56, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -20.5F, -2.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 1.5708F, 0.0F);
		cube_r10.setTextureOffset(56, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
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