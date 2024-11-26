// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelseelie extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public Modelseelie() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 21.0F, 0.5F);
		setRotationAngle(bone, 0.3927F, 0.0F, 0.0F);
		bone.setTextureOffset(18, 34).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.5F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(22, 26).addBox(-3.0F, -0.5F, 1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.5F, -2.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -8.0714F, 0.4576F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.829F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 10).addBox(2.3F, -1.9659F, -0.7588F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 10).addBox(-0.3F, -1.9659F, -0.7588F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -2.5F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.2618F);
		cube_r3.setTextureOffset(0, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, -2.5F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.0F, -0.2618F);
		cube_r4.setTextureOffset(0, 29).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 17).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(50, 0).addBox(-2.0F, -6.5F, -4.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(56, 6).addBox(-0.5F, -4.5F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(22, 9).addBox(-2.0F, -6.0F, -2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.1138F, -5.5352F, -3.6975F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.1855F, -1.3311F, -1.1807F);
		cube_r6.setTextureOffset(16, 0).addBox(0.1431F, -0.8154F, -0.3545F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(40, 30).addBox(2.1431F, 0.1846F, -0.3545F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.12F, -7.6832F, 1.2446F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 2.2149F, -1.292F, -2.2392F);
		cube_r7.setTextureOffset(46, 22).addBox(6.921F, -0.7854F, 0.0041F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(46, 60).addBox(-1.079F, -0.7854F, -0.9959F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(34, 40).addBox(-0.079F, -1.7854F, -0.9959F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.12F, -7.6832F, 1.2446F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.5586F, -1.218F, -1.5637F);
		cube_r8.setTextureOffset(46, 22).addBox(7.921F, 0.2146F, -1.4446F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(34, 40).addBox(-0.079F, -0.7854F, -2.4446F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r8.setTextureOffset(46, 60).addBox(-1.079F, 0.2146F, -2.4446F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.6614F, -6.5382F, 0.7599F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.0321F, -1.3116F, -1.0223F);
		cube_r9.setTextureOffset(46, 22).addBox(7.6338F, -1.8154F, 0.7825F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(34, 40).addBox(0.6338F, -2.8154F, -0.2175F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r9.setTextureOffset(46, 60).addBox(-0.3662F, -1.8154F, -0.2175F, 7.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.5F, -5.5F, -4.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3797F, -0.1857F, -0.1849F);
		cube_r10.setTextureOffset(0, 49).addBox(-0.1043F, -0.5143F, 0.0F, 1.0F, 1.0F, 14.0F, 0.0F, true);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.5F, -5.5F, -5.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3515F, 0.3487F, 0.0082F);
		cube_r11.setTextureOffset(0, 49).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.8807F, -5.5613F, -3.4636F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.7433F, -1.3455F, -1.753F);
		cube_r12.setTextureOffset(40, 30).addBox(2.1431F, 0.1846F, -0.3545F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r12.setTextureOffset(16, 0).addBox(0.1431F, -0.8154F, -0.3545F, 6.0F, 1.0F, 1.0F, 0.0F, false);
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