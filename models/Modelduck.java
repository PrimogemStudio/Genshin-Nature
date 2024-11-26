// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelduck extends EntityModel<Entity> {
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer wings;

	public Modelduck() {
		textureWidth = 64;
		textureHeight = 64;

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.5F, 20.0F, 0.0F);
		rightleg.setTextureOffset(4, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		rightleg.setTextureOffset(1, 60).addBox(-1.5F, 4.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.5F, 20.0F, 0.0F);
		leftleg.setTextureOffset(4, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftleg.setTextureOffset(1, 60).addBox(-1.5F, 4.0F, -2.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 33).addBox(-4.0F, -10.0F, -4.0F, 9.0F, 6.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -7.0F, 4.5F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(37, 42).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5F, 17.3333F, -3.6667F);
		head.setTextureOffset(17, 16).addBox(-1.5F, -9.3333F, -1.3333F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(-2.5F, -13.3333F, -2.3333F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(45, 22).addBox(-2.5F, -11.3333F, -4.3333F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 24.0F, 0.0F);
		wings.setTextureOffset(0, 0).addBox(5.0F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		wings.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		wings.render(matrixStack, buffer, packedLight, packedOverlay);
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