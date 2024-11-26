// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmagatsu_mitake_narukami_no_mikoto_puppet extends EntityModel<Entity> {
	private final ModelRenderer bone60;
	private final ModelRenderer baal;
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
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r2;
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
	private final ModelRenderer puppet_stuff;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer rotate_puppet_arm;
	private final ModelRenderer rotate_puppet_arm2;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone42;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone45;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer bone43;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone54;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer bone51;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone52;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer bone55;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer bone56;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone57;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone58;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer bone59;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;

	public Modelmagatsu_mitake_narukami_no_mikoto_puppet() {
		textureWidth = 256;
		textureHeight = 256;

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 20.0F, 0.0F);

		baal = new ModelRenderer(this);
		baal.setRotationPoint(0.0F, -6.0F, 0.0F);
		bone60.addChild(baal);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -20.9F, 0.0F);
		baal.addChild(head);
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
		armRight.setRotationPoint(-4.0F, -20.5F, 0.0F);
		baal.addChild(armRight);
		setRotationAngle(armRight, -0.6941F, 0.0749F, 0.5438F);
		armRight.setTextureOffset(83, 95).addBox(-0.8823F, 1.0305F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		armRight.setTextureOffset(82, 106).addBox(-1.3823F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, -0.3F, false);

		armLeft = new ModelRenderer(this);
		armLeft.setRotationPoint(4.0F, -20.5F, 0.0F);
		baal.addChild(armLeft);
		setRotationAngle(armLeft, 0.0F, -0.48F, -0.4363F);
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
		body.setRotationPoint(0.0F, -10.5F, 0.0F);
		baal.addChild(body);
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

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9F, 0.4F, -0.7F);
		bone32.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(11, 76).addBox(-2.0F, -0.5F, -0.8F, 4.0F, 9.0F, 1.0F, -0.1F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-0.1F, 0.0F, 0.0F);
		part4.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.0873F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.9F, 0.4F, -0.7F);
		bone33.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(11, 97).addBox(-2.0F, -0.5F, -0.8F, 4.0F, 9.0F, 1.0F, -0.1F, false);

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
		legLeft.setRotationPoint(2.0F, -9.0F, 0.0F);
		baal.addChild(legLeft);
		setRotationAngle(legLeft, 0.0F, 0.0F, -0.1745F);
		legLeft.setTextureOffset(82, 55).addBox(-1.751F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
		legLeft.setTextureOffset(82, 68).addBox(-1.951F, 0.0F, -1.7F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		legRight = new ModelRenderer(this);
		legRight.setRotationPoint(-2.0F, -9.0F, 0.0F);
		baal.addChild(legRight);
		setRotationAngle(legRight, 0.0F, 0.0F, 0.1745F);
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

		puppet_stuff = new ModelRenderer(this);
		puppet_stuff.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(puppet_stuff);
		puppet_stuff.setTextureOffset(215, 104).addBox(-18.0F, -44.0F, 8.0F, 11.0F, 14.0F, 3.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(178, 162).addBox(-6.0F, -49.0F, 14.0F, 2.0F, 10.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(171, 194).addBox(-24.0F, -42.0F, 13.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-26.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-20.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-3.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-9.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(171, 194).addBox(-7.0F, -42.0F, 13.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(200, 193).addBox(-16.0F, -54.0F, 13.0F, 6.0F, 6.0F, 3.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-14.0F, -56.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(210, 197).addBox(-14.0F, -48.0F, 14.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(178, 162).addBox(-23.0F, -49.0F, 14.0F, 2.0F, 10.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(178, 162).addBox(-20.0F, -52.0F, 14.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(234, 242).addBox(-19.0F, -42.0F, 6.0F, 8.0F, 11.0F, 3.0F, 0.0F, false);
		puppet_stuff.setTextureOffset(236, 245).addBox(-21.0F, -40.0F, 5.0F, 7.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-27.3377F, -24.2898F, -15.0358F);
		puppet_stuff.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5968F, -0.9721F, -0.6857F);
		cube_r3.setTextureOffset(220, 168).addBox(-1.0F, -2.5F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-25.6738F, -24.6495F, -14.6565F);
		puppet_stuff.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.9905F, -0.5545F, -0.1356F);
		cube_r4.setTextureOffset(220, 168).addBox(-2.1674F, 0.2753F, -0.5769F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(13.0F, -38.0F, 20.5F);
		puppet_stuff.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(6, 218).addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-22.0F, -48.5F, 14.5F);
		puppet_stuff.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.setTextureOffset(178, 162).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-22.0F, -38.5F, 14.5F);
		puppet_stuff.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
		cube_r7.setTextureOffset(178, 162).addBox(-0.5F, 8.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(178, 162).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.0F, -38.5F, 14.5F);
		puppet_stuff.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3054F);
		cube_r8.setTextureOffset(178, 162).addBox(-1.0F, 8.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(178, 162).addBox(-1.3F, -0.8F, -0.5F, 2.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.0F, -48.0F, 14.5F);
		puppet_stuff.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.setTextureOffset(178, 162).addBox(-0.5F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-5.0F, -47.0F, 14.5F);
		puppet_stuff.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
		cube_r10.setTextureOffset(210, 197).addBox(-4.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(210, 197).addBox(2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(171, 194).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-22.0F, -47.0F, 14.5F);
		puppet_stuff.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
		cube_r11.setTextureOffset(210, 197).addBox(-4.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(210, 197).addBox(2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(171, 194).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(13.0F, -45.3325F, 3.5553F);
		puppet_stuff.addChild(bone47);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1916F, 0.2815F, -0.1201F);
		cube_r12.setTextureOffset(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 7.3325F, 16.9447F);
		bone47.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, 0.0F, false);
		cube_r13.setTextureOffset(6, 218).addBox(-1.0F, -1.0F, 5.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-0.4725F, -19.1925F, 12.6245F);
		puppet_stuff.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, 0.7854F);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.7549F, -22.2562F, -9.0693F);
		bone48.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1916F, 0.2815F, -0.1201F);
		cube_r14.setTextureOffset(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.7549F, -14.9237F, 7.8755F);
		bone48.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, 0.0F, false);
		cube_r15.setTextureOffset(6, 218).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(17.2809F, -17.8443F, 12.6245F);
		puppet_stuff.addChild(bone49);
		setRotationAngle(bone49, 0.2132F, 0.0469F, 1.314F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.6336F, -4.5785F, -9.0693F);
		bone49.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1916F, 0.2815F, -0.1201F);
		cube_r16.setTextureOffset(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.6336F, 2.754F, 7.8755F);
		bone49.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, 0.0F, false);
		cube_r17.setTextureOffset(6, 218).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		rotate_puppet_arm = new ModelRenderer(this);
		rotate_puppet_arm.setRotationPoint(-19.5F, -34.5F, 6.0F);
		puppet_stuff.addChild(rotate_puppet_arm);
		setRotationAngle(rotate_puppet_arm, -0.413F, -0.1451F, 0.9904F);
		rotate_puppet_arm.setTextureOffset(164, 236).addBox(-2.5F, -1.5F, -3.0F, 5.0F, 15.0F, 5.0F, 0.0F, false);

		rotate_puppet_arm2 = new ModelRenderer(this);
		rotate_puppet_arm2.setRotationPoint(-27.5F, -32.5F, 0.0F);
		puppet_stuff.addChild(rotate_puppet_arm2);
		setRotationAngle(rotate_puppet_arm2, -0.413F, -0.1451F, 0.9904F);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.9147F, 10.486F, -4.2335F);
		rotate_puppet_arm2.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.027F, -0.2324F, 0.2F);
		cube_r18.setTextureOffset(138, 162).addBox(-3.7147F, -0.0075F, -3.7396F, 6.0F, 10.0F, 8.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.5F, 2.0F, 2.0F);
		rotate_puppet_arm2.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7F, -0.0668F, 0.0562F);
		cube_r19.setTextureOffset(124, 239).addBox(-3.5F, 0.5F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.7354F, 21.4335F, -15.1099F);
		rotate_puppet_arm2.addChild(bone42);
		setRotationAngle(bone42, 0.0306F, -0.1719F, -0.1772F);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(3.4647F, -5.2421F, 0.7208F);
		bone42.addChild(bone44);
		setRotationAngle(bone44, 0.6545F, 0.0F, 0.0F);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(2.5353F, 7.2421F, -4.7208F);
		bone44.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.5404F, -0.9433F, -1.8702F);
		cube_r20.setTextureOffset(220, 168).addBox(-1.6843F, -1.572F, -0.393F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.5353F, 7.2421F, -4.7208F);
		bone44.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.7717F, -0.792F, -0.2932F);
		cube_r21.setTextureOffset(220, 168).addBox(-2.3531F, -6.9497F, -0.393F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.7262F, 3.4445F, -1.0007F);
		bone44.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.027F, -0.2324F, 0.2F);
		cube_r22.setTextureOffset(220, 168).addBox(-2.2024F, -2.7726F, -0.3072F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(4.4909F, -5.8568F, 2.268F);
		bone42.addChild(bone45);
		setRotationAngle(bone45, 0.1309F, 0.0F, 0.0F);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone45.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.5404F, -0.9433F, -1.8702F);
		cube_r23.setTextureOffset(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone45.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.7717F, -0.792F, -0.2932F);
		cube_r24.setTextureOffset(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.7524F, 5.0591F, -0.5479F);
		bone45.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.027F, -0.2324F, 0.2F);
		cube_r25.setTextureOffset(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(5.4909F, -8.8568F, 2.268F);
		bone42.addChild(bone43);
		setRotationAngle(bone43, 0.1309F, 0.0F, 0.0F);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone43.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.5404F, -0.9433F, -1.8702F);
		cube_r26.setTextureOffset(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone43.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.7717F, -0.792F, -0.2932F);
		cube_r27.setTextureOffset(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.7524F, 5.0591F, -0.5479F);
		bone43.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.027F, -0.2324F, 0.2F);
		cube_r28.setTextureOffset(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(6.4909F, -9.8568F, 0.268F);
		bone42.addChild(bone46);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone46.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.5404F, -0.9433F, -1.8702F);
		cube_r29.setTextureOffset(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.5091F, 8.8568F, -4.268F);
		bone46.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.7717F, -0.792F, -0.2932F);
		cube_r30.setTextureOffset(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.7524F, 5.0591F, -0.5479F);
		bone46.addChild(cube_r31);
		setRotationAngle(cube_r31, -1.027F, -0.2324F, 0.2F);
		cube_r31.setTextureOffset(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(-8.0F, -3.5F, -8.5F);
		puppet_stuff.addChild(bone54);
		setRotationAngle(bone54, 0.3193F, 0.2909F, 0.0945F);
		bone54.setTextureOffset(206, 0).addBox(-6.0F, -1.5F, -6.5F, 12.0F, 3.0F, 13.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-10.5669F, 0.0F, -1.5296F);
		bone54.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, -1.3526F, 0.0F);
		cube_r32.setTextureOffset(237, 56).addBox(-4.4129F, -1.5F, -1.4383F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-6.5F, 0.0F, 3.0F);
		bone54.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.829F, 0.0F);
		cube_r33.setTextureOffset(150, 20).addBox(-6.5F, -1.49F, -1.5F, 9.0F, 3.0F, 3.0F, 0.0F, false);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-5.0F, -0.1982F, -5.7828F);
		bone54.addChild(bone50);
		setRotationAngle(bone50, 0.1331F, 0.1264F, 0.0341F);
		bone50.setTextureOffset(176, 0).addBox(-1.01F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone50.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.829F, 0.0F, 0.0F);
		cube_r34.setTextureOffset(213, 41).addBox(-1.01F, -2.9912F, -0.5328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone50.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.3927F, 0.0F, 0.0F);
		cube_r35.setTextureOffset(176, 0).addBox(-1.01F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(-2.0F, -0.1982F, -5.7828F);
		bone54.addChild(bone51);
		setRotationAngle(bone51, -0.2618F, 0.0F, 0.0F);
		bone51.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone51.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.829F, 0.0F, 0.0F);
		cube_r36.setTextureOffset(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone51.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.3927F, 0.0F, 0.0F);
		cube_r37.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(5.0F, -0.1982F, -5.7828F);
		bone54.addChild(bone53);
		setRotationAngle(bone53, -0.0866F, -0.1744F, -0.0077F);
		bone53.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone53.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.829F, 0.0F, 0.0F);
		cube_r38.setTextureOffset(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone53.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.3927F, 0.0F, 0.0F);
		cube_r39.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(2.0F, -0.1982F, -5.7828F);
		bone54.addChild(bone52);
		setRotationAngle(bone52, -0.3054F, 0.0F, 0.0F);
		bone52.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone52.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.829F, 0.0F, 0.0F);
		cube_r40.setTextureOffset(213, 41).addBox(-1.0F, -1.6212F, -3.5328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone52.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.3927F, 0.0F, 0.0F);
		cube_r41.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(11.0F, -3.5F, -8.5F);
		puppet_stuff.addChild(bone55);
		setRotationAngle(bone55, 0.3193F, -0.2909F, -0.0945F);
		bone55.setTextureOffset(206, 0).addBox(-6.0F, -1.5F, -6.5F, 12.0F, 3.0F, 13.0F, 0.0F, true);

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(10.4331F, 0.0F, -1.5296F);
		bone55.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 1.3526F, 0.0F);
		cube_r42.setTextureOffset(237, 56).addBox(-0.4129F, -1.5F, -1.4383F, 5.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(6.5F, 0.0F, 3.0F);
		bone55.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.829F, 0.0F);
		cube_r43.setTextureOffset(150, 20).addBox(-2.5F, -1.49F, -1.5F, 9.0F, 3.0F, 3.0F, 0.0F, true);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-5.0F, -0.1982F, -5.7828F);
		bone55.addChild(bone56);
		setRotationAngle(bone56, 0.1331F, 0.1264F, 0.0341F);
		bone56.setTextureOffset(176, 0).addBox(-1.01F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone56.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.829F, 0.0F, 0.0F);
		cube_r44.setTextureOffset(213, 41).addBox(-1.01F, -2.9912F, -0.5328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone56.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.3927F, 0.0F, 0.0F);
		cube_r45.setTextureOffset(176, 0).addBox(-1.01F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-2.0F, -0.1982F, -5.7828F);
		bone55.addChild(bone57);
		setRotationAngle(bone57, -0.2618F, 0.0F, 0.0F);
		bone57.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone57.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.829F, 0.0F, 0.0F);
		cube_r46.setTextureOffset(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone57.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.3927F, 0.0F, 0.0F);
		cube_r47.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(5.0F, -0.1982F, -5.7828F);
		bone55.addChild(bone58);
		setRotationAngle(bone58, -0.0866F, -0.1744F, -0.0077F);
		bone58.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone58.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.829F, 0.0F, 0.0F);
		cube_r48.setTextureOffset(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone58.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.3927F, 0.0F, 0.0F);
		cube_r49.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(2.0F, -0.1982F, -5.7828F);
		bone55.addChild(bone59);
		setRotationAngle(bone59, -0.3054F, 0.0F, 0.0F);
		bone59.setTextureOffset(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, -1.4806F, -9.6844F);
		bone59.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.829F, 0.0F, 0.0F);
		cube_r50.setTextureOffset(213, 41).addBox(-1.0F, -1.6212F, -3.5328F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.1982F, -4.2172F);
		bone59.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.3927F, 0.0F, 0.0F);
		cube_r51.setTextureOffset(166, 53).addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone60.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}