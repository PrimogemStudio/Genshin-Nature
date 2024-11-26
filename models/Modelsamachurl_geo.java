// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsamachurl_geo extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelsamachurl_geo() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 6.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(58, 13).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 0).addBox(-3.0F, -5.0F, -4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 6).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(39, 9).addBox(-3.0F, -6.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(46, 0).addBox(1.0F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(46, 0).addBox(-3.0F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 0).addBox(-2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 0).addBox(1.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(40, 26).addBox(3.0F, -5.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(40, 26).addBox(-6.0F, -5.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(40, 26).addBox(-5.0F, -3.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(40, 26).addBox(3.0F, -3.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 0).addBox(1.0F, -5.0F, -4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -3.0F, 2.5F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, -0.5672F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(0, 32).addBox(-3.0F, -3.0F, -0.5F, 6.0F, 6.0F, 14.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(2.5F, -6.5F, -2.5F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.48F, 0.0F, 0.0F);
		Head_r2.setTextureOffset(48, 36).addBox(-5.0F, 0.5F, -0.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head_r2.setTextureOffset(48, 36).addBox(-1.0F, 0.5F, -0.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(17, 16).addBox(-3.0F, 6.0F, -2.0F, 6.0F, 9.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, 7.0F, 0.0F);
		setRotationAngle(RightArm, -1.0472F, 0.0F, 0.0F);
		RightArm.setTextureOffset(52, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(38, 51).addBox(-0.5F, 10.5F, -3.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		RightArm.setTextureOffset(23, 59).addBox(-1.5F, 9.5F, -5.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 53).addBox(-2.5F, 8.5F, -11.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 54).addBox(-7.5F, 10.0F, -10.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(32, 54).addBox(2.5F, 10.0F, -10.0F, 5.0F, 2.0F, 3.0F, 0.0F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, 7.0F, 0.0F);
		LeftArm.setTextureOffset(52, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 11.0F, 4.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 15.0F, 0.0F);
		RightLeg.setTextureOffset(0, 19).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 15.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 19).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}