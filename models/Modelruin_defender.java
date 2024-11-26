// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_defender extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer right_leg2;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer left_leg2;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public Modelruin_defender() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0435F, 7.1504F, -3.0036F);
		body.setTextureOffset(0, 0).addBox(-6.0435F, -2.1504F, -0.0797F, 12.0F, 5.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(56, 0).addBox(-1.0435F, 2.8496F, -2.0797F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(-3.0435F, 3.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(-3.0435F, -2.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(0.9565F, -2.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(85, 35).addBox(-1.0435F, 2.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(85, 35).addBox(-1.0435F, -1.6504F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(0.9565F, 3.3496F, -3.0797F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(-4.0435F, 2.3496F, -3.0797F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(85, 35).addBox(-3.0435F, -0.6504F, -3.0797F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(85, 35).addBox(1.9565F, -0.6504F, -3.0797F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(-4.0435F, -1.6504F, -3.0797F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(2.9565F, 2.3496F, -3.0797F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(85, 35).addBox(2.9565F, -1.6504F, -3.0797F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(52, 18).addBox(-2.0435F, -1.1504F, -2.0797F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(47, 0).addBox(-1.0435F, -3.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(47, 7).addBox(-4.0435F, -0.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(56, 8).addBox(1.9565F, -0.1504F, -2.0797F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 36).addBox(-2.0435F, -5.4504F, -2.913F, 4.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(6.5436F, -2.4808F, 11.1692F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.2182F, 0.3491F);
		cube_r1.setTextureOffset(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-5.6306F, -2.4403F, 11.1039F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0757F, 0.2048F, -0.3568F);
		cube_r2.setTextureOffset(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.5436F, -2.4403F, 1.07F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0757F, 0.2048F, 0.3568F);
		cube_r3.setTextureOffset(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.6306F, -2.4808F, 1.0048F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.2182F, -0.3491F);
		cube_r4.setTextureOffset(0, 18).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-4.7428F, 10.5406F, -1.4504F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.6448F, 3.5054F, -13.0383F);
		left_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.9045F, 0.2003F, 0.0342F);
		cube_r5.setTextureOffset(6, 68).addBox(-4.5F, -1.0F, -10.5F, 9.0F, 2.0F, 21.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.739F, 4.3293F, -7.7299F);
		left_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.8179F, 0.3013F, 0.3795F);
		cube_r6.setTextureOffset(90, 4).addBox(-1.7934F, -1.2963F, -0.8197F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.9894F, 2.7159F, -3.0407F);
		left_leg.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.2943F, 0.3013F, 0.3795F);
		cube_r7.setTextureOffset(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2428F, -0.0406F, -0.0496F);
		left_leg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6398F, 0.3013F, 0.3795F);
		cube_r8.setTextureOffset(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(5.2572F, 10.5406F, -1.4504F);
		setRotationAngle(right_leg, 0.0F, -0.8727F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-6.6448F, 3.5054F, -13.0383F);
		right_leg.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.9045F, 0.2003F, 0.0342F);
		cube_r9.setTextureOffset(6, 68).addBox(-4.5F, -1.0F, -10.5F, 9.0F, 2.0F, 21.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.739F, 4.3293F, -7.7299F);
		right_leg.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.8179F, 0.3013F, 0.3795F);
		cube_r10.setTextureOffset(90, 4).addBox(-1.7934F, -1.2963F, -0.8197F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.9894F, 2.7159F, -3.0407F);
		right_leg.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.2943F, 0.3013F, 0.3795F);
		cube_r11.setTextureOffset(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.2428F, -0.0406F, -0.0496F);
		right_leg.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6398F, 0.3013F, 0.3795F);
		cube_r12.setTextureOffset(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(5.2572F, 10.5406F, 8.5496F);
		setRotationAngle(right_leg2, -3.1416F, -0.0436F, 3.1416F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-5.5358F, 5.0374F, -7.3222F);
		right_leg2.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.9045F, 0.2003F, 0.0342F);
		cube_r13.setTextureOffset(78, 66).addBox(-4.5F, -1.0F, -8.0F, 9.0F, 2.0F, 16.0F, 0.0F, true);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-1.9894F, 2.7159F, -3.0407F);
		right_leg2.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.2943F, 0.3013F, 0.3795F);
		cube_r14.setTextureOffset(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.2428F, -0.0406F, -0.0496F);
		right_leg2.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.6398F, 0.3013F, 0.3795F);
		cube_r15.setTextureOffset(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(-5.7428F, 10.5406F, 8.5496F);
		setRotationAngle(left_leg2, 3.1375F, 1.0471F, 3.1413F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-5.5358F, 5.0374F, -7.3222F);
		left_leg2.addChild(cube_r16);
		setRotationAngle(cube_r16, -1.9045F, 0.2003F, 0.0342F);
		cube_r16.setTextureOffset(78, 66).addBox(-4.5F, -1.0F, -8.0F, 9.0F, 2.0F, 16.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.9894F, 2.7159F, -3.0407F);
		left_leg2.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.2943F, 0.3013F, 0.3795F);
		cube_r17.setTextureOffset(90, 4).addBox(-1.3828F, 0.1436F, 0.4911F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.2428F, -0.0406F, -0.0496F);
		left_leg2.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.6398F, 0.3013F, 0.3795F);
		cube_r18.setTextureOffset(90, 4).addBox(-1.5F, -1.5F, -0.5F, 2.0F, 7.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}