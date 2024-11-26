// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrow_fixed extends EntityModel<Entity> {
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelcrow_fixed() {
		textureWidth = 64;
		textureHeight = 64;

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 23.5F, -1.0F);
		leftleg.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.0F, 23.5F, -1.0F);
		rightleg.setTextureOffset(0, 61).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.5F, 23.0F, 0.5F);
		setRotationAngle(body, 0.3054F, 0.0F, 0.0F);
		body.setTextureOffset(0, 15).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.5F, 1.5F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(26, 33).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 4.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -6.5F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
		cube_r2.setTextureOffset(56, 55).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.5F, -6.5F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
		cube_r3.setTextureOffset(56, 55).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5F, 17.0F, -2.5F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.5F, -1.5F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(56, 0).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.5F, -1.5F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(47, 0).addBox(-0.5F, -0.5F, -3.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}