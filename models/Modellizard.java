// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellizard extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer leftleg1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r3;

	public Modellizard() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5F, 21.0F, -3.25F);
		head.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, -2.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(14, 0).addBox(-0.5F, -2.5F, -1.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(-0.384F, 21.799F, -1.5F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 1.0F, 0.0F);
		leftleg1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
		cube_r1.setTextureOffset(60, 60).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(-0.384F, 21.799F, 2.5F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leftleg2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
		cube_r2.setTextureOffset(60, 60).addBox(0.0F, -0.634F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(1.384F, 22.799F, -1.5F);
		setRotationAngle(rightleg1, 0.0F, 0.0F, -0.5236F);
		rightleg1.setTextureOffset(60, 60).addBox(0.366F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(1.384F, 21.799F, 2.5F);
		setRotationAngle(rightleg2, 0.0F, 0.0F, -0.5236F);
		rightleg2.setTextureOffset(60, 60).addBox(-0.134F, -0.134F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 55).addBox(-1.0F, -4.0F, -3.0F, 3.0F, 2.0F, 7.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -2.5F, 4.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(52, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}