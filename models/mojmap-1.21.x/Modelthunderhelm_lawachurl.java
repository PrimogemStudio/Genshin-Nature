// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelthunderhelm_lawachurl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "thunderhelm_lawachurl"), "main");
	private final ModelPart CABEZA;
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart BRAZO_LEFT;
	private final ModelPart left_hand2;
	private final ModelPart lower_left_hand;
	private final ModelPart BRAZO_RIGHT;
	private final ModelPart right_hand2;
	private final ModelPart lower_right_hand;
	private final ModelPart LEG_LEFT;
	private final ModelPart left_leg2;
	private final ModelPart lower_left_leg;
	private final ModelPart LEG_RIGHT;
	private final ModelPart right_leg2;
	private final ModelPart lower_right_Leg;

	public Modelthunderhelm_lawachurl(ModelPart root) {
		this.CABEZA = root.getChild("CABEZA");
		this.body = root.getChild("body");
		this.legs = this.body.getChild("legs");
		this.BRAZO_LEFT = root.getChild("BRAZO_LEFT");
		this.left_hand2 = this.BRAZO_LEFT.getChild("left_hand2");
		this.lower_left_hand = this.left_hand2.getChild("lower_left_hand");
		this.BRAZO_RIGHT = root.getChild("BRAZO_RIGHT");
		this.right_hand2 = this.BRAZO_RIGHT.getChild("right_hand2");
		this.lower_right_hand = this.right_hand2.getChild("lower_right_hand");
		this.LEG_LEFT = root.getChild("LEG_LEFT");
		this.left_leg2 = this.LEG_LEFT.getChild("left_leg2");
		this.lower_left_leg = this.left_leg2.getChild("lower_left_leg");
		this.LEG_RIGHT = root.getChild("LEG_RIGHT");
		this.right_leg2 = this.LEG_RIGHT.getChild("right_leg2");
		this.lower_right_Leg = this.right_leg2.getChild("lower_right_Leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition CABEZA = partdefinition.addOrReplaceChild("CABEZA", CubeListBuilder.create().texOffs(54, 58).addBox(-3.025F, -4.3653F, -13.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 48).addBox(-4.0F, -2.2102F, -13.85F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 11).addBox(-1.0F, -0.2102F, -13.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 15).addBox(-1.0F, 7.5398F, -13.6F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(93, 51).addBox(-3.0F, -6.2102F, -13.85F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 38).addBox(-5.0F, -11.2102F, -13.85F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 13).addBox(-1.0F, -13.2102F, -13.85F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(138, 66).addBox(-5.75F, -13.0F, -11.0F, 12.0F, 13.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-15.75F, -13.0F, -5.0F, 32.0F, 13.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(106, 48).addBox(-8.75F, -22.0F, 0.5F, 18.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 113).addBox(-12.75F, -8.8592F, -10.8438F, 25.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -56.2898F, 4.6F));

		PartDefinition cube_r1 = CABEZA.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 148).mirror().addBox(-21.0F, -16.5F, -2.5F, 20.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = CABEZA.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(110, 148).addBox(1.0F, -16.5F, -2.5F, 20.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = CABEZA.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(110, 158).mirror().addBox(-5.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.4497F, -11.3112F, 13.5493F, -1.9989F, 0.3369F, 0.4327F));

		PartDefinition cube_r4 = CABEZA.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(110, 158).addBox(-8.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4497F, -11.3112F, 13.5493F, -1.9989F, -0.3369F, -0.4327F));

		PartDefinition cube_r5 = CABEZA.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(110, 158).addBox(-8.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4497F, -16.3112F, 9.5493F, -1.301F, 0.0461F, -0.54F));

		PartDefinition cube_r6 = CABEZA.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 167).addBox(-15.5F, -6.0F, -12.75F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4497F, -16.3112F, 9.5493F, -1.1942F, 0.0653F, -1.4751F));

		PartDefinition cube_r7 = CABEZA.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(66, 167).mirror().addBox(3.5F, -6.0F, -13.0F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.4497F, -16.3112F, 9.5493F, -1.1942F, -0.0653F, 1.4751F));

		PartDefinition cube_r8 = CABEZA.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(110, 158).mirror().addBox(-5.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.4497F, -16.3112F, 9.5493F, -1.301F, -0.0461F, 0.54F));

		PartDefinition cube_r9 = CABEZA.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 140).mirror().addBox(-3.0F, -17.0F, 1.5F, 17.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -14.0F, -11.0F, -0.6028F, -0.0461F, 0.54F));

		PartDefinition cube_r10 = CABEZA.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(42, 140).addBox(-15.0F, -17.0F, 1.5F, 17.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.6028F, 0.0461F, -0.54F));

		PartDefinition cube_r11 = CABEZA.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(140, 182).addBox(-6.0F, -10.0F, 0.5F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r12 = CABEZA.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(82, 0).addBox(-0.75F, -30.0F, 2.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 148).mirror().addBox(-1.25F, -27.0F, 0.5F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.0906F, 0.0902F, -0.7974F));

		PartDefinition cube_r13 = CABEZA.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(174, 65).addBox(-6.25F, -29.0F, 2.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 148).addBox(-6.75F, -23.0F, 0.5F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.1049F, -0.0731F, 0.9717F));

		PartDefinition cube_r14 = CABEZA.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(178, 44).addBox(-6.25F, -26.0F, -10.0F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(160, 10).addBox(-6.75F, -22.0F, -11.5F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.9145F, 0.0665F, 0.1615F));

		PartDefinition cube_r15 = CABEZA.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(174, 65).addBox(-6.25F, -35.0F, -5.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 148).addBox(-6.75F, -29.0F, -6.5F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.3873F, 0.0665F, 0.1615F));

		PartDefinition cube_r16 = CABEZA.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 146).addBox(-7.0826F, -11.0F, -3.6082F, 13.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7925F, 0.0F, 0.0F));

		PartDefinition cube_r17 = CABEZA.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(150, 148).mirror().addBox(-15.2151F, -8.0F, -3.8571F, 13.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7898F, -0.123F, -0.045F));

		PartDefinition cube_r18 = CABEZA.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(150, 148).addBox(2.797F, -8.0F, -3.9008F, 13.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7898F, 0.123F, 0.045F));

		PartDefinition cube_r19 = CABEZA.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(34, 157).addBox(2.797F, -6.0F, -3.9008F, 13.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5267F, 0.1071F, 0.0754F));

		PartDefinition cube_r20 = CABEZA.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(148, 100).addBox(-7.0826F, -9.0F, -3.6082F, 13.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5307F, 0.0F, 0.0F));

		PartDefinition cube_r21 = CABEZA.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 157).mirror().addBox(-15.2151F, -6.0F, -3.8571F, 13.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5267F, -0.1071F, -0.0754F));

		PartDefinition cube_r22 = CABEZA.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 182).addBox(-6.25F, -8.0F, -21.0F, 13.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 182).addBox(-6.25F, -14.0F, -17.0F, 13.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r23 = CABEZA.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(180, 115).mirror().addBox(-12.25F, -11.0F, -17.0F, 13.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -2.2211F, -0.0795F, -0.1041F));

		PartDefinition cube_r24 = CABEZA.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(180, 115).addBox(-0.5F, -11.0F, -17.0F, 13.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -2.2211F, 0.0795F, 0.1041F));

		PartDefinition cube_r25 = CABEZA.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(62, 38).addBox(-1.25F, -1.0F, -0.26F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.25F, -5.5F, -10.75F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r26 = CABEZA.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-1.75F, -1.0F, -0.26F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.25F, -5.5F, -10.75F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r11_r1 = CABEZA.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(92, 10).mirror().addBox(-1.75F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.25F, -12.2102F, -13.35F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r10_r1 = CABEZA.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(92, 10).addBox(-2.25F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.25F, -12.2102F, -13.35F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r11_r2 = CABEZA.addOrReplaceChild("cube_r11_r2", CubeListBuilder.create().texOffs(82, 10).mirror().addBox(-1.3152F, -6.2794F, -9.5781F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4744F, -11.6719F, -19.9092F, 0.6901F, -0.3794F, 2.7564F));

		PartDefinition cube_r10_r2 = CABEZA.addOrReplaceChild("cube_r10_r2", CubeListBuilder.create().texOffs(100, 23).mirror().addBox(-1.3156F, -4.2794F, -6.0781F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4744F, -11.6719F, -19.9092F, 0.1665F, -0.3794F, 2.7564F));

		PartDefinition cube_r9_r1 = CABEZA.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.3152F, -0.0294F, -4.8281F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4744F, -11.6719F, -19.9092F, -0.968F, -0.3794F, 2.7564F));

		PartDefinition cube_r8_r1 = CABEZA.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(183, 3).mirror().addBox(-2.0639F, 0.4848F, -1.2216F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4744F, -11.6719F, -19.9092F, -0.1797F, -0.3365F, 2.748F));

		PartDefinition cube_r7_r1 = CABEZA.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(182, 144).mirror().addBox(-2.4639F, 1.4625F, 0.4073F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.4744F, -11.6719F, -19.9092F, 0.693F, -0.3365F, 2.748F));

		PartDefinition cube_r10_r3 = CABEZA.addOrReplaceChild("cube_r10_r3", CubeListBuilder.create().texOffs(82, 10).addBox(-0.6848F, -6.2794F, -9.5781F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4744F, -11.6719F, -19.9092F, 0.6901F, 0.3794F, -2.7564F));

		PartDefinition cube_r9_r2 = CABEZA.addOrReplaceChild("cube_r9_r2", CubeListBuilder.create().texOffs(100, 23).addBox(-0.6848F, -4.2794F, -6.0781F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4744F, -11.6719F, -19.9092F, 0.1665F, 0.3794F, -2.7564F));

		PartDefinition cube_r8_r2 = CABEZA.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.6848F, -0.0294F, -4.8281F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4744F, -11.6719F, -19.9092F, -0.968F, 0.3794F, -2.7564F));

		PartDefinition cube_r7_r2 = CABEZA.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(183, 3).addBox(-1.9361F, 0.4848F, -1.2216F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4744F, -11.6719F, -19.9092F, -0.1797F, 0.3365F, -2.748F));

		PartDefinition cube_r6_r1 = CABEZA.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(182, 144).addBox(-2.5361F, 1.4625F, 0.4073F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.4744F, -11.6719F, -19.9092F, 0.693F, 0.3365F, -2.748F));

		PartDefinition cube_r4_r1 = CABEZA.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-2.5F, -7.0F, 0.25F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8324F, -7.7471F, -13.1F, 0.0F, 0.3491F, -0.3927F));

		PartDefinition cube_r9_r3 = CABEZA.addOrReplaceChild("cube_r9_r3", CubeListBuilder.create().texOffs(95, 97).addBox(-1.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6266F, -6.0985F, -13.1F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r8_r3 = CABEZA.addOrReplaceChild("cube_r8_r3", CubeListBuilder.create().texOffs(100, 10).addBox(-1.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.6266F, -6.0985F, -13.1F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r3_r1 = CABEZA.addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(54, 48).addBox(-2.5F, -7.0F, 0.25F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8324F, -7.7471F, -13.1F, 0.0F, -0.3491F, 0.3927F));

		PartDefinition cube_r6_r2 = CABEZA.addOrReplaceChild("cube_r6_r2", CubeListBuilder.create().texOffs(0, 85).addBox(-1.75F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0675F, -4.4641F, -10.85F, -0.0285F, 0.1278F, -0.9181F));

		PartDefinition cube_r5_r1 = CABEZA.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(113, 66).addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8611F, -3.4333F, -11.1F, 0.1882F, -0.4896F, -0.4453F));

		PartDefinition cube_r7_r3 = CABEZA.addOrReplaceChild("cube_r7_r3", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(-2.25F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0675F, -4.4641F, -10.85F, -0.0285F, -0.1278F, 0.9181F));

		PartDefinition cube_r6_r3 = CABEZA.addOrReplaceChild("cube_r6_r3", CubeListBuilder.create().texOffs(113, 66).mirror().addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8611F, -3.4333F, -11.1F, 0.1882F, 0.4896F, 0.4453F));

		PartDefinition cube_r27 = CABEZA.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 41).addBox(-4.2744F, -4.2598F, 0.0101F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.1651F, -13.6574F, 0.0F, 0.0F, -1.6778F));

		PartDefinition cube_r28 = CABEZA.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(2.7091F, -2.9045F, 0.0014F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -1.9832F));

		PartDefinition cube_r29 = CABEZA.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-2.7256F, -4.2599F, 0.0099F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.1651F, -13.6574F, 0.0F, 0.0F, 1.6778F));

		PartDefinition cube_r30 = CABEZA.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.7091F, -2.9045F, 0.0014F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 1.9832F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 31).addBox(-10.3173F, -27.7602F, -7.88F, 13.0F, 30.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(140, 166).addBox(-2.7573F, -23.5202F, -9.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 93).addBox(-3.1573F, -8.4802F, -8.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 88).addBox(-9.8773F, -8.4802F, -8.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 80).addBox(-3.1573F, -3.0202F, -8.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(-9.8773F, -3.0202F, -8.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 166).addBox(-17.8773F, -23.5202F, -9.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(131, 132).addBox(-0.0348F, -1.8462F, -6.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 132).addBox(-16.7999F, -1.8462F, -6.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0373F, -28.2898F, 6.6F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(50, 86).addBox(0.18F, -10.3F, -5.46F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(93, 56).mirror().addBox(5.92F, 6.2F, 10.54F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 11).mirror().addBox(5.42F, 5.7F, 7.54F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -17.0F, -2.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(93, 56).addBox(-8.92F, 6.2F, 10.54F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 11).addBox(-9.42F, 5.7F, 7.54F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 48).addBox(-12.42F, -10.3F, -5.46F, 13.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0747F, -17.0F, -2.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(37, 75).addBox(-2.78F, -0.2997F, -6.5F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(54, 31).addBox(-12.78F, 0.7003F, -6.25F, 26.0F, 3.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(121, 124).addBox(-12.78F, -2.2997F, 7.73F, 26.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(40, 17).mirror().addBox(-12.7F, -1.2997F, -6.25F, 0.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(40, 17).addBox(13.2F, -1.2997F, -6.25F, 0.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(114, 23).addBox(-1.78F, 4.7003F, -6.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(200, 93).addBox(-1.28F, 1.9503F, -6.54F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 5).addBox(-0.78F, 7.2003F, -6.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0373F, 2.7035F, -0.96F));

		PartDefinition cube_r33 = legs.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(140, 182).addBox(-6.0F, -52.0F, 20.0F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -44.7035F, -12.04F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r34 = legs.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(196, 185).addBox(9.0F, -6.0F, 14.25F, 6.0F, 23.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(164, 199).addBox(9.0F, 1.0F, 1.25F, 6.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 75).addBox(-3.0F, -7.0F, 1.25F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6342F, 5.2787F, -7.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r35 = legs.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(87, 86).mirror().addBox(4.25F, -7.0F, 0.86F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2984F, 5.6219F, 5.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r36 = legs.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(170, 26).mirror().addBox(4.25F, -14.0F, -7.14F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r37 = legs.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(2.75F, -6.5F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(11, 0).mirror().addBox(-0.75F, 0.0F, 0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r38 = legs.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(11, 4).mirror().addBox(4.25F, -7.0F, 0.86F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r39 = legs.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-2.25F, -4.5F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r40 = legs.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(-0.75F, -2.5F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r41 = legs.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(11, 0).mirror().addBox(4.0F, -1.25F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.2984F, 5.6219F, 5.0F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r42 = legs.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(11, 0).addBox(-6.0F, -1.25F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2984F, 5.6219F, 5.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r43 = legs.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 86).addBox(-6.25F, -7.0F, 0.86F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2984F, 5.6219F, 5.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r44 = legs.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(11, 4).addBox(-6.25F, -7.0F, 0.86F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r45 = legs.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(170, 26).addBox(-6.25F, -14.0F, -7.64F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5484F, 5.6219F, -7.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r46 = legs.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(11, 0).addBox(-4.75F, -6.5F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 0).addBox(-1.25F, 0.0F, 0.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r47 = legs.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(11, 0).addBox(0.25F, -4.5F, 0.86F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r48 = legs.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(11, 0).addBox(-1.25F, -2.5F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition BRAZO_LEFT = partdefinition.addOrReplaceChild("BRAZO_LEFT", CubeListBuilder.create().texOffs(100, 0).addBox(-4.2695F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.3069F, -48.1449F, 4.6F, 0.0F, -0.1745F, 1.5272F));

		PartDefinition left_hand2 = BRAZO_LEFT.addOrReplaceChild("left_hand2", CubeListBuilder.create().texOffs(93, 73).addBox(0.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(37, 124).addBox(16.1769F, -6.3949F, -6.5F, 7.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5536F, 0.0F, 1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r49 = left_hand2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(37, 82).addBox(-16.5F, -2.25F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(146, 0).addBox(-10.5F, -2.25F, -3.5F, 15.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition lower_left_hand = left_hand2.addOrReplaceChild("lower_left_hand", CubeListBuilder.create().texOffs(120, 23).addBox(0.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.1769F, -1.1449F, -1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition BRAZO_RIGHT = partdefinition.addOrReplaceChild("BRAZO_RIGHT", CubeListBuilder.create().texOffs(100, 0).mirror().addBox(-12.7305F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.3069F, -48.1449F, 4.6F, 0.0F, 0.1745F, -1.5272F));

		PartDefinition right_hand2 = BRAZO_RIGHT.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-16.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(37, 124).mirror().addBox(-23.1769F, -7.1449F, -6.5F, 7.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.5536F, 0.0F, 1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r50 = right_hand2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(146, 0).mirror().addBox(-4.5F, -2.25F, -3.5F, 15.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(37, 82).mirror().addBox(10.5F, -2.25F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition lower_right_hand = right_hand2.addOrReplaceChild("lower_right_hand", CubeListBuilder.create().texOffs(120, 23).mirror().addBox(-15.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.1769F, -1.1449F, -1.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition LEG_LEFT = partdefinition.addOrReplaceChild("LEG_LEFT", CubeListBuilder.create().texOffs(89, 124).addBox(-5.5F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(100, 97).addBox(-6.2626F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5126F, -22.085F, 5.8085F));

		PartDefinition left_leg2 = LEG_LEFT.addOrReplaceChild("left_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition cube_r51 = left_leg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(167, 126).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r52 = left_leg2.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(168, 79).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r53 = left_leg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(92, 169).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition cube_r54 = left_leg2.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(170, 166).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition cube_r55 = left_leg2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 173).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));

		PartDefinition cube_r56 = left_leg2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(116, 175).addBox(-3.25F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));

		PartDefinition cube_r57 = left_leg2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(178, 26).addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r58 = left_leg2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(180, 97).addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lower_left_leg = left_leg2.addOrReplaceChild("lower_left_leg", CubeListBuilder.create().texOffs(139, 85).addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(107, 51).addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(100, 97).addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(100, 103).addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(103, 0).addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(107, 26).addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(106, 66).addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(160, 54).addBox(-4.0F, -3.0509F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r59 = lower_left_leg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(87, 95).addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(117, 27).addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r60 = lower_left_leg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(114, 69).addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));

		PartDefinition LEG_RIGHT = partdefinition.addOrReplaceChild("LEG_RIGHT", CubeListBuilder.create().texOffs(89, 124).mirror().addBox(-12.2752F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(100, 97).mirror().addBox(-12.5126F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5126F, -22.085F, 5.8085F));

		PartDefinition right_leg2 = LEG_RIGHT.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(160, 54).mirror().addBox(-4.0F, 18.9491F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.7752F, 23.0F, 0.0F));

		PartDefinition cube_r61 = right_leg2.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(167, 126).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r62 = right_leg2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(168, 79).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r63 = right_leg2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(92, 169).mirror().addBox(-2.5F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));

		PartDefinition cube_r64 = right_leg2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(170, 166).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));

		PartDefinition cube_r65 = right_leg2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(30, 173).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));

		PartDefinition cube_r66 = right_leg2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(116, 175).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition cube_r67 = right_leg2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(178, 26).mirror().addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r68 = right_leg2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(180, 97).mirror().addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lower_right_Leg = right_leg2.addOrReplaceChild("lower_right_Leg", CubeListBuilder.create().texOffs(139, 85).mirror().addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(107, 51).mirror().addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(100, 97).mirror().addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(103, 0).mirror().addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(100, 103).mirror().addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(107, 26).mirror().addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(106, 66).mirror().addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r69 = lower_right_Leg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(87, 95).mirror().addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(117, 27).mirror().addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r70 = lower_right_Leg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(114, 69).mirror().addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 208, 208);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		CABEZA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BRAZO_LEFT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BRAZO_RIGHT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LEG_LEFT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LEG_RIGHT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}