// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelgeovishap_fixed3<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "geovishap_fixed3"), "main");
	private final ModelPart body;
	private final ModelPart neck;
	private final ModelPart ANIMATE_CABEZA;
	private final ModelPart Jaw;
	private final ModelPart ANIMATE_LEFT_ARM;
	private final ModelPart leftarmbend;
	private final ModelPart hand;
	private final ModelPart ANIMATE_RIGHT_ARM;
	private final ModelPart rightarmbend;
	private final ModelPart hand2;
	private final ModelPart ANIMATE_LEFT_LEG;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart ANIMATE_RIGHT_LEG;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart tail;

	public Modelgeovishap_fixed3(ModelPart root) {
		this.body = root.getChild("body");
		this.neck = this.body.getChild("neck");
		this.ANIMATE_CABEZA = this.neck.getChild("ANIMATE_CABEZA");
		this.Jaw = this.ANIMATE_CABEZA.getChild("Jaw");
		this.ANIMATE_LEFT_ARM = this.body.getChild("ANIMATE_LEFT_ARM");
		this.leftarmbend = this.ANIMATE_LEFT_ARM.getChild("leftarmbend");
		this.hand = this.leftarmbend.getChild("hand");
		this.ANIMATE_RIGHT_ARM = this.body.getChild("ANIMATE_RIGHT_ARM");
		this.rightarmbend = this.ANIMATE_RIGHT_ARM.getChild("rightarmbend");
		this.hand2 = this.rightarmbend.getChild("hand2");
		this.ANIMATE_LEFT_LEG = this.body.getChild("ANIMATE_LEFT_LEG");
		this.bone = this.ANIMATE_LEFT_LEG.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.ANIMATE_RIGHT_LEG = this.body.getChild("ANIMATE_RIGHT_LEG");
		this.bone3 = this.ANIMATE_RIGHT_LEG.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.tail = this.body.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(132, 202).addBox(-4.0F, -22.25F, 0.75F, 8.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.5F, 1.0F, -2.6616F, 0.0F, 3.1416F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 122).addBox(-16.0F, -13.5F, -7.0F, 32.0F, 27.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 14.0574F, 20.5013F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 261).mirror().addBox(0.0F, -15.25F, -12.75F, 0.0F, 23.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(273, 270).mirror().addBox(-4.0F, -11.25F, -9.75F, 6.0F, 19.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(17.0F, -16.2063F, 16.2284F, 0.0098F, 0.0403F, 0.4784F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 261).addBox(0.0F, -15.25F, -12.75F, 0.0F, 23.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(273, 270).addBox(-2.0F, -11.25F, -9.75F, 6.0F, 19.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -16.2063F, 16.2284F, 0.0098F, -0.0403F, -0.4784F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(290, 77).addBox(-34.4863F, -0.931F, 9.4625F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(26.6628F, -6.0286F, -47.1098F, 0.9202F, 0.1685F, 0.0456F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(135, 264).addBox(-36.4863F, -3.1237F, 8.2225F, 12.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(26.6628F, -6.0286F, -47.1098F, 0.3529F, 0.1685F, 0.0456F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(277, 46).addBox(-31.6628F, 8.2763F, 33.0391F, 8.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.6628F, -6.0286F, -47.1098F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(207, 218).addBox(-35.6628F, -4.5886F, 33.4492F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.6628F, -6.0286F, -47.1098F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(71, 281).mirror().addBox(17.2382F, 3.3941F, 38.5104F, 2.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-27.6628F, -6.0286F, -47.1098F, 0.6512F, 0.4488F, 0.1762F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(71, 281).addBox(-19.2382F, 3.3941F, 38.5104F, 2.0F, 17.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.6628F, -6.0286F, -47.1098F, 0.6512F, -0.4488F, -0.1762F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 164).addBox(-10.0F, -20.5F, -23.0F, 20.0F, 17.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.1737F, 23.956F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 56).addBox(-19.75F, -13.5F, -20.5F, 40.0F, 33.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-22.25F, -13.5F, -10.5F, 45.0F, 36.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 2.5F, 14.25F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(55, 233).addBox(-6.0F, -7.5F, -14.75F, 12.0F, 17.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -23.9633F, 36.1753F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(199, 140).addBox(-40.6628F, 2.9301F, 17.1844F, 26.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 191).addBox(-39.6628F, 4.9301F, 18.1844F, 24.0F, 25.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 104).addBox(-41.6628F, 2.9301F, 31.1844F, 28.0F, 27.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.6628F, -6.0286F, -47.1098F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(159, 16).addBox(-2.5F, -2.0F, -5.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -16.25F, 6.75F, 0.0F, -0.9163F, 0.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(108, 234).addBox(-8.0F, -11.8301F, 0.9019F, 16.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.5F, 28.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r15 = neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(268, 184).addBox(-7.0F, 1.0F, 0.5F, 14.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8301F, 8.9019F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r16 = neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(140, 82).addBox(-3.125F, -6.0F, 0.0F, 11.0F, 15.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(140, 82).addBox(-3.125F, -6.0F, 0.0F, 11.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.6143F, -18.4284F, -3.6408F, -2.2183F, 1.168F, -2.205F));

		PartDefinition cube_r17 = neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 150).addBox(-1.5F, -4.0F, -6.125F, 3.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 150).addBox(-1.5F, -4.0F, -6.125F, 3.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.6143F, -18.4284F, -3.6408F, -0.3276F, 0.2387F, -0.0263F));

		PartDefinition cube_r18 = neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(140, 82).mirror().addBox(-7.875F, -6.0F, 0.0F, 11.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.6143F, -18.4284F, -3.6408F, -2.2183F, -1.168F, 2.205F));

		PartDefinition cube_r19 = neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-1.5F, -4.0F, -6.125F, 3.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.6143F, -18.4284F, -3.6408F, -0.3276F, -0.2387F, 0.0263F));

		PartDefinition cube_r20 = neck.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 292).addBox(-2.0F, -6.5F, -4.75F, 4.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.9065F, -5.3921F, -0.1309F, 0.0F, 0.0F));

		PartDefinition ANIMATE_CABEZA = neck.addOrReplaceChild("ANIMATE_CABEZA", CubeListBuilder.create().texOffs(245, 26).addBox(-7.5F, -5.1359F, 9.5647F, 17.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(140, 172).addBox(-4.0F, -4.1359F, 22.5647F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 114).addBox(-2.0F, -4.1359F, 27.5647F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -9.0801F, 9.9019F));

		PartDefinition cube_r21 = ANIMATE_CABEZA.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(192, 61).addBox(-30.5F, -11.0F, 3.0F, 14.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.5F, 11.0F, 12.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r22 = ANIMATE_CABEZA.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(94, 233).addBox(-2.5F, -12.25F, -4.25F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(35, 288).addBox(-3.5F, -6.25F, -4.75F, 7.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.1359F, 16.0647F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r23 = ANIMATE_CABEZA.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(93, 122).mirror().addBox(-1.25F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0593F, -7.2574F, 4.5066F, -0.9506F, 0.0391F, 0.0024F));

		PartDefinition cube_r24 = ANIMATE_CABEZA.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 122).addBox(-1.75F, -3.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0593F, -7.2574F, 4.5066F, -0.9506F, -0.0391F, -0.0024F));

		PartDefinition cube_r25 = ANIMATE_CABEZA.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(93, 122).addBox(-1.5F, 0.0F, -7.75F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -9.8469F, 15.719F, -0.1215F, 0.0042F, -0.0077F));

		PartDefinition cube_r26 = ANIMATE_CABEZA.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 191).mirror().addBox(-4.75F, -5.5F, -0.25F, 7.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.5389F, 2.5539F, 0.8205F, -1.2217F, 0.4951F, -1.3399F));

		PartDefinition cube_r27 = ANIMATE_CABEZA.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, -3.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.9941F, 1.5364F, 5.2647F, -0.3193F, 0.2909F, -0.0945F));

		PartDefinition cube_r28 = ANIMATE_CABEZA.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.75F, -3.0F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.9941F, 1.5364F, 5.2647F, -0.3193F, -0.2909F, 0.0945F));

		PartDefinition cube_r29 = ANIMATE_CABEZA.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 0).mirror().addBox(-2.0F, -3.5F, -1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(13.1189F, -4.4064F, 1.597F, -0.7561F, -0.0465F, -1.5133F));

		PartDefinition cube_r30 = ANIMATE_CABEZA.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(174, 105).mirror().addBox(-0.75F, -8.0F, -2.5F, 9.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.9329F, -1.5739F, -2.6496F, -1.0545F, -0.155F, -1.5147F));

		PartDefinition cube_r31 = ANIMATE_CABEZA.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(174, 105).addBox(-8.25F, -8.0F, -2.5F, 9.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.9329F, -1.5739F, -2.6496F, -1.0545F, 0.155F, 1.5147F));

		PartDefinition cube_r32 = ANIMATE_CABEZA.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 191).addBox(-2.25F, -5.5F, -0.25F, 7.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5389F, 2.5539F, 0.8205F, -1.2217F, -0.4951F, 1.3399F));

		PartDefinition cube_r33 = ANIMATE_CABEZA.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(110, 0).addBox(-2.0F, -3.5F, -1.0F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.1189F, -4.4064F, 1.597F, -0.7561F, 0.0465F, 1.5133F));

		PartDefinition cube_r34 = ANIMATE_CABEZA.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(218, 190).addBox(-7.75F, -1.25F, -7.5F, 15.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -9.9549F, -1.7167F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r35 = ANIMATE_CABEZA.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(228, 61).addBox(-8.75F, -1.25F, -9.5F, 17.0F, 9.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -7.0847F, -0.4621F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r36 = ANIMATE_CABEZA.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(259, 101).addBox(-9.5F, -1.25F, -13.25F, 19.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.1359F, 16.0647F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r37 = ANIMATE_CABEZA.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(256, 0).addBox(-30.5F, -10.25F, -8.0F, 14.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(245, 85).addBox(-31.0F, -10.75F, -8.25F, 15.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.5F, 11.0F, 12.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Jaw = ANIMATE_CABEZA.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(275, 233).addBox(-6.5F, 2.0F, 7.0F, 13.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(40, 230).addBox(-5.5F, 2.0F, -2.0F, 11.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(140, 70).addBox(-6.5F, 2.0F, 1.0F, 13.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(219, 162).addBox(-7.5F, 0.0F, -2.0F, 15.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(147, 244).addBox(-6.5F, -1.0F, -1.5F, 13.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.25F, 5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition ANIMATE_LEFT_ARM = body.addOrReplaceChild("ANIMATE_LEFT_ARM", CubeListBuilder.create().texOffs(199, 105).addBox(-26.75F, -9.5914F, -7.9762F, 21.0F, 17.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(269, 152).addBox(-32.75F, -6.5914F, -5.9762F, 6.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(192, 247).addBox(-5.75F, -6.8414F, -8.4762F, 6.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.25F, -1.5F, 15.25F, -0.0637F, -0.3498F, -0.9822F));

		PartDefinition leftarmbend = ANIMATE_LEFT_ARM.addOrReplaceChild("leftarmbend", CubeListBuilder.create().texOffs(160, 172).addBox(-18.8057F, -9.1197F, -7.7765F, 20.0F, 18.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(110, 0).addBox(-22.8057F, -12.1197F, -1.7765F, 24.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.9443F, -1.4717F, -0.6997F, -1.3183F, 0.0906F, -0.5721F));

		PartDefinition cube_r38 = leftarmbend.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 202).addBox(-5.7053F, -14.5429F, 1.6609F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.1274F, 0.2783F));

		PartDefinition cube_r39 = leftarmbend.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(241, 247).addBox(-16.9553F, -22.596F, -4.7765F, 12.0F, 24.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(300, 115).addBox(-22.9553F, -10.596F, 1.2235F, 6.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.1274F, 0.2783F));

		PartDefinition hand = leftarmbend.addOrReplaceChild("hand", CubeListBuilder.create().texOffs(201, 0).addBox(-16.8057F, -3.1197F, -6.7765F, 19.0F, 9.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(256, 215).addBox(-9.8057F, -5.1197F, -6.2765F, 12.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.6581F));

		PartDefinition ANIMATE_RIGHT_ARM = body.addOrReplaceChild("ANIMATE_RIGHT_ARM", CubeListBuilder.create().texOffs(199, 105).mirror().addBox(5.75F, -9.5914F, -7.9762F, 21.0F, 17.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(269, 152).mirror().addBox(26.75F, -6.5914F, -5.9762F, 6.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(192, 247).mirror().addBox(-0.25F, -6.8414F, -8.4762F, 6.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(20.25F, -1.5F, 15.25F, -0.0637F, 0.3498F, 0.9822F));

		PartDefinition rightarmbend = ANIMATE_RIGHT_ARM.addOrReplaceChild("rightarmbend", CubeListBuilder.create().texOffs(160, 172).mirror().addBox(-1.1943F, -9.1197F, -7.7765F, 20.0F, 18.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(110, 0).mirror().addBox(-1.1943F, -12.1197F, -1.7765F, 24.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(31.9443F, -1.4717F, -0.6997F, -1.3183F, -0.0906F, 0.5721F));

		PartDefinition cube_r40 = rightarmbend.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(75, 202).mirror().addBox(0.7053F, -14.5429F, 1.6609F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.1274F, -0.2783F));

		PartDefinition cube_r41 = rightarmbend.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(241, 247).mirror().addBox(4.9553F, -22.596F, -4.7765F, 12.0F, 24.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(300, 115).mirror().addBox(16.9553F, -10.596F, 1.2235F, 6.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, -0.1274F, -0.2783F));

		PartDefinition hand2 = rightarmbend.addOrReplaceChild("hand2", CubeListBuilder.create().texOffs(201, 0).mirror().addBox(-2.1943F, -3.1197F, -6.7765F, 19.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(256, 215).mirror().addBox(-2.1943F, -5.1197F, -6.2765F, 12.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.6581F));

		PartDefinition ANIMATE_LEFT_LEG = body.addOrReplaceChild("ANIMATE_LEFT_LEG", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.5F, -2.4363F, -23.9729F, -0.0873F, 0.0F, -0.9599F));

		PartDefinition cube_r42 = ANIMATE_LEFT_LEG.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(75, 202).addBox(10.0689F, -1.1666F, -14.4249F, 18.0F, 10.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(152, 209).addBox(10.0689F, -11.1666F, -10.4249F, 20.0F, 9.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(166, 70).addBox(9.0689F, -9.1666F, -13.4249F, 22.0F, 17.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.5689F, 6.3809F, 4.9578F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone = ANIMATE_LEFT_LEG.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.5689F, 6.3809F, -0.0422F, 0.0F, -1.7017F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(293, 15).addBox(3.9501F, -7.1666F, 5.0955F, 10.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(35, 265).addBox(-9.9864F, -8.6666F, 1.8124F, 17.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, 2.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(266, 129).addBox(-16.9311F, -6.1666F, -10.4249F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(56, 150).addBox(3.0689F, -6.1666F, -10.4249F, 7.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 230).addBox(-5.9311F, -8.1666F, -12.4249F, 12.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0F, 0.0F, 4.75F, -0.9167F, 0.9305F, -1.102F));

		PartDefinition cube_r46 = bone2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(282, 301).addBox(-19.3525F, -6.1666F, 9.1025F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, 3.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r47 = bone2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(284, 252).addBox(-6.0F, -4.5F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9311F, -0.6666F, -4.4249F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r48 = bone2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(92, 262).addBox(-21.9311F, -7.1666F, -14.4249F, 5.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition ANIMATE_RIGHT_LEG = body.addOrReplaceChild("ANIMATE_RIGHT_LEG", CubeListBuilder.create(), PartPose.offsetAndRotation(14.5F, -2.4363F, -23.9729F, -0.0873F, 0.0F, 0.9599F));

		PartDefinition cube_r49 = ANIMATE_RIGHT_LEG.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(75, 202).mirror().addBox(-28.0689F, -1.1666F, -14.4249F, 18.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(152, 209).mirror().addBox(-30.0689F, -11.1666F, -10.4249F, 20.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(166, 70).mirror().addBox(-31.0689F, -9.1666F, -13.4249F, 22.0F, 17.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(28.5689F, 6.3809F, 4.9578F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone3 = ANIMATE_RIGHT_LEG.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(19.5689F, 6.3809F, -0.0422F, 0.0F, 1.7017F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(293, 15).mirror().addBox(-13.9501F, -7.1666F, 5.0955F, 10.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(35, 265).mirror().addBox(-7.0136F, -8.6666F, 1.8124F, 17.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.0F, 0.0F, 2.5F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(266, 129).mirror().addBox(5.9311F, -6.1666F, -10.4249F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 150).mirror().addBox(-10.0689F, -6.1666F, -10.4249F, 7.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 230).mirror().addBox(-6.0689F, -8.1666F, -12.4249F, 12.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(21.0F, 0.0F, 4.75F, -0.9167F, -0.9305F, 1.102F));

		PartDefinition cube_r53 = bone4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(282, 301).mirror().addBox(14.3525F, -6.1666F, 9.1025F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, 0.0F, 3.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r54 = bone4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(284, 252).mirror().addBox(-2.0F, -4.5F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9311F, -0.6666F, -4.4249F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r55 = bone4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(92, 262).mirror().addBox(16.9311F, -7.1666F, -14.4249F, 5.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -2.5165F, -23.2703F, 0.264F, 0.3396F, 1.5419F));

		PartDefinition cube_r56 = tail.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 100).addBox(-31.1605F, -6.8262F, -12.9806F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, 0.9051F, -0.5454F, -1.6044F));

		PartDefinition cube_r57 = tail.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(125, 287).addBox(-33.1605F, 3.3172F, -14.3731F, 6.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, 0.3379F, -0.5454F, -1.6044F));

		PartDefinition cube_r58 = tail.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(71, 282).mirror().addBox(-1.0F, -5.5F, -7.5F, 2.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9217F, -6.3118F, -20.7386F, 0.7113F, 0.1528F, -1.4723F));

		PartDefinition cube_r59 = tail.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(71, 281).addBox(-36.2299F, 2.7718F, -1.8262F, 2.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, 0.7209F, -0.5418F, -1.5833F));

		PartDefinition cube_r60 = tail.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(71, 281).mirror().addBox(-1.0F, -4.0F, -5.5F, 2.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7129F, -16.7582F, -38.8393F, 0.239F, -0.5764F, -1.4424F));

		PartDefinition cube_r61 = tail.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(71, 281).addBox(-39.9407F, -4.9345F, -6.6109F, 2.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, 0.9477F, -0.9383F, -2.2287F));

		PartDefinition cube_r62 = tail.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(155, 131).addBox(14.3822F, 47.2715F, -59.6495F, 5.0F, 7.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, -1.5016F, -0.2593F, 0.022F));

		PartDefinition cube_r63 = tail.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(204, 26).addBox(12.3822F, 38.8411F, -37.685F, 8.0F, 10.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, -1.2834F, -0.2593F, 0.022F));

		PartDefinition cube_r64 = tail.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(101, 23).addBox(10.3822F, 26.8362F, -32.9021F, 12.0F, 13.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, -0.8471F, -0.2593F, 0.022F));

		PartDefinition cube_r65 = tail.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(159, 0).addBox(6.3822F, 19.1004F, -14.0218F, 7.0F, 22.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(75, 74).addBox(7.3822F, 19.6004F, -13.0218F, 19.0F, 21.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, 0.0256F, -0.2593F, 0.022F));

		PartDefinition cube_r66 = tail.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 150).addBox(8.3822F, 23.222F, -10.3222F, 16.0F, 17.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5702F, -28.7444F, -12.2288F, -0.5853F, -0.2593F, 0.022F));

		return LayerDefinition.create(meshdefinition, 336, 336);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}