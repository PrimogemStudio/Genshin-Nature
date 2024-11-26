// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhydro_hypostasis_dolphin extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer tail;
	private final ModelRenderer tail_fin;
	private final ModelRenderer back_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer right_fin;

	public Modelhydro_hypostasis_dolphin() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, -3.0F);
		body.setTextureOffset(22, 6).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 6).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 0.0F, -10.0F);
		head.addChild(nose);
		nose.setTextureOffset(0, 19).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -2.5F, 14.0F);
		body.addChild(tail);
		tail.setTextureOffset(0, 25).addBox(-2.0F, -2.5F, -1.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);

		tail_fin = new ModelRenderer(this);
		tail_fin.setRotationPoint(0.0F, 0.0F, 9.0F);
		tail.addChild(tail_fin);
		tail_fin.setTextureOffset(19, 26).addBox(-5.0F, -0.5F, -1.0F, 10.0F, 1.0F, 6.0F, 0.0F, false);

		back_fin = new ModelRenderer(this);
		back_fin.setRotationPoint(0.0F, -7.0F, 5.0F);
		body.addChild(back_fin);
		setRotationAngle(back_fin, 1.0472F, 0.0F, 0.0F);
		back_fin.setTextureOffset(51, 6).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(3.0F, -2.0F, 5.0F);
		body.addChild(left_fin);
		setRotationAngle(left_fin, 0.9599F, 0.0F, 1.8675F);
		left_fin.setTextureOffset(48, 26).addBox(0.0F, -4.0F, -1.5F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(-3.0F, -2.0F, 5.0F);
		body.addChild(right_fin);
		setRotationAngle(right_fin, 0.9599F, 0.0F, -1.8675F);
		right_fin.setTextureOffset(48, 26).addBox(-1.0F, -4.0F, -1.5F, 1.0F, 4.0F, 7.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}