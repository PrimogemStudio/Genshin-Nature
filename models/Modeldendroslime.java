// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldendroslime extends EntityModel<Entity> {
	private final ModelRenderer leaves;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leaves2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leaves3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bb_main;

	public Modeldendroslime() {
		textureWidth = 64;
		textureHeight = 64;

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(-1.5F, 13.0937F, -2.9226F);
		setRotationAngle(leaves, 0.3771F, 0.5603F, 0.0662F);
		leaves.setTextureOffset(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.5315F, -1.1131F);
		leaves.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.1781F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.0937F, 0.4226F);
		leaves.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaves2 = new ModelRenderer(this);
		leaves2.setRotationPoint(1.5F, 13.0937F, -2.9226F);
		setRotationAngle(leaves2, 0.3064F, -0.6225F, 0.0005F);
		leaves2.setTextureOffset(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -7.5315F, -1.1131F);
		leaves2.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.1781F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -4.0937F, 0.4226F);
		leaves2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		leaves3 = new ModelRenderer(this);
		leaves3.setRotationPoint(0.5F, 13.0937F, 2.0774F);
		setRotationAngle(leaves3, -2.9273F, 0.1281F, 3.128F);
		leaves3.setTextureOffset(15, 27).addBox(-0.5F, -2.0937F, -0.0774F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -7.5315F, -1.1131F);
		leaves3.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.1781F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(26, 34).addBox(-1.5F, -3.2352F, -2.9643F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -4.0937F, 0.4226F);
		leaves3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(19, 29).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 55).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-6.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(-7.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(-4.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bb_main.setTextureOffset(46, 0).addBox(5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 0).addBox(3.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 0).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 57).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 57).addBox(-6.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 57).addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 57).addBox(5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 55).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 56).addBox(5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 55).addBox(4.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(9, 56).addBox(-3.0F, -10.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 55).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 55).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 56).addBox(-6.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leaves.render(matrixStack, buffer, packedLight, packedOverlay);
		leaves2.render(matrixStack, buffer, packedLight, packedOverlay);
		leaves3.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}