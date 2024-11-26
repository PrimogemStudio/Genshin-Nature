// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelthe_great_snowboar_king extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public Modelthe_great_snowboar_king() {
		textureWidth = 192;
		textureHeight = 96;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -39.0F, 6.0F);
		bone.addChild(body);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(84, 24).addBox(-15.0F, -30.0F, -21.0F, 30.0F, 48.0F, 24.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -36.0F, -18.0F);
		bone.addChild(head);
		head.setTextureOffset(0, 0).addBox(-12.0F, -12.0F, -24.0F, 24.0F, 24.0F, 24.0F, 0.0F, false);
		head.setTextureOffset(48, 48).addBox(-6.0F, 0.0F, -27.0F, 12.0F, 9.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(10.5F, 3.0F, -25.5F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
		cube_r1.setTextureOffset(63, 73).addBox(-1.5F, -3.0F, -7.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(62, 73).addBox(-1.5F, 0.0F, -4.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-10.5F, 3.0F, -25.5F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.1309F, 0.0F);
		cube_r2.setTextureOffset(63, 70).addBox(-1.5F, -3.0F, -7.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);
		cube_r2.setTextureOffset(63, 71).addBox(-1.5F, 0.0F, -4.5F, 3.0F, 3.0F, 6.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-9.0F, -18.0F, 21.0F);
		bone.addChild(leg0);
		leg0.setTextureOffset(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(9.0F, -18.0F, 21.0F);
		bone.addChild(leg1);
		leg1.setTextureOffset(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, 0.0F, true);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-9.0F, -18.0F, -15.0F);
		bone.addChild(leg2);
		leg2.setTextureOffset(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(9.0F, -18.0F, -15.0F);
		bone.addChild(leg3);
		leg3.setTextureOffset(0, 48).addBox(-6.0F, 0.0F, -6.0F, 12.0F, 18.0F, 12.0F, 0.0F, true);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg0.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}