// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelrimebiter_bathysmal_vishap_hatchling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "rimebiter_bathysmal_vishap_hatchling"), "main");
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart BRAZO_RIGHT;
	private final ModelPart right_hand2;
	private final ModelPart lower_right;
	private final ModelPart BRAZO_LEFT;
	private final ModelPart left_hand4;
	private final ModelPart lower_left;
	private final ModelPart CABEZA;
	private final ModelPart jaw;
	private final ModelPart LEG_LEFT;
	private final ModelPart left_leg5;
	private final ModelPart lower3;
	private final ModelPart LEG_RIGHT;
	private final ModelPart right_leg4;
	private final ModelPart lower2;

	public Modelrimebiter_bathysmal_vishap_hatchling(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.BRAZO_RIGHT = this.body.getChild("BRAZO_RIGHT");
		this.right_hand2 = this.BRAZO_RIGHT.getChild("right_hand2");
		this.lower_right = this.right_hand2.getChild("lower_right");
		this.BRAZO_LEFT = this.body.getChild("BRAZO_LEFT");
		this.left_hand4 = this.BRAZO_LEFT.getChild("left_hand4");
		this.lower_left = this.left_hand4.getChild("lower_left");
		this.CABEZA = this.body.getChild("CABEZA");
		this.jaw = this.CABEZA.getChild("jaw");
		this.LEG_LEFT = this.body.getChild("LEG_LEFT");
		this.left_leg5 = this.LEG_LEFT.getChild("left_leg5");
		this.lower3 = this.left_leg5.getChild("lower3");
		this.LEG_RIGHT = this.body.getChild("LEG_RIGHT");
		this.right_leg4 = this.LEG_RIGHT.getChild("right_leg4");
		this.lower2 = this.right_leg4.getChild("lower2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(99, 109).addBox(-1.5F, -3.5F, -15.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 96).addBox(-3.5F, -3.5F, -11.0F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-5.5F, -4.5F, -7.0F, 11.0F, 9.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 85).addBox(-3.5F, -3.75F, 15.5F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(62, 103).addBox(-4.25F, 4.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(100, 46).addBox(0.25F, 4.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(91, 67).addBox(-4.0F, -7.2F, 1.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.75F, -22.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 92).addBox(-3.5F, -8.25F, 4.75F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 0).addBox(-3.99F, -7.5F, -5.75F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 15).addBox(0.25F, 5.25F, -5.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(79, 67).addBox(-4.25F, 5.25F, -5.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(37, 56).addBox(-4.0F, -8.0F, 8.5F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 5).addBox(-1.0F, -9.75F, 10.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(2.5F, -9.0F, 3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 22.0F, 1.4707F, 0.3166F, 0.6044F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(0.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 22.0F, 1.3967F, 0.1321F, 0.6429F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(2.5F, -9.0F, 3.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 13.0F, 1.4707F, 0.3166F, 0.6044F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 100).mirror().addBox(0.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.0F, 13.0F, 1.3967F, 0.1321F, 0.6429F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(2.75F, -8.25F, 4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.25F, 6.75F, 1.5841F, 0.4526F, 0.79F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(0.25F, -11.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -2.25F, 6.75F, 1.3967F, 0.1321F, 0.6429F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 20).mirror().addBox(0.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3967F, 0.1321F, 0.6429F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-2.75F, -8.25F, 4.5F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.25F, 6.75F, 1.5841F, -0.4526F, -0.79F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 28).addBox(-1.25F, -11.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.25F, 6.75F, 1.3967F, -0.1321F, -0.6429F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(33, 0).addBox(-2.5F, -9.0F, 3.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 22.0F, 1.4707F, -0.3166F, -0.6044F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 0).addBox(-1.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 22.0F, 1.3967F, -0.1321F, -0.6429F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 100).addBox(-1.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 13.0F, 1.3967F, -0.1321F, -0.6429F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 100).addBox(-2.5F, -9.0F, 3.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 13.0F, 1.4707F, -0.3166F, -0.6044F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(32, 101).mirror().addBox(6.75F, -7.75F, 1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.104F, 0.5758F, 0.175F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 101).addBox(-6.75F, -7.75F, 1.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.104F, -0.5758F, -0.175F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(102, 20).addBox(-1.25F, -10.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3967F, -0.1321F, -0.6429F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(100, 55).addBox(-1.0F, -6.75F, -10.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, -4.75F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(114, 92).addBox(-1.0F, -11.0F, -10.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, -4.75F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(32, 115).addBox(-1.0F, -6.75F, -10.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.25F, -1.8326F, 0.0F, 0.0F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(109, 114).addBox(-1.0F, -11.0F, -10.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -11.25F, -1.309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(101, 0).addBox(-1.0F, -6.75F, 15.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 44).addBox(-1.5F, -7.75F, 3.5F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(54, 40).addBox(-1.5F, -11.5F, 3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(94, 46).addBox(-1.0F, -1.25F, 14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(93, 6).addBox(-1.5F, -2.25F, 6.0F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(74, 115).addBox(-1.0F, -11.0F, 5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(59, 112).addBox(-1.0F, -4.25F, 13.25F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(75, 18).addBox(-1.0F, -0.75F, 20.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(98, 85).addBox(-1.5F, -1.25F, 13.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(108, 35).addBox(-1.5F, 2.25F, 9.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(114, 72).addBox(-1.0F, -6.75F, 5.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 5.25F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(112, 104).addBox(-1.0F, -11.0F, 5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 5.25F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 115).addBox(-1.0F, -6.75F, 5.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.8326F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(51, 77).addBox(-3.0F, -4.25F, -0.5F, 6.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(109, 55).addBox(-2.5F, -3.75F, -2.5F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-2.5F, -3.75F, 6.5F, 5.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(113, 65).addBox(-1.0F, -5.25F, 9.75F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 21.0F, -0.641F, 0.351F, 0.222F));

		PartDefinition cube_r33 = tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 35).addBox(-1.49F, 54.0F, 37.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.99F, 53.0F, 17.0F, 6.0F, 7.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(78, 77).addBox(-1.99F, 54.0F, 9.0F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 20).addBox(-4.01F, 54.0F, -14.0F, 3.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 2.1749F, -0.0546F, 0.3838F));

		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(84, 52).addBox(2.01F, 54.0F, -14.0F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 2.1764F, 0.0298F, -0.3478F));

		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(33, 0).addBox(-10.24F, 50.5F, 31.5F, 5.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 1.3576F, 0.0469F, 0.2132F));

		PartDefinition cube_r37 = tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(81, 31).addBox(-2.0F, 43.25F, 26.25F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 14).addBox(-2.0F, 9.75F, 37.5F, 4.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, 1.75F, 27.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(10, 0).mirror().addBox(2.5F, 4.75F, 20.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(10, 0).addBox(-3.5F, 4.75F, 20.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(78, 105).addBox(-1.5F, 4.75F, 20.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition BRAZO_RIGHT = body.addOrReplaceChild("BRAZO_RIGHT", CubeListBuilder.create().texOffs(40, 74).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(99, 35).addBox(-1.25F, -0.25F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 100).addBox(-7.5F, 0.0F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(65, 93).addBox(-6.5F, -0.25F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 77).addBox(-8.0F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, -4.0F, 0.2158F, 0.9787F, -0.7648F));

		PartDefinition cube_r41 = BRAZO_RIGHT.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(39, 56).addBox(-7.25F, -2.75F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.75F, -1.75F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 3.0F, 4.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r42 = BRAZO_RIGHT.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 100).addBox(-6.25F, 2.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 3.0F, 4.0F, -0.172F, 0.0429F, 1.0663F));

		PartDefinition right_hand2 = BRAZO_RIGHT.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(112, 84).addBox(-2.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(108, 0).addBox(-7.5F, -2.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-9.5F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 2.0F, 0.0F, 1.5708F, -1.1345F, -0.4363F));

		PartDefinition cube_r43 = right_hand2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 70).addBox(-13.0F, 4.25F, 13.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 56).addBox(-18.0F, 3.75F, 13.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 1.0F, 4.0F, -0.1762F, -0.7597F, 0.4004F));

		PartDefinition lower_right = right_hand2.addOrReplaceChild("lower_right", CubeListBuilder.create().texOffs(17, 109).addBox(-1.5F, -4.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -1.0F, 0.0F, -0.1145F, -0.4101F, -0.0522F));

		PartDefinition BRAZO_LEFT = body.addOrReplaceChild("BRAZO_LEFT", CubeListBuilder.create().texOffs(40, 74).mirror().addBox(-1.5F, -1.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(99, 35).mirror().addBox(-1.75F, -0.25F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 100).mirror().addBox(1.5F, 0.0F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(65, 93).mirror().addBox(2.5F, -0.25F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(96, 77).mirror().addBox(2.0F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, -3.0F, -4.0F, 0.2158F, -0.9787F, 0.7648F));

		PartDefinition cube_r44 = BRAZO_LEFT.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(39, 56).mirror().addBox(6.25F, -2.75F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(5.75F, -1.75F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 3.0F, 4.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r45 = BRAZO_LEFT.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 100).mirror().addBox(5.25F, 2.5F, -5.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.0F, 3.0F, 4.0F, -0.172F, -0.0429F, -1.0663F));

		PartDefinition left_hand4 = BRAZO_LEFT.addOrReplaceChild("left_hand4", CubeListBuilder.create().texOffs(112, 84).mirror().addBox(-0.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(108, 0).mirror().addBox(2.5F, -2.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 49).mirror().addBox(7.5F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 2.0F, 0.0F, 1.5708F, 1.1345F, 0.4363F));

		PartDefinition cube_r46 = left_hand4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 70).mirror().addBox(11.0F, 4.25F, 13.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 56).mirror().addBox(13.0F, 3.75F, 13.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.0F, 1.0F, 4.0F, -0.1762F, 0.7597F, -0.4004F));

		PartDefinition lower_left = left_hand4.addOrReplaceChild("lower_left", CubeListBuilder.create().texOffs(17, 109).mirror().addBox(-0.5F, -4.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.0F, -1.0F, 0.0F, -0.1145F, 0.4101F, 0.0522F));

		PartDefinition CABEZA = body.addOrReplaceChild("CABEZA", CubeListBuilder.create().texOffs(58, 62).addBox(-2.0F, -1.5F, -13.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(41, 20).addBox(-0.5F, -2.0F, -13.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(20, 74).addBox(-1.99F, 0.5F, -12.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r47 = CABEZA.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(75, 30).addBox(-1.01F, -4.4F, -3.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -11.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = CABEZA.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(109, 12).mirror().addBox(-5.01F, -6.25F, 7.25F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.0F, -11.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r49 = CABEZA.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(109, 12).addBox(5.01F, -6.25F, 7.25F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -11.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r50 = CABEZA.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(54, 40).addBox(0.5F, -7.0F, 7.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(0.0F, -5.0F, 7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r51 = CABEZA.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(33, 0).addBox(0.6F, -11.25F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r52 = CABEZA.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(118, 50).mirror().addBox(4.0F, -6.03F, 6.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0109F, -0.5675F, 0.0012F));

		PartDefinition cube_r53 = CABEZA.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(12, 15).mirror().addBox(4.5F, -5.03F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, -0.0885F, -0.6497F, 0.1672F));

		PartDefinition cube_r54 = CABEZA.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 70).mirror().addBox(7.5F, -1.78F, 5.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.267F, -0.6055F, -0.4264F));

		PartDefinition cube_r55 = CABEZA.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(68, 49).mirror().addBox(7.25F, -0.78F, 6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.3232F, -0.58F, -0.5271F));

		PartDefinition cube_r56 = CABEZA.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(9.75F, -1.86F, 5.24F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.3498F, -0.5656F, -0.5761F));

		PartDefinition cube_r57 = CABEZA.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(6.4F, -6.2F, 7.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, -0.0565F, -0.4336F, 0.1495F));

		PartDefinition cube_r58 = CABEZA.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(38, 61).mirror().addBox(6.75F, -5.28F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(62, 61).mirror().addBox(6.25F, -6.28F, 5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0116F, -0.6548F, 0.0025F));

		PartDefinition cube_r59 = CABEZA.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(6.25F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0622F, -0.9586F, -0.076F));

		PartDefinition cube_r60 = CABEZA.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(32, 70).addBox(-7.4F, -6.2F, 7.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.0565F, 0.4336F, -0.1495F));

		PartDefinition cube_r61 = CABEZA.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(68, 49).addBox(-9.25F, -0.78F, 6.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.3232F, 0.58F, 0.5271F));

		PartDefinition cube_r62 = CABEZA.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(12, 15).addBox(-6.5F, -5.03F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.0885F, 0.6497F, -0.1672F));

		PartDefinition cube_r63 = CABEZA.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 70).addBox(-8.5F, -1.78F, 5.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.267F, 0.6055F, 0.4264F));

		PartDefinition cube_r64 = CABEZA.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 7).addBox(-7.0F, -5.03F, 5.45F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.1437F, 0.6412F, 0.2159F));

		PartDefinition cube_r65 = CABEZA.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(118, 50).addBox(-6.0F, -6.03F, 6.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0109F, 0.5675F, -0.0012F));

		PartDefinition cube_r66 = CABEZA.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 52).mirror().addBox(5.0F, -5.78F, 5.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0116F, -0.6548F, 0.0F));

		PartDefinition cube_r67 = CABEZA.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(68, 52).addBox(-7.0F, -5.78F, 5.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0116F, 0.6548F, 0.0F));

		PartDefinition cube_r68 = CABEZA.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(38, 61).addBox(-8.75F, -5.28F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 61).addBox(-8.25F, -6.28F, 5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0116F, 0.6548F, -0.0025F));

		PartDefinition cube_r69 = CABEZA.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 73).addBox(-10.75F, -1.86F, 5.24F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.3498F, 0.5656F, 0.5761F));

		PartDefinition cube_r70 = CABEZA.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 46).addBox(-1.01F, -6.7F, -2.6F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r71 = CABEZA.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(76, 14).addBox(-8.25F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0622F, 0.9586F, 0.076F));

		PartDefinition cube_r72 = CABEZA.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(67, 40).addBox(-1.01F, -6.6F, -4.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r73 = CABEZA.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(-2.75F, -5.75F, 8.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(34, 30).mirror().addBox(-2.75F, -5.75F, 8.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.0F, -11.0F, 0.2214F, 0.348F, 0.01F));

		PartDefinition cube_r74 = CABEZA.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(117, 10).mirror().addBox(-1.0F, -1.0F, 13.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.0F, -11.0F, 0.5495F, 0.2371F, -0.0625F));

		PartDefinition cube_r75 = CABEZA.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(117, 10).addBox(0.0F, -1.0F, 13.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, -11.0F, 0.5495F, -0.2371F, 0.0625F));

		PartDefinition cube_r76 = CABEZA.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(34, 30).addBox(1.75F, -5.75F, 8.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, -11.0F, 0.2214F, -0.348F, -0.01F));

		PartDefinition cube_r77 = CABEZA.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(10, 6).addBox(0.0F, 8.75F, 12.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r78 = CABEZA.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, 9.5F, 8.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r79 = CABEZA.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(71, 77).addBox(-0.5F, -4.25F, 8.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = CABEZA.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(44, 87).addBox(-1.75F, -1.4052F, -0.1342F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(7, 28).addBox(-1.25F, -1.4052F, -1.1342F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(1.25F, -1.4052F, -1.1342F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 116).addBox(-0.5F, 0.6448F, -4.5842F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(69, 112).addBox(-0.5F, 0.3948F, -2.0842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(116, 45).addBox(-1.25F, 0.6548F, -1.5842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 115).addBox(0.25F, 0.6548F, -1.5842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(78, 103).addBox(-1.0F, -1.4152F, 0.8558F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 49).addBox(0.75F, -1.4052F, -0.1342F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -3.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r80 = jaw.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 20).addBox(0.7497F, -3.4052F, -3.8474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r81 = jaw.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(63, 20).addBox(-3.4908F, -3.3652F, -3.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r82 = jaw.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(63, 26).addBox(2.4908F, -3.3652F, -3.0534F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r83 = jaw.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(56, 26).addBox(-1.7497F, -3.4052F, -3.8474F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition LEG_LEFT = body.addOrReplaceChild("LEG_LEFT", CubeListBuilder.create().texOffs(25, 87).mirror().addBox(0.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 17.0F, 0.0F, 0.5672F, 1.0908F));

		PartDefinition cube_r84 = LEG_LEFT.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(99, 25).mirror().addBox(-0.75F, 0.5F, 11.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -14.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition left_leg5 = LEG_LEFT.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(94, 98).mirror().addBox(0.0F, -2.5F, -2.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(81, 51).mirror().addBox(0.75F, -1.5F, 2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(41, 28).mirror().addBox(0.25F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(86, 0).mirror().addBox(6.0F, -2.0F, -1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 0.0F, -1.0F, 0.0F, -1.309F, 0.0F));

		PartDefinition lower3 = left_leg5.addOrReplaceChild("lower3", CubeListBuilder.create().texOffs(44, 108).mirror().addBox(0.0F, -3.25F, -4.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.25F, 0.25F, -0.5F, 0.4166F, 0.7907F, 0.7149F));

		PartDefinition LEG_RIGHT = body.addOrReplaceChild("LEG_RIGHT", CubeListBuilder.create().texOffs(25, 87).addBox(-6.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 17.0F, 0.0F, -0.5672F, -1.0908F));

		PartDefinition cube_r85 = LEG_RIGHT.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(99, 25).addBox(-5.25F, 0.5F, 11.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition right_leg4 = LEG_RIGHT.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(94, 98).addBox(-6.0F, -2.5F, -2.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(81, 51).addBox(-4.75F, -1.5F, 2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 28).addBox(-3.25F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(86, 0).addBox(-9.0F, -2.0F, -1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, -1.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition lower2 = right_leg4.addOrReplaceChild("lower2", CubeListBuilder.create().texOffs(44, 108).addBox(-2.0F, -3.25F, -4.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.25F, 0.25F, -0.5F, 0.4166F, -0.7907F, -0.7149F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}