// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelshadowy_husk_fixed extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer head;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public Modelshadowy_husk_fixed() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -16.0F, 0.0F);
		bone.addChild(body);
		body.setTextureOffset(0, 25).addBox(-4.0F, -39.0F, -7.0F, 8.0F, 8.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(32, 0).addBox(-4.0F, -31.0F, -6.0F, 8.0F, 3.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, -48.0F, -8.0F, 8.0F, 9.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(30, 25).addBox(-1.0F, -47.0F, -12.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 25).addBox(-1.0F, -47.0F, 8.0F, 2.0F, 6.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(30, 25).addBox(-4.0F, -50.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(80, 44).addBox(-3.0F, -53.0F, -4.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(106, 19).addBox(-2.0F, -50.0F, 6.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(48, 15).addBox(-2.0F, -50.0F, -10.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(84, 17).addBox(-4.0F, -22.0F, -1.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(60, 44).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -50.5F, 5.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(108, 0).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -50.5F, -5.0F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.5672F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(32, 108).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -52.0F, -5.0F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.48F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(100, 43).addBox(-4.0F, -5.0F, 9.0F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -52.0F, -5.0F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(0, 101).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -68.5F, 0.0F);
		bone.addChild(head);
		head.setTextureOffset(56, 52).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 39).addBox(-4.0F, -5.5F, -6.0F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(70, 94).addBox(-3.0F, -10.5F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -13.5F, 0.5F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(58, 28).addBox(-1.0F, -4.0F, -0.5F, 3.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -13.5F, -0.5F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(32, 0).addBox(-1.0F, -4.0F, -0.5F, 3.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.0F, 3.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(48, 110).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -1.0F, -3.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(107, 111).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -8.0F, -3.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(111, 31).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -8.0F, 3.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(112, 64).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, -64.5F, 13.0F);
		bone.addChild(leftarm);
		leftarm.setTextureOffset(0, 84).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		leftarm.setTextureOffset(30, 76).addBox(-3.0F, 13.5F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		leftarm.setTextureOffset(88, 22).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -5.5F, 3.0F);
		leftarm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.9599F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(39, 98).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -5.5F, 2.0F);
		leftarm.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.1345F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(49, 52).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.5F, -2.0F);
		leftarm.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(96, 33).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, -64.5F, -13.0F);
		bone.addChild(rightarm);
		rightarm.setTextureOffset(73, 76).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		rightarm.setTextureOffset(84, 0).addBox(-3.0F, 13.5F, -3.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		rightarm.setTextureOffset(60, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -5.5F, -3.0F);
		rightarm.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.0508F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(21, 47).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.5F, -1.0F);
		rightarm.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.9599F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(97, 77).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.5F, 1.0F);
		rightarm.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.5708F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(97, 67).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.2143F, -40.5714F, 3.7143F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(24, 94).addBox(-3.2143F, 31.5714F, -3.2143F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		leftleg.setTextureOffset(55, 102).addBox(-1.2143F, 36.5714F, -3.2143F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		leftleg.setTextureOffset(88, 98).addBox(-0.2143F, 38.5714F, -3.2143F, 5.0F, 2.0F, 6.0F, 0.0F, false);
		leftleg.setTextureOffset(0, 47).addBox(-4.2143F, 1.5714F, -3.2143F, 7.0F, 15.0F, 7.0F, 0.0F, false);
		leftleg.setTextureOffset(49, 67).addBox(-4.2143F, 16.5714F, -3.2143F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		leftleg.setTextureOffset(58, 15).addBox(-5.2143F, -3.4286F, -3.7143F, 9.0F, 5.0F, 8.0F, 0.0F, false);
		leftleg.setTextureOffset(82, 61).addBox(-3.2143F, 24.5714F, -3.2143F, 5.0F, 7.0F, 6.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.7857F, 36.0714F, -0.2143F);
		leftleg.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.48F);
		cube_r17.setTextureOffset(0, 108).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.2143F, 37.8214F, -0.2143F);
		leftleg.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3927F);
		cube_r18.setTextureOffset(104, 100).addBox(-3.0F, -1.5F, -3.0F, 2.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(4.7857F, 39.0714F, -0.2143F);
		leftleg.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.setTextureOffset(16, 105).addBox(-1.0F, -3.5F, -3.0F, 2.0F, 5.0F, 6.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.2143F, -40.5714F, -3.7143F);
		bone.addChild(rightleg);
		rightleg.setTextureOffset(91, 87).addBox(-3.2143F, 31.5714F, -2.7857F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		rightleg.setTextureOffset(102, 11).addBox(-1.2143F, 36.5714F, -2.7857F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		rightleg.setTextureOffset(98, 56).addBox(-0.2143F, 38.5714F, -2.7857F, 5.0F, 2.0F, 6.0F, 0.0F, false);
		rightleg.setTextureOffset(62, 31).addBox(-5.2143F, -3.4286F, -4.2857F, 9.0F, 5.0F, 8.0F, 0.0F, false);
		rightleg.setTextureOffset(28, 52).addBox(-4.2143F, 1.5714F, -3.7857F, 7.0F, 15.0F, 7.0F, 0.0F, false);
		rightleg.setTextureOffset(0, 69).addBox(-4.2143F, 16.5714F, -3.7857F, 8.0F, 8.0F, 7.0F, 0.0F, false);
		rightleg.setTextureOffset(54, 87).addBox(-3.2143F, 24.5714F, -2.7857F, 5.0F, 7.0F, 6.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.7857F, 36.0714F, 0.2143F);
		rightleg.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.48F);
		cube_r20.setTextureOffset(91, 106).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.2143F, 37.8214F, 0.2143F);
		rightleg.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3927F);
		cube_r21.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -3.0F, 2.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(4.7857F, 39.0714F, 0.2143F);
		rightleg.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.setTextureOffset(75, 103).addBox(-1.0F, -3.5F, -3.0F, 2.0F, 5.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}