// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarama extends EntityModel<Entity> {
	private final ModelRenderer arama;
	private final ModelRenderer ANIMAR_LEFT_ARM;
	private final ModelRenderer ANIMAR_RIGHT_ARM;
	private final ModelRenderer ANIMAR_CABEZA;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Scarfstrap;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Head;
	private final ModelRenderer Leaves;
	private final ModelRenderer LeafLeft;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leafLeft1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeafLeft2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeafLeft3;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LeafRight4;
	private final ModelRenderer cube_r7;
	private final ModelRenderer leafRight5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer LeafRight6;
	private final ModelRenderer cube_r9;
	private final ModelRenderer LeafRight7;
	private final ModelRenderer cube_r10;
	private final ModelRenderer headVines;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer Flower;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r24;
	private final ModelRenderer bone14;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer bone15;
	private final ModelRenderer cube_r27;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r28;
	private final ModelRenderer earLeft;
	private final ModelRenderer cube_r29;
	private final ModelRenderer earRight;
	private final ModelRenderer cube_r30;
	private final ModelRenderer LegLeft;
	private final ModelRenderer LegRight;

	public Modelarama() {
		textureWidth = 128;
		textureHeight = 128;

		arama = new ModelRenderer(this);
		arama.setRotationPoint(-1.5F, 24.0F, -3.0F);
		arama.setTextureOffset(52, 0).addBox(-3.0F, -16.0F, 0.0F, 9.0F, 8.0F, 6.0F, 0.0F, false);

		ANIMAR_LEFT_ARM = new ModelRenderer(this);
		ANIMAR_LEFT_ARM.setRotationPoint(-3.4F, -13.9F, 3.0F);
		arama.addChild(ANIMAR_LEFT_ARM);
		setRotationAngle(ANIMAR_LEFT_ARM, 0.0F, 0.0F, 0.3927F);
		ANIMAR_LEFT_ARM.setTextureOffset(52, 14).addBox(-2.3F, -1.6F, -2.0F, 4.0F, 10.0F, 4.0F, -0.5F, false);

		ANIMAR_RIGHT_ARM = new ModelRenderer(this);
		ANIMAR_RIGHT_ARM.setRotationPoint(6.4F, -13.9F, 3.0F);
		arama.addChild(ANIMAR_RIGHT_ARM);
		setRotationAngle(ANIMAR_RIGHT_ARM, 0.0F, 0.0F, -0.3927F);
		ANIMAR_RIGHT_ARM.setTextureOffset(52, 14).addBox(-1.7F, -1.6F, -2.0F, 4.0F, 10.0F, 4.0F, -0.5F, true);

		ANIMAR_CABEZA = new ModelRenderer(this);
		ANIMAR_CABEZA.setRotationPoint(1.5F, -16.5F, 3.0F);
		arama.addChild(ANIMAR_CABEZA);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ANIMAR_CABEZA.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0873F);
		cube_r1.setTextureOffset(0, 41).addBox(-5.5F, -2.0F, -4.0F, 11.0F, 4.0F, 8.0F, 0.0F, false);

		Scarfstrap = new ModelRenderer(this);
		Scarfstrap.setRotationPoint(-2.3985F, 1.2588F, 2.6782F);
		ANIMAR_CABEZA.addChild(Scarfstrap);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.1015F, -0.2588F, 0.3218F);
		Scarfstrap.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3491F, 0.0F, -0.7854F);
		cube_r2.setTextureOffset(83, 90).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 18.0F, 0.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -0.8F, 0.0F);
		ANIMAR_CABEZA.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-8.0F, -12.7F, -5.0F, 16.0F, 13.0F, 10.0F, 0.0F, false);

		Leaves = new ModelRenderer(this);
		Leaves.setRotationPoint(26.6F, 0.1F, 0.0F);
		Head.addChild(Leaves);

		LeafLeft = new ModelRenderer(this);
		LeafLeft.setRotationPoint(-53.2F, 0.0F, 0.0F);
		Leaves.addChild(LeafLeft);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(17.1146F, -17.1226F, 0.0F);
		LeafLeft.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 1.3963F);
		cube_r3.setTextureOffset(0, 111).addBox(2.074F, -7.8752F, -12.774F, 11.0F, 6.0F, 11.0F, 2.0F, true);

		leafLeft1 = new ModelRenderer(this);
		leafLeft1.setRotationPoint(17.3F, -17.2F, 0.0F);
		LeafLeft.addChild(leafLeft1);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.2F, 11.3F, 0.0F);
		leafLeft1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.6981F);
		cube_r4.setTextureOffset(0, 23).addBox(-3.7F, -5.9F, -7.0F, 11.0F, 6.0F, 11.0F, 2.0F, true);

		LeafLeft2 = new ModelRenderer(this);
		LeafLeft2.setRotationPoint(-5.8F, 7.6F, 0.0F);
		leafLeft1.addChild(LeafLeft2);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5F, 9.0F, 0.0F);
		LeafLeft2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 1.1345F);
		cube_r5.setTextureOffset(34, 30).addBox(-3.7F, -8.9F, -6.0F, 10.0F, 9.0F, 10.0F, 1.5F, true);

		LeafLeft3 = new ModelRenderer(this);
		LeafLeft3.setRotationPoint(-6.6F, 2.7F, 0.0F);
		LeafLeft2.addChild(LeafLeft3);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.9F, 6.9F, 0.0F);
		LeafLeft3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 1.4835F);
		cube_r6.setTextureOffset(30, 49).addBox(-3.7F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, true);

		LeafRight4 = new ModelRenderer(this);
		LeafRight4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Leaves.addChild(LeafRight4);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-17.1146F, -17.1226F, 0.0F);
		LeafRight4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.7854F, -1.3963F);
		cube_r7.setTextureOffset(0, 111).addBox(-13.074F, -7.8752F, -12.774F, 11.0F, 6.0F, 11.0F, 2.0F, false);

		leafRight5 = new ModelRenderer(this);
		leafRight5.setRotationPoint(-17.3F, -17.2F, 0.0F);
		LeafRight4.addChild(leafRight5);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.2F, 11.3F, 0.0F);
		leafRight5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, -0.6981F);
		cube_r8.setTextureOffset(0, 23).addBox(-7.3F, -5.9F, -7.0F, 11.0F, 6.0F, 11.0F, 2.0F, false);

		LeafRight6 = new ModelRenderer(this);
		LeafRight6.setRotationPoint(5.8F, 7.6F, 0.0F);
		leafRight5.addChild(LeafRight6);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.5F, 9.0F, 0.0F);
		LeafRight6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.7854F, -1.1345F);
		cube_r9.setTextureOffset(34, 30).addBox(-6.3F, -8.9F, -6.0F, 10.0F, 9.0F, 10.0F, 1.5F, false);

		LeafRight7 = new ModelRenderer(this);
		LeafRight7.setRotationPoint(6.6F, 2.7F, 0.0F);
		LeafRight6.addChild(LeafRight7);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.9F, 6.9F, 0.0F);
		LeafRight7.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.7854F, -1.4835F);
		cube_r10.setTextureOffset(30, 49).addBox(-4.3F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);

		headVines = new ModelRenderer(this);
		headVines.setRotationPoint(0.0F, -17.2F, 0.0F);
		Head.addChild(headVines);
		headVines.setTextureOffset(96, 0).addBox(-4.0F, -11.5F, 0.0F, 8.0F, 13.0F, 0.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -5.0F, 0.0F);
		headVines.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, -0.9599F, 3.1416F);
		cube_r11.setTextureOffset(96, 0).addBox(-4.0F, -6.5F, 0.0F, 8.0F, 13.0F, 0.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -5.0F, 0.0F);
		headVines.addChild(cube_r12);
		setRotationAngle(cube_r12, -3.1416F, 0.5672F, 3.1416F);
		cube_r12.setTextureOffset(96, 0).addBox(-4.0F, -6.5F, 0.0F, 8.0F, 13.0F, 0.0F, 0.0F, false);

		Flower = new ModelRenderer(this);
		Flower.setRotationPoint(0.0F, -10.8F, 0.0F);
		headVines.addChild(Flower);
		setRotationAngle(Flower, 0.0F, -1.0472F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.9F, 0.1F, 0.0F);
		Flower.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.6981F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.2F, -8.4F, 0.0F);
		bone3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
		cube_r13.setTextureOffset(112, 23).addBox(-3.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, -0.25F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.2F, -2.2F, 0.0F);
		bone3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.7854F, 0.5672F);
		cube_r14.setTextureOffset(112, 37).addBox(-3.7071F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, -0.25F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.2F, -6.6F, 0.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.7854F, -0.3054F);
		cube_r15.setTextureOffset(112, 48).addBox(-3.7071F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, -0.35F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.75F, -2.5F, 0.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.6981F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.05F, 0.1F, 0.0F);
		bone5.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.7854F, -0.3054F);
		cube_r16.setTextureOffset(112, 61).addBox(-1.7454F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, -0.35F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.9F, 0.1F, 0.0F);
		Flower.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.6981F);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.2F, -8.4F, 0.0F);
		bone6.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.7854F, 0.0F);
		cube_r17.setTextureOffset(112, 23).addBox(-1.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, -0.25F, true);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.2F, -2.2F, 0.0F);
		bone6.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.7854F, -0.5672F);
		cube_r18.setTextureOffset(112, 37).addBox(-0.2929F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, -0.25F, true);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.2F, -6.6F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.7854F);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.7854F, 0.3054F);
		cube_r19.setTextureOffset(112, 48).addBox(-0.2929F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, -0.35F, true);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.75F, -2.5F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.6981F);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.05F, 0.1F, 0.0F);
		bone8.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.7854F, 0.3054F);
		cube_r20.setTextureOffset(112, 61).addBox(-0.2546F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, -0.35F, true);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 46.0F, 0.0F);
		Flower.addChild(bone10);
		setRotationAngle(bone10, -3.1416F, -1.4399F, 3.1416F);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.9F, -45.9F, 0.0F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.6981F);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.2F, -8.4F, 0.0F);
		bone11.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.7854F, 0.0F);
		cube_r21.setTextureOffset(112, 23).addBox(-3.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, -0.25F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.2F, -2.2F, 0.0F);
		bone11.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -0.7854F, 0.5672F);
		cube_r22.setTextureOffset(112, 37).addBox(-3.7071F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, -0.25F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(1.2F, -6.6F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.7854F);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, -0.7854F, -0.3054F);
		cube_r23.setTextureOffset(112, 48).addBox(-3.7071F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, -0.35F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.75F, -2.5F, 0.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.6981F);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.05F, 0.1F, 0.0F);
		bone13.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -0.7854F, -0.3054F);
		cube_r24.setTextureOffset(112, 61).addBox(-1.7454F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, -0.35F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-0.9F, -45.9F, 0.0F);
		bone10.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.6981F);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.2F, -8.4F, 0.0F);
		bone14.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.7854F, 0.0F);
		cube_r25.setTextureOffset(112, 23).addBox(-1.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, -0.25F, true);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.2F, -2.2F, 0.0F);
		bone14.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.7854F, -0.5672F);
		cube_r26.setTextureOffset(112, 37).addBox(-0.2929F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, -0.25F, true);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-1.2F, -6.6F, 0.0F);
		bone14.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.7854F);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.7854F, 0.3054F);
		cube_r27.setTextureOffset(112, 48).addBox(-0.2929F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, -0.35F, true);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.75F, -2.5F, 0.0F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.6981F);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.05F, 0.1F, 0.0F);
		bone16.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.7854F, 0.3054F);
		cube_r28.setTextureOffset(112, 61).addBox(-0.2546F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, -0.35F, true);

		earLeft = new ModelRenderer(this);
		earLeft.setRotationPoint(-8.0F, -9.9F, 0.0F);
		Head.addChild(earLeft);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-2.0F, 3.7F, 0.0F);
		earLeft.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.48F);
		cube_r29.setTextureOffset(0, 53).addBox(-0.7F, -5.5F, -4.0F, 4.0F, 11.0F, 8.0F, 0.0F, true);

		earRight = new ModelRenderer(this);
		earRight.setRotationPoint(8.0F, -9.9F, 0.0F);
		Head.addChild(earRight);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(2.0F, 3.7F, 0.0F);
		earRight.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -0.48F);
		cube_r30.setTextureOffset(0, 53).addBox(-3.3F, -5.5F, -4.0F, 4.0F, 11.0F, 8.0F, 0.0F, false);

		LegLeft = new ModelRenderer(this);
		LegLeft.setRotationPoint(0.0F, -8.0F, 3.0F);
		arama.addChild(LegLeft);
		setRotationAngle(LegLeft, 0.0F, 0.0F, -0.1309F);
		LegLeft.setTextureOffset(58, 61).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, -0.5F, false);

		LegRight = new ModelRenderer(this);
		LegRight.setRotationPoint(3.0F, -8.0F, 2.3F);
		arama.addChild(LegRight);
		setRotationAngle(LegRight, 0.0F, 0.0F, 0.1309F);
		LegRight.setTextureOffset(58, 61).addBox(-1.0F, -1.0F, -1.3F, 4.0F, 8.0F, 4.0F, -0.5F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		arama.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.ANIMAR_LEFT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.ANIMAR_RIGHT_ARM.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.ANIMAR_CABEZA.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.ANIMAR_CABEZA.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}