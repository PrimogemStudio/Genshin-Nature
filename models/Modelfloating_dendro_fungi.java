// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfloating_dendro_fungi extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public Modelfloating_dendro_fungi() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 15.7F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -0.7F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(39, 57).addBox(-10.0F, -4.7F, -10.0F, 20.0F, 4.0F, 20.0F, 0.0F, false);
		bone.setTextureOffset(8, 28).addBox(-7.0F, -6.7F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 15).addBox(-4.0F, -10.7F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-3.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(2.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -10.7F, -1.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.3927F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.9343F, 1.9246F, 23.9914F);
		bone2.addChild(cube_r1);
		setRotationAngle(cube_r1, 3.0669F, -0.6584F, 1.2398F);
		cube_r1.setTextureOffset(40, 17).addBox(-4.2657F, -15.6002F, -3.6914F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(91, 0).addBox(-3.2657F, -10.6002F, -2.6914F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.0F, -9.0F, 20.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, -2.7031F, -0.5132F, 0.3557F);
		cube_r2.setTextureOffset(79, 29).addBox(-2.1301F, -12.5861F, -1.4303F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -13.0F, 13.0F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.9199F, 0.5236F, 0.0F);
		cube_r3.setTextureOffset(48, 0).addBox(-1.3F, -10.0F, -0.6F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -7.0F, 5.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.9163F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(108, 20).addBox(-2.0F, -9.388F, -1.7606F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 2.0F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(4, 72).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);
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