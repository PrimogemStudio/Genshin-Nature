// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwithering_tumor extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer flower;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Modelwithering_tumor() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.setTextureOffset(0, 0).addBox(-16.0F, -1.0F, 0.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-15.0F, -2.0F, 1.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-14.0F, -3.0F, 2.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(1, 46).addBox(-12.0F, -13.0F, 4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.0F, -15.0F, 8.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3927F);
		cube_r1.setTextureOffset(27, 41).addBox(-3.0F, -13.7F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(40, 46).addBox(-4.0F, -9.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		flower = new ModelRenderer(this);
		flower.setRotationPoint(-14.426F, -27.2664F, 7.8721F);
		bone.addChild(flower);
		setRotationAngle(flower, 0.0F, 0.0F, -0.0436F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6257F, -1.6339F, 0.1279F);
		flower.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3054F);
		cube_r2.setTextureOffset(9, 33).addBox(3.0433F, 2.2961F, -2.0F, 5.0F, 0.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.2323F, -0.6504F, -1.9552F);
		flower.addChild(cube_r3);
		setRotationAngle(cube_r3, 3.0262F, 0.8329F, 2.7328F);
		cube_r3.setTextureOffset(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.2158F, 0.5206F, 1.9431F);
		flower.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0898F, -0.5291F, -0.3687F);
		cube_r4.setTextureOffset(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.2376F, -0.842F, 2.1438F);
		flower.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1086F, 0.7752F, -0.2471F);
		cube_r5.setTextureOffset(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.1921F, 0.6992F, -2.6434F);
		flower.addChild(cube_r6);
		setRotationAngle(cube_r6, 3.0159F, -0.9052F, 2.9174F);
		cube_r6.setTextureOffset(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.3339F, 0.0385F, -3.3464F);
		flower.addChild(cube_r7);
		setRotationAngle(cube_r7, 3.0107F, 0.0F, 2.7489F);
		cube_r7.setTextureOffset(39, 28).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.325F, -0.1124F, 0.6279F);
		flower.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, -0.3927F);
		cube_r8.setTextureOffset(39, 28).addBox(-1.449F, 0.0F, 0.5F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.0814F, 1.3064F, 0.1279F);
		flower.addChild(cube_r9);
		setRotationAngle(cube_r9, 3.1416F, 0.0F, 2.6616F);
		cube_r9.setTextureOffset(9, 33).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 0.0F, 4.0F, 0.0F, false);
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