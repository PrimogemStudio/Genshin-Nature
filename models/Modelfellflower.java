// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfellflower extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer leaves;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer leaves2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer leaves3;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r7;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r8;
	private final ModelRenderer decorations;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer decorations2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer decorations3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer decorations4;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer decorations6;
	private final ModelRenderer decorations7;
	private final ModelRenderer decorations5;

	public Modelfellflower() {
		textureWidth = 192;
		textureHeight = 192;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -33.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-12.0F, -24.0F, -12.0F, 24.0F, 24.0F, 24.0F, 0.0F, false);
		Head.setTextureOffset(108, 48).addBox(-4.5F, -33.0F, -6.0F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(0.0F, -3.0F, 3.0F);
		Head.addChild(leaves);
		setRotationAngle(leaves, 0.0F, 0.0F, -0.3491F);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(9.0F, -21.0F, -10.5F);
		leaves.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.8727F, -0.6981F, 0.0F);
		Head_r1.setTextureOffset(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(20.7265F, -35.1404F, -22.6257F);
		leaves.addChild(Head_r2);
		setRotationAngle(Head_r2, 2.138F, -0.6981F, 0.0F);
		Head_r2.setTextureOffset(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, 0.0F, false);

		leaves2 = new ModelRenderer(this);
		leaves2.setRotationPoint(0.0F, -3.0F, 3.0F);
		Head.addChild(leaves2);
		setRotationAngle(leaves2, 0.0F, 1.5708F, 0.3491F);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(9.0F, -21.0F, -10.5F);
		leaves2.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.8727F, -0.6981F, 0.0F);
		Head_r3.setTextureOffset(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(20.7265F, -35.1404F, -22.6257F);
		leaves2.addChild(Head_r4);
		setRotationAngle(Head_r4, 2.138F, -0.6981F, 0.0F);
		Head_r4.setTextureOffset(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, 0.0F, false);

		leaves3 = new ModelRenderer(this);
		leaves3.setRotationPoint(-2.0497F, -35.1166F, 13.0332F);
		Head.addChild(leaves3);
		setRotationAngle(leaves3, 2.6467F, -0.5989F, -2.8086F);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(-12.5248F, 7.1935F, 12.6223F);
		leaves3.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.8727F, -0.6981F, 0.0F);
		Head_r5.setTextureOffset(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, 0.0F, false);

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(-0.7983F, -6.9468F, 0.4966F);
		leaves3.addChild(Head_r6);
		setRotationAngle(Head_r6, 2.138F, -0.6981F, 0.0F);
		Head_r6.setTextureOffset(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 57).addBox(-3.0F, -57.0F, -3.0F, 6.0F, 57.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(53, 73).addBox(-3.0F, -51.0F, -6.0F, 6.0F, 15.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(29, 53).addBox(-3.0F, -57.0F, -6.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(51, 83).addBox(-3.0F, -51.0F, 3.0F, 6.0F, 15.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 118).addBox(-9.0F, -24.0F, -6.0F, 6.0F, 24.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(0, 110).addBox(-6.0F, -24.0F, 3.0F, 12.0F, 24.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 109).addBox(-6.0F, -24.0F, -9.0F, 12.0F, 24.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 168).addBox(-6.0F, -24.0F, -9.09F, 12.0F, 24.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 115).addBox(3.0F, -24.0F, -6.0F, 6.0F, 24.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(4, 132).addBox(3.0F, -15.0F, -12.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(2, 140).addBox(-6.0F, -15.0F, -12.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(10, 95).addBox(3.0F, -15.0F, 9.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(30, 105).addBox(-6.0F, -15.0F, 9.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-10.5F, -24.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.setTextureOffset(174, 162).addBox(1.5F, 0.0F, -3.0F, 3.0F, 24.0F, 6.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(10.5F, -24.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(174, 162).addBox(-4.5F, 0.0F, -3.0F, 3.0F, 24.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -49.5F, 4.5F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.setTextureOffset(64, 74).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 15.0F, 3.0F, 0.0F, false);
		cube_r3.setTextureOffset(53, 73).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 15.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -49.5F, 4.5F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6109F);
		cube_r4.setTextureOffset(67, 68).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 15.0F, 3.0F, 0.0F, false);
		cube_r4.setTextureOffset(53, 73).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 15.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -55.5F, 4.5F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(93, 76).addBox(-6.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(93, 77).addBox(3.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(92, 78).addBox(3.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(93, 76).addBox(-6.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(90, 76).addBox(-3.0F, 1.5F, -1.5F, 6.0F, 33.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -55.5F, -4.5F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(91, 76).addBox(3.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(91, 77).addBox(-6.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(92, 76).addBox(-6.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(91, 77).addBox(3.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r6.setTextureOffset(90, 75).addBox(-3.0F, 1.5F, -1.5F, 6.0F, 33.0F, 3.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(10.5F, 18.0F, 0.0F);
		leg1.setTextureOffset(56, 129).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-10.5F, 18.0F, 0.0F);
		leg2.setTextureOffset(57, 128).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(4.5F, -31.5F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
		cube_r7.setTextureOffset(91, 76).addBox(-1.5F, 19.5F, 3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(91, 76).addBox(-1.5F, 7.5F, 3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(91, 77).addBox(-1.5F, 19.5F, -6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(93, 76).addBox(-1.5F, 7.5F, -6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r7.setTextureOffset(90, 75).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 33.0F, 6.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-4.5F, -31.5F, 0.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3054F);
		cube_r8.setTextureOffset(92, 75).addBox(-1.5F, 19.5F, -6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r8.setTextureOffset(93, 77).addBox(-1.5F, 19.5F, 3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r8.setTextureOffset(93, 77).addBox(-1.5F, 7.5F, 3.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r8.setTextureOffset(93, 77).addBox(-1.5F, 7.5F, -6.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		cube_r8.setTextureOffset(90, 75).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 33.0F, 6.0F, 0.0F, false);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, -36.0F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(14.6042F, 12.2658F, -14.2763F);
		decorations.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2877F, 0.5467F, -0.5175F);
		cube_r9.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r9.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r9.setTextureOffset(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.5F, 4.5F, -6.0F);
		decorations.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.5208F, 0.3352F, -1.05F);
		cube_r10.setTextureOffset(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, 0.0F, false);

		decorations2 = new ModelRenderer(this);
		decorations2.setRotationPoint(0.0F, -36.0F, 0.0F);
		setRotationAngle(decorations2, 0.0F, 1.5708F, 0.0F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(14.6042F, 12.2658F, -14.2763F);
		decorations2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2877F, 0.5467F, -0.5175F);
		cube_r11.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r11.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r11.setTextureOffset(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.5F, 4.5F, -6.0F);
		decorations2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.5208F, 0.3352F, -1.05F);
		cube_r12.setTextureOffset(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, 0.0F, false);

		decorations3 = new ModelRenderer(this);
		decorations3.setRotationPoint(0.0F, -36.0F, 0.0F);
		setRotationAngle(decorations3, 0.0F, 3.1416F, 0.0F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(14.6042F, 12.2658F, -14.2763F);
		decorations3.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2877F, 0.5467F, -0.5175F);
		cube_r13.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r13.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r13.setTextureOffset(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.5F, 4.5F, -6.0F);
		decorations3.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5208F, 0.3352F, -1.05F);
		cube_r14.setTextureOffset(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, 0.0F, false);

		decorations4 = new ModelRenderer(this);
		decorations4.setRotationPoint(0.0F, -36.0F, 0.0F);
		setRotationAngle(decorations4, 0.0F, -1.5708F, 0.0F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(14.6042F, 12.2658F, -14.2763F);
		decorations4.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2877F, 0.5467F, -0.5175F);
		cube_r15.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r15.setTextureOffset(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r15.setTextureOffset(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(4.5F, 4.5F, -6.0F);
		decorations4.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.5208F, 0.3352F, -1.05F);
		cube_r16.setTextureOffset(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, 0.0F, false);

		decorations6 = new ModelRenderer(this);
		decorations6.setRotationPoint(-24.0F, -24.0F, 3.0F);
		decorations6.setTextureOffset(113, 129).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		decorations6.setTextureOffset(115, 132).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations6.setTextureOffset(115, 131).addBox(-1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations6.setTextureOffset(114, 129).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations6.setTextureOffset(114, 130).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations6.setTextureOffset(116, 134).addBox(3.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations6.setTextureOffset(116, 133).addBox(-6.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		decorations7 = new ModelRenderer(this);
		decorations7.setRotationPoint(0.0F, -24.0F, 21.0F);
		decorations7.setTextureOffset(112, 128).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		decorations7.setTextureOffset(117, 133).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations7.setTextureOffset(116, 133).addBox(-1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations7.setTextureOffset(118, 130).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations7.setTextureOffset(117, 131).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations7.setTextureOffset(116, 133).addBox(3.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations7.setTextureOffset(117, 131).addBox(-6.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		decorations5 = new ModelRenderer(this);
		decorations5.setRotationPoint(0.0F, 24.0F, 0.0F);
		decorations5.setTextureOffset(114, 129).addBox(21.0F, -51.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		decorations5.setTextureOffset(115, 130).addBox(22.5F, -49.5F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations5.setTextureOffset(115, 133).addBox(22.5F, -49.5F, 6.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations5.setTextureOffset(115, 131).addBox(22.5F, -54.0F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations5.setTextureOffset(117, 133).addBox(22.5F, -45.0F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations5.setTextureOffset(115, 130).addBox(27.0F, -49.5F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		decorations5.setTextureOffset(117, 131).addBox(18.0F, -49.5F, 1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations2.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations3.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations4.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations6.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations7.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations5.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}