// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelkairagi extends EntityModel<Entity> {
	private final ModelRenderer CABEZA;
	private final ModelRenderer Body;
	private final ModelRenderer RIGHT_ARM;
	private final ModelRenderer LEFT_ARM;
	private final ModelRenderer RIGHT_LEG;
	private final ModelRenderer LEFT_LEG;

	public Modelkairagi() {
		textureWidth = 64;
		textureHeight = 64;

		CABEZA = new ModelRenderer(this);
		CABEZA.setRotationPoint(0.0F, 0.0F, 0.0F);
		CABEZA.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		CABEZA.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		RIGHT_ARM = new ModelRenderer(this);
		RIGHT_ARM.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RIGHT_ARM.setTextureOffset(32, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		RIGHT_ARM.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		LEFT_ARM = new ModelRenderer(this);
		LEFT_ARM.setRotationPoint(5.0F, 2.0F, 0.0F);
		LEFT_ARM.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LEFT_ARM.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RIGHT_LEG = new ModelRenderer(this);
		RIGHT_LEG.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RIGHT_LEG.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RIGHT_LEG.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LEFT_LEG = new ModelRenderer(this);
		LEFT_LEG.setRotationPoint(1.9F, 12.0F, 0.0F);
		LEFT_LEG.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LEFT_LEG.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		CABEZA.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHT_ARM.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFT_ARM.render(matrixStack, buffer, packedLight, packedOverlay);
		RIGHT_LEG.render(matrixStack, buffer, packedLight, packedOverlay);
		LEFT_LEG.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.LEFT_LEG.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LEFT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RIGHT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.CABEZA.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.CABEZA.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RIGHT_LEG.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}