// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhydro_cicin extends EntityModel<Entity> {
	private final ModelRenderer RIG_wing3;
	private final ModelRenderer bone;
	private final ModelRenderer RIG_wing1;
	private final ModelRenderer wing2;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelhydro_cicin() {
		textureWidth = 64;
		textureHeight = 64;

		RIG_wing3 = new ModelRenderer(this);
		RIG_wing3.setRotationPoint(-1.5867F, 18.0586F, -0.5F);
		setRotationAngle(RIG_wing3, 0.0F, 3.1416F, 0.0873F);
		RIG_wing3.setTextureOffset(52, 0).addBox(-0.0947F, -0.3066F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		RIG_wing3.setTextureOffset(52, 5).addBox(1.9053F, -3.3066F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		RIG_wing3.setTextureOffset(60, 24).addBox(6.9053F, -1.3066F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RIG_wing3.setTextureOffset(48, 19).addBox(2.9053F, -4.3066F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.011F, 3.9491F, 0.0F);
		RIG_wing3.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.1309F);
		bone.setTextureOffset(52, 62).addBox(-0.25F, -2.0F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 62).addBox(-0.25F, -1.0F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		RIG_wing1 = new ModelRenderer(this);
		RIG_wing1.setRotationPoint(2.5905F, 20.1457F, -0.5F);
		setRotationAngle(RIG_wing1, 0.0F, 0.0F, -0.0873F);
		RIG_wing1.setTextureOffset(52, 0).addBox(0.0796F, -2.299F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		RIG_wing1.setTextureOffset(52, 5).addBox(2.0796F, -5.299F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		RIG_wing1.setTextureOffset(60, 24).addBox(7.0796F, -3.299F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RIG_wing1.setTextureOffset(48, 19).addBox(3.0796F, -6.299F, -0.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		wing2 = new ModelRenderer(this);
		wing2.setRotationPoint(-2.4162F, 3.8619F, 0.5F);
		RIG_wing1.addChild(wing2);
		setRotationAngle(wing2, 0.0F, 0.0F, 0.1309F);
		wing2.setTextureOffset(52, 62).addBox(2.0F, -4.3076F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		wing2.setTextureOffset(0, 62).addBox(2.0F, -3.3076F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -7.0F, -3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 27).addBox(-1.5F, -9.15F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(36, 27).addBox(1.5F, -9.15F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -9.0F, -0.5F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.3491F);
		cube_r1.setTextureOffset(20, 30).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, -9.0F, -0.5F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
		cube_r2.setTextureOffset(20, 30).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RIG_wing3.render(matrixStack, buffer, packedLight, packedOverlay);
		RIG_wing1.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RIG_wing1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.RIG_wing3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}