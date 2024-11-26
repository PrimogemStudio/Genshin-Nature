// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwinged_cryoshroom extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer hat;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone2;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer decorations;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone5;

	public Modelwinged_cryoshroom() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 6.0F, -3.0F);
		bone.setTextureOffset(0, 51).addBox(-4.0F, 7.0F, -1.0F, 7.0F, 10.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 33).addBox(-5.0F, 16.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 33).addBox(2.0F, 16.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 15.5F, 5.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(75, 11).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.6169F, 1.875F);
		bone.addChild(head);
		head.setTextureOffset(0, 0).addBox(-3.0F, -7.0F, -2.375F, 5.0F, 8.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -1.5F, -1.875F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3229F, -0.3615F, -0.8131F);
		cube_r2.setTextureOffset(81, 94).addBox(-1.5F, -0.1934F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, -1.5F, -1.875F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3229F, 0.3615F, 0.8131F);
		cube_r3.setTextureOffset(81, 94).addBox(-1.5F, -0.1934F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -1.5F, -1.875F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(81, 94).addBox(-1.5F, -0.1934F, -0.5412F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(-1.0F, -4.6169F, 1.125F);
		head.addChild(hat);
		hat.setTextureOffset(0, 75).addBox(-8.0F, -4.0F, -8.0F, 17.0F, 2.0F, 16.0F, 0.0F, true);
		hat.setTextureOffset(0, 112).addBox(-7.0F, -6.0F, -7.0F, 15.0F, 2.0F, 14.0F, 0.0F, true);
		hat.setTextureOffset(22, 12).addBox(-6.0F, -7.0F, -6.0F, 13.0F, 1.0F, 12.0F, 0.0F, true);
		hat.setTextureOffset(86, 116).addBox(-5.0F, -9.0F, -5.0F, 11.0F, 2.0F, 10.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(-8.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(-1.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(-1.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(6.0F, -2.0F, -8.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(48, 49).addBox(7.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(6.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		hat.setTextureOffset(48, 49).addBox(-8.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		hat.setTextureOffset(84, 61).addBox(-8.0F, -2.0F, 5.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.5F, -6.5F, -6.5F);
		hat.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.845F, 0.2831F, 0.0727F);
		cube_r5.setTextureOffset(68, 64).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(6.5F, -6.5F, -6.5F);
		hat.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.845F, -0.2831F, -0.0727F);
		cube_r6.setTextureOffset(68, 64).addBox(-1.5F, -0.5F, -5.5F, 1.0F, 1.0F, 7.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -10.0F, 0.0F);
		hat.addChild(bone2);
		setRotationAngle(bone2, -0.6545F, 0.0F, 0.0F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 8.5F, 2.5F);
		bone.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.5236F);
		left_arm.setTextureOffset(82, 24).addBox(-10.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(97, 5).addBox(-4.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(2.0F, 8.5F, 2.5F);
		bone.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.5236F);
		right_arm.setTextureOffset(82, 24).addBox(0.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(97, 5).addBox(0.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, true);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, 17.0F, 0.0F);
		bone.addChild(decorations);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -7.0F, -1.5F);
		decorations.addChild(bone4);
		bone4.setTextureOffset(80, 2).addBox(-1.0F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8727F);
		cube_r7.setTextureOffset(80, 2).addBox(-1.0F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8727F);
		cube_r8.setTextureOffset(80, 2).addBox(-0.6F, 0.5F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.0F, -5.2381F, 1.5F);
		decorations.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.5708F, 0.0F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.0F, -5.2381F, 1.5F);
		decorations.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -1.5708F, 0.0F);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.0F, -7.2381F, 1.5F);
		decorations.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -1.5708F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -9.0F, -1.5F);
		decorations.addChild(bone3);
		bone3.setTextureOffset(0, 51).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8727F);
		cube_r9.setTextureOffset(0, 51).addBox(-1.0F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8727F);
		cube_r10.setTextureOffset(0, 51).addBox(-0.6F, 0.5F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, -7.2381F, 1.5F);
		decorations.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);

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
		this.right_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}