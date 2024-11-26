// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwhirling_pyro_fungus_fixed extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer hat;
	private final ModelRenderer bone2;
	private final ModelRenderer tentacles3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tentacles2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer tentacles;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone3;
	private final ModelRenderer tentacles4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer tentacles5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer tentacles6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public Modelwhirling_pyro_fungus_fixed() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, 1.0F);
		bone.setTextureOffset(29, 28).addBox(-1.0F, -4.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(77, 33).addBox(0.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(3, 68).addBox(-2.0F, -15.0F, -4.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(hat);
		hat.setTextureOffset(48, 82).addBox(-9.0F, -18.0F, -11.0F, 20.0F, 3.0F, 20.0F, 0.0F, false);
		hat.setTextureOffset(56, 40).addBox(-8.0F, -22.0F, -10.0F, 18.0F, 4.0F, 18.0F, 0.0F, false);
		hat.setTextureOffset(0, 111).addBox(-6.0F, -25.0F, -8.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(4, 97).addBox(-4.0F, -26.0F, -6.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, -14.0F, -2.0F);
		bone.addChild(bone2);

		tentacles3 = new ModelRenderer(this);
		tentacles3.setRotationPoint(-2.0F, -0.5F, 2.0F);
		bone2.addChild(tentacles3);
		setRotationAngle(tentacles3, 0.0436F, -0.8727F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.0F, -7.0F);
		tentacles3.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, -5.0F);
		tentacles3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		tentacles2 = new ModelRenderer(this);
		tentacles2.setRotationPoint(2.0F, -0.5F, 2.0F);
		bone2.addChild(tentacles2);
		setRotationAngle(tentacles2, 0.0436F, 0.8727F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.0F, -7.0F);
		tentacles2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, -5.0F);
		tentacles2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		tentacles = new ModelRenderer(this);
		tentacles.setRotationPoint(0.0F, -0.5F, -2.0F);
		bone2.addChild(tentacles);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 1.0F, -2.0F);
		tentacles.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		tentacles.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, -14.0F, 0.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, -3.1416F, 0.0F, 3.1416F);

		tentacles4 = new ModelRenderer(this);
		tentacles4.setRotationPoint(-2.0F, -0.5F, 2.0F);
		bone3.addChild(tentacles4);
		setRotationAngle(tentacles4, 0.0436F, -0.8727F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.0F, -7.0F);
		tentacles4.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -5.0F);
		tentacles4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		tentacles5 = new ModelRenderer(this);
		tentacles5.setRotationPoint(2.0F, -0.5F, 2.0F);
		bone3.addChild(tentacles5);
		setRotationAngle(tentacles5, 0.0436F, 0.8727F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 1.0F, -7.0F);
		tentacles5.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, -5.0F);
		tentacles5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		tentacles6 = new ModelRenderer(this);
		tentacles6.setRotationPoint(0.0F, -0.5F, -2.0F);
		bone3.addChild(tentacles6);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 1.0F, -2.0F);
		tentacles6.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 0).addBox(-1.99F, -0.25F, -5.2F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		tentacles6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.4363F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(33, 8).addBox(-2.0F, -0.5F, -3.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}