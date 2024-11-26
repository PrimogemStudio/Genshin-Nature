// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_hunter_arm extends EntityModel<Entity> {
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public Modelruin_hunter_arm() {
		textureWidth = 160;
		textureHeight = 160;

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.5589F, 17.5753F, -0.0057F);
		setRotationAngle(right_arm, -0.2182F, 0.0F, 0.2618F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9607F, 5.5731F, -9.2675F);
		right_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0413F, -0.056F, -0.211F);
		cube_r1.setTextureOffset(0, 50).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.1417F, 1.0745F, -0.5112F);
		right_arm.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.0413F, -0.056F, -0.211F);
		cube_r2.setTextureOffset(89, 31).addBox(-2.5F, -7.0F, -2.5F, 5.0F, 14.0F, 5.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.2096F, -1.0311F, 5.4842F);
		right_arm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7795F, -0.056F, -0.211F);
		cube_r3.setTextureOffset(66, 31).addBox(-0.9805F, -14.8539F, -3.3458F, 5.0F, 16.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}