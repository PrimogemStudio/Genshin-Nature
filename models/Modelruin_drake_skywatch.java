// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_drake_skywatch extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_wing;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer right_wing;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r8;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r9;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r10;

	public Modelruin_drake_skywatch() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 2.0F, 8.0F);
		bone.setTextureOffset(48, 46).addBox(-10.0F, -10.0F, -14.0F, 20.0F, 10.0F, 24.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-13.0F, -32.0F, -14.0F, 26.0F, 22.0F, 24.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0033F, -24.265F, -10.5589F);
		bone.addChild(head);
		setRotationAngle(head, -0.5236F, 0.0F, 0.0F);
		head.setTextureOffset(0, 88).addBox(-6.0033F, -9.8083F, -20.2854F, 12.0F, 14.0F, 18.0F, 0.0F, false);
		head.setTextureOffset(0, 88).addBox(1.9967F, -17.8083F, -17.2854F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 88).addBox(-5.0033F, -17.8083F, -17.2854F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 88).addBox(-6.0033F, -17.8083F, -8.2854F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 88).addBox(2.9967F, -17.8083F, -8.2854F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0167F, -12.0083F, -24.2854F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(199, 98).addBox(-1.0F, 12.2F, -18.6F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(199, 98).addBox(-1.0F, 3.2F, -18.6F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(153, 143).addBox(-7.0F, 9.2F, -18.6F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(153, 143).addBox(3.0F, 9.2F, -18.6F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(64, 80).addBox(-6.0F, 4.2F, -17.6F, 12.0F, 13.0F, 20.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-19.5402F, -33.5393F, -0.0694F);
		bone.addChild(left_wing);
		setRotationAngle(left_wing, 0.0F, 0.0F, 0.8727F);
		left_wing.setTextureOffset(0, 120).addBox(-12.622F, -4.7541F, -3.9306F, 12.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-24.3637F, 6.21F, 1.0694F);
		left_wing.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5672F, 0.0F, 1.3963F);
		cube_r2.setTextureOffset(100, 23).addBox(-0.3397F, 0.1962F, -3.0F, 36.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-24.3637F, 6.21F, 1.0694F);
		left_wing.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.481F, 0.3133F, 0.8628F);
		cube_r3.setTextureOffset(108, 80).addBox(-0.3397F, -0.8038F, -3.0F, 30.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-23.622F, 2.2459F, 1.0694F);
		left_wing.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5236F);
		cube_r4.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(18.8498F, -34.3858F, 4.0008F);
		bone.addChild(right_wing);
		setRotationAngle(right_wing, 3.1416F, 0.0F, 2.1817F);
		right_wing.setTextureOffset(0, 120).addBox(-12.6904F, -5.2961F, -6.0694F, 12.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-24.432F, 5.668F, -1.0694F);
		right_wing.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.481F, -0.3133F, 0.8628F);
		cube_r5.setTextureOffset(108, 80).addBox(-0.3397F, -0.8038F, -3.0F, 30.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-24.432F, 5.668F, -1.0694F);
		right_wing.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5672F, 0.0F, 1.3963F);
		cube_r6.setTextureOffset(100, 23).addBox(-0.3397F, 0.1962F, -3.0F, 36.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-23.6904F, 1.7039F, -1.0694F);
		right_wing.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.5236F);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 10.0F, 10.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(15.01F, -14.421F, -3.0031F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(112, 44).addBox(-5.01F, 4.421F, -6.9969F, 9.0F, 12.0F, 12.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 68).addBox(-2.99F, 27.5417F, -6.9969F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(124, 103).addBox(-4.99F, 31.5417F, -8.9969F, 9.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.01F, 16.421F, 3.0031F);
		right_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 46).addBox(-3.0F, 0.0F, -6.0F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-14.99F, -14.421F, -3.0031F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(112, 44).addBox(-4.01F, 4.421F, -6.9969F, 9.0F, 12.0F, 12.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 68).addBox(-1.99F, 27.5417F, -6.9969F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		left_leg.setTextureOffset(124, 103).addBox(-3.99F, 31.5417F, -8.9969F, 9.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.01F, 16.421F, 3.0031F);
		left_leg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 46).addBox(-2.0F, 0.0F, -6.0F, 5.0F, 14.0F, 8.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-0.25F, -5.0F, 7.75F);
		bone.addChild(tail);
		setRotationAngle(tail, -0.3491F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 46).addBox(-2.75F, -3.0F, 0.25F, 6.0F, 6.0F, 36.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.25F, 0.0F, 35.75F);
		tail.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.3927F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(76, 0).addBox(-10.5F, -1.0F, -0.5F, 21.0F, 2.0F, 21.0F, 0.0F, false);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_wing.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_wing.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}