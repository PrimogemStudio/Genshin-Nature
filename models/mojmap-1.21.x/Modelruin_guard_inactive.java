// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelruin_guard_inactive<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ruin_guard_inactive"), "main");
	private final ModelPart RuinGuard;
	private final ModelPart h_head;
	private final ModelPart RuinEye;
	private final ModelPart RuinNeck;
	private final ModelPart RuinPelvis;
	private final ModelPart left_leg_ANIM;
	private final ModelPart LRuinLegBottom2;
	private final ModelPart LRuinLegFoot;
	private final ModelPart right_leg_ANIM;
	private final ModelPart RRuinLegBottom;
	private final ModelPart RRuinLegFoot2;
	private final ModelPart left_arm_ANIM;
	private final ModelPart LRuinShoulder;
	private final ModelPart LRuinMid;
	private final ModelPart LRuinLower;
	private final ModelPart LPod;
	private final ModelPart right_arm_ANIM;
	private final ModelPart RRuinShoulder;
	private final ModelPart RRuinMid;
	private final ModelPart RRuinLower;
	private final ModelPart RPod;

	public Modelruin_guard_inactive(ModelPart root) {
		this.RuinGuard = root.getChild("RuinGuard");
		this.h_head = this.RuinGuard.getChild("h_head");
		this.RuinEye = this.h_head.getChild("RuinEye");
		this.RuinNeck = this.h_head.getChild("RuinNeck");
		this.RuinPelvis = this.RuinGuard.getChild("RuinPelvis");
		this.left_leg_ANIM = this.RuinGuard.getChild("left_leg_ANIM");
		this.LRuinLegBottom2 = this.left_leg_ANIM.getChild("LRuinLegBottom2");
		this.LRuinLegFoot = this.LRuinLegBottom2.getChild("LRuinLegFoot");
		this.right_leg_ANIM = this.RuinGuard.getChild("right_leg_ANIM");
		this.RRuinLegBottom = this.right_leg_ANIM.getChild("RRuinLegBottom");
		this.RRuinLegFoot2 = this.RRuinLegBottom.getChild("RRuinLegFoot2");
		this.left_arm_ANIM = this.RuinGuard.getChild("left_arm_ANIM");
		this.LRuinShoulder = this.left_arm_ANIM.getChild("LRuinShoulder");
		this.LRuinMid = this.LRuinShoulder.getChild("LRuinMid");
		this.LRuinLower = this.LRuinMid.getChild("LRuinLower");
		this.LPod = this.LRuinShoulder.getChild("LPod");
		this.right_arm_ANIM = this.RuinGuard.getChild("right_arm_ANIM");
		this.RRuinShoulder = this.right_arm_ANIM.getChild("RRuinShoulder");
		this.RRuinMid = this.RRuinShoulder.getChild("RRuinMid");
		this.RRuinLower = this.RRuinMid.getChild("RRuinLower");
		this.RPod = this.RRuinShoulder.getChild("RPod");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RuinGuard = partdefinition.addOrReplaceChild("RuinGuard", CubeListBuilder.create(), PartPose.offset(0.0F, 55.0F, 0.0F));

		PartDefinition h_head = RuinGuard.addOrReplaceChild("h_head", CubeListBuilder.create().texOffs(116, 176).addBox(-10.0F, 18.0F, -8.0F, 19.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(62, 159).addBox(-6.0F, 15.0F, -10.0F, 11.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(93, 47).addBox(-13.0F, 3.0F, -6.0F, 24.0F, 15.0F, 11.0F, new CubeDeformation(-0.02F))
		.texOffs(90, 39).addBox(-13.0F, 13.0F, 5.0F, 24.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 111).addBox(-13.0F, 3.0F, -7.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(214, 180).addBox(-11.0F, -2.0F, -7.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(212, 22).addBox(-11.0F, -2.0F, 5.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 36).addBox(-13.0F, 3.0F, 5.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(229, 140).addBox(11.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(12, 58).addBox(11.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 71).addBox(8.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 71).addBox(8.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 71).addBox(-11.0F, 0.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(-11.0F, 0.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 58).addBox(11.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 58).addBox(-14.0F, 5.0F, 5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-14.0F, 5.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(227, 162).addBox(11.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, new CubeDeformation(-0.02F))
		.texOffs(224, 91).addBox(-14.0F, 13.0F, -7.0F, 1.0F, 5.0F, 13.0F, new CubeDeformation(-0.02F))
		.texOffs(228, 220).addBox(-14.0F, 3.0F, -7.0F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(41, 230).addBox(-11.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(17, 230).addBox(8.0F, -2.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(156, 114).addBox(-10.0F, -2.0F, -6.0F, 18.0F, 5.0F, 11.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, -39.0F, 7.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r1 = h_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 170).addBox(-8.0F, -4.0F, 17.0F, 14.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-20.0F, 11.9082F, 4.0536F, 38.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-17.0F, -9.0918F, 2.0536F, 32.0F, 24.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r2 = h_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 10).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.9F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r3 = h_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 12).addBox(-12.0F, -16.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-3.9F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r4 = h_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 39).addBox(9.0F, -12.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-11.6F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r5 = h_head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 41).addBox(-12.0F, -16.0F, 0.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-11.6F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = h_head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 43).addBox(-12.0F, -16.0F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, 29.0F, -7.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = h_head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 45).addBox(5.0F, -12.0F, 0.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, 29.0F, -7.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = h_head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(211, 47).addBox(-2.3345F, -13.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.4363F, 0.0F, -0.7854F));

		PartDefinition cube_r9 = h_head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(173, 211).addBox(-5.6655F, -12.8517F, -7.1384F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 29.0F, -7.0F, -0.4363F, 0.0F, 0.7854F));

		PartDefinition RuinEye = h_head.addOrReplaceChild("RuinEye", CubeListBuilder.create().texOffs(0, 0).addBox(-3.1F, -1.3F, -6.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 30.0F, -8.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r10 = RuinEye.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 68).addBox(-6.3223F, -11.3223F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-12.3223F, -11.3223F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 70).addBox(-12.3223F, -5.3223F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 70).addBox(-3.3223F, -11.3223F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 0).addBox(-3.3223F, -5.3223F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-6.3223F, -2.3223F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-11.3223F, -2.3223F, -7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 4).addBox(-12.3223F, -10.3223F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 58).addBox(-13.3223F, -12.3223F, -6.0F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(170, 15).addBox(-14.3223F, -13.3223F, -5.0F, 14.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition RuinNeck = h_head.addOrReplaceChild("RuinNeck", CubeListBuilder.create().texOffs(162, 176).addBox(-10.0F, -10.5326F, -4.1513F, 19.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 139).addBox(-6.0F, -13.5326F, -6.1513F, 11.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 26.0F, -5.0F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = RuinNeck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(90, 213).addBox(42.1483F, -48.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.4363F, 0.0F, -0.7854F));

		PartDefinition cube_r12 = RuinNeck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(190, 222).addBox(-50.1483F, -47.2728F, -38.5774F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, 63.3756F, 10.7951F, -0.4363F, 0.0F, 0.7854F));

		PartDefinition RuinPelvis = RuinGuard.addOrReplaceChild("RuinPelvis", CubeListBuilder.create().texOffs(158, 130).addBox(-10.0F, -1.0F, -5.0F, 18.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(179, 69).addBox(-5.0F, -6.0F, -5.0F, 8.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -37.0F, 6.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = RuinPelvis.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 6).addBox(10.0F, -12.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(0, 49).addBox(10.0F, -12.0F, -12.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-4.0F, 16.0F, 6.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r14 = RuinPelvis.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 47).addBox(-11.0F, -16.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F))
		.texOffs(0, 8).addBox(-12.0F, -16.0F, -12.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-4.0F, 16.0F, 6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition left_leg_ANIM = RuinGuard.addOrReplaceChild("left_leg_ANIM", CubeListBuilder.create().texOffs(105, 107).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(213, 211).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(101, 213).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(73, 213).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(212, 153).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4939F, -34.6533F, 8.0F, -2.0333F, 1.4733F, -0.4644F));

		PartDefinition LRuinLegBottom2 = left_leg_ANIM.addOrReplaceChild("LRuinLegBottom2", CubeListBuilder.create().texOffs(136, 143).addBox(0.0883F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(156, 211).addBox(16.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(209, 80).addBox(11.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(45, 208).addBox(6.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(208, 25).addBox(1.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition LRuinLegFoot = LRuinLegBottom2.addOrReplaceChild("LRuinLegFoot", CubeListBuilder.create().texOffs(40, 154).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(168, 189).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(44, 186).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(45, 91).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, -1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition right_leg_ANIM = RuinGuard.addOrReplaceChild("right_leg_ANIM", CubeListBuilder.create().texOffs(96, 125).addBox(-1.9117F, -4.402F, -5.0F, 25.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(226, 69).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(118, 224).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(223, 47).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(173, 222).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5061F, -34.6533F, 8.0F, 2.0333F, 1.4733F, -2.6772F));

		PartDefinition RRuinLegBottom = right_leg_ANIM.addOrReplaceChild("RRuinLegBottom", CubeListBuilder.create().texOffs(151, 89).addBox(-0.9117F, -4.402F, -5.0F, 20.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(222, 113).addBox(15.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 219).addBox(10.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(218, 0).addBox(5.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(214, 189).addBox(0.0883F, -5.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition RRuinLegFoot2 = RRuinLegBottom.addOrReplaceChild("RRuinLegFoot2", CubeListBuilder.create().texOffs(78, 159).addBox(0.0F, -7.0F, -10.0F, 3.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(34, 208).addBox(-1.0F, -7.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(128, 191).addBox(-1.0F, 5.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(100, 191).addBox(-1.0F, -1.0F, -17.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, -1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition left_arm_ANIM = RuinGuard.addOrReplaceChild("left_arm_ANIM", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, -68.0F, 12.0F, -0.3503F, -0.082F, 0.0299F));

		PartDefinition LRuinShoulder = left_arm_ANIM.addOrReplaceChild("LRuinShoulder", CubeListBuilder.create(), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = LRuinShoulder.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(164, 161).addBox(-18.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 143).addBox(-18.0F, -78.0F, 4.0F, 15.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(67, 74).addBox(-19.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(170, 0).addBox(-18.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, 69.0F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition LRuinMid = LRuinShoulder.addOrReplaceChild("LRuinMid", CubeListBuilder.create().texOffs(17, 208).addBox(-10.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(206, 58).addBox(-15.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(205, 131).addBox(-20.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(203, 102).addBox(-25.0F, -6.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 12.0F, 0.0F, 0.0F, -0.4363F, -1.5708F));

		PartDefinition cube_r16 = LRuinMid.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(94, 18).addBox(24.0F, -43.0F, 7.0F, 29.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-51.0F, 38.0F, -12.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition LRuinLower = LRuinMid.addOrReplaceChild("LRuinLower", CubeListBuilder.create(), PartPose.offsetAndRotation(-25.5061F, -0.6533F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = LRuinLower.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(197, 178).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(196, 200).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(128, 202).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(152, 36).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 38.598F, -12.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition LPod = LRuinShoulder.addOrReplaceChild("LPod", CubeListBuilder.create(), PartPose.offset(6.0F, -5.0F, 0.0F));

		PartDefinition cube_r18 = LPod.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(45, 107).addBox(-18.0F, -95.0F, 4.0F, 15.0F, 5.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(39, 127).addBox(-17.0F, -90.0F, 5.0F, 13.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.0F, 74.0F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition right_arm_ANIM = RuinGuard.addOrReplaceChild("right_arm_ANIM", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.0F, -69.0F, 12.0F, -0.3503F, 0.082F, -0.0299F));

		PartDefinition RRuinShoulder = right_arm_ANIM.addOrReplaceChild("RRuinShoulder", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r19 = RRuinShoulder.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 161).addBox(-26.0F, -76.0F, 2.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(134, 73).addBox(-18.0F, -78.0F, 4.0F, 15.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-27.0F, -77.0F, 3.0F, 25.0F, 16.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(163, 54).addBox(-26.0F, -76.0F, 20.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5061F, 64.3467F, -12.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition RRuinMid = RRuinShoulder.addOrReplaceChild("RRuinMid", CubeListBuilder.create().texOffs(94, 0).addBox(-26.9117F, -3.402F, -5.0F, 29.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 197).addBox(-9.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(111, 191).addBox(-14.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(83, 191).addBox(-19.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(179, 189).addBox(-24.9117F, -4.402F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.5061F, 0.3467F, 0.0F, 0.0F, -0.4363F, -0.7854F));

		PartDefinition RRuinLower = RRuinMid.addOrReplaceChild("RRuinLower", CubeListBuilder.create(), PartPose.offsetAndRotation(-25.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r20 = RRuinLower.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(27, 186).addBox(11.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(55, 186).addBox(16.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(151, 189).addBox(21.0F, -44.0F, -6.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 152).addBox(10.0F, -43.0F, -5.0F, 19.0F, 9.0F, 9.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-25.9117F, 39.598F, -12.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition RPod = RRuinShoulder.addOrReplaceChild("RPod", CubeListBuilder.create(), PartPose.offset(2.0F, -10.0F, 0.0F));

		PartDefinition cube_r21 = RPod.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 91).addBox(-18.0F, -95.0F, 4.0F, 15.0F, 5.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 114).addBox(-17.0F, -90.0F, 5.0F, 13.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.5061F, 74.3467F, -12.0F, 0.0F, 0.0F, 0.4363F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RuinGuard.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}