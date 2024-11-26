// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelweapon_primal_construct_repulsor extends EntityModel<Entity> {
	private final ModelRenderer weapon;

	public Modelweapon_primal_construct_repulsor() {
		textureWidth = 64;
		textureHeight = 64;

		weapon = new ModelRenderer(this);
		weapon.setRotationPoint(-0.5F, 20.5F, -1.6667F);
		setRotationAngle(weapon, 0.0F, 0.0F, 0.0F);
		weapon.setTextureOffset(3, 32).addBox(-3.5F, -3.5F, 0.6667F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		weapon.setTextureOffset(29, 17).addBox(-2.5F, -2.5F, 0.1667F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		weapon.setTextureOffset(29, 17).addBox(-2.5F, -2.5F, -2.8333F, 5.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		weapon.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}