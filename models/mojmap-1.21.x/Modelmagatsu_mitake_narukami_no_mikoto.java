// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelmagatsu_mitake_narukami_no_mikoto<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "magatsu_mitake_narukami_no_mikoto"), "main");
	private final ModelPart head;
	private final ModelPart headDeco;
	private final ModelPart TrueEventaille;
	private final ModelPart Eventaille3;
	private final ModelPart bone13;
	private final ModelPart bone15;
	private final ModelPart bone12;
	private final ModelPart bone14;
	private final ModelPart Eventaille4;
	private final ModelPart bone11;
	private final ModelPart Eventaille5;
	private final ModelPart Eventaille6;
	private final ModelPart Eventaille7;
	private final ModelPart Eventaille8;
	private final ModelPart TrueFlower;
	private final ModelPart Flower;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart Flower2;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart Papillon;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart Hairs;
	private final ModelPart bone34;
	private final ModelPart bone35;
	private final ModelPart bone36;
	private final ModelPart bone37;
	private final ModelPart bone38;
	private final ModelPart bone39;
	private final ModelPart bone40;
	private final ModelPart bone41;
	private final ModelPart armRight;
	private final ModelPart armLeft;
	private final ModelPart armLeftDeco2;
	private final ModelPart bone30;
	private final ModelPart bone31;
	private final ModelPart body;
	private final ModelPart RedKnot;
	private final ModelPart BackDeco;
	private final ModelPart skirt;
	private final ModelPart part2;
	private final ModelPart part1;
	private final ModelPart part3;
	private final ModelPart part4;
	private final ModelPart bone32;
	private final ModelPart bone33;
	private final ModelPart RedRibbonBehind;
	private final ModelPart legLeft;
	private final ModelPart legRight;
	private final ModelPart TrueFlower2;
	private final ModelPart Flower3;
	private final ModelPart bone20;
	private final ModelPart bone21;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;
	private final ModelPart Flower4;
	private final ModelPart bone25;
	private final ModelPart bone26;
	private final ModelPart bone27;
	private final ModelPart bone28;
	private final ModelPart bone29;

	public Modelmagatsu_mitake_narukami_no_mikoto(ModelPart root) {
		this.head = root.getChild("head");
		this.headDeco = this.head.getChild("headDeco");
		this.TrueEventaille = this.headDeco.getChild("TrueEventaille");
		this.Eventaille3 = this.TrueEventaille.getChild("Eventaille3");
		this.bone13 = this.TrueEventaille.getChild("bone13");
		this.bone15 = this.TrueEventaille.getChild("bone15");
		this.bone12 = this.TrueEventaille.getChild("bone12");
		this.bone14 = this.TrueEventaille.getChild("bone14");
		this.Eventaille4 = this.TrueEventaille.getChild("Eventaille4");
		this.bone11 = this.TrueEventaille.getChild("bone11");
		this.Eventaille5 = this.TrueEventaille.getChild("Eventaille5");
		this.Eventaille6 = this.TrueEventaille.getChild("Eventaille6");
		this.Eventaille7 = this.TrueEventaille.getChild("Eventaille7");
		this.Eventaille8 = this.TrueEventaille.getChild("Eventaille8");
		this.TrueFlower = this.headDeco.getChild("TrueFlower");
		this.Flower = this.TrueFlower.getChild("Flower");
		this.bone = this.Flower.getChild("bone");
		this.bone2 = this.Flower.getChild("bone2");
		this.bone3 = this.Flower.getChild("bone3");
		this.bone4 = this.Flower.getChild("bone4");
		this.bone5 = this.Flower.getChild("bone5");
		this.Flower2 = this.TrueFlower.getChild("Flower2");
		this.bone6 = this.Flower2.getChild("bone6");
		this.bone7 = this.Flower2.getChild("bone7");
		this.bone8 = this.Flower2.getChild("bone8");
		this.bone9 = this.Flower2.getChild("bone9");
		this.bone10 = this.Flower2.getChild("bone10");
		this.Papillon = this.headDeco.getChild("Papillon");
		this.bone16 = this.Papillon.getChild("bone16");
		this.bone17 = this.Papillon.getChild("bone17");
		this.bone18 = this.headDeco.getChild("bone18");
		this.bone19 = this.headDeco.getChild("bone19");
		this.Hairs = this.head.getChild("Hairs");
		this.bone34 = this.head.getChild("bone34");
		this.bone35 = this.bone34.getChild("bone35");
		this.bone36 = this.bone34.getChild("bone36");
		this.bone37 = this.bone34.getChild("bone37");
		this.bone38 = this.head.getChild("bone38");
		this.bone39 = this.bone38.getChild("bone39");
		this.bone40 = this.bone38.getChild("bone40");
		this.bone41 = this.bone38.getChild("bone41");
		this.armRight = root.getChild("armRight");
		this.armLeft = root.getChild("armLeft");
		this.armLeftDeco2 = this.armLeft.getChild("armLeftDeco2");
		this.bone30 = this.armLeftDeco2.getChild("bone30");
		this.bone31 = this.armLeftDeco2.getChild("bone31");
		this.body = root.getChild("body");
		this.RedKnot = this.body.getChild("RedKnot");
		this.BackDeco = this.body.getChild("BackDeco");
		this.skirt = this.body.getChild("skirt");
		this.part2 = this.skirt.getChild("part2");
		this.part1 = this.skirt.getChild("part1");
		this.part3 = this.skirt.getChild("part3");
		this.part4 = this.skirt.getChild("part4");
		this.bone32 = this.part4.getChild("bone32");
		this.bone33 = this.part4.getChild("bone33");
		this.RedRibbonBehind = this.body.getChild("RedRibbonBehind");
		this.legLeft = root.getChild("legLeft");
		this.legRight = root.getChild("legRight");
		this.TrueFlower2 = this.legRight.getChild("TrueFlower2");
		this.Flower3 = this.TrueFlower2.getChild("Flower3");
		this.bone20 = this.Flower3.getChild("bone20");
		this.bone21 = this.Flower3.getChild("bone21");
		this.bone22 = this.Flower3.getChild("bone22");
		this.bone23 = this.Flower3.getChild("bone23");
		this.bone24 = this.Flower3.getChild("bone24");
		this.Flower4 = this.TrueFlower2.getChild("Flower4");
		this.bone25 = this.Flower4.getChild("bone25");
		this.bone26 = this.Flower4.getChild("bone26");
		this.bone27 = this.Flower4.getChild("bone27");
		this.bone28 = this.Flower4.getChild("bone28");
		this.bone29 = this.Flower4.getChild("bone29");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 3.1F, 0.0F));

		PartDefinition headDeco = head.addOrReplaceChild("headDeco", CubeListBuilder.create(), PartPose.offset(0.0F, 17.9F, -0.8F));

		PartDefinition TrueEventaille = headDeco.addOrReplaceChild("TrueEventaille", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, -23.35F, 1.55F, -0.0873F, 0.4363F, 0.0F));

		PartDefinition Eventaille3 = TrueEventaille.addOrReplaceChild("Eventaille3", CubeListBuilder.create().texOffs(27, 73).addBox(0.0067F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone13 = TrueEventaille.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.05F, 0.05F, -0.2849F, 0.274F, -0.8249F));

		PartDefinition bone15 = TrueEventaille.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.65F, 0.45F, 0.1414F, 0.6614F, -0.7517F));

		PartDefinition bone12 = TrueEventaille.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.3F, -0.05F, -0.4614F, 0.0823F, -0.796F));

		PartDefinition bone14 = TrueEventaille.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -0.3F, -0.05F, -0.4614F, 0.0823F, -0.796F));

		PartDefinition Eventaille4 = TrueEventaille.addOrReplaceChild("Eventaille4", CubeListBuilder.create().texOffs(27, 73).addBox(0.0065F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, -0.2618F, 0.3927F, 0.0F));

		PartDefinition bone11 = TrueEventaille.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 76).addBox(-0.1318F, 0.0829F, -3.001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.05F, 0.05F, -0.1133F, 0.4552F, -0.864F));

		PartDefinition Eventaille5 = TrueEventaille.addOrReplaceChild("Eventaille5", CubeListBuilder.create().texOffs(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.2618F, 0.3927F, 0.0F));

		PartDefinition Eventaille6 = TrueEventaille.addOrReplaceChild("Eventaille6", CubeListBuilder.create().texOffs(27, 73).addBox(0.0064F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.5236F, 0.3927F, 0.0F));

		PartDefinition Eventaille7 = TrueEventaille.addOrReplaceChild("Eventaille7", CubeListBuilder.create().texOffs(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, -0.5236F, 0.3927F, 0.0F));

		PartDefinition Eventaille8 = TrueEventaille.addOrReplaceChild("Eventaille8", CubeListBuilder.create().texOffs(0, 83).addBox(0.0066F, 0.0294F, -2.5885F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -1.0F, 0.05F, -0.6425F, -0.0352F, -0.6323F));

		PartDefinition TrueFlower = headDeco.addOrReplaceChild("TrueFlower", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8F, -23.1F, -0.1F, 0.0F, -0.9599F, 0.0F));

		PartDefinition Flower = TrueFlower.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.8F, -1.0F, -0.0013F, -0.0334F, -1.5774F));

		PartDefinition bone = Flower.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone2 = Flower.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));

		PartDefinition bone3 = Flower.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));

		PartDefinition bone4 = Flower.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));

		PartDefinition bone5 = Flower.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));

		PartDefinition Flower2 = TrueFlower.addOrReplaceChild("Flower2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.6F, -1.1F, 0.0264F, -0.0323F, -1.3591F));

		PartDefinition bone6 = Flower2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone7 = Flower2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));

		PartDefinition bone8 = Flower2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));

		PartDefinition bone9 = Flower2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));

		PartDefinition bone10 = Flower2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));

		PartDefinition Papillon = headDeco.addOrReplaceChild("Papillon", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -23.5F, 2.4F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bone16 = Papillon.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone17 = Papillon.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(7, 90).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone18 = headDeco.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 96).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -22.5F, 2.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone19 = headDeco.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(0, 100).addBox(-0.01F, -4.5F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -23.3F, -0.3F, 0.1308F, -0.0057F, 0.0433F));

		PartDefinition Hairs = head.addOrReplaceChild("Hairs", CubeListBuilder.create().texOffs(100, 0).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 4).addBox(-3.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 7).addBox(-2.5F, 2.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 10).addBox(-3.0F, 3.5F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 14).addBox(-2.5F, 5.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 22).addBox(-2.5F, 7.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 26).addBox(-2.0F, 8.5F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 18).addBox(-2.0F, 5.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(2.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(1.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(1.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(-2.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(-2.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 6).addBox(-2.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 3).addBox(1.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 0).addBox(-3.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 9).addBox(1.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 9).addBox(-2.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 32).addBox(-1.5F, 12.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 36).addBox(-1.0F, 13.5F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 12).addBox(0.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 12).addBox(-1.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 15).addBox(-1.0F, 19.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 18).addBox(-0.5F, 20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 18).addBox(0.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 15).addBox(1.0F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 18).addBox(-2.0F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 15).addBox(-1.5F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 45).addBox(-1.5F, 16.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone34 = head.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -2.1F, -3.35F, -3.0218F, -0.0536F, -2.839F));

		PartDefinition bone35 = bone34.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.6F));

		PartDefinition bone36 = bone34.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.0F, -0.1F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone37 = bone34.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 4.0F, -0.1F, 0.0F, 0.0F, 1.2654F));

		PartDefinition bone38 = head.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 0.6F, -3.45F, -0.1311F, 0.0038F, -0.0872F));

		PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create().texOffs(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.6F));

		PartDefinition bone40 = bone38.addOrReplaceChild("bone40", CubeListBuilder.create().texOffs(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 4.0F, -0.1F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone41 = bone38.addOrReplaceChild("bone41", CubeListBuilder.create().texOffs(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 4.0F, -0.1F, 0.0F, 0.0F, 1.2654F));

		PartDefinition armRight = partdefinition.addOrReplaceChild("armRight", CubeListBuilder.create().texOffs(83, 95).addBox(-0.8823F, 1.0305F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 106).addBox(-1.3823F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-4.0F, 3.5F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition armLeft = partdefinition.addOrReplaceChild("armLeft", CubeListBuilder.create().texOffs(97, 82).addBox(-1.6177F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(-0.3F))
		.texOffs(98, 106).addBox(-1.1177F, 1.0307F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 3.5F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition armLeftDeco2 = armLeft.addOrReplaceChild("armLeftDeco2", CubeListBuilder.create().texOffs(53, 84).addBox(0.4F, 0.3F, -0.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(67, 72).addBox(0.9F, 0.3F, 1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(67, 80).addBox(0.9F, 0.79F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 80).addBox(0.9F, 0.79F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 88).addBox(0.9F, 4.8F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 92).addBox(0.9F, 4.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 88).addBox(0.9F, 4.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 88).addBox(0.9F, 4.3F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 0.0F, 2.0F, 3.1416F, 0.0F, 3.098F));

		PartDefinition bone30 = armLeftDeco2.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(53, 97).addBox(-1.0F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 97).addBox(-0.5F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(53, 104).addBox(-1.0F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 104).addBox(-1.0F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 107).addBox(-1.0F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 107).addBox(-1.0F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5F, 3.5F, -3.1416F, -0.7854F, 3.1416F));

		PartDefinition bone31 = armLeftDeco2.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(53, 97).addBox(-0.5F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 97).addBox(0.0F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(53, 104).addBox(-0.5F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 104).addBox(-0.5F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 107).addBox(-0.5F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 107).addBox(-0.5F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5F, 0.5F, 0.0F, -0.7854F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -10.499F, -2.3F, 8.0F, 12.0F, 4.6F, new CubeDeformation(-0.1F))
		.texOffs(16, 32).addBox(-4.2F, -10.799F, -2.4F, 8.4F, 12.6F, 4.8F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 13.5F, 0.0F));

		PartDefinition RedKnot = body.addOrReplaceChild("RedKnot", CubeListBuilder.create().texOffs(53, 110).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 114).addBox(-2.0F, 0.275F, 0.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -10.4F, -2.3F, -0.1309F, 0.0F, 0.0F));

		PartDefinition BackDeco = body.addOrReplaceChild("BackDeco", CubeListBuilder.create().texOffs(98, 49).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 59).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1F, -5.5F, 2.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition skirt = body.addOrReplaceChild("skirt", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, 0.0F));

		PartDefinition part2 = skirt.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(27, 83).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(-0.1F))
		.texOffs(27, 111).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(0.0F)), PartPose.offset(-3.9F, -9.1F, 0.0F));

		PartDefinition part1 = skirt.addOrReplaceChild("part1", CubeListBuilder.create().texOffs(27, 79).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 119).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -9.1F, -2.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition part3 = skirt.addOrReplaceChild("part3", CubeListBuilder.create().texOffs(27, 90).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(-0.1F))
		.texOffs(0, 109).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(0.0F)), PartPose.offset(3.9F, -9.1F, 0.0F));

		PartDefinition part4 = skirt.addOrReplaceChild("part4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.1F, 2.2F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone32 = part4.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(11, 76).addBox(-0.1F, -0.1F, -1.5F, 4.0F, 9.0F, 1.6F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bone33 = part4.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(11, 97).addBox(-3.9F, -0.1F, -1.5F, 4.0F, 9.0F, 1.6F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition RedRibbonBehind = body.addOrReplaceChild("RedRibbonBehind", CubeListBuilder.create().texOffs(55, 19).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 28).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.2F))
		.texOffs(55, 19).addBox(-9.0F, 0.0F, -0.5F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 39).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 48).addBox(-1.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(72, 48).addBox(-2.0F, 6.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 60).addBox(-2.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 63).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 54).addBox(-9.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 38).addBox(-7.5F, 4.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 44).addBox(-5.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 47).addBox(-4.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 47).addBox(-3.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 38).addBox(-4.5F, 4.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 41).addBox(-7.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 41).addBox(-6.5F, 3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 42).addBox(-6.0F, 2.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 57).addBox(-8.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 54).addBox(-9.0F, 0.5F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(66, 51).addBox(-7.0F, 1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -8.5F, 1.8F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition legLeft = partdefinition.addOrReplaceChild("legLeft", CubeListBuilder.create().texOffs(82, 55).addBox(-1.751F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 68).addBox(-1.951F, 0.0F, -1.7F, 3.4F, 9.1F, 3.4F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 15.0F, 0.0F));

		PartDefinition legRight = partdefinition.addOrReplaceChild("legRight", CubeListBuilder.create().texOffs(82, 42).addBox(-1.249F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 81).addBox(-1.449F, 0.0F, -1.7F, 3.4F, 9.1F, 3.4F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 15.0F, 0.0F));

		PartDefinition TrueFlower2 = legRight.addOrReplaceChild("TrueFlower2", CubeListBuilder.create(), PartPose.offset(-1.9F, 6.6F, 0.5F));

		PartDefinition Flower3 = TrueFlower2.addOrReplaceChild("Flower3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.8F, -1.0F, -0.0013F, -0.0334F, -1.5774F));

		PartDefinition bone20 = Flower3.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone21 = Flower3.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));

		PartDefinition bone22 = Flower3.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));

		PartDefinition bone23 = Flower3.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));

		PartDefinition bone24 = Flower3.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));

		PartDefinition Flower4 = TrueFlower2.addOrReplaceChild("Flower4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.6F, -0.2F, 0.0264F, -0.0323F, -1.3591F));

		PartDefinition bone25 = Flower4.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));

		PartDefinition bone26 = Flower4.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));

		PartDefinition bone27 = Flower4.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));

		PartDefinition bone28 = Flower4.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));

		PartDefinition bone29 = Flower4.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}