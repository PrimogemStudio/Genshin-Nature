// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelkois extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modelkois() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 23.0F, -8.0F);
		bone.setTextureOffset(0, 26).addBox(-2.0F, -5.0F, 10.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 47).addBox(-2.5F, -5.5F, -2.0F, 5.0F, 5.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -9.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.51F, -5.5F, -5.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(17, 20).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.51F, -5.5F, -3.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.48F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(33, 6).addBox(-0.5F, -2.3257F, -0.4924F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -9.4351F, -8.8087F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(7, 16).addBox(-0.5F, -2.3488F, -1.9253F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -6.0F, -7.5F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 21).addBox(-0.49F, -5.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -3.0F, 22.0F);
		bone.addChild(bone2);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(47, 22).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(45, 2).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 7.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(3.0F, -3.0F, -3.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.3054F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(47, 22).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(45, 2).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 7.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.0F, -3.0F, -3.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.3054F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(47, 22).addBox(0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(45, 2).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 7.0F, 0.0F, false);
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