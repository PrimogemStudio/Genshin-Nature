// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpyro_whopperflower extends EntityModel<Entity> {
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
	private final ModelRenderer decorations5;
	private final ModelRenderer decorations6;
	private final ModelRenderer decorations7;

	public Modelpyro_whopperflower() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 5.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(36, 16).addBox(-1.5F, -11.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		leaves = new ModelRenderer(this);
		leaves.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(leaves);
		setRotationAngle(leaves, 0.0F, 0.0F, -0.3491F);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(3.0F, -7.0F, -3.5F);
		leaves.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.8727F, -0.6981F, 0.0F);
		Head_r1.setTextureOffset(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(6.9088F, -11.7135F, -7.5419F);
		leaves.addChild(Head_r2);
		setRotationAngle(Head_r2, 2.138F, -0.6981F, 0.0F);
		Head_r2.setTextureOffset(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, 0.0F, false);

		leaves2 = new ModelRenderer(this);
		leaves2.setRotationPoint(0.0F, -1.0F, 1.0F);
		Head.addChild(leaves2);
		setRotationAngle(leaves2, 0.0F, 1.5708F, 0.3491F);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(3.0F, -7.0F, -3.5F);
		leaves2.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.8727F, -0.6981F, 0.0F);
		Head_r3.setTextureOffset(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(6.9088F, -11.7135F, -7.5419F);
		leaves2.addChild(Head_r4);
		setRotationAngle(Head_r4, 2.138F, -0.6981F, 0.0F);
		Head_r4.setTextureOffset(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, 0.0F, false);

		leaves3 = new ModelRenderer(this);
		leaves3.setRotationPoint(-0.6832F, -11.7055F, 4.3444F);
		Head.addChild(leaves3);
		setRotationAngle(leaves3, 2.6467F, -0.5989F, -2.8086F);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(-4.1749F, 2.3978F, 4.2074F);
		leaves3.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.8727F, -0.6981F, 0.0F);
		Head_r5.setTextureOffset(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, 0.0F, false);

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(-0.2661F, -2.3156F, 0.1655F);
		leaves3.addChild(Head_r6);
		setRotationAngle(Head_r6, 2.138F, -0.6981F, 0.0F);
		Head_r6.setTextureOffset(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 19).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(18, 23).addBox(-1.0F, -17.0F, -2.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(29, 53).addBox(-1.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 23).addBox(-1.0F, -17.0F, 1.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(-3.0F, -8.0F, -2.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(-2.0F, -8.0F, 1.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 56).addBox(-2.0F, -8.0F, -3.03F, 4.0F, 8.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(1.0F, -8.0F, -2.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(2, 45).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(2, 45).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(2, 45).addBox(1.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(2, 45).addBox(-2.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.5F, -8.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.setTextureOffset(58, 54).addBox(0.5F, 0.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.5F, -8.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.setTextureOffset(58, 54).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -16.5F, 1.5F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6109F);
		cube_r3.setTextureOffset(18, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(18, 23).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -16.5F, 1.5F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.6109F);
		cube_r4.setTextureOffset(18, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(18, 23).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -18.5F, 1.5F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(30, 25).addBox(-2.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(30, 25).addBox(1.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(30, 25).addBox(1.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(30, 25).addBox(-2.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(30, 25).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -18.5F, -1.5F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(30, 25).addBox(1.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 25).addBox(-2.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 25).addBox(-2.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 25).addBox(1.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 25).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 11.0F, 1.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg1.setTextureOffset(19, 42).addBox(3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.5F, 22.0F, 0.0F);
		leg2.setTextureOffset(19, 42).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(1.5F, 5.5F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
		cube_r7.setTextureOffset(30, 25).addBox(-0.5F, 6.5F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(30, 25).addBox(-0.5F, 2.5F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(30, 25).addBox(-0.5F, 6.5F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(30, 25).addBox(-0.5F, 2.5F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(30, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-1.5F, 5.5F, 0.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3054F);
		cube_r8.setTextureOffset(30, 25).addBox(-0.5F, 6.5F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(30, 25).addBox(-0.5F, 6.5F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(30, 25).addBox(-0.5F, 2.5F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(30, 25).addBox(-0.5F, 2.5F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(30, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);

		decorations = new ModelRenderer(this);
		decorations.setRotationPoint(0.0F, 4.0F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.8681F, 4.0886F, -4.7588F);
		decorations.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2877F, 0.5467F, -0.5175F);
		cube_r9.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.5F, 1.5F, -2.0F);
		decorations.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.5208F, 0.3352F, -1.05F);
		cube_r10.setTextureOffset(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		decorations2 = new ModelRenderer(this);
		decorations2.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(decorations2, 0.0F, 1.5708F, 0.0F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.8681F, 4.0886F, -4.7588F);
		decorations2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2877F, 0.5467F, -0.5175F);
		cube_r11.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.5F, 1.5F, -2.0F);
		decorations2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.5208F, 0.3352F, -1.05F);
		cube_r12.setTextureOffset(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		decorations3 = new ModelRenderer(this);
		decorations3.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(decorations3, 0.0F, 3.1416F, 0.0F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.8681F, 4.0886F, -4.7588F);
		decorations3.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2877F, 0.5467F, -0.5175F);
		cube_r13.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.5F, 1.5F, -2.0F);
		decorations3.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5208F, 0.3352F, -1.05F);
		cube_r14.setTextureOffset(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		decorations4 = new ModelRenderer(this);
		decorations4.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(decorations4, 0.0F, -1.5708F, 0.0F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.8681F, 4.0886F, -4.7588F);
		decorations4.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2877F, 0.5467F, -0.5175F);
		cube_r15.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r15.setTextureOffset(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r15.setTextureOffset(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.5F, 1.5F, -2.0F);
		decorations4.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.5208F, 0.3352F, -1.05F);
		cube_r16.setTextureOffset(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		decorations5 = new ModelRenderer(this);
		decorations5.setRotationPoint(0.0F, 24.0F, 0.0F);
		decorations5.setTextureOffset(38, 43).addBox(7.0F, -17.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(7.5F, -16.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(7.5F, -16.5F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(7.5F, -18.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(7.5F, -15.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(9.0F, -16.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations5.setTextureOffset(38, 43).addBox(6.0F, -16.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		decorations6 = new ModelRenderer(this);
		decorations6.setRotationPoint(-8.0F, 8.0F, 1.0F);
		decorations6.setTextureOffset(38, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations6.setTextureOffset(38, 43).addBox(-2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		decorations7 = new ModelRenderer(this);
		decorations7.setRotationPoint(0.0F, 8.0F, 7.0F);
		decorations7.setTextureOffset(38, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		decorations7.setTextureOffset(38, 43).addBox(-2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
		decorations5.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations6.render(matrixStack, buffer, packedLight, packedOverlay);
		decorations7.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}