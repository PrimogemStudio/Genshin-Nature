// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelruin_grader extends EntityModel<Entity> {
	private final ModelRenderer RuinGuard;
	private final ModelRenderer CABEZA;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer RuinEye;
	private final ModelRenderer cube_r13;
	private final ModelRenderer RuinNeck;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer LEFT_ARM;
	private final ModelRenderer LRuinShoulder;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer LRuinMid;
	private final ModelRenderer LRuinLower;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer LPod;
	private final ModelRenderer cube_r22;
	private final ModelRenderer RIGHT_ARM;
	private final ModelRenderer RRuinShoulder;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer RRuinMid;
	private final ModelRenderer RRuinLower;
	private final ModelRenderer cube_r25;
	private final ModelRenderer RPod;
	private final ModelRenderer cube_r26;
	private final ModelRenderer RuinPelvis;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer RIGHT_LEG;
	private final ModelRenderer RRuinLegBottom;
	private final ModelRenderer cube_r29;
	private final ModelRenderer RRuinLegFoot2;
	private final ModelRenderer LEFT_LEG;
	private final ModelRenderer cube_r30;
	private final ModelRenderer LRuinLegBottom2;
	private final ModelRenderer cube_r31;
	private final ModelRenderer LRuinLegFoot;

	public Modelruin_grader() {
		textureWidth = 512;
		textureHeight = 512;

		RuinGuard = new ModelRenderer(this);
		RuinGuard.setRotationPoint(0.0F, 15.0F, 0.0F);

		CABEZA = new ModelRenderer(this);
		CABEZA.setRotationPoint(-1.0F, -39.0F, 7.0F);
		RuinGuard.addChild(CABEZA);
		setRotationAngle(CABEZA, 0.0F, 0.0F, -3.1416F);
		CABEZA.setTextureOffset(204, 131).addBox(-10.0F, 18.0F, -8.0F, 19.0F, 11.0F, 4.0F, 0.0F, false);
		CABEZA.setTextureOffset(211, 0).addBox(-6.0F, 15.0F, -10.0F, 11.0F, 7.0F, 4.0F, 0.0F, false);
		CABEZA.setTextureOffset(93, 47).addBox(-13.0F, 3.0F, -6.0F, 24.0F, 15.0F, 11.0F, -0.02F, false);
		CABEZA.setTextureOffset(90, 39).addBox(-13.0F, 13.0F, 5.0F, 24.0F, 5.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(0, 94).addBox(-13.0F, 3.0F, -7.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(27, 132).addBox(-11.0F, -2.0F, -7.0F, 20.0F, 2.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(94, 36).addBox(-11.0F, -2.0F, 5.0F, 20.0F, 2.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(0, 91).addBox(-13.0F, 3.0F, 5.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(238, 240).addBox(11.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		CABEZA.setTextureOffset(54, 116).addBox(11.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(110, 163).addBox(8.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(106, 163).addBox(8.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(91, 163).addBox(-11.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(163, 58).addBox(-11.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(97, 0).addBox(11.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(8, 39).addBox(-14.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(8, 0).addBox(-14.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		CABEZA.setTextureOffset(240, 71).addBox(11.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, -0.02F, false);
		CABEZA.setTextureOffset(75, 125).addBox(-14.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, -0.02F, false);
		CABEZA.setTextureOffset(240, 218).addBox(-14.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		CABEZA.setTextureOffset(128, 179).addBox(-11.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		CABEZA.setTextureOffset(117, 163).addBox(8.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		CABEZA.setTextureOffset(0, 177).addBox(-10.0F, -2.0F, -6.0F, 18.0F, 5.0F, 11.0F, -0.02F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-35.4178F, 37.9447F, -11.0F);
		CABEZA.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.4363F, -1.5708F);
		cube_r1.setTextureOffset(0, 177).addBox(-25.0F, 23.0F, 31.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(171, 115).addBox(-27.0F, 21.0F, 32.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(171, 111).addBox(-30.0F, 19.0F, 33.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(170, 28).addBox(-37.0F, 15.0F, 36.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(50, 91).addBox(-31.0F, 15.0F, 34.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(170, 24).addBox(-34.0F, 15.0F, 35.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(130, 169).addBox(-40.0F, 13.0F, 37.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(117, 168).addBox(-23.0F, 25.0F, 30.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(128, 155).addBox(-38.0F, 10.0F, 37.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(35, 153).addBox(-21.0F, 24.0F, 29.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(79, 9).addBox(-20.0F, 24.0F, 28.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(158, 129).addBox(-19.0F, 24.0F, 27.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(75, 143).addBox(-15.0F, 24.0F, 26.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(55, 159).addBox(-13.0F, 24.0F, 25.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(158, 135).addBox(-6.0F, 25.0F, 23.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(128, 183).addBox(-32.0F, 36.0F, 35.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 181).addBox(-34.0F, 34.0F, 36.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(128, 179).addBox(-29.0F, 35.0F, 34.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(94, 18).addBox(-26.0F, 36.0F, 33.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 97).addBox(-31.0F, 47.0F, 33.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(17, 214).addBox(-30.0F, 47.0F, 32.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 214).addBox(-38.0F, 55.0F, 35.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(92, 212).addBox(-36.0F, 52.0F, 35.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(46, 210).addBox(-34.0F, 51.0F, 34.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(97, 216).addBox(-27.0F, 47.0F, 31.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 218).addBox(-25.0F, 44.0F, 31.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(141, 186).addBox(-24.0F, 40.0F, 32.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(78, 189).addBox(-23.0F, 41.0F, 31.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(17, 218).addBox(-23.0F, 43.0F, 30.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(221, 146).addBox(-21.0F, 42.0F, 29.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(90, 47).addBox(-20.0F, 42.0F, 28.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(147, 170).addBox(-19.0F, 42.0F, 27.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 168).addBox(-15.0F, 42.0F, 26.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(240, 89).addBox(-13.0F, 42.0F, 25.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(185, 126).addBox(-6.0F, 41.0F, 23.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(59, 212).addBox(-8.0F, -4.0F, 17.0F, 14.0F, 13.0F, 5.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 39).addBox(-20.0F, 11.9082F, 4.0536F, 38.0F, 5.0F, 14.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(-17.0F, -9.0918F, 2.0536F, 32.0F, 24.0F, 15.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.9F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.setTextureOffset(0, 135).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.9F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.setTextureOffset(90, 51).addBox(-12.0F, -16.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.6F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.setTextureOffset(54, 125).addBox(9.0F, -12.0F, 0.0F, 7.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-11.6F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.setTextureOffset(90, 45).addBox(-12.0F, -16.0F, 0.0F, 11.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.setTextureOffset(67, 73).addBox(-12.0F, -16.0F, 0.0F, 7.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.setTextureOffset(114, 45).addBox(5.0F, -12.0F, 0.0F, 11.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6109F, 0.0F, -0.7854F);
		cube_r9.setTextureOffset(158, 114).addBox(-1.7345F, -8.8517F, -11.1384F, 3.0F, 8.0F, 7.0F, -0.02F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.4363F, 0.0F, -0.7854F);
		cube_r10.setTextureOffset(131, 231).addBox(-2.3345F, -13.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.6109F, 0.0F, 0.7854F);
		cube_r11.setTextureOffset(147, 155).addBox(-1.6655F, -7.8517F, -11.1384F, 3.0F, 8.0F, 7.0F, -0.02F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 29.0F, -7.0F);
		CABEZA.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.4363F, 0.0F, 0.7854F);
		cube_r12.setTextureOffset(246, 47).addBox(-5.6655F, -12.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, 0.0F, false);

		RuinEye = new ModelRenderer(this);
		RuinEye.setRotationPoint(-1.2F, 30.0F, -8.0F);
		CABEZA.addChild(RuinEye);
		setRotationAngle(RuinEye, 0.0F, 0.0F, -3.1416F);
		RuinEye.setTextureOffset(35, 193).addBox(-3.1F, -1.3F, -6.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 11.0F, 1.0F);
		RuinEye.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.setTextureOffset(94, 25).addBox(-6.3223F, -11.3223F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(58, 146).addBox(-12.3223F, -11.3223F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 66).addBox(-12.3223F, -5.3223F, -7.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 58).addBox(-3.3223F, -11.3223F, -7.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(130, 163).addBox(-3.3223F, -5.3223F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(48, 146).addBox(-6.3223F, -2.3223F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 104).addBox(-11.3223F, -2.3223F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(138, 163).addBox(-12.3223F, -10.3223F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(67, 58).addBox(-13.3223F, -12.3223F, -6.0F, 12.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 193).addBox(-14.3223F, -13.3223F, -5.0F, 14.0F, 14.0F, 7.0F, 0.0F, false);

		RuinNeck = new ModelRenderer(this);
		RuinNeck.setRotationPoint(-1.0F, 26.0F, -5.0F);
		CABEZA.addChild(RuinNeck);
		setRotationAngle(RuinNeck, -0.4363F, 0.0F, -3.1416F);
		RuinNeck.setTextureOffset(185, 207).addBox(-10.0F, -10.5326F, -4.1513F, 19.0F, 9.0F, 4.0F, 0.0F, false);
		RuinNeck.setTextureOffset(27, 159).addBox(-6.0F, -13.5326F, -6.1513F, 11.0F, 7.0F, 6.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7218F, 0.2382F, -0.661F);
		cube_r14.setTextureOffset(0, 116).addBox(39.1483F, -41.2728F, -48.2774F, 3.0F, 8.0F, 7.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.4363F, 0.0F, -0.7854F);
		cube_r15.setTextureOffset(196, 248).addBox(42.1483F, -48.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6545F, -0.3927F, 0.7854F);
		cube_r16.setTextureOffset(0, 153).addBox(-50.1483F, -44.9728F, -34.5774F, 3.0F, 8.0F, 7.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 63.3756F, 10.7951F);
		RuinNeck.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.4363F, 0.0F, 0.7854F);
		cube_r17.setTextureOffset(250, 101).addBox(-50.1483F, -47.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, -0.02F, false);

		LEFT_ARM = new ModelRenderer(this);
		LEFT_ARM.setRotationPoint(-15.0F, 30.0F, 5.0F);
		CABEZA.addChild(LEFT_ARM);
		setRotationAngle(LEFT_ARM, 0.0F, 0.0F, -3.1416F);

		LRuinShoulder = new ModelRenderer(this);
		LRuinShoulder.setRotationPoint(4.0F, 0.0F, 0.0F);
		LEFT_ARM.addChild(LRuinShoulder);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-18.0F, 69.0F, -12.0F);
		LRuinShoulder.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.7854F, 0.0F, 0.4363F);
		cube_r18.setTextureOffset(181, 80).addBox(-11.0F, -61.0F, -51.0F, 10.0F, 14.0F, 11.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-18.0F, 69.0F, -12.0F);
		LRuinShoulder.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.4363F);
		cube_r19.setTextureOffset(137, 198).addBox(-18.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r19.setTextureOffset(83, 144).addBox(-13.9522F, -80.7842F, 4.0F, 15.0F, 4.0F, 15.0F, 0.0F, false);
		cube_r19.setTextureOffset(67, 74).addBox(-19.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, 0.0F, false);
		cube_r19.setTextureOffset(89, 197).addBox(-18.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);

		LRuinMid = new ModelRenderer(this);
		LRuinMid.setRotationPoint(7.0F, 12.0F, 0.0F);
		LRuinShoulder.addChild(LRuinMid);
		setRotationAngle(LRuinMid, 0.0F, 0.0F, -1.5708F);
		LRuinMid.setTextureOffset(94, 0).addBox(-27.0F, -5.0F, -5.0F, 29.0F, 9.0F, 9.0F, 0.0F, false);
		LRuinMid.setTextureOffset(234, 0).addBox(-10.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(233, 105).addBox(-15.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(223, 231).addBox(-20.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(142, 231).addBox(-25.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinMid.setTextureOffset(28, 249).addBox(-25.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		LRuinMid.setTextureOffset(159, 231).addBox(-20.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		LRuinMid.setTextureOffset(180, 180).addBox(-15.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		LRuinMid.setTextureOffset(90, 128).addBox(-10.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		LRuinLower = new ModelRenderer(this);
		LRuinLower.setRotationPoint(-25.5061F, -0.6533F, 0.0F);
		LRuinMid.addChild(LRuinLower);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-25.9117F, 38.598F, -12.0F);
		LRuinLower.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -0.4363F, 0.0F);
		cube_r20.setTextureOffset(251, 0).addBox(21.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(251, 22).addBox(16.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(161, 0).addBox(0.0F, -33.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(183, 72).addBox(1.0F, -33.0F, 2.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20.setTextureOffset(240, 209).addBox(1.0F, -33.0F, -6.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r20.setTextureOffset(243, 191).addBox(2.0F, -30.0F, -3.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(212, 83).addBox(7.0F, -33.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(0, 58).addBox(4.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(212, 61).addBox(4.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r20.setTextureOffset(251, 93).addBox(11.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r20.setTextureOffset(223, 209).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r20.setTextureOffset(17, 227).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r20.setTextureOffset(229, 49).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r20.setTextureOffset(163, 54).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, -0.02F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-25.9117F, 38.598F, -12.0F);
		LRuinLower.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.4363F, 0.0F);
		cube_r21.setTextureOffset(125, 213).addBox(3.0F, -43.0F, -5.0F, 7.0F, 9.0F, 9.0F, -0.02F, false);

		LPod = new ModelRenderer(this);
		LPod.setRotationPoint(6.0F, -5.0F, 0.0F);
		LRuinShoulder.addChild(LPod);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-24.0F, 74.0F, -12.0F);
		LPod.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.4363F);
		cube_r22.setTextureOffset(174, 164).addBox(-12.9522F, -89.7842F, 5.0F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		cube_r22.setTextureOffset(65, 127).addBox(-0.9522F, -86.7842F, 18.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(161, 0).addBox(-4.9522F, -86.7842F, 18.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(227, 44).addBox(-13.9522F, -88.7842F, 18.0F, 15.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(27, 159).addBox(-8.9522F, -86.7842F, 18.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(118, 111).addBox(-13.9522F, -86.7842F, 18.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(150, 158).addBox(-13.9522F, -86.7842F, 17.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(3, 156).addBox(-13.9522F, -86.7842F, 13.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(147, 155).addBox(-13.9522F, -86.7842F, 9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(138, 155).addBox(-13.9522F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(157, 240).addBox(-13.9522F, -88.7842F, 5.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r22.setTextureOffset(215, 127).addBox(-13.9522F, -88.7842F, 4.0F, 15.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(118, 107).addBox(-13.9522F, -86.7842F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(27, 153).addBox(-8.9522F, -86.7842F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(0, 153).addBox(-4.9522F, -86.7842F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(13, 116).addBox(-0.9522F, -86.7842F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(138, 77).addBox(0.0478F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(138, 73).addBox(0.0478F, -86.7842F, 9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(67, 135).addBox(0.0478F, -86.7842F, 13.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(63, 135).addBox(0.0478F, -86.7842F, 17.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(88, 240).addBox(0.0478F, -88.7842F, 5.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r22.setTextureOffset(161, 18).addBox(-13.9522F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r22.setTextureOffset(141, 180).addBox(-12.9522F, -88.7842F, 5.0F, 13.0F, 5.0F, 13.0F, 0.0F, false);
		cube_r22.setTextureOffset(172, 242).addBox(-9.9522F, -83.7842F, 8.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		RIGHT_ARM = new ModelRenderer(this);
		RIGHT_ARM.setRotationPoint(19.0F, 32.0F, 5.0F);
		CABEZA.addChild(RIGHT_ARM);
		setRotationAngle(RIGHT_ARM, 0.0F, 0.0F, -3.1416F);

		RRuinShoulder = new ModelRenderer(this);
		RRuinShoulder.setRotationPoint(2.0F, 5.0F, 0.0F);
		RIGHT_ARM.addChild(RRuinShoulder);
		setRotationAngle(RRuinShoulder, 0.0F, 0.0F, -0.7854F);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-20.5061F, 64.3467F, -12.0F);
		RRuinShoulder.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.4363F);
		cube_r23.setTextureOffset(47, 185).addBox(-20.0F, -61.0F, -51.0F, 10.0F, 14.0F, 11.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-20.5061F, 64.3467F, -12.0F);
		RRuinShoulder.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.4363F);
		cube_r24.setTextureOffset(185, 111).addBox(-26.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);
		cube_r24.setTextureOffset(136, 92).addBox(-22.4428F, -80.4887F, 4.0F, 15.0F, 4.0F, 15.0F, 0.0F, false);
		cube_r24.setTextureOffset(0, 58).addBox(-27.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, 0.0F, false);
		cube_r24.setTextureOffset(193, 192).addBox(-26.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, 0.0F, false);

		RRuinMid = new ModelRenderer(this);
		RRuinMid.setRotationPoint(-12.5061F, 0.3467F, 0.0F);
		RRuinShoulder.addChild(RRuinMid);
		setRotationAngle(RRuinMid, 0.0F, 0.0F, -0.7854F);
		RRuinMid.setTextureOffset(94, 18).addBox(-26.9117F, -3.402F, -5.0F, 29.0F, 9.0F, 9.0F, 0.0F, false);
		RRuinMid.setTextureOffset(239, 135).addBox(-9.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(0, 238).addBox(-14.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(236, 164).addBox(-19.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(234, 22).addBox(-24.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RRuinMid.setTextureOffset(180, 252).addBox(-24.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		RRuinMid.setTextureOffset(71, 252).addBox(-19.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		RRuinMid.setTextureOffset(55, 252).addBox(-14.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		RRuinMid.setTextureOffset(39, 252).addBox(-9.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		RRuinLower = new ModelRenderer(this);
		RRuinLower.setRotationPoint(-25.0F, 0.0F, 0.0F);
		RRuinMid.addChild(RRuinLower);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-25.9117F, 39.598F, -12.0F);
		RRuinLower.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, -0.4363F, 0.0F);
		cube_r25.setTextureOffset(111, 253).addBox(21.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(127, 253).addBox(16.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(97, 212).addBox(4.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r25.setTextureOffset(240, 233).addBox(1.0F, -47.0F, -6.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r25.setTextureOffset(193, 242).addBox(1.0F, -47.0F, 2.0F, 11.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r25.setTextureOffset(185, 138).addBox(0.0F, -47.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(243, 198).addBox(2.0F, -49.0F, -3.0F, 8.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(114, 212).addBox(7.0F, -47.0F, -3.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(0, 66).addBox(4.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(143, 253).addBox(11.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		cube_r25.setTextureOffset(45, 230).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r25.setTextureOffset(73, 230).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r25.setTextureOffset(114, 231).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		cube_r25.setTextureOffset(157, 213).addBox(3.0F, -43.0F, -5.0F, 7.0F, 9.0F, 9.0F, -0.02F, false);
		cube_r25.setTextureOffset(174, 146).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, -0.02F, false);

		RPod = new ModelRenderer(this);
		RPod.setRotationPoint(2.0F, -10.0F, 0.0F);
		RRuinShoulder.addChild(RPod);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-22.5061F, 74.3467F, -12.0F);
		RPod.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.4363F);
		cube_r26.setTextureOffset(184, 178).addBox(-21.4428F, -89.4887F, 5.0F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		cube_r26.setTextureOffset(11, 58).addBox(-9.4428F, -86.4887F, 18.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(134, 73).addBox(-13.4428F, -86.4887F, 18.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(101, 128).addBox(-8.4428F, -86.4887F, 17.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(90, 128).addBox(-8.4428F, -86.4887F, 13.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(83, 125).addBox(-8.4428F, -86.4887F, 9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(75, 125).addBox(-8.4428F, -86.4887F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(102, 163).addBox(-8.4428F, -88.4887F, 5.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r26.setTextureOffset(14, 131).addBox(-22.4428F, -86.4887F, 13.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(75, 131).addBox(-22.4428F, -86.4887F, 9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(83, 131).addBox(-22.4428F, -86.4887F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(228, 194).addBox(-22.4428F, -88.4887F, 5.0F, 1.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r26.setTextureOffset(133, 110).addBox(-22.4428F, -86.4887F, 17.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(133, 114).addBox(-17.4428F, -86.4887F, 18.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(8, 9).addBox(-22.4428F, -86.4887F, 18.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(90, 125).addBox(-22.4428F, -88.4887F, 18.0F, 15.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(134, 77).addBox(-17.4428F, -86.4887F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(49, 135).addBox(-13.4428F, -86.4887F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(11, 66).addBox(-9.4428F, -86.4887F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(0, 116).addBox(-22.4428F, -86.4887F, 4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(158, 140).addBox(-22.4428F, -88.4887F, 4.0F, 15.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r26.setTextureOffset(89, 179).addBox(-21.4428F, -88.4887F, 5.0F, 13.0F, 5.0F, 13.0F, 0.0F, false);
		cube_r26.setTextureOffset(133, 111).addBox(-18.4428F, -83.4887F, 8.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		RuinPelvis = new ModelRenderer(this);
		RuinPelvis.setRotationPoint(-1.0F, -37.0F, 6.0F);
		RuinGuard.addChild(RuinPelvis);
		setRotationAngle(RuinPelvis, 0.0F, 0.0F, -3.1416F);
		RuinPelvis.setTextureOffset(170, 22).addBox(-10.0F, -1.0F, -5.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
		RuinPelvis.setTextureOffset(27, 116).addBox(-5.0F, -6.0F, -5.0F, 8.0F, 5.0F, 11.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-4.0F, 16.0F, 6.0F);
		RuinPelvis.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.setTextureOffset(0, 50).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r27.setTextureOffset(27, 135).addBox(8.0F, -15.0F, -12.0F, 10.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r27.setTextureOffset(138, 45).addBox(10.0F, -12.0F, -12.0F, 5.0F, 1.0F, 1.0F, -0.02F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-4.0F, 16.0F, 6.0F);
		RuinPelvis.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.7854F);
		cube_r28.setTextureOffset(90, 136).addBox(-11.0F, -16.0F, 0.0F, 5.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r28.setTextureOffset(67, 71).addBox(-15.0F, -19.0F, -12.0F, 11.0F, 1.0F, 1.0F, -0.02F, false);
		cube_r28.setTextureOffset(79, 13).addBox(-12.0F, -16.0F, -12.0F, 6.0F, 1.0F, 1.0F, -0.02F, false);

		RIGHT_LEG = new ModelRenderer(this);
		RIGHT_LEG.setRotationPoint(7.4939F, -2.6533F, 2.0F);
		RuinPelvis.addChild(RIGHT_LEG);
		setRotationAngle(RIGHT_LEG, 0.0F, 0.0F, -1.5708F);
		RIGHT_LEG.setTextureOffset(59, 107).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, 0.0F, false);
		RIGHT_LEG.setTextureOffset(27, 116).addBox(21.0883F, -4.402F, -7.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		RIGHT_LEG.setTextureOffset(223, 83).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RIGHT_LEG.setTextureOffset(206, 220).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		RIGHT_LEG.setTextureOffset(178, 220).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		RRuinLegBottom = new ModelRenderer(this);
		RRuinLegBottom.setRotationPoint(21.0F, 0.0F, 0.0F);
		RIGHT_LEG.addChild(RRuinLegBottom);
		RRuinLegBottom.setTextureOffset(152, 36).addBox(-0.9117F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(223, 178).addBox(-8.9117F, -1.402F, 10.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(0, 131).addBox(-7.9117F, -1.402F, 9.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(0, 172).addBox(-6.9117F, -1.402F, 8.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(27, 172).addBox(-2.9117F, -1.402F, 7.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(246, 129).addBox(-0.9117F, -1.402F, 6.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(196, 105).addBox(6.0883F, -1.402F, 4.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(130, 163).addBox(2.0883F, -6.402F, -5.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(174, 164).addBox(0.0883F, -6.402F, -7.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(141, 180).addBox(2.0883F, 4.598F, -5.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(174, 170).addBox(0.0883F, 4.598F, -7.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(59, 91).addBox(2.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(210, 34).addBox(4.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 13.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(133, 121).addBox(-7.9117F, -2.402F, -9.0F, 7.0F, 5.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(140, 36).addBox(-0.9117F, -3.402F, -9.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(117, 163).addBox(6.0883F, -1.402F, -9.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(236, 157).addBox(6.0883F, -1.402F, -7.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);
		RRuinLegBottom.setTextureOffset(170, 0).addBox(4.0883F, -5.402F, -6.0F, 15.0F, 11.0F, 11.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-46.9117F, 38.598F, -12.0F);
		RRuinLegBottom.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
		cube_r29.setTextureOffset(158, 111).addBox(32.0F, -33.0F, 41.0F, 2.0F, 1.0F, 23.0F, -0.02F, false);
		cube_r29.setTextureOffset(48, 125).addBox(32.0F, -44.0F, 41.0F, 2.0F, 11.0F, 23.0F, -0.02F, false);
		cube_r29.setTextureOffset(147, 156).addBox(32.0F, -45.0F, 41.0F, 2.0F, 1.0F, 23.0F, -0.02F, false);

		RRuinLegFoot2 = new ModelRenderer(this);
		RRuinLegFoot2.setRotationPoint(19.0F, -1.0F, 0.0F);
		RRuinLegBottom.addChild(RRuinLegFoot2);
		RRuinLegFoot2.setTextureOffset(106, 107).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 21.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(201, 34).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(91, 163).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(48, 135).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		RRuinLegFoot2.setTextureOffset(154, 111).addBox(-2.0F, -1.0F, -10.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		LEFT_LEG = new ModelRenderer(this);
		LEFT_LEG.setRotationPoint(-9.5061F, -2.6533F, 2.0F);
		RuinPelvis.addChild(LEFT_LEG);
		setRotationAngle(LEFT_LEG, 0.0F, 0.0F, -1.5708F);
		LEFT_LEG.setTextureOffset(0, 98).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, 0.0F, false);
		LEFT_LEG.setTextureOffset(219, 153).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LEFT_LEG.setTextureOffset(217, 11).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);
		LEFT_LEG.setTextureOffset(0, 214).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-25.9117F, 38.598F, -12.0F);
		LEFT_LEG.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.7854F, 0.0F);
		cube_r30.setTextureOffset(131, 121).addBox(32.0F, -44.0F, 41.0F, 2.0F, 11.0F, 23.0F, -0.02F, false);

		LRuinLegBottom2 = new ModelRenderer(this);
		LRuinLegBottom2.setRotationPoint(20.0F, 0.0F, 0.0F);
		LEFT_LEG.addChild(LRuinLegBottom2);
		LRuinLegBottom2.setTextureOffset(134, 73).addBox(0.0883F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(223, 186).addBox(7.0883F, -1.402F, 4.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(250, 112).addBox(0.0883F, -1.402F, 6.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(78, 185).addBox(-1.9117F, -1.402F, 7.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(147, 174).addBox(-5.9117F, -1.402F, 8.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(152, 54).addBox(-6.9117F, -1.402F, 9.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(223, 182).addBox(-7.9117F, -1.402F, 10.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(50, 163).addBox(5.0883F, -5.402F, -6.0F, 15.0F, 11.0F, 11.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(29, 201).addBox(5.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 13.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(90, 234).addBox(7.0883F, -1.402F, -7.0F, 13.0F, 3.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(160, 155).addBox(7.0883F, -1.402F, -9.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(79, 0).addBox(0.0883F, -3.402F, -9.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(148, 213).addBox(-6.9117F, -2.402F, -9.0F, 7.0F, 5.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(161, 18).addBox(3.0883F, 4.598F, -5.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(27, 153).addBox(1.0883F, 4.598F, -7.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(0, 0).addBox(3.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(0, 39).addBox(1.0883F, -4.402F, -7.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(75, 125).addBox(3.0883F, -6.402F, -5.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		LRuinLegBottom2.setTextureOffset(75, 131).addBox(1.0883F, -6.402F, -7.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-45.9117F, 38.598F, -12.0F);
		LRuinLegBottom2.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.7854F, 0.0F);
		cube_r31.setTextureOffset(0, 153).addBox(32.0F, -33.0F, 41.0F, 2.0F, 1.0F, 23.0F, -0.02F, false);
		cube_r31.setTextureOffset(120, 155).addBox(32.0F, -45.0F, 41.0F, 2.0F, 1.0F, 23.0F, -0.02F, false);

		LRuinLegFoot = new ModelRenderer(this);
		LRuinLegFoot.setRotationPoint(20.0F, -1.0F, 0.0F);
		LRuinLegBottom2.addChild(LRuinLegFoot);
		LRuinLegFoot.setTextureOffset(0, 116).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 21.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(62, 230).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(34, 227).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(195, 220).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, 0.0F, false);
		LRuinLegFoot.setTextureOffset(13, 153).addBox(-2.0F, -1.0F, -10.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RuinGuard.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RIGHT_LEG.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.LEFT_LEG.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LEFT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RIGHT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}