// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsquirrel extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer leftleg2;

	public Modelsquirrel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5F, 19.8333F, -3.3333F);
		head.setTextureOffset(0, 0).addBox(-2.5F, -4.8333F, -4.6667F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 47).addBox(-0.5F, -1.8333F, -5.6667F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -6.5833F, -2.6667F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.0472F, 0.0F);
		cube_r1.setTextureOffset(47, 0).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(58, 0).addBox(-0.5F, -0.25F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, -4.5833F, -2.6667F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.0472F, 0.0F);
		cube_r2.setTextureOffset(47, 0).addBox(-0.5F, -3.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(58, 0).addBox(-0.5F, -2.25F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -10.3414F, 7.2629F);
		tail.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.789F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(34, 14).addBox(-1.5F, -1.9329F, -0.0474F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -7.5F, 6.0F);
		tail.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.3526F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(41, 36).addBox(-1.5F, -1.3149F, -1.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, -4.5F, 3.0F);
		tail.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7418F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(24, 24).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 53).addBox(-2.0F, -5.0F, -4.0F, 5.0F, 4.0F, 7.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.5F, 22.5F, 2.5F);
		leftleg.setTextureOffset(60, 62).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(2.5F, 22.5F, -3.5F);
		rightleg.setTextureOffset(60, 62).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-1.5F, 22.5F, 2.5F);
		rightleg2.setTextureOffset(60, 62).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(-1.5F, 22.5F, -3.5F);
		leftleg2.setTextureOffset(60, 62).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}