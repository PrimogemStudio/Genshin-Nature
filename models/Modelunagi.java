// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelunagi extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer decorations;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public Modelunagi() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 5.551F, 2.4082F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -2.551F, -4.4082F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5F, -0.551F, -1.9082F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(56, 14).addBox(4.5F, -0.5774F, -0.5937F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(56, 14).addBox(-0.5F, -0.5774F, -0.5937F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.5F, -0.551F, -0.9082F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(56, 0).addBox(-5.5F, -2.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		cube_r2.setTextureOffset(56, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -6.0F, 0.0F);
		decorations.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 56).addBox(-0.5F, -6.4F, 1.15F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -11.7121F, 2.7044F);
		decorations.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 55).addBox(-0.5F, -7.0845F, 1.1456F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(42, 56).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -11.7121F, 2.7044F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(27, 54).addBox(-1.0F, -7.0845F, -0.8544F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.48F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(56, 55).addBox(-1.0F, -6.4F, -0.85F, 2.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations.render(matrixStack, buffer, packedLight, packedOverlay);
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