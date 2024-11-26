// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhateful_oceanid extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public Modelhateful_oceanid() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, 0.0F);
		head.setTextureOffset(0, 12).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -12.0F, -4.01F, 4.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(52, 6).addBox(-1.0F, -13.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -13.0F, 1.5F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(58, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -8.5F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.829F);
		cube_r2.setTextureOffset(43, 0).addBox(1.0F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(28, 0).addBox(-1.0F, -5.5F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -4.01F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.0F, -8.5F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.829F);
		cube_r3.setTextureOffset(43, 0).addBox(-2.0F, -9.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(28, 0).addBox(-2.0F, -5.5F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-2.0F, -1.5F, -4.01F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-2.0F, -2.0F, 0.5F);
		setRotationAngle(leftarm, 0.0F, 0.1745F, -0.5672F);
		leftarm.setTextureOffset(28, 43).addBox(-14.0F, -3.0F, -2.0F, 15.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-13.5F, -1.0F, -0.5F);
		leftarm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3819F, -0.4891F, -0.7073F);
		cube_r4.setTextureOffset(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-13.5F, -1.0F, -0.5F);
		leftarm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2075F, 0.5788F, 0.1056F);
		cube_r5.setTextureOffset(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-13.5F, -1.0F, -0.5F);
		leftarm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.2618F);
		cube_r6.setTextureOffset(40, 51).addBox(-9.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(2.0F, -2.0F, 0.5F);
		setRotationAngle(rightarm, 0.0F, -0.1745F, 0.5672F);
		rightarm.setTextureOffset(28, 43).addBox(-1.0F, -3.0F, -2.0F, 15.0F, 4.0F, 3.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.5F, -1.0F, -0.5F);
		rightarm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3298F, 0.4703F, 0.6469F);
		cube_r7.setTextureOffset(40, 51).addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(13.5F, -1.0F, -0.5F);
		rightarm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1447F, -0.6855F, 0.0356F);
		cube_r8.setTextureOffset(40, 51).addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(13.5F, -1.0F, -0.5F);
		rightarm.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.2618F);
		cube_r9.setTextureOffset(40, 51).addBox(0.5F, -2.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(44, 11).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 26.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(35, 29).addBox(-1.5F, -31.5F, -3.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(36, 35).addBox(-1.0F, -26.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(37, 35).addBox(-0.5F, -25.5F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(1.5F, -32.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(2.5F, -31.5F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(3.5F, -31.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(-2.5F, -32.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(-3.5F, -31.5F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(34, 30).addBox(-4.5F, -31.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, -6.5F, 0.0F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5236F);
		cube_r10.setTextureOffset(52, 58).addBox(3.5F, 7.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 57).addBox(2.5F, 5.5F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(16, 53).addBox(1.5F, -0.5F, -2.5F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		cube_r10.setTextureOffset(16, 53).addBox(-0.5F, -1.5F, -2.5F, 2.0F, 6.0F, 5.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, -6.5F, 0.0F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5236F);
		cube_r11.setTextureOffset(52, 58).addBox(-4.5F, 7.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 57).addBox(-4.5F, 5.5F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(16, 53).addBox(-4.5F, -0.5F, -2.5F, 3.0F, 6.0F, 5.0F, 0.0F, false);
		cube_r11.setTextureOffset(16, 53).addBox(-1.5F, -1.5F, -2.5F, 2.0F, 6.0F, 5.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.25F, -30.125F, -2.25F);
		bone.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0873F, -0.0873F, 0.0F);
		cube_r12.setTextureOffset(0, 29).addBox(-1.25F, -4.875F, 8.75F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 39).addBox(-1.25F, -2.875F, 4.75F, 2.0F, 1.0F, 9.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 39).addBox(-0.25F, -1.875F, 1.75F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 39).addBox(-0.25F, -0.875F, -0.25F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.25F, -30.125F, -2.25F);
		bone.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0873F, 0.0873F, 0.0F);
		cube_r13.setTextureOffset(0, 29).addBox(-0.75F, -4.875F, 8.75F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 39).addBox(-0.75F, -2.875F, 4.75F, 2.0F, 1.0F, 9.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 39).addBox(-0.75F, -1.875F, 1.75F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 39).addBox(-0.75F, -0.875F, -0.25F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.0F, -28.5F, -3.0F);
		bone.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1745F, 0.0F, 0.5672F);
		cube_r14.setTextureOffset(34, 9).addBox(-2.5F, -0.5F, -0.5F, 3.0F, 13.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.0F, -28.5F, -3.0F);
		bone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.1745F, 0.0F, -0.5672F);
		cube_r15.setTextureOffset(34, 9).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 13.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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