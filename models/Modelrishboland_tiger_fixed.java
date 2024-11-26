// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrishboland_tiger_fixed extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r9;
	private final ModelRenderer decoration;
	private final ModelRenderer cube_r10;
	private final ModelRenderer decoration2;
	private final ModelRenderer cube_r11;

	public Modelrishboland_tiger_fixed() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.25F, 15.75F, -0.5F);
		setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);
		bone.setTextureOffset(0, 12).addBox(-9.75F, -3.75F, -3.5F, 11.0F, 8.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(30, 0).addBox(1.25F, -4.75F, -3.5F, 6.0F, 9.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(7.41F, -3.754F, 0.0F);
		bone.addChild(head);
		head.setTextureOffset(0, 0).addBox(-0.16F, -2.996F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(38, 17).addBox(3.84F, -1.006F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(52, 0).addBox(3.64F, 0.994F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(23, 0).addBox(0.84F, -3.996F, 2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(23, 0).addBox(0.84F, -3.996F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.878F, -0.3304F, -3.5833F);
		bone.addChild(left_arm);
		left_arm.setTextureOffset(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.528F, 2.5804F, 0.1833F);
		left_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.setTextureOffset(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.128F, 0.5804F, -0.4167F);
		left_arm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
		cube_r2.setTextureOffset(56, 35).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(4.878F, -0.3304F, 3.4167F);
		bone.addChild(right_arm);
		right_arm.setTextureOffset(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.528F, 2.5804F, 0.1833F);
		right_arm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
		cube_r3.setTextureOffset(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.128F, 0.5804F, -0.4167F);
		right_arm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
		cube_r4.setTextureOffset(56, 35).addBox(-1.5F, -1.0F, 0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-6.122F, -0.3304F, 3.4167F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.528F, 2.5804F, 0.1833F);
		right_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3491F);
		cube_r5.setTextureOffset(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.128F, 0.5804F, -0.4167F);
		right_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.setTextureOffset(56, 35).addBox(-1.5F, -1.0F, 0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-6.122F, -0.3304F, -3.5833F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(41, 26).addBox(-0.528F, 7.5804F, -1.2667F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.528F, 2.5804F, 0.1833F);
		left_leg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3491F);
		cube_r7.setTextureOffset(56, 25).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.128F, 0.5804F, -0.4167F);
		left_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
		cube_r8.setTextureOffset(56, 35).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(4.25F, 4.25F, -1.5F);
		bone.addChild(tail);
		tail.setTextureOffset(1, 37).addBox(-33.5834F, -0.2F, -1.0F, 14.0F, 0.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-14.5F, -3.0F, 1.5F);
		tail.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3927F);
		cube_r9.setTextureOffset(16, 29).addBox(-6.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		decoration = new ModelRenderer(this);
		decoration.setRotationPoint(4.25F, 4.25F, -1.5F);
		bone.addChild(decoration);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.0F, -11.0F, -1.5F);
		decoration.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.9599F);
		cube_r10.setTextureOffset(58, 14).addBox(0.0F, -14.0F, -2.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(43, 39).addBox(0.0F, -13.0F, -1.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(26, 44).addBox(0.0F, -12.0F, -0.5F, 0.0F, 12.0F, 1.0F, 0.0F, false);

		decoration2 = new ModelRenderer(this);
		decoration2.setRotationPoint(4.25F, 4.25F, 4.5F);
		bone.addChild(decoration2);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.0F, -11.0F, -1.5F);
		decoration2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.9599F);
		cube_r11.setTextureOffset(54, 18).addBox(0.0F, -14.0F, 1.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(39, 43).addBox(0.0F, -13.0F, 0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(22, 48).addBox(0.0F, -12.0F, -0.5F, 0.0F, 12.0F, 1.0F, 0.0F, false);
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
		this.right_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}