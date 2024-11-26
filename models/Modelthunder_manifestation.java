// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelthunder_manifestation extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r5;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public Modelthunder_manifestation() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-2.0F, -10.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 16).addBox(-1.0F, -14.0F, -5.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(-1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(2.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(3, 18).addBox(-3.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -9.5F, -4.5F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(10, 17).addBox(-4.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, -9.5F, -4.5F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.setTextureOffset(10, 17).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, -8.0F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.9599F);
		cube_r3.setTextureOffset(28, 0).addBox(-9.5F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
		cube_r3.setTextureOffset(44, 0).addBox(-8.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, true);
		cube_r3.setTextureOffset(48, 8).addBox(-6.5F, 1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.5F, -8.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.9599F);
		cube_r4.setTextureOffset(48, 8).addBox(0.5F, 1.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(28, 0).addBox(5.5F, -2.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(44, 0).addBox(0.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-3.5F, -2.0F, 0.5F);
		setRotationAngle(leftarm, 0.0F, 0.0F, -0.1745F);
		leftarm.setTextureOffset(0, 49).addBox(-19.5F, -2.0F, -0.5F, 20.0F, 4.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 38).addBox(-20.5F, -5.0F, -0.5F, 21.0F, 3.0F, 1.0F, 0.0F, false);
		leftarm.setTextureOffset(30, 22).addBox(-24.5F, -5.0F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 3.0F, 0.0F);
		leftarm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1309F);
		cube_r5.setTextureOffset(0, 61).addBox(-16.5F, -1.0F, -0.5F, 17.0F, 2.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(3.9829F, -2.7389F, 0.5F);
		setRotationAngle(rightarm, 0.0F, 0.0F, 0.1745F);
		rightarm.setTextureOffset(0, 49).addBox(-0.9829F, -1.2611F, -0.5F, 20.0F, 4.0F, 1.0F, 0.0F, true);
		rightarm.setTextureOffset(0, 38).addBox(-0.9829F, -4.2611F, -0.5F, 21.0F, 3.0F, 1.0F, 0.0F, true);
		rightarm.setTextureOffset(30, 22).addBox(20.0171F, -4.2611F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.4829F, 3.7389F, 0.0F);
		rightarm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1309F);
		cube_r6.setTextureOffset(0, 61).addBox(-0.5F, -1.0F, -0.5F, 17.0F, 2.0F, 1.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(44, 33).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 26.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(33, 6).addBox(-2.5F, -32.0F, -3.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(34, 4).addBox(-3.5F, -32.0F, -2.5F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(34, 4).addBox(2.5F, -32.0F, -2.5F, 1.0F, 8.0F, 5.0F, 0.0F, true);
		bb_main.setTextureOffset(33, 6).addBox(-2.5F, -32.0F, 2.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 24).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(53, 15).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.5F, -31.6667F, 0.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, -0.3491F);
		cube_r7.setTextureOffset(20, 30).addBox(-5.0F, -4.6733F, 3.5F, 4.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r7.setTextureOffset(20, 30).addBox(-5.0F, -4.6733F, -3.5F, 4.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r7.setTextureOffset(18, 27).addBox(-6.0F, -4.6733F, -2.5F, 1.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r7.setTextureOffset(0, 24).addBox(-5.0F, -9.6133F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		cube_r7.setTextureOffset(0, 24).addBox(-4.0F, -5.6733F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		cube_r7.setTextureOffset(0, 24).addBox(-5.0F, -7.6733F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(3.0F, -31.5F, 0.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2182F, 0.0F, 0.3491F);
		cube_r8.setTextureOffset(20, 30).addBox(1.5F, -5.0F, 3.5F, 4.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r8.setTextureOffset(20, 30).addBox(1.5F, -5.0F, -3.5F, 4.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r8.setTextureOffset(18, 27).addBox(5.5F, -5.0F, -2.5F, 1.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r8.setTextureOffset(0, 24).addBox(4.5F, -10.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		cube_r8.setTextureOffset(0, 24).addBox(2.5F, -8.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		cube_r8.setTextureOffset(0, 24).addBox(0.5F, -6.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, true);
		cube_r8.setTextureOffset(0, 24).addBox(-0.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.0F, -31.5F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2182F, 0.0F, -0.3491F);
		cube_r9.setTextureOffset(0, 24).addBox(-2.5F, -3.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.0F, -19.5F, 0.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
		cube_r10.setTextureOffset(43, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.0F, -19.5F, 0.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.1745F);
		cube_r11.setTextureOffset(43, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 11.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}