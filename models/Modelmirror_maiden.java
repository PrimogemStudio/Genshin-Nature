// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmirror_maiden extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer Body;
	private final ModelRenderer brazo_right;
	private final ModelRenderer brazo_left;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_left;

	public Modelmirror_maiden() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		brazo_right = new ModelRenderer(this);
		brazo_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
		brazo_right.setTextureOffset(32, 48).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, true);
		brazo_right.setTextureOffset(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, true);

		brazo_left = new ModelRenderer(this);
		brazo_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		brazo_left.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
		brazo_left.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.25F, false);

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-1.9F, 12.0F, 0.0F);
		leg_right.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leg_right.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(1.9F, 12.0F, 0.0F);
		leg_left.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		leg_left.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		brazo_right.render(matrixStack, buffer, packedLight, packedOverlay);
		brazo_left.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_right.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_left.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.brazo_right.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.brazo_left.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leg_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}