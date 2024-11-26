// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscarab extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leg;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;

	public Modelscarab() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(40, 0).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.1539F, -2.7083F);
		bone.addChild(head);
		head.setTextureOffset(0, 29).addBox(-2.0F, -1.8461F, -2.2917F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.8461F, -1.7917F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 50).addBox(-2.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 50).addBox(1.5F, -4.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 62).addBox(0.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 62).addBox(-2.5F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(60, 59).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(-3.0F, -1.5F, -2.0F);
		bone.addChild(leg);
		setRotationAngle(leg, 0.0F, -0.5236F, -0.5236F);
		leg.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.0F, -1.5F, 0.0F);
		bone.addChild(leg2);
		setRotationAngle(leg2, 0.0F, 0.0F, -0.5236F);
		leg2.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, -1.5F, 2.0F);
		bone.addChild(leg3);
		setRotationAngle(leg3, 0.0F, 0.5236F, -0.5236F);
		leg3.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, -1.5F, 2.0F);
		bone.addChild(leg4);
		setRotationAngle(leg4, 0.0F, -0.5236F, 0.5236F);
		leg4.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(3.0F, -1.5F, 0.0F);
		bone.addChild(leg5);
		setRotationAngle(leg5, 0.0F, 0.0F, 0.5236F);
		leg5.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(3.0F, -1.5F, -2.0F);
		bone.addChild(leg6);
		setRotationAngle(leg6, 0.0F, 0.5236F, 0.5236F);
		leg6.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
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
		this.leg4.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg5.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg6.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}