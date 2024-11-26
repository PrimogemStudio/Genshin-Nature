// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwhite_pigeon extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer wings;
	private final ModelRenderer cube_r1;
	private final ModelRenderer wings2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r3;

	public Modelwhite_pigeon() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.5F, -4.7F);
		head.setTextureOffset(37, 10).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 29).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.4F, 21.5F, -0.5F);
		left_leg.setTextureOffset(60, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.4F, 21.5F, -0.5F);
		right_leg.setTextureOffset(60, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(2.5F, 18.2892F, -3.6084F);
		setRotationAngle(wings, 0.0F, 0.1745F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, 2.0F);
		wings.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		wings2 = new ModelRenderer(this);
		wings2.setRotationPoint(-2.5F, 18.2892F, -3.6084F);
		setRotationAngle(wings2, 0.0F, -0.1745F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 1.0F, 2.0F);
		wings2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(20, 0).addBox(-1.99F, -3.2F, 1.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 0).addBox(-1.5F, -8.0F, -6.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.5F, 0.5F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-2.0F, -0.8F, -6.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		wings.render(matrixStack, buffer, packedLight, packedOverlay);
		wings2.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}