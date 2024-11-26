// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelosial extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Modelosial() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.005F, -103.58F, 23.5705F);
		head.setTextureOffset(38, 83).addBox(-7.005F, -22.6F, -44.6174F, 14.0F, 14.0F, 31.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.005F, -6.3786F, 7.1347F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.0036F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.0657F, -16.1F, -16.3196F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1797F, 0.6784F, -0.2817F);
		cube_r2.setTextureOffset(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.505F, -16.1F, -37.1174F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
		cube_r3.setTextureOffset(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.505F, -16.1F, -37.1174F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1447F, 0.6855F, 0.2262F);
		cube_r4.setTextureOffset(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.8218F, -16.1F, -15.6768F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1447F, -0.6855F, 0.2262F);
		cube_r5.setTextureOffset(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.495F, -16.1F, -37.1174F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.6981F, 0.0F);
		cube_r6.setTextureOffset(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(7.495F, -16.1F, -37.1174F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1447F, -0.6855F, -0.2262F);
		cube_r7.setTextureOffset(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-7.0F, -68.0F, -7.0F, 14.0F, 68.0F, 14.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.01F, -109.9586F, 30.7053F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -67.0F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6109F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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