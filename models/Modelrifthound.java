// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrifthound extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer lefthand;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer righthand;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;

	public Modelrifthound() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.9875F, 11.0213F, -1.685F);
		head.setTextureOffset(0, 0).addBox(-3.9875F, -4.0213F, -9.315F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.9875F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-5.9875F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-5.9875F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(54, 0).addBox(5.0125F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(5.0125F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(4.0125F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(4.0125F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(4.0125F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(4.0125F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(4.0125F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(4.0125F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(38, 0).addBox(-3.9875F, -5.0213F, -5.315F, 8.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(-3.9875F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(1.0125F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9875F, -1.0213F, -15.315F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(46, 10).addBox(-1.9875F, -1.0313F, -14.315F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9875F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(2.0125F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(2.0025F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9775F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.4875F, -4.0213F, -5.815F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.3054F);
		head_r1.setTextureOffset(58, 0).addBox(-1.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(2.5125F, -4.0213F, -5.815F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.3054F);
		head_r2.setTextureOffset(58, 0).addBox(-0.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0125F, 2.9787F, -9.315F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.4363F, 0.0F, 0.0F);
		head_r3.setTextureOffset(0, 16).addBox(1.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(1.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(0, 16).addBox(-2.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(46, 11).addBox(-2.0F, 0.01F, -5.0F, 4.0F, 1.0F, 5.0F, 0.0F, true);
		head_r3.setTextureOffset(22, 12).addBox(-1.5F, -1.01F, -6.02F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		head_r3.setTextureOffset(0, 16).addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 6.0F, 0.0F, true);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-2.4875F, -1.5213F, -0.815F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, -0.6545F, 0.0F);
		head_r4.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(2.5125F, -1.5213F, -0.815F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.6545F, 0.0F);
		head_r5.setTextureOffset(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.5764F, 0.4891F, 0.3819F);
		head_r6.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.62F, -0.4891F, -0.3819F);
		head_r7.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(0.0125F, -3.0213F, -1.815F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.6109F, 0.0F, 0.0F);
		head_r8.setTextureOffset(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 26).addBox(-3.0F, -14.0F, 9.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 26).addBox(-3.0F, -14.0F, -3.0F, 8.0F, 4.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, -18.0301F, 22.9681F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(21, 52).addBox(-1.0F, -0.9176F, -0.8954F, 2.0F, 3.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -12.0F, 14.5F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 44).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 9.0F, 0.0F, false);

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(9.7664F, 12.5839F, -2.7512F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.2219F, 0.145F, -1.5606F);
		lefthand.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8727F, -0.1309F, 0.0F);
		cube_r3.setTextureOffset(53, 37).addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r3.setTextureOffset(0, 56).addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.1648F, 7.359F, -4.2973F);
		lefthand.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, -0.1309F, 0.0F);
		cube_r4.setTextureOffset(0, 56).addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r4.setTextureOffset(53, 37).addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r4.setTextureOffset(0, 56).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, -0.829F, 0.0F);
		cube_r5.setTextureOffset(54, 49).addBox(0.0325F, -1.8098F, -7.1351F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
		cube_r6.setTextureOffset(54, 49).addBox(1.1898F, -0.6715F, -6.3054F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.2182F, 0.0F);
		cube_r7.setTextureOffset(54, 49).addBox(-0.2506F, -0.6715F, -6.2563F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3054F, 0.3491F, 0.0F);
		cube_r8.setTextureOffset(54, 49).addBox(1.0473F, -1.7235F, -6.2071F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.5236F, -0.2182F, 0.0F);
		cube_r9.setTextureOffset(54, 49).addBox(1.991F, -3.5715F, -7.8006F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.6045F, 10.359F, -9.0955F);
		lefthand.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, -0.3054F, 0.0F);
		cube_r10.setTextureOffset(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		lefthand.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.3054F, 0.0F);
		cube_r11.setTextureOffset(48, 58).addBox(-1.123F, -1.2287F, -4.239F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(-6.744F, 12.5772F, -2.7512F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5081F, 10.8657F, -11.3508F);
		righthand.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2618F, -0.3927F, 0.0F);
		cube_r12.setTextureOffset(54, 49).addBox(0.7611F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5081F, 10.8657F, -11.3508F);
		righthand.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0873F, 0.0F);
		cube_r13.setTextureOffset(54, 49).addBox(-0.2389F, 0.0571F, -3.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.491F, 10.8657F, -11.0898F);
		righthand.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.7854F, 0.0F);
		cube_r14.setTextureOffset(54, 49).addBox(-1.2389F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.8817F, 11.4228F, -13.0585F);
		righthand.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.5236F, 0.2182F, 0.0F);
		cube_r15.setTextureOffset(54, 49).addBox(-0.2836F, -0.5F, -2.6624F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.491F, 10.8657F, -11.0898F);
		righthand.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.2182F, 0.0F);
		cube_r16.setTextureOffset(54, 49).addBox(-0.2389F, 0.0571F, -1.9829F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.2677F, 0.1517F, -1.5606F);
		righthand.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.8727F, 0.1309F, 0.0F);
		cube_r17.setTextureOffset(53, 37).addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r17.setTextureOffset(0, 56).addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.3248F, 7.3657F, -4.2973F);
		righthand.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.48F, 0.1309F, 0.0F);
		cube_r18.setTextureOffset(0, 56).addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r18.setTextureOffset(53, 37).addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r18.setTextureOffset(0, 56).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.5384F, 10.3657F, -9.685F);
		righthand.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7854F, 0.1309F, 0.0F);
		cube_r19.setTextureOffset(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0638F, 7.3657F, -2.3144F);
		righthand.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.1309F, 0.0F);
		cube_r20.setTextureOffset(48, 58).addBox(-2.0F, 3.0F, -9.0F, 4.0F, 2.0F, 4.0F, 0.0F, true);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-6.744F, 12.5772F, 11.2488F);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.5081F, 10.8657F, -11.3508F);
		rightleg.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.2618F, -0.3927F, 0.0F);
		cube_r21.setTextureOffset(54, 49).addBox(0.7611F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.5081F, 10.8657F, -11.3508F);
		rightleg.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0873F, 0.0F);
		cube_r22.setTextureOffset(54, 49).addBox(-0.2389F, 0.0571F, -3.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.491F, 10.8657F, -11.0898F);
		rightleg.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.3054F, 0.7854F, 0.0F);
		cube_r23.setTextureOffset(54, 49).addBox(-1.2389F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.8817F, 11.4228F, -13.0585F);
		rightleg.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.5236F, 0.2182F, 0.0F);
		cube_r24.setTextureOffset(54, 49).addBox(-0.2836F, -0.5F, -2.6624F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.491F, 10.8657F, -11.0898F);
		rightleg.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.2182F, 0.0F);
		cube_r25.setTextureOffset(54, 49).addBox(-0.2389F, 0.0571F, -1.9829F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.2677F, 0.1517F, -1.5606F);
		rightleg.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.8727F, 0.1309F, 0.0F);
		cube_r26.setTextureOffset(53, 37).addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r26.setTextureOffset(0, 56).addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.3248F, 7.3657F, -4.2973F);
		rightleg.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.48F, 0.1309F, 0.0F);
		cube_r27.setTextureOffset(0, 56).addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r27.setTextureOffset(53, 37).addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r27.setTextureOffset(0, 56).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.5384F, 10.3657F, -9.685F);
		rightleg.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.7854F, 0.1309F, 0.0F);
		cube_r28.setTextureOffset(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0638F, 7.3657F, -2.3144F);
		rightleg.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.1309F, 0.0F);
		cube_r29.setTextureOffset(48, 58).addBox(-2.0F, 3.0F, -9.0F, 4.0F, 2.0F, 4.0F, 0.0F, true);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(9.7664F, 12.5839F, 11.2488F);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.2219F, 0.145F, -1.5606F);
		leftleg.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.8727F, -0.1309F, 0.0F);
		cube_r30.setTextureOffset(53, 37).addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r30.setTextureOffset(0, 56).addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(1.1648F, 7.359F, -4.2973F);
		leftleg.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.48F, -0.1309F, 0.0F);
		cube_r31.setTextureOffset(0, 56).addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, 0.0F, true);
		cube_r31.setTextureOffset(53, 37).addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cube_r31.setTextureOffset(0, 56).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2618F, -0.829F, 0.0F);
		cube_r32.setTextureOffset(54, 49).addBox(0.0325F, -1.8098F, -7.1351F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.3491F, 0.0F);
		cube_r33.setTextureOffset(54, 49).addBox(1.1898F, -0.6715F, -6.3054F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, -0.2182F, 0.0F);
		cube_r34.setTextureOffset(54, 49).addBox(-0.2506F, -0.6715F, -6.2563F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.3054F, 0.3491F, 0.0F);
		cube_r35.setTextureOffset(54, 49).addBox(1.0473F, -1.7235F, -6.2071F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.5236F, -0.2182F, 0.0F);
		cube_r36.setTextureOffset(54, 49).addBox(1.991F, -3.5715F, -7.8006F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(2.6045F, 10.359F, -9.0955F);
		leftleg.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.7854F, -0.3054F, 0.0F);
		cube_r37.setTextureOffset(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.4676F, 11.5876F, -6.8973F);
		leftleg.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -0.3054F, 0.0F);
		cube_r38.setTextureOffset(48, 58).addBox(-1.123F, -1.2287F, -4.239F, 4.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
		righthand.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.lefthand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.righthand.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}