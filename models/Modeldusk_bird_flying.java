// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldusk_bird_flying extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_wing;
	private final ModelRenderer cube_r2;
	private final ModelRenderer left_wing;
	private final ModelRenderer cube_r3;

	public Modeldusk_bird_flying() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 18.3333F, 0.3333F);
		setRotationAngle(bone, 0.6545F, 0.0F, 0.0F);
		bone.setTextureOffset(26, 45).addBox(-1.0F, 2.6667F, 2.6667F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(43, 37).addBox(-1.0F, 1.6667F, 5.6667F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.6667F, 0.1667F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(16, 19).addBox(-2.0F, -2.0F, -3.5F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.4333F, -1.9333F);
		bone.addChild(head);
		setRotationAngle(head, -0.3927F, 0.0F, 0.0F);
		head.setTextureOffset(46, 15).addBox(0.0F, -4.9F, -1.4F, 0.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(55, 9).addBox(0.0F, -5.9F, -1.4F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(48, 3).addBox(0.0F, -6.9F, -1.4F, 0.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 0).addBox(-1.5F, -3.9F, -1.4F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(22, 0).addBox(-1.0F, -3.9F, -6.4F, 2.0F, 3.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.4F, 2.0667F, -0.3333F);
		bone.addChild(left_leg);
		setRotationAngle(left_leg, 0.48F, 0.0F, 0.0F);
		left_leg.setTextureOffset(56, 60).addBox(-0.5F, 2.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(60, 51).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.4F, 2.0667F, -0.3333F);
		bone.addChild(right_leg);
		setRotationAngle(right_leg, 0.48F, 0.0F, 0.0F);
		right_leg.setTextureOffset(56, 60).addBox(-0.5F, 2.5F, -3.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(60, 51).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(1.5F, 0.8377F, -2.3635F);
		bone.addChild(right_wing);
		setRotationAngle(right_wing, -0.9599F, 0.0F, -1.5708F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -0.171F, 2.5302F);
		right_wing.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 54).addBox(2.0F, -2.0F, -2.5F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-1.5F, 0.8377F, -2.3635F);
		bone.addChild(left_wing);
		setRotationAngle(left_wing, -0.9599F, 0.0F, 1.5708F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5F, -0.171F, 2.5302F);
		left_wing.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 54).addBox(2.0F, -2.0F, -2.5F, 1.0F, 4.0F, 6.0F, 0.0F, false);
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