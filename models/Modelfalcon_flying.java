// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfalcon_flying extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer head;
	private final ModelRenderer wing1;
	private final ModelRenderer wing2;

	public Modelfalcon_flying() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, 16.3697F, -2.1707F);
		setRotationAngle(bone, 0.6109F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 2.1303F, 2.1707F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(10, 14).addBox(-2.5F, -3.0F, -7.0F, 5.0F, 5.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 2.8803F, 0.4207F);
		bone.addChild(left_leg);
		setRotationAngle(left_leg, 0.5236F, 0.2182F, 0.0F);
		left_leg.setTextureOffset(0, 6).addBox(-1.5F, 3.75F, -2.25F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 2.8803F, 0.4207F);
		bone.addChild(right_leg);
		setRotationAngle(right_leg, 0.5236F, -0.2182F, 0.0F);
		right_leg.setTextureOffset(0, 6).addBox(-1.5F, 3.75F, -2.25F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(-0.5F, -0.25F, -0.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.1197F, -3.0793F);
		bone.addChild(head);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
		head.setTextureOffset(31, 0).addBox(-1.5F, -5.25F, -1.75F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(-1.5F, -6.25F, -2.75F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(11, 0).addBox(-0.5F, -5.25F, -3.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 0).addBox(-0.5F, -5.25F, -4.75F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		wing1 = new ModelRenderer(this);
		wing1.setRotationPoint(2.0F, 0.0303F, -1.6293F);
		bone.addChild(wing1);
		setRotationAngle(wing1, -0.8492F, -0.2324F, -1.7708F);
		wing1.setTextureOffset(0, 32).addBox(-0.5F, -2.9F, -0.2F, 1.0F, 5.0F, 14.0F, 0.0F, false);
		wing1.setTextureOffset(0, 32).addBox(-0.5F, -1.9F, 13.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		wing1.setTextureOffset(0, 32).addBox(-0.5F, 0.1F, 13.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		wing1.setTextureOffset(0, 32).addBox(-0.5F, -0.9F, 13.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wing1.setTextureOffset(0, 32).addBox(-0.5F, 1.1F, 13.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wing2 = new ModelRenderer(this);
		wing2.setRotationPoint(-2.0F, 0.0303F, -1.6293F);
		bone.addChild(wing2);
		setRotationAngle(wing2, -0.8492F, 0.2324F, 1.7708F);
		wing2.setTextureOffset(0, 32).addBox(-0.5F, -2.9F, -0.2F, 1.0F, 5.0F, 14.0F, 0.0F, true);
		wing2.setTextureOffset(0, 32).addBox(-0.5F, -1.9F, 13.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		wing2.setTextureOffset(0, 32).addBox(-0.5F, 0.1F, 13.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		wing2.setTextureOffset(0, 32).addBox(-0.5F, -0.9F, 13.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wing2.setTextureOffset(0, 32).addBox(-0.5F, 1.1F, 13.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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