// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfloating_hydro_fungi extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer tentacles7;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tentaclegroup;
	private final ModelRenderer tentacles2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer tentacles3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer tentacles;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer tentaclegroup2;
	private final ModelRenderer tentacles4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer tentacles5;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer tentacles6;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer tentacles8;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public Modelfloating_hydro_fungi() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 15.7F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -0.7F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(0, 38).addBox(-8.0F, -10.7F, -8.0F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(8, 21).addBox(-7.0F, -12.7F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 20).addBox(-3.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 20).addBox(2.0F, 6.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tentacles7 = new ModelRenderer(this);
		tentacles7.setRotationPoint(0.0F, 1.3F, 0.0F);
		bone.addChild(tentacles7);
		setRotationAngle(tentacles7, -0.3491F, -1.5708F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.0092F, -7.9188F);
		tentacles7.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -0.2941F, -4.6155F);
		tentacles7.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentaclegroup = new ModelRenderer(this);
		tentaclegroup.setRotationPoint(0.0F, 8.3F, 0.0F);
		bone.addChild(tentaclegroup);

		tentacles2 = new ModelRenderer(this);
		tentacles2.setRotationPoint(-3.0F, -8.7407F, -4.0064F);
		tentaclegroup.addChild(tentacles2);
		setRotationAngle(tentacles2, -0.4942F, 0.7654F, -0.3572F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles2.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1781F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(56, 9).addBox(-2.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(56, 0).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentacles3 = new ModelRenderer(this);
		tentacles3.setRotationPoint(3.0F, -8.7407F, -4.0064F);
		tentaclegroup.addChild(tentacles3);
		setRotationAngle(tentacles3, -0.4942F, -0.7654F, 0.3572F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles3.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.1781F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(56, 9).addBox(-1.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(56, 0).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentacles = new ModelRenderer(this);
		tentacles.setRotationPoint(0.0F, -8.7407F, -4.0064F);
		tentaclegroup.addChild(tentacles);
		setRotationAngle(tentacles, -0.3491F, 0.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.1781F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentaclegroup2 = new ModelRenderer(this);
		tentaclegroup2.setRotationPoint(0.0F, 8.3F, 0.0F);
		bone.addChild(tentaclegroup2);
		setRotationAngle(tentaclegroup2, -3.1416F, 0.0F, 3.1416F);

		tentacles4 = new ModelRenderer(this);
		tentacles4.setRotationPoint(-3.0F, -8.7407F, -4.0064F);
		tentaclegroup2.addChild(tentacles4);
		setRotationAngle(tentacles4, -0.4942F, 0.7654F, -0.3572F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles4.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1781F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(56, 9).addBox(-2.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles4.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(56, 0).addBox(-2.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentacles5 = new ModelRenderer(this);
		tentacles5.setRotationPoint(3.0F, -8.7407F, -4.0064F);
		tentaclegroup2.addChild(tentacles5);
		setRotationAngle(tentacles5, -0.4942F, -0.7654F, 0.3572F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles5.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.1781F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(56, 9).addBox(-1.0F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles5.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(56, 0).addBox(-1.0F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentacles6 = new ModelRenderer(this);
		tentacles6.setRotationPoint(0.0F, -8.7407F, -4.0064F);
		tentaclegroup2.addChild(tentacles6);
		setRotationAngle(tentacles6, -0.3491F, 0.0F, 0.0F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 3.044F, -3.7969F);
		tentacles6.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.1781F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -0.2593F, -0.4936F);
		tentacles6.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);

		tentacles8 = new ModelRenderer(this);
		tentacles8.setRotationPoint(0.0F, 1.3F, 0.0F);
		bone.addChild(tentacles8);
		setRotationAngle(tentacles8, -0.3491F, 1.5708F, 0.0F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 3.0092F, -7.9188F);
		tentacles8.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.1781F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(56, 9).addBox(-1.5F, 0.1967F, -0.3967F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -0.2941F, -4.6155F);
		tentacles8.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(56, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
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