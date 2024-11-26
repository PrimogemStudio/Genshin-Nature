// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelchilde extends EntityModel<Entity> {
	private final ModelRenderer bone2;
	private final ModelRenderer ANIM_HEAD;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer ANIM_RIGHT_ARM;
	private final ModelRenderer RightArmLayer_r1;
	private final ModelRenderer ANIM_LEFT_ARM;
	private final ModelRenderer LeftArmLayer_r1;
	private final ModelRenderer ANIM_RIGHT_LEG;
	private final ModelRenderer RightLegLayer_r1;
	private final ModelRenderer ANIM_LEFT_LEG;
	private final ModelRenderer LeftLegLayer_r1;

	public Modelchilde() {
		textureWidth = 128;
		textureHeight = 128;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, 24.0F, 0.0F);

		ANIM_HEAD = new ModelRenderer(this);
		ANIM_HEAD.setRotationPoint(1.9739F, -24.1192F, 0.4698F);
		bone2.addChild(ANIM_HEAD);
		ANIM_HEAD.setTextureOffset(32, 43).addBox(-4.0805F, -8.1359F, -4.0428F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		ANIM_HEAD.setTextureOffset(32, 27).addBox(-4.2239F, -8.1308F, -4.2198F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		ANIM_HEAD.setTextureOffset(32, 26).addBox(4.3261F, -18.0249F, 0.4668F, 0.0F, 7.0F, 1.0F, 0.0F, false);
		ANIM_HEAD.setTextureOffset(36, 26).addBox(-4.1739F, -18.0249F, 0.4668F, 0.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.2239F, -8.1308F, -0.9698F);
		ANIM_HEAD.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(38, 26).addBox(0.05F, -3.75F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(34, 26).addBox(8.55F, -3.75F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, false);

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(1.9094F, -12.6265F, -1.7377F);
		bone2.addChild(Body3);
		Body3.setTextureOffset(0, 54).addBox(-3.9094F, -11.3735F, -0.2623F, 8.0F, 6.0F, 4.0F, 0.0F, false);
		Body3.setTextureOffset(24, 59).addBox(-3.4094F, -5.3735F, -0.2623F, 7.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.6594F, -1.8735F, -1.2623F);
		Body3.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.4363F, 0.0F);
		cube_r2.setTextureOffset(22, 69).addBox(-1.75F, 0.0F, 1.5F, 3.0F, 12.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.8406F, -1.8735F, -1.2623F);
		Body3.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2618F, -0.4363F, 0.0F);
		cube_r3.setTextureOffset(16, 64).addBox(-1.75F, 0.0F, 1.5F, 3.0F, 12.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0906F, 2.1265F, -0.7623F);
		Body3.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(32, 43).addBox(-1.0F, -2.5F, 0.0F, 2.0F, 5.0F, 0.0F, 0.0F, false);

		ANIM_RIGHT_ARM = new ModelRenderer(this);
		ANIM_RIGHT_ARM.setRotationPoint(-2.446F, -22.9466F, 0.3784F);
		bone2.addChild(ANIM_RIGHT_ARM);
		setRotationAngle(ANIM_RIGHT_ARM, 0.0001F, 0.0004F, 0.2899F);
		ANIM_RIGHT_ARM.setTextureOffset(58, 65).addBox(-2.7031F, -0.2348F, -2.3789F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightArmLayer_r1 = new ModelRenderer(this);
		RightArmLayer_r1.setRotationPoint(-0.7031F, 4.7652F, -0.1102F);
		ANIM_RIGHT_ARM.addChild(RightArmLayer_r1);
		setRotationAngle(RightArmLayer_r1, -0.5236F, 0.0F, 0.0F);
		RightArmLayer_r1.setTextureOffset(63, 10).addBox(-1.9934F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		ANIM_LEFT_ARM = new ModelRenderer(this);
		ANIM_LEFT_ARM.setRotationPoint(6.2608F, -24.0693F, -0.4979F);
		bone2.addChild(ANIM_LEFT_ARM);
		setRotationAngle(ANIM_LEFT_ARM, 0.0F, 0.0F, -0.2618F);
		ANIM_LEFT_ARM.setTextureOffset(64, 0).addBox(-0.2698F, -0.0006F, -1.5021F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		LeftArmLayer_r1 = new ModelRenderer(this);
		LeftArmLayer_r1.setRotationPoint(1.7302F, 8.0057F, -0.4979F);
		ANIM_LEFT_ARM.addChild(LeftArmLayer_r1);
		setRotationAngle(LeftArmLayer_r1, -0.3927F, 0.0F, 0.0F);
		LeftArmLayer_r1.setTextureOffset(0, 64).addBox(-2.0873F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		ANIM_RIGHT_LEG = new ModelRenderer(this);
		ANIM_RIGHT_LEG.setRotationPoint(0.5F, -12.6312F, -0.4204F);
		bone2.addChild(ANIM_RIGHT_LEG);
		setRotationAngle(ANIM_RIGHT_LEG, -0.2214F, 0.1704F, -0.0381F);
		ANIM_RIGHT_LEG.setTextureOffset(61, 55).addBox(-2.0F, 0.6312F, -1.4316F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		RightLegLayer_r1 = new ModelRenderer(this);
		RightLegLayer_r1.setRotationPoint(0.0F, 7.1404F, -1.2723F);
		ANIM_RIGHT_LEG.addChild(RightLegLayer_r1);
		setRotationAngle(RightLegLayer_r1, 0.1745F, 0.0F, 0.0F);
		RightLegLayer_r1.setTextureOffset(60, 39).addBox(-1.99F, -0.5092F, 0.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		ANIM_LEFT_LEG = new ModelRenderer(this);
		ANIM_LEFT_LEG.setRotationPoint(4.0F, -12.2757F, -0.5174F);
		bone2.addChild(ANIM_LEFT_LEG);
		setRotationAngle(ANIM_LEFT_LEG, -0.0707F, -0.3737F, -0.0075F);
		ANIM_LEFT_LEG.setTextureOffset(60, 23).addBox(-2.007F, 0.1308F, -1.1454F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		LeftLegLayer_r1 = new ModelRenderer(this);
		LeftLegLayer_r1.setRotationPoint(-0.007F, 6.1308F, -1.1454F);
		ANIM_LEFT_LEG.addChild(LeftLegLayer_r1);
		setRotationAngle(LeftLegLayer_r1, 0.2182F, 0.0F, 0.0F);
		LeftLegLayer_r1.setTextureOffset(0, 64).addBox(-1.99F, 0.0F, 0.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.ANIM_HEAD.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ANIM_HEAD.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.ANIM_LEFT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.ANIM_RIGHT_LEG.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.ANIM_RIGHT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.ANIM_LEFT_LEG.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}