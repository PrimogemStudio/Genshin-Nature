// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_cruiser extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bb_main;

	public Modelruin_cruiser() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 7.0F, -4.5F);
		setRotationAngle(bone, -0.2618F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(7.9641F, -5.7942F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2182F);
		cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -7.0F, -1.5F, 12.0F, 12.0F, 3.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-7.9641F, -5.7942F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
		cube_r2.setTextureOffset(0, 0).addBox(-7.0F, -7.0F, -1.5F, 12.0F, 12.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 8.0F, -4.5F);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 10.0F, 0.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -2.3562F);
		cube_r3.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -1.5F, 12.0F, 12.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, -11.5F, 4.5F);
		setRotationAngle(bone3, -0.0873F, 0.0F, 1.0472F);
		bone3.setTextureOffset(33, 21).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		bone3.setTextureOffset(14, 56).addBox(-1.5F, 2.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(18, 38).addBox(-2.5F, 4.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(0, 25).addBox(-3.5F, 5.5F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -6.5F, 0.0F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -3.1416F);
		cube_r4.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -3.1416F);
		cube_r5.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.0F, -1.5F, 0.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
		cube_r6.setTextureOffset(0, 25).addBox(-2.0F, 9.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(18, 38).addBox(-1.0F, 8.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(14, 56).addBox(0.0F, 6.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(6.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
		cube_r7.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.5F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.5708F);
		cube_r8.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
		cube_r9.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -3.5F, 0.0F);
		bone3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -3.1416F);
		cube_r10.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-20.5F, 12.5F, 4.5F);
		setRotationAngle(bone4, 0.0F, 0.8727F, -0.5236F);
		bone4.setTextureOffset(33, 21).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		bone4.setTextureOffset(14, 56).addBox(-1.5F, 2.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(18, 38).addBox(-2.5F, 4.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone4.setTextureOffset(0, 25).addBox(-3.5F, 5.5F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -6.5F, 0.0F);
		bone4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -3.1416F);
		cube_r11.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone4.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -3.1416F);
		cube_r12.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.0F, -1.5F, 0.0F);
		bone4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
		cube_r13.setTextureOffset(0, 25).addBox(-2.0F, 9.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(18, 38).addBox(-1.0F, 8.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(14, 56).addBox(0.0F, 6.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(6.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -1.5708F);
		cube_r14.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.5F, 0.0F, 0.0F);
		bone4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
		cube_r15.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.5708F);
		cube_r16.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -3.5F, 0.0F);
		bone4.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -3.1416F);
		cube_r17.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(17.5F, 15.5F, 4.5F);
		setRotationAngle(bone5, -0.2182F, -0.7854F, 0.0F);
		bone5.setTextureOffset(33, 21).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		bone5.setTextureOffset(14, 56).addBox(-1.5F, 2.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(18, 38).addBox(-2.5F, 4.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone5.setTextureOffset(0, 25).addBox(-3.5F, 5.5F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, -6.5F, 0.0F);
		bone5.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -3.1416F);
		cube_r18.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -5.0F, 0.0F);
		bone5.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -3.1416F);
		cube_r19.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(4.0F, -1.5F, 0.0F);
		bone5.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 1.5708F);
		cube_r20.setTextureOffset(0, 25).addBox(-2.0F, 9.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r20.setTextureOffset(18, 38).addBox(-1.0F, 8.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r20.setTextureOffset(14, 56).addBox(0.0F, 6.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(6.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -1.5708F);
		cube_r21.setTextureOffset(0, 25).addBox(-3.5F, -1.0F, -0.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(4.5F, 0.0F, 0.0F);
		bone5.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.5708F);
		cube_r22.setTextureOffset(18, 38).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -1.5708F);
		cube_r23.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -3.5F, 0.0F);
		bone5.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -3.1416F);
		cube_r24.setTextureOffset(14, 56).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(50, 0).addBox(-2.0F, -19.0F, -6.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 48).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 59).addBox(-1.0F, -23.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 59).addBox(-1.0F, -14.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 38).addBox(3.0F, -18.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 38).addBox(-6.0F, -18.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
		bone3.render(matrixStack, buffer, packedLight, packedOverlay);
		bone4.render(matrixStack, buffer, packedLight, packedOverlay);
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
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