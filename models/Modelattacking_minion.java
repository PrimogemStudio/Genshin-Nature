// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelattacking_minion extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer head_r12;
	private final ModelRenderer head_r13;
	private final ModelRenderer head_r14;
	private final ModelRenderer head_r15;

	public Modelattacking_minion() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.0125F, 11.0213F, 5.315F);
		head.setTextureOffset(0, 0).addBox(-3.9875F, -4.0213F, -9.315F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-5.9875F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-5.9875F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(54, 0).addBox(5.0125F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(5.0125F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(4.0125F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(4.0125F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(4.0125F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(4.0125F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(4.0125F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(4.0125F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(38, 0).addBox(-3.9875F, -5.0213F, -5.315F, 8.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(-3.9875F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(1.0125F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9875F, -1.0213F, -15.315F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 10).addBox(-1.9875F, -1.0313F, -14.315F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9875F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(2.0125F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(2.0025F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9775F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.4875F, -4.0213F, -5.815F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.3054F);
		head_r1.setTextureOffset(58, 0).addBox(-1.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(2.5125F, -4.0213F, -5.815F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.3054F);
		head_r2.setTextureOffset(58, 0).addBox(-0.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0125F, 2.9787F, -9.315F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.4363F, 0.0F, 0.0F);
		head_r3.setTextureOffset(0, 16).addBox(1.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(1.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(-2.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(46, 11).addBox(-2.0F, 0.01F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, true);
		head_r3.setTextureOffset(22, 12).addBox(-1.5F, -1.01F, -6.02F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		head_r3.setTextureOffset(0, 16).addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 6.0F, 0.0F, true);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-2.4875F, -1.5213F, -0.815F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.1625F, -1.1777F, -0.966F);
		head_r4.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-2.4875F, -1.5213F, -0.815F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, -0.5145F, -0.7312F, 0.0541F);
		head_r5.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-2.4875F, -1.5213F, -0.815F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.0F, -0.6545F, 0.0F);
		head_r6.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(2.5125F, -1.5213F, -0.815F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, -0.1423F, 1.2483F, 1.1167F);
		head_r7.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(2.5125F, -1.5213F, -0.815F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, -0.4963F, 0.693F, -0.0262F);
		head_r8.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(2.5125F, -1.5213F, -0.815F);
		head.addChild(head_r9);
		setRotationAngle(head_r9, 0.0F, 0.6545F, 0.0F);
		head_r9.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(0.0125F, 0.9787F, -1.815F);
		head.addChild(head_r10);
		setRotationAngle(head_r10, -0.7945F, -0.4891F, 0.3819F);
		head_r10.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(0.0125F, 0.9787F, -1.815F);
		head.addChild(head_r11);
		setRotationAngle(head_r11, -0.6109F, 0.0F, 0.0F);
		head_r11.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r12 = new ModelRenderer(this);
		head_r12.setRotationPoint(0.0125F, 0.9787F, -1.815F);
		head.addChild(head_r12);
		setRotationAngle(head_r12, -0.8382F, 0.4891F, -0.3819F);
		head_r12.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r13 = new ModelRenderer(this);
		head_r13.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r13);
		setRotationAngle(head_r13, 0.5764F, 0.4891F, 0.3819F);
		head_r13.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r14 = new ModelRenderer(this);
		head_r14.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r14);
		setRotationAngle(head_r14, 0.62F, -0.4891F, -0.3819F);
		head_r14.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r15 = new ModelRenderer(this);
		head_r15.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r15);
		setRotationAngle(head_r15, 0.6109F, 0.0F, 0.0F);
		head_r15.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}