// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfinches_flying extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelfinches_flying() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 18.0975F, 0.4243F);
		setRotationAngle(bone, 0.1745F, 0.0F, 0.0F);
		bone.setTextureOffset(20, 0).addBox(-2.5F, -2.0975F, -5.4243F, 5.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 2.4025F, 1.0757F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(48, 0).addBox(-1.5F, -1.0F, 0.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -1.0975F, -2.4243F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.0516F, 0.1803F, 1.5486F);
		cube_r2.setTextureOffset(34, 44).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.5F, -1.0975F, -2.4243F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0516F, -0.1803F, -1.5486F);
		cube_r3.setTextureOffset(34, 44).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0975F, -3.4243F);
		bone.addChild(head);
		head.setTextureOffset(3, 18).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(41, 27).addBox(-0.5F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -3.5F, -1.5F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(5, 37).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.0F, 2.6525F, -2.1743F);
		bone.addChild(left_leg);
		setRotationAngle(left_leg, 0.7854F, 0.0F, 0.0F);
		left_leg.setTextureOffset(0, 4).addBox(-0.5F, 0.25F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(-0.5F, 2.25F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.0F, 2.6525F, -2.1743F);
		bone.addChild(right_leg);
		setRotationAngle(right_leg, 0.7854F, 0.0F, 0.0F);
		right_leg.setTextureOffset(0, 4).addBox(-0.5F, 0.25F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(-0.5F, 2.25F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
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