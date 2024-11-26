// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelwinged_dendroshroom extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer hat;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer decorations;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r21;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r22;

	public Modelwinged_dendroshroom() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 3.0F, 0.0F);
		bone.setTextureOffset(0, 16).addBox(-3.0F, 6.0F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 51).addBox(-3.0F, 7.0F, -1.0F, 6.0F, 9.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(75, 11).addBox(-1.0F, 15.0F, 4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.6169F, 1.875F);
		bone.addChild(head);
		head.setTextureOffset(33, 50).addBox(-3.5F, -6.6169F, -4.875F, 7.0F, 6.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(61, 57).addBox(-2.5F, -0.6169F, -4.875F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -3.6169F, -1.375F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6981F);
		cube_r1.setTextureOffset(54, 40).addBox(-8.5F, -2.0F, -2.0F, 10.0F, 2.0F, 4.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -3.6169F, -1.375F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6981F);
		cube_r2.setTextureOffset(54, 40).addBox(-1.5F, -2.0F, -2.0F, 10.0F, 2.0F, 4.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -6.6169F, -1.875F);
		head.addChild(hat);
		hat.setTextureOffset(0, 0).addBox(-10.0F, -1.0F, -10.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
		hat.setTextureOffset(0, 21).addBox(-9.0F, -2.0F, -9.0F, 18.0F, 1.0F, 18.0F, 0.0F, false);
		hat.setTextureOffset(0, 40).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		hat.setTextureOffset(30, 40).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		hat.setTextureOffset(54, 21).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -10.0F, 0.0F);
		hat.addChild(bone2);
		setRotationAngle(bone2, -0.6545F, 0.0F, 0.0F);
		bone2.setTextureOffset(0, 0).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.3892F, 9.6946F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.319F, 0.0299F, 0.0477F);
		cube_r3.setTextureOffset(60, 11).addBox(-1.8299F, -4.8631F, -0.6946F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -8.3892F, 14.6946F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.2789F, 0.0299F, 0.0477F);
		cube_r4.setTextureOffset(22, 60).addBox(-1.5F, -6.1108F, -0.9946F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -13.3892F, 14.6946F);
		bone2.addChild(cube_r5);
		setRotationAngle(cube_r5, 3.0543F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(58, 60).addBox(-1.49F, -5.8108F, -1.0939F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -17.3892F, 9.6946F);
		bone2.addChild(cube_r6);
		setRotationAngle(cube_r6, -2.3126F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(60, 0).addBox(-1.5F, -7.1108F, -1.3946F, 3.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -16.3892F, 4.6946F);
		bone2.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.309F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(59, 47).addBox(-1.49F, -5.7119F, -1.1946F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -12.0F, 0.0F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6109F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 21).addBox(-1.5F, -6.0F, -0.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, 16.0F, 0.0F);
		bone.addChild(decorations);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -7.0F, -1.5F);
		decorations.addChild(bone4);
		bone4.setTextureOffset(80, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8727F);
		cube_r9.setTextureOffset(80, 2).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8727F);
		cube_r10.setTextureOffset(80, 2).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.0F, -5.2381F, 1.5F);
		decorations.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.5708F, 0.0F);
		bone7.setTextureOffset(89, 12).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone7.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8727F);
		cube_r11.setTextureOffset(89, 12).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone7.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8727F);
		cube_r12.setTextureOffset(89, 12).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.0F, -5.2381F, 1.5F);
		decorations.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -1.5708F, 0.0F);
		bone6.setTextureOffset(89, 45).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone6.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.8727F);
		cube_r13.setTextureOffset(89, 45).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone6.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8727F);
		cube_r14.setTextureOffset(89, 45).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.0F, -7.2381F, 1.5F);
		decorations.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -1.5708F, 0.0F);
		bone8.setTextureOffset(0, 0).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone8.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8727F);
		cube_r15.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone8.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.8727F);
		cube_r16.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -9.0F, -1.5F);
		decorations.addChild(bone3);
		bone3.setTextureOffset(0, 51).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.8727F);
		cube_r17.setTextureOffset(0, 51).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.8727F);
		cube_r18.setTextureOffset(0, 51).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.0F, -7.2381F, 1.5F);
		decorations.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);
		bone5.setTextureOffset(0, 33).addBox(-0.5F, -0.7619F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone5.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.8727F);
		cube_r19.setTextureOffset(0, 33).addBox(-0.5F, 0.0F, -0.49F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -0.7619F, 0.0F);
		bone5.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.8727F);
		cube_r20.setTextureOffset(0, 33).addBox(-0.5F, 0.0F, -0.51F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-2.0F, 8.5F, 1.5F);
		bone.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.5236F);
		left_arm.setTextureOffset(82, 24).addBox(-10.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(97, 5).addBox(-4.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(2.0F, 8.5F, 1.5F);
		bone.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.5236F);
		right_arm.setTextureOffset(82, 24).addBox(0.0F, -1.5F, -2.0F, 10.0F, 3.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(97, 5).addBox(0.0F, -2.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-3.275F, 14.1807F, 0.7081F);
		bone.addChild(left_leg);
		left_leg.setTextureOffset(0, 40).addBox(-0.725F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 0).addBox(-0.725F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 33).addBox(-1.725F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.275F, 2.3193F, 0.6919F);
		left_leg.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.48F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(30, 40).addBox(-1.1F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(3.275F, 14.1807F, 0.7081F);
		bone.addChild(right_leg);
		right_leg.setTextureOffset(0, 40).addBox(-0.275F, -1.1807F, -1.3081F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(12, 0).addBox(-1.275F, 2.8193F, 0.7919F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 33).addBox(-1.275F, 4.8193F, -1.2081F, 3.0F, 2.0F, 4.0F, 0.0F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.725F, 2.3193F, 0.6919F);
		right_leg.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.48F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(30, 40).addBox(-1.9F, -1.5F, -0.4F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}