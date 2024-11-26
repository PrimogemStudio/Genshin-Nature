// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsticklebacks extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer body;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modelsticklebacks() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 22.0F, -8.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.941F, 2.7271F);
		bone.addChild(head);
		head.setTextureOffset(0, 0).addBox(-4.0F, -4.059F, -11.7271F, 8.0F, 8.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(10, 19).addBox(-0.5F, -0.559F, -18.7271F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(-1.0F, -1.059F, -16.7271F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.5F, -0.059F, -2.2271F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7418F, 0.0F);
		cube_r1.setTextureOffset(56, 6).addBox(-1.5F, -4.0F, -0.5F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.5F, -0.059F, -2.2271F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7418F, 0.0F);
		cube_r2.setTextureOffset(56, 6).addBox(0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 3.441F, -2.2271F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(46, 0).addBox(-4.0F, 0.5F, -0.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -4.559F, -2.2271F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(46, 0).addBox(-4.0F, -2.5F, 0.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(body);
		body.setTextureOffset(0, 29).addBox(-3.0F, -7.0F, 1.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(24, 20).addBox(-2.0F, -6.0F, 11.0F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.5F, -0.5F, 4.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6981F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(12, 52).addBox(-5.6F, -1.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(12, 52).addBox(-0.4F, -1.5F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -2.0F, 14.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.0908F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(42, 7).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -2.0F, 14.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(42, 7).addBox(-0.45F, -2.0F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -4.0F, 20.5F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(39, 41).addBox(0.0F, 0.0F, -0.5F, 0.0F, 4.0F, 7.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -4.0F, 20.5F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(39, 41).addBox(0.0F, -4.0F, -0.5F, 0.0F, 4.0F, 7.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -7.0F, 5.5F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.48F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(56, 21).addBox(0.0F, -7.0F, 7.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(56, 21).addBox(0.0F, -4.0F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 0).addBox(-0.5F, -7.0F, 6.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 0).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
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