// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelprimal_construct_reshaper extends EntityModel<Entity> {
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
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer weapon;
	private final ModelRenderer weapon2;

	public Modelprimal_construct_reshaper() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 18.0F, 0.0F);
		bone.setTextureOffset(50, 62).addBox(-9.0F, -1.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(56, 13).addBox(-7.0F, 0.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(56, 13).addBox(5.0F, 0.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(50, 62).addBox(3.0F, -1.0F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(58, 8).addBox(-1.0F, -13.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.683F, -8.4772F, 1.51F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0472F);
		cube_r1.setTextureOffset(0, 62).addBox(-9.5F, -0.5F, -0.5F, 19.0F, 1.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.5F, 2.0F, 1.5F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6109F);
		cube_r2.setTextureOffset(0, 23).addBox(-0.8F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.5F, 2.0F, 1.5F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.setTextureOffset(0, 23).addBox(-0.2F, -1.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-9.0F, 0.0F, 1.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.0472F);
		cube_r4.setTextureOffset(0, 62).addBox(0.0F, -1.0F, -0.01F, 19.0F, 1.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone.addChild(bone2);
		bone2.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, 0.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 9).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, -7.0F, -0.5F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0436F, -0.7854F);
		cube_r5.setTextureOffset(27, 0).addBox(4.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(47, 0).addBox(7.5F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(0, 16).addBox(3.5F, -4.5F, 1.0F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r5.setTextureOffset(54, 0).addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, -7.0F, -0.5F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.0436F, 0.7854F);
		cube_r6.setTextureOffset(27, 0).addBox(-5.0F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(47, 0).addBox(-8.5F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 16).addBox(-7.5F, -4.5F, 1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(54, 0).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -6.0F, 1.5F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 2.3562F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, -2.0F, -1.0F);
		bone3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0436F, -0.7854F);
		cube_r7.setTextureOffset(27, 0).addBox(4.2F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(54, 0).addBox(0.2F, -2.0F, -1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 3.2784F, 0.5F);
		bone2.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 2.3562F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.8839F, -0.8839F, 0.0F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.setTextureOffset(20, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.8839F, 0.8839F, 0.0F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.setTextureOffset(36, 0).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		weapon = new ModelRenderer(this);
		weapon.setRotationPoint(10.5F, 8.5F, 3.5F);
		setRotationAngle(weapon, -0.2233F, -0.3033F, 0.0198F);
		weapon.setTextureOffset(3, 32).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		weapon.setTextureOffset(29, 15).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		weapon2 = new ModelRenderer(this);
		weapon2.setRotationPoint(-10.5F, 8.5F, 3.5F);
		setRotationAngle(weapon2, -0.2233F, 0.3033F, -0.0198F);
		weapon2.setTextureOffset(3, 32).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		weapon2.setTextureOffset(29, 15).addBox(-1.0F, -1.0F, -9.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		weapon.render(matrixStack, buffer, packedLight, packedOverlay);
		weapon2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}