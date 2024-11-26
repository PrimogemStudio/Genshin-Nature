// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhilichurl_electro_shooter extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelhilichurl_electro_shooter() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(54, 0).addBox(-2.0F, -6.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(60, 6).addBox(2.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(44, 10).addBox(3.0F, -4.5F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(44, 10).addBox(-6.0F, -4.5F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(60, 6).addBox(-3.0F, -6.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(43, 0).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(43, 0).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.5F, -8.5F, -1.5F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(26, 0).addBox(-5.5F, -0.5F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
		cube_r1.setTextureOffset(26, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.9819F, -0.2564F, -0.1678F);
		RightArm.setTextureOffset(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 10.0F, -4.0F);
		RightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0665F, 0.438F, 1.0676F);
		cube_r2.setTextureOffset(52, 61).addBox(-1.9683F, 1.5F, -7.2172F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 10.0F, -4.0F);
		RightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.213F, -0.5615F, -0.5462F);
		cube_r3.setTextureOffset(52, 61).addBox(-2.6405F, 1.5F, -6.4239F, 4.0F, 1.0F, 2.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 10.0F, -4.0F);
		RightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.9207F, -0.0891F, 0.2959F);
		cube_r4.setTextureOffset(22, 56).addBox(0.5F, 1.5F, -6.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);
		cube_r4.setTextureOffset(22, 56).addBox(-4.5F, 1.5F, -6.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 53).addBox(-1.5F, 1.5F, -7.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, -1.0896F, 0.5973F, 0.2856F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
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
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}