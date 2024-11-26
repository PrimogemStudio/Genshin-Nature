// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelweasel_fixed extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;

	public Modelweasel_fixed() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.5F, 17.4555F, 0.3632F);
		setRotationAngle(body, 1.3526F, 0.0F, -3.1416F);
		body.setTextureOffset(32, 0).addBox(-0.5F, -2.1318F, -4.5796F, 3.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0445F, -5.3632F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(50, 0).addBox(-0.5F, -2.4434F, -2.8373F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 3.0382F, 3.6447F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -2.0944F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(46, 31).addBox(0.0F, 0.6819F, -2.3084F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 10.0F, -2.6667F);
		head.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, -4.8333F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 61).addBox(0.5F, -2.5F, -0.8333F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 61).addBox(-2.5F, -2.5F, -0.8333F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(-2.5F, 20.5F, 2.0F);
		leftleg.setTextureOffset(56, 58).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		leftleg.setTextureOffset(46, 60).addBox(-0.5F, 2.5F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(1.5F, 20.5F, 2.0F);
		rightleg.setTextureOffset(56, 58).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		rightleg.setTextureOffset(46, 60).addBox(-0.5F, 2.5F, -4.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(1.5F, 13.9747F, -0.9571F);
		setRotationAngle(rightarm, 0.2618F, 0.0F, 0.0F);
		rightarm.setTextureOffset(0, 21).addBox(-0.5F, -0.077F, -2.2336F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		rightarm.setTextureOffset(46, 60).addBox(-0.5F, 1.923F, -3.2336F, 1.0F, 1.0F, 3.0F, 0.0F, true);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-2.5F, 13.9747F, -0.9571F);
		setRotationAngle(leftarm, 0.2618F, 0.0F, 0.0F);
		leftarm.setTextureOffset(0, 21).addBox(-0.5F, -0.077F, -2.2336F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		leftarm.setTextureOffset(46, 60).addBox(-0.5F, 1.923F, -3.2336F, 1.0F, 1.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}