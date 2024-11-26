// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelshaggy_sumpter_beast_adult extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public Modelshaggy_sumpter_beast_adult() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 17.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-18.0F, -34.0F, -16.0F, 36.0F, 34.0F, 38.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, -15.0F, -17.0F);
		bone.addChild(head);
		head.setTextureOffset(160, 4).addBox(-11.0F, -11.0F, -17.0F, 22.0F, 20.0F, 18.0F, 0.0F, false);

		horn = new ModelRenderer(this);
		horn.setRotationPoint(11.0F, -12.0F, -13.0F);
		head.addChild(horn);
		setRotationAngle(horn, 1.0472F, 0.0F, 0.0F);
		horn.setTextureOffset(136, 126).addBox(-4.0F, -5.0F, -2.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		horn.setTextureOffset(172, 96).addBox(-4.0F, -9.0F, -2.0F, 6.0F, 4.0F, 10.0F, 0.0F, true);

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(-9.0F, -12.0F, -13.0F);
		head.addChild(horn2);
		setRotationAngle(horn2, 1.0472F, 0.0F, 0.0F);
		horn2.setTextureOffset(136, 126).addBox(-4.0F, -5.0F, -2.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
		horn2.setTextureOffset(172, 96).addBox(-4.0F, -9.0F, -2.0F, 6.0F, 4.0F, 10.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(-17.0F, -4.0F, -7.0F);
		bone.addChild(left_hand);
		left_hand.setTextureOffset(26, 94).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(15.0F, -4.0F, -7.0F);
		bone.addChild(right_hand);
		right_hand.setTextureOffset(26, 94).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(15.0F, -4.0F, 15.0F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(26, 94).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-17.0F, -4.0F, 15.0F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(26, 94).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
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