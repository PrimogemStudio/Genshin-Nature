// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmagatsu_mitake_narukami_no_mikoto extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headDeco;
	private final ModelRenderer TrueEventaille;
	private final ModelRenderer Eventaille3;
	private final ModelRenderer bone13;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
	private final ModelRenderer bone14;
	private final ModelRenderer Eventaille4;
	private final ModelRenderer bone11;
	private final ModelRenderer Eventaille5;
	private final ModelRenderer Eventaille6;
	private final ModelRenderer Eventaille7;
	private final ModelRenderer Eventaille8;
	private final ModelRenderer TrueFlower;
	private final ModelRenderer Flower;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer Flower2;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer Papillon;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer Hairs;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer armRight;
	private final ModelRenderer armLeft;
	private final ModelRenderer armLeftDeco2;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer body;
	private final ModelRenderer RedKnot;
	private final ModelRenderer BackDeco;
	private final ModelRenderer skirt;
	private final ModelRenderer part2;
	private final ModelRenderer part1;
	private final ModelRenderer part3;
	private final ModelRenderer part4;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer RedRibbonBehind;
	private final ModelRenderer legLeft;
	private final ModelRenderer legRight;
	private final ModelRenderer TrueFlower2;
	private final ModelRenderer Flower3;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer Flower4;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;

	public Modelmagatsu_mitake_narukami_no_mikoto() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 3.1F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);

		headDeco = new ModelRenderer(this);
		headDeco.setRotationPoint(0.0F, 17.9F, -0.8F);
		head.addChild(headDeco);

		TrueEventaille = new ModelRenderer(this);
		TrueEventaille.setRotationPoint(-4.2F, -23.35F, 1.55F);
		headDeco.addChild(TrueEventaille);
		setRotationAngle(TrueEventaille, -0.0873F, 0.4363F, 0.0F);

		Eventaille3 = new ModelRenderer(this);
		Eventaille3.setRotationPoint(0.0F, 0.0F, 0.05F);
		TrueEventaille.addChild(Eventaille3);
		setRotationAngle(Eventaille3, 0.0F, 0.3927F, 0.0F);
		Eventaille3.setTextureOffset(27, 73).addBox(0.0067F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.1F, 0.05F, 0.05F);
		TrueEventaille.addChild(bone13);
		setRotationAngle(bone13, -0.2849F, 0.274F, -0.8249F);
		bone13.setTextureOffset(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.65F, 0.45F);
		TrueEventaille.addChild(bone15);
		setRotationAngle(bone15, 0.1414F, 0.6614F, -0.7517F);
		bone15.setTextureOffset(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.1F, -0.3F, -0.05F);
		TrueEventaille.addChild(bone12);
		setRotationAngle(bone12, -0.4614F, 0.0823F, -0.796F);
		bone12.setTextureOffset(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-0.1F, -0.3F, -0.05F);
		TrueEventaille.addChild(bone14);
		setRotationAngle(bone14, -0.4614F, 0.0823F, -0.796F);
		bone14.setTextureOffset(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Eventaille4 = new ModelRenderer(this);
		Eventaille4.setRotationPoint(0.0F, 0.0F, 0.05F);
		TrueEventaille.addChild(Eventaille4);
		setRotationAngle(Eventaille4, -0.2618F, 0.3927F, 0.0F);
		Eventaille4.setTextureOffset(27, 73).addBox(0.0065F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.05F, 0.05F);
		TrueEventaille.addChild(bone11);
		setRotationAngle(bone11, -0.1133F, 0.4552F, -0.864F);
		bone11.setTextureOffset(0, 76).addBox(-0.1318F, 0.0829F, -3.001F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		Eventaille5 = new ModelRenderer(this);
		Eventaille5.setRotationPoint(0.0F, 0.0F, 0.05F);
		TrueEventaille.addChild(Eventaille5);
		setRotationAngle(Eventaille5, 0.2618F, 0.3927F, 0.0F);
		Eventaille5.setTextureOffset(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Eventaille6 = new ModelRenderer(this);
		Eventaille6.setRotationPoint(0.0F, 0.0F, 0.05F);
		TrueEventaille.addChild(Eventaille6);
		setRotationAngle(Eventaille6, 0.5236F, 0.3927F, 0.0F);
		Eventaille6.setTextureOffset(27, 73).addBox(0.0064F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Eventaille7 = new ModelRenderer(this);
		Eventaille7.setRotationPoint(0.0F, 0.0F, 0.05F);
		TrueEventaille.addChild(Eventaille7);
		setRotationAngle(Eventaille7, -0.5236F, 0.3927F, 0.0F);
		Eventaille7.setTextureOffset(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Eventaille8 = new ModelRenderer(this);
		Eventaille8.setRotationPoint(-0.1F, -1.0F, 0.05F);
		TrueEventaille.addChild(Eventaille8);
		setRotationAngle(Eventaille8, -0.6425F, -0.0352F, -0.6323F);
		Eventaille8.setTextureOffset(0, 83).addBox(0.0066F, 0.0294F, -2.5885F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		TrueFlower = new ModelRenderer(this);
		TrueFlower.setRotationPoint(-5.8F, -23.1F, -0.1F);
		headDeco.addChild(TrueFlower);
		setRotationAngle(TrueFlower, 0.0F, -0.9599F, 0.0F);

		Flower = new ModelRenderer(this);
		Flower.setRotationPoint(0.5F, -0.8F, -1.0F);
		TrueFlower.addChild(Flower);
		setRotationAngle(Flower, -0.0013F, -0.0334F, -1.5774F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower.addChild(bone);
		setRotationAngle(bone, -1.3963F, 0.0F, 0.0F);
		bone.setTextureOffset(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower.addChild(bone2);
		setRotationAngle(bone2, -1.3963F, -1.2566F, 0.0F);
		bone2.setTextureOffset(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower.addChild(bone3);
		setRotationAngle(bone3, -1.3963F, -2.5133F, 0.0F);
		bone3.setTextureOffset(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.2774F, -0.2159F, -0.3893F);
		Flower.addChild(bone4);
		setRotationAngle(bone4, -1.3963F, 2.5133F, 0.0F);
		bone4.setTextureOffset(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.2774F, 0.7841F, -1.3893F);
		Flower.addChild(bone5);
		setRotationAngle(bone5, -1.3963F, 1.2566F, 0.0F);
		bone5.setTextureOffset(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		Flower2 = new ModelRenderer(this);
		Flower2.setRotationPoint(0.7F, 0.6F, -1.1F);
		TrueFlower.addChild(Flower2);
		setRotationAngle(Flower2, 0.0264F, -0.0323F, -1.3591F);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower2.addChild(bone6);
		setRotationAngle(bone6, -1.3963F, 0.0F, 0.0F);
		bone6.setTextureOffset(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower2.addChild(bone7);
		setRotationAngle(bone7, -1.3963F, -1.2566F, 0.0F);
		bone7.setTextureOffset(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower2.addChild(bone8);
		setRotationAngle(bone8, -1.3963F, -2.5133F, 0.0F);
		bone8.setTextureOffset(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.2774F, -0.2159F, -0.3893F);
		Flower2.addChild(bone9);
		setRotationAngle(bone9, -1.3963F, 2.5133F, 0.0F);
		bone9.setTextureOffset(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.2774F, 0.7841F, -1.3893F);
		Flower2.addChild(bone10);
		setRotationAngle(bone10, -1.3963F, 1.2566F, 0.0F);
		bone10.setTextureOffset(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		Papillon = new ModelRenderer(this);
		Papillon.setRotationPoint(-4.0F, -23.5F, 2.4F);
		headDeco.addChild(Papillon);
		setRotationAngle(Papillon, 0.4363F, 0.0F, 0.0F);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Papillon.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.7854F, 0.0F);
		bone16.setTextureOffset(0, 90).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Papillon.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.7854F, 0.0F);
		bone17.setTextureOffset(7, 90).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-3.9F, -22.5F, 2.0F);
		headDeco.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 0.1745F);
		bone18.setTextureOffset(0, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone18.setTextureOffset(5, 96).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-4.2F, -23.3F, -0.3F);
		headDeco.addChild(bone19);
		setRotationAngle(bone19, 0.1308F, -0.0057F, 0.0433F);
		bone19.setTextureOffset(0, 100).addBox(-0.01F, -4.5F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		Hairs = new ModelRenderer(this);
		Hairs.setRotationPoint(0.0F, -0.3F, 4.0F);
		head.addChild(Hairs);
		setRotationAngle(Hairs, 0.1309F, 0.0F, 0.0F);
		Hairs.setTextureOffset(100, 0).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 4).addBox(-3.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 7).addBox(-2.5F, 2.5F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 10).addBox(-3.0F, 3.5F, -1.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 14).addBox(-2.5F, 5.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 22).addBox(-2.5F, 7.0F, -1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 26).addBox(-2.0F, 8.5F, -1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 18).addBox(-2.0F, 5.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(2.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(1.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(1.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(-2.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(-2.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 6).addBox(-2.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 3).addBox(1.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 0).addBox(-3.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 9).addBox(1.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 9).addBox(-2.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 32).addBox(-1.5F, 12.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 36).addBox(-1.0F, 13.5F, -1.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 12).addBox(0.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 12).addBox(-1.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 15).addBox(-1.0F, 19.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(85, 18).addBox(-0.5F, 20.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(90, 18).addBox(0.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(92, 15).addBox(1.0F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(90, 18).addBox(-2.0F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(92, 15).addBox(-1.5F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Hairs.setTextureOffset(100, 45).addBox(-1.5F, 16.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-2.2F, -2.1F, -3.35F);
		head.addChild(bone34);
		setRotationAngle(bone34, -3.0218F, -0.0536F, -2.839F);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 0.0F, -0.6F);
		bone34.addChild(bone35);
		bone35.setTextureOffset(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.6F, 4.0F, -0.1F);
		bone34.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, 0.1745F);
		bone36.setTextureOffset(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.5F, 4.0F, -0.1F);
		bone34.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, 1.2654F);
		bone37.setTextureOffset(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(2.8F, 0.6F, -3.45F);
		head.addChild(bone38);
		setRotationAngle(bone38, -0.1311F, 0.0038F, -0.0872F);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, 0.0F, -0.6F);
		bone38.addChild(bone39);
		bone39.setTextureOffset(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.6F, 4.0F, -0.1F);
		bone38.addChild(bone40);
		setRotationAngle(bone40, 0.0F, 0.0F, 0.1745F);
		bone40.setTextureOffset(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.5F, 4.0F, -0.1F);
		bone38.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 1.2654F);
		bone41.setTextureOffset(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		armRight = new ModelRenderer(this);
		armRight.setRotationPoint(-4.0F, 3.5F, 0.0F);
		setRotationAngle(armRight, 0.0F, 0.0F, 0.4363F);
		armRight.setTextureOffset(83, 95).addBox(-0.8823F, 1.0305F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		armRight.setTextureOffset(82, 106).addBox(-1.3823F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, -0.3F, false);

		armLeft = new ModelRenderer(this);
		armLeft.setRotationPoint(4.0F, 3.5F, 0.0F);
		setRotationAngle(armLeft, 0.0F, 0.0F, -0.4363F);
		armLeft.setTextureOffset(97, 82).addBox(-1.6177F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, -0.3F, false);
		armLeft.setTextureOffset(98, 106).addBox(-1.1177F, 1.0307F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		armLeftDeco2 = new ModelRenderer(this);
		armLeftDeco2.setRotationPoint(2.8F, 0.0F, 2.0F);
		armLeft.addChild(armLeftDeco2);
		setRotationAngle(armLeftDeco2, 3.1416F, 0.0F, 3.098F);
		armLeftDeco2.setTextureOffset(53, 84).addBox(0.4F, 0.3F, -0.5F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(67, 72).addBox(0.9F, 0.3F, 1.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(67, 80).addBox(0.9F, 0.79F, 0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(71, 80).addBox(0.9F, 0.79F, 2.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(65, 88).addBox(0.9F, 4.8F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(65, 92).addBox(0.9F, 4.8F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(71, 88).addBox(0.9F, 4.3F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		armLeftDeco2.setTextureOffset(71, 88).addBox(0.9F, 4.3F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(1.4F, 1.5F, 3.5F);
		armLeftDeco2.addChild(bone30);
		setRotationAngle(bone30, -3.1416F, -0.7854F, 3.1416F);
		bone30.setTextureOffset(53, 97).addBox(-1.0F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone30.setTextureOffset(60, 97).addBox(-0.5F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone30.setTextureOffset(53, 104).addBox(-1.0F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(58, 104).addBox(-1.0F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(58, 107).addBox(-1.0F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone30.setTextureOffset(63, 107).addBox(-1.0F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(1.4F, 1.5F, 0.5F);
		armLeftDeco2.addChild(bone31);
		setRotationAngle(bone31, 0.0F, -0.7854F, 0.0F);
		bone31.setTextureOffset(53, 97).addBox(-0.5F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone31.setTextureOffset(60, 97).addBox(0.0F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		bone31.setTextureOffset(53, 104).addBox(-0.5F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(58, 104).addBox(-0.5F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(58, 107).addBox(-0.5F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone31.setTextureOffset(63, 107).addBox(-0.5F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 13.5F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, -10.499F, -2.3F, 8.0F, 12.0F, 4.0F, -0.1F, false);
		body.setTextureOffset(16, 32).addBox(-4.2F, -10.799F, -2.4F, 8.0F, 12.0F, 4.0F, -0.1F, false);

		RedKnot = new ModelRenderer(this);
		RedKnot.setRotationPoint(0.5F, -10.4F, -2.3F);
		body.addChild(RedKnot);
		setRotationAngle(RedKnot, -0.1309F, 0.0F, 0.0F);
		RedKnot.setTextureOffset(53, 110).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RedKnot.setTextureOffset(53, 114).addBox(-2.0F, 0.275F, 0.01F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		BackDeco = new ModelRenderer(this);
		BackDeco.setRotationPoint(-0.1F, -5.5F, 2.2F);
		body.addChild(BackDeco);
		setRotationAngle(BackDeco, 0.0873F, 0.0F, 0.0F);
		BackDeco.setTextureOffset(98, 49).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		BackDeco.setTextureOffset(98, 59).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, 0.1F, false);

		skirt = new ModelRenderer(this);
		skirt.setRotationPoint(0.0F, 10.5F, 0.0F);
		body.addChild(skirt);

		part2 = new ModelRenderer(this);
		part2.setRotationPoint(-3.9F, -9.1F, 0.0F);
		skirt.addChild(part2);
		part2.setTextureOffset(27, 83).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.0F, -0.1F, false);
		part2.setTextureOffset(27, 111).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		part1 = new ModelRenderer(this);
		part1.setRotationPoint(0.0F, -9.1F, -2.2F);
		skirt.addChild(part1);
		setRotationAngle(part1, -0.0873F, 0.0F, 0.0F);
		part1.setTextureOffset(27, 79).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		part1.setTextureOffset(27, 119).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 1.0F, 0.05F, false);

		part3 = new ModelRenderer(this);
		part3.setRotationPoint(3.9F, -9.1F, 0.0F);
		skirt.addChild(part3);
		part3.setTextureOffset(27, 90).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.0F, -0.1F, false);
		part3.setTextureOffset(0, 109).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		part4 = new ModelRenderer(this);
		part4.setRotationPoint(0.0F, -9.1F, 2.2F);
		skirt.addChild(part4);
		setRotationAngle(part4, 0.1309F, 0.0F, 0.0F);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.1F, 0.0F, 0.0F);
		part4.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -0.0873F);
		bone32.setTextureOffset(11, 76).addBox(-0.1F, -0.1F, -1.5F, 4.0F, 9.0F, 1.0F, -0.1F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.1F, 0.0F, 0.0F);
		part4.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.0873F);
		bone33.setTextureOffset(11, 97).addBox(-3.9F, -0.1F, -1.5F, 4.0F, 9.0F, 1.0F, -0.1F, false);

		RedRibbonBehind = new ModelRenderer(this);
		RedRibbonBehind.setRotationPoint(-4.5F, -8.5F, 1.8F);
		body.addChild(RedRibbonBehind);
		setRotationAngle(RedRibbonBehind, -3.1416F, 0.0F, 3.1416F);
		RedRibbonBehind.setTextureOffset(55, 19).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(55, 28).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, 0.2F, false);
		RedRibbonBehind.setTextureOffset(55, 19).addBox(-9.0F, 0.0F, -0.5F, 9.0F, 7.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(67, 39).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(67, 48).addBox(-1.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(72, 48).addBox(-2.0F, 6.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(73, 60).addBox(-2.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(73, 63).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(73, 54).addBox(-9.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 38).addBox(-7.5F, 4.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 44).addBox(-5.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 47).addBox(-4.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 47).addBox(-3.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(57, 38).addBox(-4.5F, 4.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 41).addBox(-7.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(62, 41).addBox(-6.5F, 3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(57, 42).addBox(-6.0F, 2.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(73, 57).addBox(-8.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(66, 54).addBox(-9.0F, 0.5F, -1.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		RedRibbonBehind.setTextureOffset(66, 51).addBox(-7.0F, 1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		legLeft = new ModelRenderer(this);
		legLeft.setRotationPoint(2.0F, 15.0F, 0.0F);
		legLeft.setTextureOffset(82, 55).addBox(-1.751F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		legLeft.setTextureOffset(82, 68).addBox(-1.951F, 0.0F, -1.7F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		legRight = new ModelRenderer(this);
		legRight.setRotationPoint(-2.0F, 15.0F, 0.0F);
		legRight.setTextureOffset(82, 42).addBox(-1.249F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		legRight.setTextureOffset(82, 81).addBox(-1.449F, 0.0F, -1.7F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		TrueFlower2 = new ModelRenderer(this);
		TrueFlower2.setRotationPoint(-1.9F, 6.6F, 0.5F);
		legRight.addChild(TrueFlower2);

		Flower3 = new ModelRenderer(this);
		Flower3.setRotationPoint(0.8F, -0.8F, -1.0F);
		TrueFlower2.addChild(Flower3);
		setRotationAngle(Flower3, -0.0013F, -0.0334F, -1.5774F);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower3.addChild(bone20);
		setRotationAngle(bone20, -1.3963F, 0.0F, 0.0F);
		bone20.setTextureOffset(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower3.addChild(bone21);
		setRotationAngle(bone21, -1.3963F, -1.2566F, 0.0F);
		bone21.setTextureOffset(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower3.addChild(bone22);
		setRotationAngle(bone22, -1.3963F, -2.5133F, 0.0F);
		bone22.setTextureOffset(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.2774F, -0.2159F, -0.3893F);
		Flower3.addChild(bone23);
		setRotationAngle(bone23, -1.3963F, 2.5133F, 0.0F);
		bone23.setTextureOffset(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.2774F, 0.7841F, -1.3893F);
		Flower3.addChild(bone24);
		setRotationAngle(bone24, -1.3963F, 1.2566F, 0.0F);
		bone24.setTextureOffset(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		Flower4 = new ModelRenderer(this);
		Flower4.setRotationPoint(0.7F, 0.6F, -0.2F);
		TrueFlower2.addChild(Flower4);
		setRotationAngle(Flower4, 0.0264F, -0.0323F, -1.3591F);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower4.addChild(bone25);
		setRotationAngle(bone25, -1.3963F, 0.0F, 0.0F);
		bone25.setTextureOffset(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower4.addChild(bone26);
		setRotationAngle(bone26, -1.3963F, -1.2566F, 0.0F);
		bone26.setTextureOffset(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.7226F, -11.2159F, 3.6107F);
		Flower4.addChild(bone27);
		setRotationAngle(bone27, -1.3963F, -2.5133F, 0.0F);
		bone27.setTextureOffset(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.2774F, -0.2159F, -0.3893F);
		Flower4.addChild(bone28);
		setRotationAngle(bone28, -1.3963F, 2.5133F, 0.0F);
		bone28.setTextureOffset(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.2774F, 0.7841F, -1.3893F);
		Flower4.addChild(bone29);
		setRotationAngle(bone29, -1.3963F, 1.2566F, 0.0F);
		bone29.setTextureOffset(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		armRight.render(matrixStack, buffer, packedLight, packedOverlay);
		armLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		legLeft.render(matrixStack, buffer, packedLight, packedOverlay);
		legRight.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.armRight.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.legRight.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.armLeft.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.legLeft.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}