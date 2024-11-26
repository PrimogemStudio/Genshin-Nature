// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgrounded_geoshroom extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer hat;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r8;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r9;

	public Modelgrounded_geoshroom() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 2.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.002F, -10.9613F, -3.862F);
		bone.addChild(head);
		head.setTextureOffset(32, 14).addBox(-3.002F, -8.0387F, -4.138F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.502F, -7.0387F, -1.138F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6545F);
		cube_r1.setTextureOffset(62, 34).addBox(0.5F, -1.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.498F, -7.0387F, -1.138F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6545F);
		cube_r2.setTextureOffset(62, 34).addBox(-1.5F, -1.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.008F, 0.4613F, -1.638F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(48, 110).addBox(-4.01F, -2.5F, -1.5F, 8.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.008F, 0.4613F, -1.638F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 121).addBox(-4.0F, -1.5F, -1.5F, 8.0F, 2.0F, 5.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(-0.002F, 11.9613F, 3.862F);
		head.addChild(hat);
		hat.setTextureOffset(72, 78).addBox(-7.0F, -22.0F, -12.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(102, 0).addBox(-6.0F, -20.0F, -12.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(102, 0).addBox(-6.0F, -20.0F, 1.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		hat.setTextureOffset(95, 49).addBox(-7.0F, -20.0F, -11.0F, 1.0F, 1.0F, 12.0F, 0.0F, true);
		hat.setTextureOffset(95, 49).addBox(6.0F, -20.0F, -11.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		hat.setTextureOffset(80, 114).addBox(-6.0F, -24.0F, -11.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		hat.setTextureOffset(22, 73).addBox(-4.0F, -25.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -5.5F, 1.5F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 51).addBox(-3.0F, -8.5F, -2.5F, 6.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 2.5F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(75, 11).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, -9.5603F, -6.0F);
		bone.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, -0.3927F, 0.0F);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0603F, -0.5F);
		right_arm.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.2217F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, -9.5603F, -6.0F);
		bone.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.3927F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0603F, -0.5F);
		left_arm.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.2217F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-0.5F, -0.5F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-3.275F, -6.8193F, 0.7081F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(2, 42).addBox(-0.725F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(20, 0).addBox(-0.725F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 33).addBox(-1.725F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.275F, 2.3193F, 0.6919F);
		left_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.48F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(30, 40).addBox(-1.1F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(3.275F, -6.8193F, 0.7081F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(2, 42).addBox(-0.275F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(20, 0).addBox(-1.275F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 33).addBox(-1.275F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.725F, 2.3193F, 0.6919F);
		right_leg.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.48F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(30, 40).addBox(-1.9F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}