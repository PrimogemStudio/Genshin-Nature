// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsacred_ibis extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r2;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer wing1;
	private final ModelRenderer wing2;

	public Modelsacred_ibis() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.0F, -13.6156F, 3.3882F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(42, 60).addBox(-1.0F, 12.6156F, -5.3882F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		leftleg.setTextureOffset(60, 58).addBox(-0.5F, -0.3844F, -0.8882F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 13.1156F, -2.8882F);
		leftleg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 40).addBox(-0.5F, -9.5F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-3.0F, -13.6156F, 3.3882F);
		bone.addChild(rightleg);
		rightleg.setTextureOffset(42, 60).addBox(-1.0F, 12.6156F, -5.3882F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		rightleg.setTextureOffset(60, 58).addBox(-0.5F, -0.3844F, -0.8882F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 13.1156F, -2.8882F);
		rightleg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(60, 40).addBox(-0.5F, -9.5F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(body);
		body.setTextureOffset(0, 45).addBox(-4.0F, -18.0F, 1.0F, 8.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 27).addBox(-4.0F, -27.0F, -2.0F, 8.0F, 9.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -26.75F, -0.5F);
		bone.addChild(head);
		head.setTextureOffset(0, 0).addBox(-1.0F, -9.25F, -1.4F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(11, 0).addBox(-2.0F, -12.25F, -3.4F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(35, 7).addBox(-0.5F, -10.25F, -9.4F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(29, 0).addBox(-0.5F, -11.25F, -7.4F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(4.5F, -26.3333F, 2.5F);
		bone.addChild(wing1);
		setRotationAngle(wing1, 0.3491F, 0.0F, 0.0F);
		wing1.setTextureOffset(54, 0).addBox(-0.5F, -0.6667F, -2.5F, 1.0F, 13.0F, 4.0F, 0.0F, false);
		wing1.setTextureOffset(56, 17).addBox(-0.5F, 12.3333F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		wing1.setTextureOffset(58, 23).addBox(-0.5F, 15.3333F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		wing2 = new ModelRenderer(this);
		wing2.setRotationPoint(-4.5F, -26.3333F, 2.5F);
		bone.addChild(wing2);
		setRotationAngle(wing2, 0.3491F, 0.0F, 0.0F);
		wing2.setTextureOffset(54, 0).addBox(-0.5F, -0.6667F, -2.5F, 1.0F, 13.0F, 4.0F, 0.0F, true);
		wing2.setTextureOffset(56, 17).addBox(-0.5F, 12.3333F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		wing2.setTextureOffset(58, 23).addBox(-0.5F, 15.3333F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, true);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}