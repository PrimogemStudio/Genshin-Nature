// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_scout extends EntityModel<Entity> {
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r4;
	private final ModelRenderer tentacles;
	private final ModelRenderer cube_r5;
	private final ModelRenderer tentacles2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer tentacles3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer tentacles4;
	private final ModelRenderer cube_r8;

	public Modelruin_scout() {
		textureWidth = 64;
		textureHeight = 64;

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 23.5F, -0.5F);
		bone5.setTextureOffset(56, 0).addBox(-1.0F, -37.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(0, 52).addBox(-5.5F, -35.5F, -5.5F, 11.0F, 1.0F, 11.0F, 0.0F, false);
		bone5.setTextureOffset(0, 34).addBox(-2.5F, -36.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(9.6286F, -34.0939F, 0.005F);
		bone5.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.3927F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-9.6185F, -34.0939F, 0.005F);
		bone5.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.3927F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, -0.7854F, 3.1416F);
		cube_r2.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -34.0939F, 9.6236F);
		bone5.addChild(bone2);
		setRotationAngle(bone2, -0.3927F, 0.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -34.0939F, -9.6236F);
		bone5.addChild(bone);
		setRotationAngle(bone, 0.3927F, 0.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.7854F, 3.1416F);
		cube_r4.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);

		tentacles = new ModelRenderer(this);
		tentacles.setRotationPoint(-4.3658F, -34.5F, 0.0F);
		bone5.addChild(tentacles);
		setRotationAngle(tentacles, 0.0F, 0.0F, 0.1309F);
		tentacles.setTextureOffset(52, 41).addBox(-0.6342F, 0.0F, -1.5F, 3.0F, 20.0F, 3.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.8658F, 19.0F, 0.0F);
		tentacles.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.2182F);
		cube_r5.setTextureOffset(52, 19).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		tentacles2 = new ModelRenderer(this);
		tentacles2.setRotationPoint(4.3658F, -34.5F, 0.0F);
		bone5.addChild(tentacles2);
		setRotationAngle(tentacles2, 0.0F, 0.0F, -0.1309F);
		tentacles2.setTextureOffset(52, 41).addBox(-2.3658F, 0.0F, -1.5F, 3.0F, 20.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.8658F, 19.0F, 0.0F);
		tentacles2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.2182F);
		cube_r6.setTextureOffset(52, 19).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, 0.0F, true);

		tentacles3 = new ModelRenderer(this);
		tentacles3.setRotationPoint(0.0F, -34.5F, -4.3717F);
		bone5.addChild(tentacles3);
		setRotationAngle(tentacles3, -0.1309F, 0.0F, 0.0F);
		tentacles3.setTextureOffset(52, 41).addBox(-1.5F, 0.0F, -0.6283F, 3.0F, 20.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 19.0F, 0.3717F);
		tentacles3.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(52, 19).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, false);

		tentacles4 = new ModelRenderer(this);
		tentacles4.setRotationPoint(0.0F, -34.5F, 4.3598F);
		bone5.addChild(tentacles4);
		setRotationAngle(tentacles4, 0.1309F, 0.0F, 0.0F);
		tentacles4.setTextureOffset(52, 41).addBox(-1.5F, 0.0F, -2.3598F, 3.0F, 20.0F, 3.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 19.0F, -1.3598F);
		tentacles4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(52, 19).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 16.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}