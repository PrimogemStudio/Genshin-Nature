// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelabyssmage_pyro extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer bone;
	private final ModelRenderer Body_r4;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelabyssmage_pyro() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 21).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -2.0F, -4.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3927F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(37, 9).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(2.0F, -8.0F, -1.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.0F, 0.2182F);
		Head_r2.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(-2.0F, -8.0F, -1.0F);
		Head.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 0.0F, -0.2182F);
		Head_r3.setTextureOffset(56, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-6.0F, 0.0F, -3.0F, 12.0F, 12.0F, 6.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(-5.5F, 12.0F, 0.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 0.0F, 0.3491F);
		Body_r1.setTextureOffset(50, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(-3.5F, 12.0F, -2.5F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, -0.3491F, 0.0F, 0.0F);
		Body_r2.setTextureOffset(41, 19).addBox(2.5F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		Body_r2.setTextureOffset(50, 17).addBox(4.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, 0.0F, true);
		Body_r2.setTextureOffset(50, 17).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(5.5F, 12.0F, 0.0F);
		Body.addChild(bone2);

		Body_r3 = new ModelRenderer(this);
		Body_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 0.0F, -0.3491F);
		Body_r3.setTextureOffset(50, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.5F, 12.0F, 2.5F);
		Body.addChild(bone);

		Body_r4 = new ModelRenderer(this);
		Body_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.3491F, 0.0F, 0.0F);
		Body_r4.setTextureOffset(41, 19).addBox(2.5F, 0.0F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		Body_r4.setTextureOffset(50, 17).addBox(4.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, 0.0F, true);
		Body_r4.setTextureOffset(50, 17).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 8.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-7.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, 0.0F, 0.0F, 0.1745F);
		RightArm.setTextureOffset(50, 48).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(7.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, -0.1745F);
		LeftArm.setTextureOffset(50, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 49).addBox(-2.0F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 49).addBox(-1.0F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, true);
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
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}