// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspinocrocodile extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer jaws;
	private final ModelRenderer tail;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer decorations;
	private final ModelRenderer cube_r1;

	public Modelspinocrocodile() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 2.0F);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 4.0F, 14.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, -8.0F);
		bone.addChild(head);
		head.setTextureOffset(20, 21).addBox(-3.0F, -2.0F, -6.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		jaws = new ModelRenderer(this);
		jaws.setRotationPoint(0.0F, 2.0F, 8.0F);
		head.addChild(jaws);
		jaws.setTextureOffset(18, 31).addBox(-2.0F, -1.0F, -20.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		jaws.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -17.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		jaws.setTextureOffset(0, 5).addBox(-1.5F, -3.0F, -20.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(tail);
		tail.setTextureOffset(0, 18).addBox(-3.5F, -4.0F, 6.0F, 7.0F, 3.0F, 6.0F, 0.0F, false);
		tail.setTextureOffset(0, 27).addBox(-3.0F, -4.0F, 12.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		tail.setTextureOffset(30, 0).addBox(-2.0F, -3.5F, 18.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
		tail.setTextureOffset(46, 0).addBox(-1.5F, -3.5F, 24.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, -2.5F, -6.0F);
		bone.addChild(left_arm);
		left_arm.setTextureOffset(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, -2.5F, -6.0F);
		bone.addChild(right_arm);
		right_arm.setTextureOffset(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(5.0F, -2.5F, 3.0F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-5.0F, -2.5F, 3.0F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(38, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(decorations);
		decorations.setTextureOffset(42, 42).addBox(0.0F, -7.0F, -9.5F, 0.0F, 4.0F, 7.0F, 0.0F, true);
		decorations.setTextureOffset(44, 28).addBox(0.0F, -7.0F, -2.3F, 0.0F, 4.0F, 7.0F, 0.0F, true);
		decorations.setTextureOffset(44, 28).addBox(0.0F, -7.0F, 4.8F, 0.0F, 4.0F, 7.0F, 0.0F, true);
		decorations.setTextureOffset(44, 28).addBox(0.0F, -7.0F, 12.0F, 0.0F, 4.0F, 7.0F, 0.0F, true);
		decorations.setTextureOffset(22, 43).addBox(0.0F, -6.0F, 19.5F, 0.0F, 3.0F, 6.0F, 0.0F, true);
		decorations.setTextureOffset(47, 15).addBox(0.0F, -6.0F, 25.8F, 0.0F, 3.0F, 4.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -4.5F, -11.5F);
		decorations.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(12, 44).addBox(0.0F, -4.5F, -1.5F, 0.0F, 6.0F, 3.0F, 0.0F, true);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}