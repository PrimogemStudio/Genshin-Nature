// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellucklight_fly extends EntityModel<Entity> {
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r3;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Modellucklight_fly() {
		textureWidth = 64;
		textureHeight = 64;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -2.0F, 2.5F);
		right_leg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -2.0F, 2.5F);
		left_leg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(60, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.5F, -2.0F, -2.5F);
		right_arm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(60, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -2.0F, -2.5F);
		left_arm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(60, 60).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 18.8926F, -4.4235F);
		head.setTextureOffset(50, 0).addBox(-2.0F, -1.8926F, -2.5765F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -0.3926F, -1.0765F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.48F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 60).addBox(2.5F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 60).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -8.5F, -3.5F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4297F, -0.1919F, -0.1642F);
		cube_r6.setTextureOffset(22, 25).addBox(-4.0F, -0.1F, -0.5F, 5.0F, 1.0F, 10.0F, 0.0F, true);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, -8.5F, -3.5F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.4297F, 0.1919F, 0.1642F);
		cube_r7.setTextureOffset(22, 25).addBox(-1.0F, -0.1F, -0.5F, 5.0F, 1.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}