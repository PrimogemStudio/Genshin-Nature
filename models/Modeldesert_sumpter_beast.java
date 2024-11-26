// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldesert_sumpter_beast extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modeldesert_sumpter_beast() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 21.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-9.0F, -17.0F, -8.0F, 18.0F, 17.0F, 19.0F, 0.0F, false);
		bone.setTextureOffset(64, 91).addBox(-9.0F, -18.0F, -7.0F, 18.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(64, 91).addBox(-9.0F, -18.0F, 2.0F, 18.0F, 1.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, -8.0F, -8.5F);
		bone.addChild(head);
		head.setTextureOffset(80, 2).addBox(-5.5F, -5.0F, -8.5F, 11.0F, 10.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(3, 83).addBox(-6.5F, -6.0F, -8.5F, 3.0F, 1.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(3, 83).addBox(3.5F, -6.0F, -8.5F, 3.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.0F, -3.5F, -3.5F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
		cube_r1.setTextureOffset(90, 29).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 13.0F, 6.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(6.0F, -3.5F, -3.5F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
		cube_r2.setTextureOffset(90, 29).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 13.0F, 6.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(-8.5F, -2.5F, -3.5F);
		bone.addChild(left_hand);
		left_hand.setTextureOffset(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(7.5F, -1.5F, -3.5F);
		bone.addChild(right_hand);
		right_hand.setTextureOffset(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(7.5F, -1.5F, 7.5F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-8.5F, -2.5F, 7.5F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_hand.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_hand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}