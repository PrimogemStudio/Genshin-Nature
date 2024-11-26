// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelruin_grader<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ruin_grader"), "main");
	private final ModelPart RuinGuard;
	private final ModelPart CABEZA;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart RuinEye;
	private final ModelPart cube_r13;
	private final ModelPart RuinNeck;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart LEFT_ARM;
	private final ModelPart LRuinShoulder;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart LRuinMid;
	private final ModelPart LRuinLower;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart LPod;
	private final ModelPart cube_r22;
	private final ModelPart RIGHT_ARM;
	private final ModelPart RRuinShoulder;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart RRuinMid;
	private final ModelPart RRuinLower;
	private final ModelPart cube_r25;
	private final ModelPart RPod;
	private final ModelPart cube_r26;
	private final ModelPart RuinPelvis;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart RIGHT_LEG;
	private final ModelPart RRuinLegBottom;
	private final ModelPart cube_r29;
	private final ModelPart RRuinLegFoot2;
	private final ModelPart LEFT_LEG;
	private final ModelPart cube_r30;
	private final ModelPart LRuinLegBottom2;
	private final ModelPart cube_r31;
	private final ModelPart LRuinLegFoot;

	public Modelruin_grader(ModelPart root) {
		this.RuinGuard = root.getChild("RuinGuard");
		this.CABEZA = this.RuinGuard.getChild("CABEZA");
		this.cube_r1 = this.CABEZA.getChild("cube_r1");
		this.cube_r2 = this.CABEZA.getChild("cube_r2");
		this.cube_r3 = this.CABEZA.getChild("cube_r3");
		this.cube_r4 = this.CABEZA.getChild("cube_r4");
		this.cube_r5 = this.CABEZA.getChild("cube_r5");
		this.cube_r6 = this.CABEZA.getChild("cube_r6");
		this.cube_r7 = this.CABEZA.getChild("cube_r7");
		this.cube_r8 = this.CABEZA.getChild("cube_r8");
		this.cube_r9 = this.CABEZA.getChild("cube_r9");
		this.cube_r10 = this.CABEZA.getChild("cube_r10");
		this.cube_r11 = this.CABEZA.getChild("cube_r11");
		this.cube_r12 = this.CABEZA.getChild("cube_r12");
		this.RuinEye = this.CABEZA.getChild("RuinEye");
		this.cube_r13 = this.RuinEye.getChild("cube_r13");
		this.RuinNeck = this.CABEZA.getChild("RuinNeck");
		this.cube_r14 = this.RuinNeck.getChild("cube_r14");
		this.cube_r15 = this.RuinNeck.getChild("cube_r15");
		this.cube_r16 = this.RuinNeck.getChild("cube_r16");
		this.cube_r17 = this.RuinNeck.getChild("cube_r17");
		this.LEFT_ARM = this.CABEZA.getChild("LEFT_ARM");
		this.LRuinShoulder = this.LEFT_ARM.getChild("LRuinShoulder");
		this.cube_r18 = this.LRuinShoulder.getChild("cube_r18");
		this.cube_r19 = this.LRuinShoulder.getChild("cube_r19");
		this.LRuinMid = this.LRuinShoulder.getChild("LRuinMid");
		this.LRuinLower = this.LRuinMid.getChild("LRuinLower");
		this.cube_r20 = this.LRuinLower.getChild("cube_r20");
		this.cube_r21 = this.LRuinLower.getChild("cube_r21");
		this.LPod = this.LRuinShoulder.getChild("LPod");
		this.cube_r22 = this.LPod.getChild("cube_r22");
		this.RIGHT_ARM = this.CABEZA.getChild("RIGHT_ARM");
		this.RRuinShoulder = this.RIGHT_ARM.getChild("RRuinShoulder");
		this.cube_r23 = this.RRuinShoulder.getChild("cube_r23");
		this.cube_r24 = this.RRuinShoulder.getChild("cube_r24");
		this.RRuinMid = this.RRuinShoulder.getChild("RRuinMid");
		this.RRuinLower = this.RRuinMid.getChild("RRuinLower");
		this.cube_r25 = this.RRuinLower.getChild("cube_r25");
		this.RPod = this.RRuinShoulder.getChild("RPod");
		this.cube_r26 = this.RPod.getChild("cube_r26");
		this.RuinPelvis = this.RuinGuard.getChild("RuinPelvis");
		this.cube_r27 = this.RuinPelvis.getChild("cube_r27");
		this.cube_r28 = this.RuinPelvis.getChild("cube_r28");
		this.RIGHT_LEG = this.RuinPelvis.getChild("RIGHT_LEG");
		this.RRuinLegBottom = this.RIGHT_LEG.getChild("RRuinLegBottom");
		this.cube_r29 = this.RRuinLegBottom.getChild("cube_r29");
		this.RRuinLegFoot2 = this.RRuinLegBottom.getChild("RRuinLegFoot2");
		this.LEFT_LEG = this.RuinPelvis.getChild("LEFT_LEG");
		this.cube_r30 = this.LEFT_LEG.getChild("cube_r30");
		this.LRuinLegBottom2 = this.LEFT_LEG.getChild("LRuinLegBottom2");
		this.cube_r31 = this.LRuinLegBottom2.getChild("cube_r31");
		this.LRuinLegFoot = this.LRuinLegBottom2.getChild("LRuinLegFoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RuinGuard = partdefinition.addOrReplaceChild("RuinGuard", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition CABEZA = RuinGuard.addOrReplaceChild("CABEZA", CubeListBuilder.create().texOffs(204, 131).addBox(-10.0F, 18.0F, -8.0F, 19.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(211, 0).addBox(-6.0F, 15.0F, -10.0F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(93, 47).addBox(-13.0F, 3.0F, -6.0F, 24.0F, 15.0F, 11.0F, new CubeDeformation(-0.02F))
		.texOffs(90, 39).addBox(-13.0F, 13.0F, 5.0F, 24.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 94).addBox(-13.0F, 3.0F, -7.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 132).addBox(-11.0F, -2.0F, -7.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 36).addBox(-11.0F, -2.0F, 5.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 91).addBox(-13.0F, 3.0F, 5.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(238, 240).addBox(11.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(54, 116).addBox(11.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(110, 163).addBox(8.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(106, 163).addBox(8.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 163).addBox(-11.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(163, 58).addBox(-11.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(97, 0).addBox(11.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 39).addBox(-14.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 0).addBox(-14.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(240, 71).addBox(11.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, new CubeDeformation(-0.02F))
		.texOffs(75, 125).addBox(-14.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, new CubeDeformation(-0.02F))
		.texOffs(240, 218).addBox(-14.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(128, 179).addBox(-11.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(117, 163).addBox(8.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 177).addBox(-10.0F, -2.0F, -6.0F, 18.0F, 5.0F, 11.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, -39.0F, 7.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r1 = CABEZA.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 177).addBox(-25.0F, 23.0F, 31.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(171, 115).addBox(-27.0F, 21.0F, 32.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(171, 111).addBox(-30.0F, 19.0F, 33.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(170, 28).addBox(-37.0F, 15.0F, 36.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 91).addBox(-31.0F, 15.0F, 34.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(170, 24).addBox(-34.0F, 15.0F, 35.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(130, 169).addBox(-40.0F, 13.0F, 37.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(117, 168).addBox(-23.0F, 25.0F, 30.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(128, 155).addBox(-38.0F, 10.0F, 37.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 153).addBox(-21.0F, 24.0F, 29.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 9).addBox(-20.0F, 24.0F, 28.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(158, 129).addBox(-19.0F, 24.0F, 27.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 143).addBox(-15.0F, 24.0F, 26.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 159).addBox(-13.0F, 24.0F, 25.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(158, 135).addBox(-6.0F, 25.0F, 23.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 183).addBox(-32.0F, 36.0F, 35.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 181).addBox(-34.0F, 34.0F, 36.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(128, 179).addBox(-29.0F, 35.0F, 34.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 18).addBox(-26.0F, 36.0F, 33.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 97).addBox(-31.0F, 47.0F, 33.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 214).addBox(-30.0F, 47.0F, 32.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 214).addBox(-38.0F, 55.0F, 35.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 212).addBox(-36.0F, 52.0F, 35.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 210).addBox(-34.0F, 51.0F, 34.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(97, 216).addBox(-27.0F, 47.0F, 31.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 218).addBox(-25.0F, 44.0F, 31.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(141, 186).addBox(-24.0F, 40.0F, 32.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 189).addBox(-23.0F, 41.0F, 31.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 218).addBox(-23.0F, 43.0F, 30.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(221, 146).addBox(-21.0F, 42.0F, 29.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 47).addBox(-20.0F, 42.0F, 28.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 170).addBox(-19.0F, 42.0F, 27.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 168).addBox(-15.0F, 42.0F, 26.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(240, 89).addBox(-13.0F, 42.0F, 25.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(185, 126).addBox(-6.0F, 41.0F, 23.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.4178F, 37.9447F, -11.0F, 0.0F, 0.4363F, -1.5708F));

		PartDefinition cube_r2 = CABEZA.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(59, 212).addBox(-8.0F, -4.0F, 17.0F, 14.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-20.0F, 11.9082F, 4.0536F, 38.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-17.0F, -9.0918F, 2.0536F, 32.0F, 24.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = CABEZA.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 135).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.9F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = CABEZA.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 51).addBox(-12.0F, -16.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.9F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r5 = CABEZA.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 125).addBox(9.0F, -12.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-11.6F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r6 = CABEZA.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 45).addBox(-12.0F, -16.0F, 0.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-11.6F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = CABEZA.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(67, 73).addBox(-12.0F, -16.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r8 = CABEZA.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(114, 45).addBox(5.0F, -12.0F, 0.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r9 = CABEZA.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(158, 114).addBox(-1.7345F, -8.8517F, -11.1384F, 3.0F, 8.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.6109F, 0.0F, -0.7854F));

		PartDefinition cube_r10 = CABEZA.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(131, 231).addBox(-2.3345F, -13.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.4363F, 0.0F, -0.7854F));

		PartDefinition cube_r11 = CABEZA.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(147, 155).addBox(-1.6655F, -7.8517F, -11.1384F, 3.0F, 8.0F, 7.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.6109F, 0.0F, 0.7854F));

		PartDefinition cube_r12 = CABEZA.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(246, 47).addBox(-5.6655F, -12.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.4363F, 0.0F, 0.7854F));

		PartDefinition RuinEye = CABEZA.addOrReplaceChild("RuinEye", CubeListBuilder.create().texOffs(35, 193).addBox(-3.1F, -1.3F, -6.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 30.0F, -8.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = RuinEye.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(94, 25).addBox(-6.3223F, -11.3223F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 146).addBox(-12.3223F, -11.3223F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-12.3223F, -5.3223F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-3.3223F, -11.3223F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(130, 163).addBox(-3.3223F, -5.3223F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 146).addBox(-6.3223F, -2.3223F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 104).addBox(-11.3223F, -2.3223F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 163).addBox(-12.3223F, -10.3223F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 58).addBox(-13.3223F, -12.3223F, -6.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 193).addBox(-14.3223F, -13.3223F, -5.0F, 14.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RuinNeck = CABEZA.addOrReplaceChild("RuinNeck", CubeListBuilder.create().texOffs(185, 207).addBox(-10.0F, -10.5326F, -4.1513F, 19.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(27, 159).addBox(-6.0F, -13.5326F, -6.1513F, 11.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 26.0F, -5.0F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition cube_r14 = RuinNeck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 116).addBox(39.1483F, -41.2728F, -48.2774F, 3.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.7218F, 0.2382F, -0.661F));

		PartDefinition cube_r15 = RuinNeck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(196, 248).addBox(42.1483F, -48.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.4363F, 0.0F, -0.7854F));

		PartDefinition cube_r16 = RuinNeck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 153).addBox(-50.1483F, -44.9728F, -34.5774F, 3.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.6545F, -0.3927F, 0.7854F));

		PartDefinition cube_r17 = RuinNeck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(250, 101).addBox(-50.1483F, -47.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.4363F, 0.0F, 0.7854F));

		PartDefinition LEFT_ARM = CABEZA.addOrReplaceChild("LEFT_ARM", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.0F, 30.0F, 5.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition LRuinShoulder = LEFT_ARM.addOrReplaceChild("LRuinShoulder", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = LRuinShoulder.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(181, 80).addBox(-11.0F, -61.0F, -51.0F, 10.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, 69.0F, -12.0F, -0.7854F, 0.0F, 0.4363F));

		PartDefinition cube_r19 = LRuinShoulder.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(137, 198).addBox(-18.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 144).addBox(-13.9522F, -80.7842F, 4.0F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(67, 74).addBox(-19.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(89, 197).addBox(-18.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, 69.0F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition LRuinMid = LRuinShoulder.addOrReplaceChild("LRuinMid", CubeListBuilder.create().texOffs(94, 0).addBox(-27.0F, -5.0F, -5.0F, 29.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(234, 0).addBox(-10.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(233, 105).addBox(-15.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(223, 231).addBox(-20.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(142, 231).addBox(-25.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(28, 249).addBox(-25.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(159, 231).addBox(-20.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(180, 180).addBox(-15.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(90, 128).addBox(-10.0F, 5.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 12.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition LRuinLower = LRuinMid.addOrReplaceChild("LRuinLower", CubeListBuilder.create(), PartPose.offset(-25.5061F, -0.6533F, 0.0F));

		PartDefinition cube_r20 = LRuinLower.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(251, 0).addBox(21.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(251, 22).addBox(16.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(161, 0).addBox(0.0F, -33.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(183, 72).addBox(1.0F, -33.0F, 2.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(240, 209).addBox(1.0F, -33.0F, -6.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(243, 191).addBox(2.0F, -30.0F, -3.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(212, 83).addBox(7.0F, -33.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(4.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(212, 61).addBox(4.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(251, 93).addBox(11.0F, -33.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(223, 209).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(17, 227).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(229, 49).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(163, 54).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 38.598F, -12.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r21 = LRuinLower.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(125, 213).addBox(3.0F, -43.0F, -5.0F, 7.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 38.598F, -12.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition LPod = LRuinShoulder.addOrReplaceChild("LPod", CubeListBuilder.create(), PartPose.offset(6.0F, -5.0F, 0.0F));

		PartDefinition cube_r22 = LPod.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(174, 164).addBox(-12.9522F, -89.7842F, 5.0F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(65, 127).addBox(-0.9522F, -86.7842F, 18.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(161, 0).addBox(-4.9522F, -86.7842F, 18.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(227, 44).addBox(-13.9522F, -88.7842F, 18.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 159).addBox(-8.9522F, -86.7842F, 18.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(118, 111).addBox(-13.9522F, -86.7842F, 18.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(150, 158).addBox(-13.9522F, -86.7842F, 17.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 156).addBox(-13.9522F, -86.7842F, 13.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 155).addBox(-13.9522F, -86.7842F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 155).addBox(-13.9522F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(157, 240).addBox(-13.9522F, -88.7842F, 5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(215, 127).addBox(-13.9522F, -88.7842F, 4.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(118, 107).addBox(-13.9522F, -86.7842F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 153).addBox(-8.9522F, -86.7842F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 153).addBox(-4.9522F, -86.7842F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 116).addBox(-0.9522F, -86.7842F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 77).addBox(0.0478F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(138, 73).addBox(0.0478F, -86.7842F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 135).addBox(0.0478F, -86.7842F, 13.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 135).addBox(0.0478F, -86.7842F, 17.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 240).addBox(0.0478F, -88.7842F, 5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(161, 18).addBox(-13.9522F, -86.7842F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(141, 180).addBox(-12.9522F, -88.7842F, 5.0F, 13.0F, 5.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(172, 242).addBox(-9.9522F, -83.7842F, 8.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, 74.0F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition RIGHT_ARM = CABEZA.addOrReplaceChild("RIGHT_ARM", CubeListBuilder.create(), PartPose.offsetAndRotation(19.0F, 32.0F, 5.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition RRuinShoulder = RIGHT_ARM.addOrReplaceChild("RRuinShoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r23 = RRuinShoulder.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(47, 185).addBox(-20.0F, -61.0F, -51.0F, 10.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5061F, 64.3467F, -12.0F, -0.7854F, 0.0F, 0.4363F));

		PartDefinition cube_r24 = RRuinShoulder.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(185, 111).addBox(-26.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(136, 92).addBox(-22.4428F, -80.4887F, 4.0F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-27.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(193, 192).addBox(-26.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5061F, 64.3467F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition RRuinMid = RRuinShoulder.addOrReplaceChild("RRuinMid", CubeListBuilder.create().texOffs(94, 18).addBox(-26.9117F, -3.402F, -5.0F, 29.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(239, 135).addBox(-9.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 238).addBox(-14.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(236, 164).addBox(-19.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(234, 22).addBox(-24.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(180, 252).addBox(-24.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(71, 252).addBox(-19.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(55, 252).addBox(-14.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(39, 252).addBox(-9.9117F, -7.402F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.5061F, 0.3467F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RRuinLower = RRuinMid.addOrReplaceChild("RRuinLower", CubeListBuilder.create(), PartPose.offset(-25.0F, 0.0F, 0.0F));

		PartDefinition cube_r25 = RRuinLower.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(111, 253).addBox(21.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(127, 253).addBox(16.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(97, 212).addBox(4.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(240, 233).addBox(1.0F, -47.0F, -6.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(193, 242).addBox(1.0F, -47.0F, 2.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(185, 138).addBox(0.0F, -47.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(243, 198).addBox(2.0F, -49.0F, -3.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(114, 212).addBox(7.0F, -47.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(4.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(143, 253).addBox(11.0F, -47.0F, -3.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(45, 230).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(73, 230).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(114, 231).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(157, 213).addBox(3.0F, -43.0F, -5.0F, 7.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F))
		.texOffs(174, 146).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 39.598F, -12.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition RPod = RRuinShoulder.addOrReplaceChild("RPod", CubeListBuilder.create(), PartPose.offset(2.0F, -10.0F, 0.0F));

		PartDefinition cube_r26 = RPod.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(184, 178).addBox(-21.4428F, -89.4887F, 5.0F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(11, 58).addBox(-9.4428F, -86.4887F, 18.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(134, 73).addBox(-13.4428F, -86.4887F, 18.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(101, 128).addBox(-8.4428F, -86.4887F, 17.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 128).addBox(-8.4428F, -86.4887F, 13.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 125).addBox(-8.4428F, -86.4887F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 125).addBox(-8.4428F, -86.4887F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 163).addBox(-8.4428F, -88.4887F, 5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(14, 131).addBox(-22.4428F, -86.4887F, 13.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 131).addBox(-22.4428F, -86.4887F, 9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(83, 131).addBox(-22.4428F, -86.4887F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(228, 194).addBox(-22.4428F, -88.4887F, 5.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(133, 110).addBox(-22.4428F, -86.4887F, 17.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(133, 114).addBox(-17.4428F, -86.4887F, 18.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 9).addBox(-22.4428F, -86.4887F, 18.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 125).addBox(-22.4428F, -88.4887F, 18.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(134, 77).addBox(-17.4428F, -86.4887F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 135).addBox(-13.4428F, -86.4887F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 66).addBox(-9.4428F, -86.4887F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 116).addBox(-22.4428F, -86.4887F, 4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(158, 140).addBox(-22.4428F, -88.4887F, 4.0F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(89, 179).addBox(-21.4428F, -88.4887F, 5.0F, 13.0F, 5.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(133, 111).addBox(-18.4428F, -83.4887F, 8.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5061F, 74.3467F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition RuinPelvis = RuinGuard.addOrReplaceChild("RuinPelvis", CubeListBuilder.create().texOffs(170, 22).addBox(-10.0F, -1.0F, -5.0F, 18.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(27, 116).addBox(-5.0F, -6.0F, -5.0F, 8.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -37.0F, 6.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r27 = RuinPelvis.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 50).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(27, 135).addBox(8.0F, -15.0F, -12.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(138, 45).addBox(10.0F, -12.0F, -12.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-4.0F, 16.0F, 6.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r28 = RuinPelvis.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(90, 136).addBox(-11.0F, -16.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(67, 71).addBox(-15.0F, -19.0F, -12.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(79, 13).addBox(-12.0F, -16.0F, -12.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-4.0F, 16.0F, 6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RIGHT_LEG = RuinPelvis.addOrReplaceChild("RIGHT_LEG", CubeListBuilder.create().texOffs(59, 107).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(27, 116).addBox(21.0883F, -4.402F, -7.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(223, 83).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(206, 220).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(178, 220).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.4939F, -2.6533F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition RRuinLegBottom = RIGHT_LEG.addOrReplaceChild("RRuinLegBottom", CubeListBuilder.create().texOffs(152, 36).addBox(-0.9117F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(223, 178).addBox(-8.9117F, -1.402F, 10.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 131).addBox(-7.9117F, -1.402F, 9.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 172).addBox(-6.9117F, -1.402F, 8.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 172).addBox(-2.9117F, -1.402F, 7.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(246, 129).addBox(-0.9117F, -1.402F, 6.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(196, 105).addBox(6.0883F, -1.402F, 4.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(130, 163).addBox(2.0883F, -6.402F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(174, 164).addBox(0.0883F, -6.402F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(141, 180).addBox(2.0883F, 4.598F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(174, 170).addBox(0.0883F, 4.598F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(59, 91).addBox(2.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(210, 34).addBox(4.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(133, 121).addBox(-7.9117F, -2.402F, -9.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(140, 36).addBox(-0.9117F, -3.402F, -9.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(117, 163).addBox(6.0883F, -1.402F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(236, 157).addBox(6.0883F, -1.402F, -7.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(170, 0).addBox(4.0883F, -5.402F, -6.0F, 15.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(21.0F, 0.0F, 0.0F));

		PartDefinition cube_r29 = RRuinLegBottom.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(158, 111).addBox(32.0F, -33.0F, 41.0F, 2.0F, 1.0F, 23.0F, new CubeDeformation(-0.02F))
		.texOffs(48, 125).addBox(32.0F, -44.0F, 41.0F, 2.0F, 11.0F, 23.0F, new CubeDeformation(-0.02F))
		.texOffs(147, 156).addBox(32.0F, -45.0F, 41.0F, 2.0F, 1.0F, 23.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-46.9117F, 38.598F, -12.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition RRuinLegFoot2 = RRuinLegBottom.addOrReplaceChild("RRuinLegFoot2", CubeListBuilder.create().texOffs(106, 107).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(201, 34).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(91, 163).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(48, 135).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(154, 111).addBox(-2.0F, -1.0F, -10.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(19.0F, -1.0F, 0.0F));

		PartDefinition LEFT_LEG = RuinPelvis.addOrReplaceChild("LEFT_LEG", CubeListBuilder.create().texOffs(0, 98).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(219, 153).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(217, 11).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 214).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5061F, -2.6533F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r30 = LEFT_LEG.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(131, 121).addBox(32.0F, -44.0F, 41.0F, 2.0F, 11.0F, 23.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 38.598F, -12.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition LRuinLegBottom2 = LEFT_LEG.addOrReplaceChild("LRuinLegBottom2", CubeListBuilder.create().texOffs(134, 73).addBox(0.0883F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(223, 186).addBox(7.0883F, -1.402F, 4.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(250, 112).addBox(0.0883F, -1.402F, 6.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(78, 185).addBox(-1.9117F, -1.402F, 7.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 174).addBox(-5.9117F, -1.402F, 8.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(152, 54).addBox(-6.9117F, -1.402F, 9.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(223, 182).addBox(-7.9117F, -1.402F, 10.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 163).addBox(5.0883F, -5.402F, -6.0F, 15.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(29, 201).addBox(5.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(90, 234).addBox(7.0883F, -1.402F, -7.0F, 13.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(160, 155).addBox(7.0883F, -1.402F, -9.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(79, 0).addBox(0.0883F, -3.402F, -9.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(148, 213).addBox(-6.9117F, -2.402F, -9.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(161, 18).addBox(3.0883F, 4.598F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(27, 153).addBox(1.0883F, 4.598F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0883F, -6.402F, -7.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(1.0883F, -4.402F, -7.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(75, 125).addBox(3.0883F, -6.402F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(75, 131).addBox(1.0883F, -6.402F, -7.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(20.0F, 0.0F, 0.0F));

		PartDefinition cube_r31 = LRuinLegBottom2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 153).addBox(32.0F, -33.0F, 41.0F, 2.0F, 1.0F, 23.0F, new CubeDeformation(-0.02F))
		.texOffs(120, 155).addBox(32.0F, -45.0F, 41.0F, 2.0F, 1.0F, 23.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-45.9117F, 38.598F, -12.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition LRuinLegFoot = LRuinLegBottom2.addOrReplaceChild("LRuinLegFoot", CubeListBuilder.create().texOffs(0, 116).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(62, 230).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(34, 227).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(195, 220).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(13, 153).addBox(-2.0F, -1.0F, -10.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(20.0F, -1.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RuinGuard.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}