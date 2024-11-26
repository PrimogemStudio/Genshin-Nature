// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelprimordial_bathysmal_vishap<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "primordial_bathysmal_vishap"), "main");
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart MANO_RIGHT;
	private final ModelPart right_hand2;
	private final ModelPart lower_right;
	private final ModelPart MANO_LEFT;
	private final ModelPart left_hand4;
	private final ModelPart lower_left;
	private final ModelPart CABEZA;
	private final ModelPart jaw;
	private final ModelPart PIERNA_RIGHT;
	private final ModelPart right_leg4;
	private final ModelPart lower2;
	private final ModelPart PIERNA_LEFT;
	private final ModelPart left_leg5;
	private final ModelPart lower3;

	public Modelprimordial_bathysmal_vishap(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = this.body.getChild("tail");
		this.MANO_RIGHT = this.body.getChild("MANO_RIGHT");
		this.right_hand2 = this.MANO_RIGHT.getChild("right_hand2");
		this.lower_right = this.right_hand2.getChild("lower_right");
		this.MANO_LEFT = this.body.getChild("MANO_LEFT");
		this.left_hand4 = this.MANO_LEFT.getChild("left_hand4");
		this.lower_left = this.left_hand4.getChild("lower_left");
		this.CABEZA = this.body.getChild("CABEZA");
		this.jaw = this.CABEZA.getChild("jaw");
		this.PIERNA_RIGHT = this.body.getChild("PIERNA_RIGHT");
		this.right_leg4 = this.PIERNA_RIGHT.getChild("right_leg4");
		this.lower2 = this.right_leg4.getChild("lower2");
		this.PIERNA_LEFT = this.body.getChild("PIERNA_LEFT");
		this.left_leg5 = this.PIERNA_LEFT.getChild("left_leg5");
		this.lower3 = this.left_leg5.getChild("lower3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(12, 102).addBox(-1.5F, -3.5F, -15.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(62, 25).addBox(-1.51F, -5.25F, -13.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(42, 75).addBox(-1.01F, -7.25F, -10.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 83).addBox(-3.5F, -3.5F, -11.0F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.5F, -4.5F, -7.0F, 11.0F, 9.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-4.5F, -4.5F, 4.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 72).addBox(-3.5F, -3.75F, 15.5F, 7.0F, 9.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(93, 8).addBox(-4.25F, 4.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(92, 71).addBox(0.25F, 4.5F, -3.5F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(72, 49).addBox(-4.0F, -7.2F, 1.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.75F, -22.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(72, 39).addBox(-3.5F, -8.25F, 4.75F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 50).addBox(-3.99F, -7.5F, -5.75F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 32).addBox(0.25F, 5.25F, -5.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 30).addBox(-4.25F, 5.25F, -5.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(44, 0).addBox(-4.0F, -8.0F, 8.5F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(2.5F, -5.5F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 7.75F, 21.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 31).addBox(-2.5F, -5.5F, -2.5F, 0.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 7.75F, 21.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(0.25F, 1.25F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3453F, -6.0507F, -8.3893F, 0.6392F, -0.7056F, 1.3153F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 0).addBox(-3.25F, 1.25F, -4.5F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.3453F, -6.0507F, -8.3893F, 0.6392F, 0.7056F, -1.3153F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 53).mirror().addBox(-2.25F, -3.0F, -6.5F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0704F, -9.4778F, -1.3104F, 1.2376F, -0.0987F, 0.3442F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 50).mirror().addBox(1.0F, -2.0F, -4.75F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0019F, -9.6778F, 7.6856F, 1.1165F, 0.1654F, 0.8818F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 42).mirror().addBox(0.0F, -3.25F, -4.5F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.101F, -6.5487F, 17.1583F, 1.2089F, 0.3166F, 0.6044F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -3.25F, 1.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6641F, -5.3985F, 18.3839F, -0.4546F, 0.1364F, 0.3619F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(90, 86).mirror().addBox(-1.5F, -0.5F, -1.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6124F, -5.0222F, 15.3251F, 0.2872F, 0.1364F, 0.3619F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-1.5F, -2.5F, -2.5F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.7257F, -6.8063F, 11.0614F, 0.6113F, 0.1321F, 0.6429F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(37, 99).mirror().addBox(-0.5F, 0.5F, -4.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.2945F, -13.5724F, 5.7375F, 0.5791F, 0.5536F, 0.3924F));

		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 31).mirror().addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9191F, -8.0F, 1.1492F, 0.9281F, 0.5536F, 0.3924F));

		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(66, 53).addBox(2.25F, -3.0F, -6.5F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0704F, -9.4778F, -1.3104F, 1.2376F, 0.0987F, -0.3442F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 42).addBox(0.0F, -3.25F, -4.5F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.101F, -6.5487F, 17.1583F, 1.2089F, -0.3166F, -0.6044F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.25F, 1.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6641F, -5.3985F, 18.3839F, -0.4546F, -0.1364F, -0.3619F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(90, 86).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6124F, -5.0222F, 15.3251F, 0.2872F, -0.1364F, -0.3619F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(37, 99).addBox(-0.5F, 0.5F, -4.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2945F, -13.5724F, 5.7375F, 0.5791F, -0.5536F, -0.3924F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(92, 31).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9191F, -8.0F, 1.1492F, 0.9281F, -0.5536F, -0.3924F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5F, -2.5F, -2.5F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7257F, -6.8063F, 11.0614F, 0.6113F, -0.1321F, -0.6429F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(24, 50).addBox(-1.0F, -2.0F, -4.75F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0019F, -9.6778F, 7.6856F, 1.1165F, -0.1654F, -0.8818F));

		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(60, 35).addBox(-0.5F, -1.0F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.5078F, 26.152F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(40, 24).addBox(0.25F, -1.25F, 13.0F, 0.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(30, 58).addBox(-1.0F, -1.25F, 13.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 17).addBox(-0.5F, -0.75F, 11.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.25F, 5.25F, 0.0F, 8.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(91, 51).addBox(-1.5F, -6.25F, 5.25F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(20, 40).addBox(-1.0F, -11.0F, 7.75F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(13, 93).addBox(-1.5F, -6.25F, 5.25F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(0.0F, -5.25F, 5.25F, 0.0F, 8.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, 5.5F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 86).addBox(-0.5F, -1.75F, 11.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, 5.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(44, 17).addBox(-1.0F, -11.25F, 7.75F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, 5.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(42, 72).addBox(-0.99F, -2.25F, 0.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.25F, -10.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 86).addBox(-1.0F, -0.25F, 0.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.25F, -10.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(46, 63).addBox(-1.98F, -5.9F, -1.25F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.0F, -7.5F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(66, 103).addBox(-2.5F, -2.25F, 0.25F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.0F, -7.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 86).addBox(-1.48F, -5.15F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.0F, -8.75F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(30, 64).addBox(-2.0F, -2.25F, 0.25F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, -6.0F, -8.75F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(69, 10).addBox(-3.0F, -4.25F, -0.5F, 6.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(102, 79).addBox(-2.5F, -3.75F, -2.5F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-2.5F, -3.75F, 6.5F, 5.0F, 7.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 2).addBox(0.0F, -7.25F, 9.75F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 21.0F, -0.4615F, 0.3639F, 0.1816F));

		PartDefinition cube_r38 = tail.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(40, 30).addBox(0.0F, -4.5F, -6.25F, 0.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(24, 20).addBox(-1.0F, -0.5F, -6.25F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -30.6651F, 16.4381F, 2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(40, 78).addBox(-1.25F, -0.75F, 0.0F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.24F, -22.0887F, 27.574F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 83).addBox(-1.5F, -2.0F, -7.0F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.24F, -23.583F, 27.4433F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 25).addBox(-1.99F, 54.0F, 9.0F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(66, 69).addBox(-2.0F, 43.25F, 26.25F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 5.25F, -26.75F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(49, 63).addBox(-2.0F, 9.75F, 37.5F, 4.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 53).addBox(0.0F, 2.25F, 25.25F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(0.0F, 1.25F, 27.25F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r45 = tail.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 97).addBox(-0.5F, 4.75F, 20.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -21.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition MANO_RIGHT = body.addOrReplaceChild("MANO_RIGHT", CubeListBuilder.create().texOffs(91, 96).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(54, 82).addBox(-1.25F, -0.25F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 0).addBox(-7.5F, 0.0F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(81, 58).addBox(-6.5F, -0.25F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(93, 44).addBox(-8.0F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -3.0F, -4.0F, 0.2158F, 0.9787F, -0.7648F));

		PartDefinition right_hand2 = MANO_RIGHT.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(99, 61).addBox(-2.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(71, 94).addBox(-7.5F, -2.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(23, 40).addBox(-9.5F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 2.0F, 0.0F, 1.5708F, -1.1345F, -0.4363F));

		PartDefinition cube_r46 = right_hand2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 47).addBox(-17.0F, 3.0F, 14.5F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(83, 71).addBox(-18.0F, 3.75F, 14.75F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 1.0F, 4.0F, -0.1762F, -0.7597F, 0.4004F));

		PartDefinition lower_right = right_hand2.addOrReplaceChild("lower_right", CubeListBuilder.create().texOffs(52, 95).addBox(-1.5F, -4.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -1.0F, 0.0F, -0.1145F, -0.4101F, -0.0522F));

		PartDefinition MANO_LEFT = body.addOrReplaceChild("MANO_LEFT", CubeListBuilder.create().texOffs(91, 96).mirror().addBox(-1.5F, -1.0F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(54, 82).mirror().addBox(-1.75F, -0.25F, -3.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(91, 0).mirror().addBox(1.5F, 0.0F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(81, 58).mirror().addBox(2.5F, -0.25F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(93, 44).mirror().addBox(2.0F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, -3.0F, -4.0F, 0.2158F, -0.9787F, 0.7648F));

		PartDefinition left_hand4 = MANO_LEFT.addOrReplaceChild("left_hand4", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(-0.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(71, 94).mirror().addBox(2.5F, -2.5F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(23, 40).mirror().addBox(7.5F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.0F, 2.0F, 0.0F, 1.5708F, 1.1345F, 0.4363F));

		PartDefinition cube_r47 = left_hand4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 47).mirror().addBox(12.0F, 3.0F, 14.5F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(83, 71).mirror().addBox(10.0F, 3.75F, 14.75F, 8.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.0F, 1.0F, 4.0F, -0.1762F, 0.7597F, -0.4004F));

		PartDefinition lower_left = left_hand4.addOrReplaceChild("lower_left", CubeListBuilder.create().texOffs(52, 95).mirror().addBox(-0.5F, -4.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.0F, -1.0F, 0.0F, -0.1145F, 0.4101F, 0.0522F));

		PartDefinition CABEZA = body.addOrReplaceChild("CABEZA", CubeListBuilder.create().texOffs(83, 61).addBox(-2.0F, -1.5F, -9.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(25, 94).addBox(-0.5F, -2.0F, -9.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 84).addBox(-1.99F, 0.5F, -9.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, -13.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r48 = CABEZA.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(44, 28).addBox(-1.0F, -4.2F, -3.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -7.75F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r49 = CABEZA.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -14.75F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 83).addBox(0.0F, -12.75F, 0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r50 = CABEZA.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(33, 0).mirror().addBox(5.0F, -5.78F, 5.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0116F, -0.6548F, 0.0F));

		PartDefinition cube_r51 = CABEZA.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(6, 2).mirror().addBox(4.0F, -6.03F, 6.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0109F, -0.5675F, 0.0012F));

		PartDefinition cube_r52 = CABEZA.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(6, 0).mirror().addBox(4.25F, -1.5F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 89).mirror().addBox(1.5F, -1.5F, -0.75F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9119F, -0.5129F, -0.6669F, -0.3755F, -1.5453F, 0.2459F));

		PartDefinition cube_r53 = CABEZA.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(66, 69).mirror().addBox(-1.5F, -1.0F, 0.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9119F, -0.5129F, -0.6669F, 0.4321F, -0.8081F, -0.7049F));

		PartDefinition cube_r54 = CABEZA.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(33, 2).mirror().addBox(6.0F, -4.78F, 5.45F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.1437F, -0.6412F, -0.2159F));

		PartDefinition cube_r55 = CABEZA.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(63, 32).mirror().addBox(6.25F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0622F, -0.9586F, -0.076F));

		PartDefinition cube_r56 = CABEZA.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(12, 56).mirror().addBox(6.25F, -6.28F, 5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(6, 56).mirror().addBox(6.75F, -5.28F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.0116F, -0.6548F, 0.0025F));

		PartDefinition cube_r57 = CABEZA.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(29, 47).mirror().addBox(7.5F, -1.0F, 5.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, 0.3232F, -0.58F, -0.5271F));

		PartDefinition cube_r58 = CABEZA.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(23, 47).mirror().addBox(4.5F, -5.03F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.5F, -11.0F, -0.0885F, -0.6497F, 0.1672F));

		PartDefinition cube_r59 = CABEZA.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(29, 47).addBox(-9.5F, -1.0F, 5.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.3232F, 0.58F, 0.5271F));

		PartDefinition cube_r60 = CABEZA.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(23, 47).addBox(-6.5F, -5.03F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, -0.0885F, 0.6497F, -0.1672F));

		PartDefinition cube_r61 = CABEZA.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(33, 2).addBox(-8.0F, -4.78F, 5.45F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.1437F, 0.6412F, 0.2159F));

		PartDefinition cube_r62 = CABEZA.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(6, 2).addBox(-6.0F, -6.03F, 6.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0109F, 0.5675F, -0.0012F));

		PartDefinition cube_r63 = CABEZA.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(33, 0).addBox(-7.0F, -5.78F, 5.75F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0116F, 0.6548F, 0.0F));

		PartDefinition cube_r64 = CABEZA.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(32, 89).addBox(-4.5F, -1.5F, -0.75F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 0).addBox(-6.25F, -1.5F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9119F, -0.5129F, -0.6669F, -0.3755F, 1.5453F, -0.2459F));

		PartDefinition cube_r65 = CABEZA.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(6, 56).addBox(-8.75F, -5.28F, 5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 56).addBox(-8.25F, -6.28F, 5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0116F, 0.6548F, -0.0025F));

		PartDefinition cube_r66 = CABEZA.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(66, 69).addBox(-1.5F, -1.0F, 0.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9119F, -0.5129F, -0.6669F, 0.4321F, 0.8081F, 0.7049F));

		PartDefinition cube_r67 = CABEZA.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(54, 78).addBox(-1.01F, -6.95F, -2.6F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -7.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = CABEZA.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(63, 32).addBox(-8.25F, -6.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.0622F, 0.9586F, 0.076F));

		PartDefinition cube_r69 = CABEZA.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.011F, -1.879F, 0.4101F, 0.6368F, 0.2371F, -0.0625F));

		PartDefinition cube_r70 = CABEZA.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(32, 84).mirror().addBox(-2.75F, -5.75F, 8.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 6.0F, -11.0F, 0.2214F, 0.348F, 0.01F));

		PartDefinition cube_r71 = CABEZA.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 6).addBox(0.0F, -1.0F, -2.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.011F, -1.879F, 0.4101F, 0.6368F, -0.2371F, 0.0625F));

		PartDefinition cube_r72 = CABEZA.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(32, 84).addBox(1.75F, -5.75F, 8.25F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.0F, -11.0F, 0.2214F, -0.348F, -0.01F));

		PartDefinition cube_r73 = CABEZA.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 103).addBox(-0.62F, -5.25F, 8.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, -11.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition jaw = CABEZA.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(72, 39).addBox(-1.98F, -1.4052F, -0.1342F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 7).addBox(-1.25F, -1.4052F, -1.1342F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 5).addBox(1.25F, -1.4052F, -1.1342F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 88).addBox(-1.0F, 0.6448F, -3.5842F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(88, 10).addBox(-0.5F, 0.3948F, -2.0842F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 0).addBox(-1.0F, -1.4152F, 0.8558F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(0.98F, -1.4052F, -0.1342F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, -4.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(92, 79).addBox(0.9997F, -3.4052F, -2.8474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(33, 0).addBox(-2.01F, 0.0F, 1.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -0.0842F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(102, 96).addBox(-1.5F, -0.25F, -1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1448F, -0.0842F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r77 = jaw.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(95, 16).addBox(-1.9997F, -3.4052F, -2.8474F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition PIERNA_RIGHT = body.addOrReplaceChild("PIERNA_RIGHT", CubeListBuilder.create().texOffs(24, 72).addBox(-6.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 17.0F, 0.0F, -0.5672F, -1.0908F));

		PartDefinition cube_r78 = PIERNA_RIGHT.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(35, 90).addBox(-5.25F, 0.5F, 11.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition right_leg4 = PIERNA_RIGHT.addOrReplaceChild("right_leg4", CubeListBuilder.create().texOffs(90, 20).addBox(-6.0F, -2.5F, -2.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(19, 72).addBox(-4.75F, -1.5F, 2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 32).addBox(-3.25F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 0).addBox(-9.0F, -2.0F, -1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 0.0F, -1.0F, 0.0F, 1.309F, 0.0F));

		PartDefinition lower2 = right_leg4.addOrReplaceChild("lower2", CubeListBuilder.create().texOffs(44, 17).addBox(-2.0F, -3.25F, -4.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.25F, 0.25F, -0.5F, 0.4166F, -0.7907F, -0.7149F));

		PartDefinition PIERNA_LEFT = body.addOrReplaceChild("PIERNA_LEFT", CubeListBuilder.create().texOffs(24, 72).mirror().addBox(0.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 2.0F, 17.0F, 0.0F, 0.5672F, 1.0908F));

		PartDefinition cube_r79 = PIERNA_LEFT.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(35, 90).mirror().addBox(-0.75F, 0.5F, 11.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 0.0F, -14.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition left_leg5 = PIERNA_LEFT.addOrReplaceChild("left_leg5", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(0.0F, -2.5F, -2.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 72).mirror().addBox(0.75F, -1.5F, 2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(55, 32).mirror().addBox(0.25F, -1.0F, -2.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(68, 0).mirror().addBox(6.0F, -2.0F, -1.5F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 0.0F, -1.0F, 0.0F, -1.309F, 0.0F));

		PartDefinition lower3 = left_leg5.addOrReplaceChild("lower3", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(0.0F, -3.25F, -4.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.25F, 0.25F, -0.5F, 0.4166F, 0.7907F, 0.7149F));

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