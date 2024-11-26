// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelstretchy_electro_fungus extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer hat;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modelstretchy_electro_fungus() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 24.0F, -1.0F);
		bone.setTextureOffset(112, 106).addBox(-1.0F, -18.0F, -1.0F, 4.0F, 18.0F, 4.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(2.0F, 2.0F, 0.0F);
		bone.addChild(hat);
		hat.setTextureOffset(36, 45).addBox(-9.0F, -22.0F, -7.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);
		hat.setTextureOffset(58, 68).addBox(-8.0F, -23.0F, -6.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		hat.setTextureOffset(4, 75).addBox(-6.0F, -25.0F, -4.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -24.0F, -1.0F);
		hat.addChild(bone2);
		setRotationAngle(bone2, 0.0436F, -0.2182F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -5.0F, 6.0F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9163F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -7.6099F, -2.4087F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 2.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 111).addBox(-4.0F, -7.0F, -3.6F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.7304F, -10.7713F, 10.0654F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -0.0436F, -0.2618F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0106F, 7.8469F, 9.5273F);
		bone3.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.8666F, 0.8986F, 0.9314F);
		cube_r3.setTextureOffset(13, 39).addBox(-1.0409F, -9.4897F, -3.5463F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.7058F, 8.0047F, 8.3093F);
		bone3.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.8979F, 1.0912F, 0.8807F);
		cube_r4.setTextureOffset(101, 32).addBox(-1.4362F, -2.7335F, -3.0F, 3.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.2696F, 1.7713F, 6.9346F);
		bone3.addChild(cube_r5);
		setRotationAngle(cube_r5, -2.6364F, 1.0248F, -0.1554F);
		cube_r5.setTextureOffset(114, 0).addBox(-1.0F, -6.0403F, -1.85F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.7304F, 1.7713F, 1.9346F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.5241F, 0.5934F, 0.1867F);
		cube_r6.setTextureOffset(42, 0).addBox(-0.9F, -6.4148F, -2.8F, 3.0F, 8.0F, 4.0F, 0.0F, false);
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