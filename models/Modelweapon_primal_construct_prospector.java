// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelweapon_primal_construct_prospector extends EntityModel<Entity> {
	private final ModelRenderer weapon2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelweapon_primal_construct_prospector() {
		textureWidth = 64;
		textureHeight = 64;

		weapon2 = new ModelRenderer(this);
		weapon2.setRotationPoint(0.5F, 18.5F, -2.6667F);
		setRotationAngle(weapon2, 0.0F, 0.0F, 0.0F);
		weapon2.setTextureOffset(3, 32).addBox(-2.5F, -1.5F, 0.6567F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		weapon2.setTextureOffset(43, 29).addBox(-2.5F, -7.5F, 0.6667F, 4.0F, 6.0F, 2.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, 2.5F, 1.6667F);
		weapon2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.setTextureOffset(29, 20).addBox(-1.0F, -3.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, 2.5F, 1.6667F);
		weapon2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
		cube_r2.setTextureOffset(29, 20).addBox(-5.0F, -3.0F, -1.0F, 6.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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