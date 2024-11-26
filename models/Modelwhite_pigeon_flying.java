// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwhite_pigeon_flying extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer wings2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer wings;
	private final ModelRenderer cube_r3;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer head;

	public Modelwhite_pigeon_flying() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0033F, 19.3631F, -0.8028F);
		setRotationAngle(bone, 0.48F, 0.0F, 0.0F);
		bone.setTextureOffset(52, 0).addBox(-1.5033F, -3.3631F, -5.1972F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(20, 0).addBox(-1.9933F, 1.4369F, 2.0028F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.0033F, 0.1369F, 1.3028F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-2.0F, -0.8F, -6.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);

		wings2 = new ModelRenderer(this);
		wings2.setRotationPoint(-2.5033F, -1.0739F, -2.8056F);
		bone.addChild(wings2);
		setRotationAngle(wings2, -0.1745F, 0.0F, 1.5708F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 1.0F, 2.0F);
		wings2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(2.4967F, -1.0739F, -2.8056F);
		bone.addChild(wings);
		setRotationAngle(wings, -0.1745F, 0.0F, -1.5708F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.0F, 2.0F);
		wings.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 55).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.3967F, 1.1369F, 0.3028F);
		bone.addChild(right_leg);
		setRotationAngle(right_leg, 0.6981F, 0.0F, 0.0F);
		right_leg.setTextureOffset(60, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.4033F, 1.1369F, 0.3028F);
		bone.addChild(left_leg);
		setRotationAngle(left_leg, 0.6981F, 0.0F, 0.0F);
		left_leg.setTextureOffset(60, 60).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.0033F, -2.8631F, -3.8972F);
		bone.addChild(head);
		head.setTextureOffset(37, 10).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 29).addBox(-0.5F, -2.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
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