// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfatui_enchanter extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_sleve;
	private final ModelRenderer right_arm;
	private final ModelRenderer baston;
	private final ModelRenderer gema;
	private final ModelRenderer palo1;
	private final ModelRenderer palo2;
	private final ModelRenderer right_arm2;
	private final ModelRenderer right_sleve;
	private final ModelRenderer right_sleve2;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;

	public Modelfatui_enchanter() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(24, 19).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 11).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		head.setTextureOffset(0, 0).addBox(-5.0F, -3.8F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(24, 35).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(jacket);
		jacket.setTextureOffset(0, 27).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(56, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_sleve = new ModelRenderer(this);
		left_sleve.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_arm.addChild(left_sleve);
		left_sleve.setTextureOffset(52, 31).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(right_arm, -0.8727F, 0.0F, 0.0F);
		right_arm.setTextureOffset(60, 47).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		baston = new ModelRenderer(this);
		baston.setRotationPoint(5.0F, 8.0F, 19.0F);
		right_arm.addChild(baston);
		setRotationAngle(baston, 1.2217F, 0.0F, 0.0F);

		gema = new ModelRenderer(this);
		gema.setRotationPoint(-5.7654F, -32.6369F, -6.376F);
		baston.addChild(gema);
		setRotationAngle(gema, -1.3177F, -0.6021F, 0.7505F);
		gema.setTextureOffset(24, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		palo1 = new ModelRenderer(this);
		palo1.setRotationPoint(-5.5F, -23.3333F, -6.5F);
		baston.addChild(palo1);
		setRotationAngle(palo1, 0.0F, -0.7854F, 0.0F);
		palo1.setTextureOffset(32, 51).addBox(-0.5F, 0.3333F, -0.5F, 1.0F, 23.0F, 1.0F, 0.0F, false);
		palo1.setTextureOffset(58, 22).addBox(-2.0F, -8.6667F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		palo1.setTextureOffset(0, 0).addBox(-1.0F, -2.6667F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		palo2 = new ModelRenderer(this);
		palo2.setRotationPoint(-5.5F, -27.5F, -6.5F);
		baston.addChild(palo2);
		palo2.setTextureOffset(62, 16).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm2 = new ModelRenderer(this);
		right_arm2.setRotationPoint(-0.5F, 7.0F, 0.0F);
		right_arm.addChild(right_arm2);
		setRotationAngle(right_arm2, -0.3927F, 0.0F, 0.0F);
		right_arm2.setTextureOffset(0, 59).addBox(-1.5F, -3.537F, -3.3003F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		right_sleve = new ModelRenderer(this);
		right_sleve.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_arm.addChild(right_sleve);
		right_sleve.setTextureOffset(56, 59).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.25F, false);

		right_sleve2 = new ModelRenderer(this);
		right_sleve2.setRotationPoint(10.0F, 6.0F, -1.0F);
		right_sleve.addChild(right_sleve2);
		setRotationAngle(right_sleve2, -0.3927F, 0.0F, 0.0F);
		right_sleve2.setTextureOffset(48, 16).addBox(-12.0F, -2.6105F, -1.9171F, 3.0F, 6.0F, 4.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
		left_leg.setTextureOffset(16, 51).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_leg.addChild(left_pants);
		left_pants.setTextureOffset(44, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_leg.addChild(right_pants);
		right_pants.setTextureOffset(40, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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