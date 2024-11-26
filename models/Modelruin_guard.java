// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_guard extends EntityModel<Entity> {
	private final ModelRenderer RuinGuard;
	private final ModelRenderer h_head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer RuinEye;
	private final ModelRenderer cube_r10;
	private final ModelRenderer RuinNeck;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer RuinPelvis;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer left_leg_ANIM;
	private final ModelRenderer LRuinLegBottom2;
	private final ModelRenderer LRuinLegFoot;
	private final ModelRenderer right_leg_ANIM;
	private final ModelRenderer RRuinLegBottom;
	private final ModelRenderer RRuinLegFoot2;
	private final ModelRenderer left_arm_ANIM;
	private final ModelRenderer LRuinShoulder;
	private final ModelRenderer cube_r15;
	private final ModelRenderer LRuinMid;
	private final ModelRenderer LRuinLower;
	private final ModelRenderer cube_r16;
	private final ModelRenderer LPod;
	private final ModelRenderer cube_r17;
	private final ModelRenderer right_arm_ANIM;
	private final ModelRenderer RRuinShoulder;
	private final ModelRenderer cube_r18;
	private final ModelRenderer RRuinMid;
	private final ModelRenderer RRuinLower;
	private final ModelRenderer cube_r19;
	private final ModelRenderer RPod;
	private final ModelRenderer cube_r20;

	public Modelruin_guard() {
		textureWidth = 256;
		textureHeight = 256;

		RuinGuard = new ModelRenderer(this);
		RuinGuard.setRotationPoint(0.0F, 15.0F, 0.0F);

		h_head = new ModelRenderer(this);
		h_head.setRotationPoint(-1.0F, -39.0F, 7.0F);
		RuinGuard.addChild(h_head);
		setRotationAngle(h_head, 0.0F, 0.0F, -3.1416F);
		h_head.setTextureOffset(116, 176).addBox(-10.0F, 18.0F, -8.0F, 19.0F, 11.0F, 4.0F, 0.0F, false);
		h_head.setTextureOffset(62, 159).addBox(-6.0F, 15.0F, -10.0F, 11.0F, 7.0F, 4.0F, 0.0F, false);
		h_head.setTextureOffset(93, 47).addBox(-13.0F, 3.0F, -6.0F, 24.0F, 15.0F, 11.0F, -0.02F, false);
		h_head.setTextureOffset(90, 39).addBox(-13.0F, 13.0F, 5.0F, 24.0F, 5.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(0, 111).addBox(-13.0F, 3.0F, -7.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(214, 180).addBox(-11.0F, -2.0F, -7.0F, 20.0F, 2.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(212, 22).addBox(-11.0F, -2.0F, 5.0F, 20.0F, 2.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(94, 36).addBox(-13.0F, 3.0F, 5.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(229, 140).addBox(11.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		h_head.setTextureOffset(12, 58).addBox(11.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(75, 71).addBox(8.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(71, 71).addBox(8.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(67, 71).addBox(-11.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(0, 71).addBox(-11.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(8, 58).addBox(11.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(4, 58).addBox(-14.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(0, 58).addBox(-14.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		h_head.setTextureOffset(227, 162).addBox(11.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, -0.02F, false);
		h_head.setTextureOffset(224, 91).addBox(-14.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, -0.02F, false);
		h_head.setTextureOffset(228, 220).addBox(-14.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		h_head.setTextureOffset(41, 230).addBox(-11.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		h_head.setTextureOffset(17, 230).addBox(8.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		h_head.setTextureOffset(156, 114).addBox(-10.0F, -2.0F, -6.0F, 18.0F, 5.0F, 11.0F, -0.02F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 29.0F, -7.0F);
		h_head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 170).addBox(-8.0F, -4.0F, 17.0F, 14.0F, 13.0F, 5.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 39).addBox(-20.0F, 11.9082F, 4.0536F, 38.0F, 5.0F, 14.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-17.0F, -9.0918F, 2.0536F, 32.0F, 24.0F, 15.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.9F, 29.0F, -7.0F);
		h_head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.setTextureOffset(0, 10).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.9F, 29.0F, -7.0F);
		h_head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.setTextureOffset(0, 12).addBox(-12.0F, -16.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-11.6F, 29.0F, -7.0F);
		h_head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.setTextureOffset(0, 39).addBox(9.0F, -12.0F, 0.0F, 7.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.6F, 29.0F, -7.0F);
		h_head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.setTextureOffset(0, 41).addBox(-12.0F, -16.0F, 0.0F, 11.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.0F, 29.0F, -7.0F);
		h_head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.setTextureOffset(0, 43).addBox(-12.0F, -16.0F, 0.0F, 7.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.0F, 29.0F, -7.0F);
		h_head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.setTextureOffset(0, 45).addBox(5.0F, -12.0F, 0.0F, 11.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 29.0F, -7.0F);
		h_head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4363F, 0.0F, -0.7854F);
		cube_r8.setTextureOffset(211, 47).addBox(-2.3345F, -13.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 29.0F, -7.0F);
		h_head.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.7854F);
		cube_r9.setTextureOffset(173, 211).addBox(-5.6655F, -12.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		RuinEye = new ModelRenderer(this);
		RuinEye.setRotationPoint(-1.2F, 30.0F, -8.0F);
		h_head.addChild(RuinEye);
		setRotationAngle(RuinEye, 0.0F, 0.0F, -3.1416F);
		RuinEye.setTextureOffset(0, 0).addBox(-3.1F, -1.3F, -6.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 11.0F, 1.0F);
		RuinEye.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.setTextureOffset(9, 68).addBox(-6.3223F, -11.3223F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 51).addBox(-12.3223F, -11.3223F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(7, 70).addBox(-12.3223F, -5.3223F, -7.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(11, 70).addBox(-3.3223F, -11.3223F, -7.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(79, 0).addBox(-3.3223F, -5.3223F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 67).addBox(-6.3223F, -2.3223F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(0, 69).addBox(-11.3223F, -2.3223F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(79, 4).addBox(-12.3223F, -10.3223F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(67, 58).addBox(-13.3223F, -12.3223F, -6.0F, 12.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(170, 15).addBox(-14.3223F, -13.3223F, -5.0F, 14.0F, 14.0F, 7.0F, 0.0F, false);

		RuinNeck = new ModelRenderer(this);
		RuinNeck.setRotationPoint(-1.0F, 26.0F, -5.0F);
		h_head.addChild(RuinNeck);
		setRotationAngle(RuinNeck, -0.4363F, 0.0F, -3.1416F);
		RuinNeck.setTextureOffset(162, 176).addBox(-10.0F, -10.5326F, -4.1513F, 19.0F, 9.0F, 4.0F, 0.0F, false);
		RuinNeck.setTextureOffset(0, 139).addBox(-6.0F, -13.5326F, -6.1513F, 11.0F, 7.0F, 6.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4363F, 0.0F, -0.7854F);
		cube_r11.setTextureOffset(90, 213).addBox(42.1483F, -48.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4363F, 0.0F, 0.7854F);
		cube_r12.setTextureOffset(190, 222).addBox(-50.1483F, -47.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		RuinPelvis = new ModelRenderer(this);
		RuinPelvis.setRotationPoint(-1.0F, -37.0F, 6.0F);
		RuinGuard.addChild(RuinPelvis);
		setRotationAngle(RuinPelvis, 0.0F, 0.0F, -3.1416F);
		RuinPelvis.setTextureOffset(158, 130).addBox(-10.0F, -1.0F, -5.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
		RuinPelvis.setTextureOffset(179, 69).addBox(-5.0F, -6.0F, -5.0F, 8.0F, 5.0F, 11.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.0F, 16.0F, 6.0F);
		RuinPelvis.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.setTextureOffset(0, 6).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r13.setTextureOffset(0, 49).addBox(10.0F, -12.0F, -12.0F, 5.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.0F, 16.0F, 6.0F);
		RuinPelvis.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.setTextureOffset(0, 47).addBox(-11.0F, -16.0F, 0.0F, 5.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r14.setTextureOffset(0, 8).addBox(-12.0F, -16.0F, -12.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		left_leg_ANIM = new ModelRenderer(this);
		left_leg_ANIM.setRotationPoint(9.4939F, -19.6533F, 8.0F);
		setRotationAngle(left_leg_ANIM, 0.0F, 0.0F, 1.5708F);
		left_leg_ANIM.setTextureOffset(105, 107).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, 0.0F, false);
		left_leg_ANIM.setTextureOffset(213, 211).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		left_leg_ANIM.setTextureOffset(101, 213).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		left_leg_ANIM.setTextureOffset(73, 213).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		left_leg_ANIM.setTextureOffset(212, 153).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		LRuinLegBottom2 = new ModelRenderer(this);
		LRuinLegBottom2.setRotationPoint(20.0F, 0.0F, 0.0F);
		left_leg_ANIM.addChild(LRuinLegBottom2);
		LRuinLegBottom2.setTextureOffset(136, 143).addBox(0.0883F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(156, 211).addBox(16.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(209, 80).addBox(11.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(45, 208).addBox(6.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(208, 25).addBox(1.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		LRuinLegFoot = new ModelRenderer(this);
		LRuinLegFoot.setRotationPoint(20.0F, -1.0F, 0.0F);
		LRuinLegBottom2.addChild(LRuinLegFoot);
		LRuinLegFoot.setTextureOffset(40, 154).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 16.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(168, 189).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(44, 186).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(45, 91).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		right_leg_ANIM = new ModelRenderer(this);
		right_leg_ANIM.setRotationPoint(-9.5061F, -19.6533F, 8.0F);
		setRotationAngle(right_leg_ANIM, 0.0F, 0.0F, 1.5708F);
		right_leg_ANIM.setTextureOffset(96, 125).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, 0.0F, false);
		right_leg_ANIM.setTextureOffset(226, 69).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		right_leg_ANIM.setTextureOffset(118, 224).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		right_leg_ANIM.setTextureOffset(223, 47).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		right_leg_ANIM.setTextureOffset(173, 222).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		RRuinLegBottom = new ModelRenderer(this);
		RRuinLegBottom.setRotationPoint(21.0F, 0.0F, 0.0F);
		right_leg_ANIM.addChild(RRuinLegBottom);
		RRuinLegBottom.setTextureOffset(151, 89).addBox(-0.9117F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(222, 113).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(0, 219).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(218, 0).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(214, 189).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		RRuinLegFoot2 = new ModelRenderer(this);
		RRuinLegFoot2.setRotationPoint(19.0F, -1.0F, 0.0F);
		RRuinLegBottom.addChild(RRuinLegFoot2);
		RRuinLegFoot2.setTextureOffset(78, 159).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 16.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(34, 208).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(128, 191).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(100, 191).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);

		left_arm_ANIM = new ModelRenderer(this);
		left_arm_ANIM.setRotationPoint(15.0F, -53.0F, 12.0F);

		LRuinShoulder = new ModelRenderer(this);
		LRuinShoulder.setRotationPoint(4.0F, 0.0F, 0.0F);
		left_arm_ANIM.addChild(LRuinShoulder);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-18.0F, 69.0F, -12.0F);
		LRuinShoulder.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
		cube_r15.setTextureOffset(164, 161).addBox(-18.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r15.setTextureOffset(76, 143).addBox(-18.0F, -78.0F, 4.0F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		cube_r15.setTextureOffset(67, 74).addBox(-19.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, 0.0F, false);
		cube_r15.setTextureOffset(170, 0).addBox(-18.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);

		LRuinMid = new ModelRenderer(this);
		LRuinMid.setRotationPoint(7.0F, 12.0F, 0.0F);
		LRuinShoulder.addChild(LRuinMid);
		setRotationAngle(LRuinMid, 0.0F, 0.0F, -1.5708F);
		LRuinMid.setTextureOffset(94, 18).addBox(-27.0F, -5.0F, -5.0F, 29.0F, 9.0F, 9.0F, 0.0F, false);
		LRuinMid.setTextureOffset(17, 208).addBox(-10.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(206, 58).addBox(-15.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(205, 131).addBox(-20.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(203, 102).addBox(-25.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		LRuinLower = new ModelRenderer(this);
		LRuinLower.setRotationPoint(-25.5061F, -0.6533F, 0.0F);
		LRuinMid.addChild(LRuinLower);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-25.9117F, 38.598F, -12.0F);
		LRuinLower.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.4363F, 0.0F);
		cube_r16.setTextureOffset(197, 178).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r16.setTextureOffset(196, 200).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r16.setTextureOffset(128, 202).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r16.setTextureOffset(152, 36).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, -0.02F, false);

		LPod = new ModelRenderer(this);
		LPod.setRotationPoint(6.0F, -5.0F, 0.0F);
		LRuinShoulder.addChild(LPod);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-24.0F, 74.0F, -12.0F);
		LPod.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.4363F);
		cube_r17.setTextureOffset(45, 107).addBox(-18.0F, -95.0F, 4.0F, 15.0F, 5.0F, 15.0F, 0.0F, false);
		cube_r17.setTextureOffset(39, 127).addBox(-17.0F, -90.0F, 5.0F, 13.0F, 12.0F, 13.0F, 0.0F, false);

		right_arm_ANIM = new ModelRenderer(this);
		right_arm_ANIM.setRotationPoint(-20.0F, -54.0F, 12.0F);

		RRuinShoulder = new ModelRenderer(this);
		RRuinShoulder.setRotationPoint(2.0F, 5.0F, 0.0F);
		right_arm_ANIM.addChild(RRuinShoulder);
		setRotationAngle(RRuinShoulder, 0.0F, 0.0F, -0.7854F);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-20.5061F, 64.3467F, -12.0F);
		RRuinShoulder.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.4363F);
		cube_r18.setTextureOffset(116, 161).addBox(-26.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r18.setTextureOffset(134, 73).addBox(-18.0F, -78.0F, 4.0F, 15.0F, 1.0F, 15.0F, 0.0F, false);
		cube_r18.setTextureOffset(0, 58).addBox(-27.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, 0.0F, false);
		cube_r18.setTextureOffset(163, 54).addBox(-26.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);

		RRuinMid = new ModelRenderer(this);
		RRuinMid.setRotationPoint(-12.5061F, 0.3467F, 0.0F);
		RRuinShoulder.addChild(RRuinMid);
		setRotationAngle(RRuinMid, 0.0F, 0.0F, -0.7854F);
		RRuinMid.setTextureOffset(94, 0).addBox(-26.9117F, -3.402F, -5.0F, 29.0F, 9.0F, 9.0F, 0.0F, false);
		RRuinMid.setTextureOffset(0, 197).addBox(-9.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(111, 191).addBox(-14.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(83, 191).addBox(-19.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(179, 189).addBox(-24.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		RRuinLower = new ModelRenderer(this);
		RRuinLower.setRotationPoint(-25.0F, 0.0F, 0.0F);
		RRuinMid.addChild(RRuinLower);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-25.9117F, 39.598F, -12.0F);
		RRuinLower.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, -0.4363F, 0.0F);
		cube_r19.setTextureOffset(27, 186).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r19.setTextureOffset(55, 186).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r19.setTextureOffset(151, 189).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r19.setTextureOffset(0, 152).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, -0.02F, false);

		RPod = new ModelRenderer(this);
		RPod.setRotationPoint(2.0F, -10.0F, 0.0F);
		RRuinShoulder.addChild(RPod);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-22.5061F, 74.3467F, -12.0F);
		RPod.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.4363F);
		cube_r20.setTextureOffset(0, 91).addBox(-18.0F, -95.0F, 4.0F, 15.0F, 5.0F, 15.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 114).addBox(-17.0F, -90.0F, 5.0F, 13.0F, 12.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RuinGuard.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_ANIM.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_ANIM.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm_ANIM.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm_ANIM.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg_ANIM.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm_ANIM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm_ANIM.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg_ANIM.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}