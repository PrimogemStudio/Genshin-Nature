// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelgeovishaphatchling<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "geovishaphatchling"), "main");
	private final ModelPart CABEZA;
	private final ModelPart Headspikes;
	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart bone3;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart LowerBody;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart PIERNA_LEFT;
	private final ModelPart Lbottomleg;
	private final ModelPart LFoot;
	private final ModelPart LToe1;
	private final ModelPart Claw1;
	private final ModelPart Topclaw;
	private final ModelPart Bottomclaw;
	private final ModelPart Toe;
	private final ModelPart LToe2;
	private final ModelPart Claw2;
	private final ModelPart Topclaw2;
	private final ModelPart Bottomclaw2;
	private final ModelPart Toe2;
	private final ModelPart Leg;
	private final ModelPart Legbracer;
	private final ModelPart Lupperleg;
	private final ModelPart PIERNA_RIGHT;
	private final ModelPart Rbottomleg2;
	private final ModelPart RFoot2;
	private final ModelPart RToe3;
	private final ModelPart Claw3;
	private final ModelPart Topclaw3;
	private final ModelPart Bottomclaw3;
	private final ModelPart Toe3;
	private final ModelPart RToe4;
	private final ModelPart Claw4;
	private final ModelPart Topclaw4;
	private final ModelPart Bottomclaw4;
	private final ModelPart Toe4;
	private final ModelPart Leg2;
	private final ModelPart Legbracer2;
	private final ModelPart Lupperleg2;
	private final ModelPart UpperBody;
	private final ModelPart BRAZO_LEFT;
	private final ModelPart bone15;
	private final ModelPart bone14;
	private final ModelPart bone13;
	private final ModelPart bone12;
	private final ModelPart BRAZO_RIGHT;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart Tail;
	private final ModelPart bone20;

	public Modelgeovishaphatchling(ModelPart root) {
		this.CABEZA = root.getChild("CABEZA");
		this.Headspikes = this.CABEZA.getChild("Headspikes");
		this.bone6 = this.Headspikes.getChild("bone6");
		this.bone5 = this.Headspikes.getChild("bone5");
		this.bone = this.Headspikes.getChild("bone");
		this.bone2 = this.Headspikes.getChild("bone2");
		this.bone4 = this.Headspikes.getChild("bone4");
		this.bone3 = this.Headspikes.getChild("bone3");
		this.bone10 = this.Headspikes.getChild("bone10");
		this.bone11 = this.Headspikes.getChild("bone11");
		this.LowerBody = root.getChild("LowerBody");
		this.bone7 = this.LowerBody.getChild("bone7");
		this.bone8 = this.LowerBody.getChild("bone8");
		this.bone9 = this.LowerBody.getChild("bone9");
		this.PIERNA_LEFT = root.getChild("PIERNA_LEFT");
		this.Lbottomleg = this.PIERNA_LEFT.getChild("Lbottomleg");
		this.LFoot = this.Lbottomleg.getChild("LFoot");
		this.LToe1 = this.LFoot.getChild("LToe1");
		this.Claw1 = this.LToe1.getChild("Claw1");
		this.Topclaw = this.Claw1.getChild("Topclaw");
		this.Bottomclaw = this.Claw1.getChild("Bottomclaw");
		this.Toe = this.LToe1.getChild("Toe");
		this.LToe2 = this.LFoot.getChild("LToe2");
		this.Claw2 = this.LToe2.getChild("Claw2");
		this.Topclaw2 = this.Claw2.getChild("Topclaw2");
		this.Bottomclaw2 = this.Claw2.getChild("Bottomclaw2");
		this.Toe2 = this.LToe2.getChild("Toe2");
		this.Leg = this.Lbottomleg.getChild("Leg");
		this.Legbracer = this.Leg.getChild("Legbracer");
		this.Lupperleg = this.PIERNA_LEFT.getChild("Lupperleg");
		this.PIERNA_RIGHT = root.getChild("PIERNA_RIGHT");
		this.Rbottomleg2 = this.PIERNA_RIGHT.getChild("Rbottomleg2");
		this.RFoot2 = this.Rbottomleg2.getChild("RFoot2");
		this.RToe3 = this.RFoot2.getChild("RToe3");
		this.Claw3 = this.RToe3.getChild("Claw3");
		this.Topclaw3 = this.Claw3.getChild("Topclaw3");
		this.Bottomclaw3 = this.Claw3.getChild("Bottomclaw3");
		this.Toe3 = this.RToe3.getChild("Toe3");
		this.RToe4 = this.RFoot2.getChild("RToe4");
		this.Claw4 = this.RToe4.getChild("Claw4");
		this.Topclaw4 = this.Claw4.getChild("Topclaw4");
		this.Bottomclaw4 = this.Claw4.getChild("Bottomclaw4");
		this.Toe4 = this.RToe4.getChild("Toe4");
		this.Leg2 = this.Rbottomleg2.getChild("Leg2");
		this.Legbracer2 = this.Leg2.getChild("Legbracer2");
		this.Lupperleg2 = this.PIERNA_RIGHT.getChild("Lupperleg2");
		this.UpperBody = root.getChild("UpperBody");
		this.BRAZO_LEFT = root.getChild("BRAZO_LEFT");
		this.bone15 = this.BRAZO_LEFT.getChild("bone15");
		this.bone14 = this.bone15.getChild("bone14");
		this.bone13 = this.bone15.getChild("bone13");
		this.bone12 = this.bone15.getChild("bone12");
		this.BRAZO_RIGHT = root.getChild("BRAZO_RIGHT");
		this.bone16 = this.BRAZO_RIGHT.getChild("bone16");
		this.bone17 = this.bone16.getChild("bone17");
		this.bone18 = this.bone16.getChild("bone18");
		this.bone19 = this.bone16.getChild("bone19");
		this.Tail = root.getChild("Tail");
		this.bone20 = this.Tail.getChild("bone20");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition CABEZA = partdefinition.addOrReplaceChild("CABEZA", CubeListBuilder.create(), PartPose.offset(-0.0345F, 3.8174F, -5.6325F));

		PartDefinition Mouth_r1 = CABEZA.addOrReplaceChild("Mouth_r1", CubeListBuilder.create().texOffs(34, 0).addBox(-1.75F, -1.75F, 4.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.004F, 3.4955F, 2.7094F, 2.6853F, -0.4214F, -0.6957F));

		PartDefinition EyeL_r1 = CABEZA.addOrReplaceChild("EyeL_r1", CubeListBuilder.create().texOffs(50, 5).addBox(-0.75F, -3.5F, 5.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(54, 5).addBox(-3.5F, -0.75F, 5.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.004F, 3.4955F, 2.7094F, 2.4008F, -0.6008F, -0.5556F));

		PartDefinition Headspikes = CABEZA.addOrReplaceChild("Headspikes", CubeListBuilder.create(), PartPose.offset(5.0241F, 1.4889F, -1.6225F));

		PartDefinition bone6 = Headspikes.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-9.2326F, 0.9744F, 3.3819F));

		PartDefinition cube_r1 = bone6.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 0).addBox(0.25F, -4.75F, 6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5316F, -0.5908F, 0.8385F));

		PartDefinition cube_r2 = bone6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 0).addBox(5.25F, -4.5F, 6.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3955F, -0.5432F, -2.5685F, 1.5213F, -0.8523F, 0.8539F));

		PartDefinition cube_r3 = bone6.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 0).addBox(7.25F, -3.5F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.828F, -1.0394F, -3.3213F, 1.5213F, -0.8523F, 0.8539F));

		PartDefinition bone5 = Headspikes.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-2.4858F, 3.5243F, 2.9739F));

		PartDefinition cube_r4 = bone5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 0).addBox(7.25F, -3.5F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(5.25F, -4.5F, 6.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0787F, -0.9333F, -1.6589F));

		PartDefinition cube_r5 = bone5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(15, 0).addBox(1.25F, -4.75F, 6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2584F, -0.6695F, 1.1765F, 2.7516F, -0.8735F, -1.245F));

		PartDefinition bone = Headspikes.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-5.0865F, -9.263F, 2.5024F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(15, 0).addBox(-0.85F, -0.825F, 18.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-1.6F, -1.575F, 16.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1419F, 10.2239F, -12.3108F, 0.5291F, -0.4792F, 0.6557F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 0).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0108F, 1.08F, -1.0558F, 0.5291F, -0.4792F, 0.6557F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 0).addBox(-2.1F, -2.075F, 12.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1198F, 11.5221F, -9.4787F, 0.7394F, -0.6026F, 0.5477F));

		PartDefinition bone2 = Headspikes.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-7.5748F, 3.5894F, 2.9133F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-9.25F, -3.5F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 0).mirror().addBox(-7.25F, -4.5F, 6.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0787F, 0.9333F, 1.6589F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-5.25F, -4.75F, 6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2584F, -0.6695F, 1.1765F, 2.7516F, 0.8735F, 1.245F));

		PartDefinition bone4 = Headspikes.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-8.25F, -3.5F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5213F, 0.8523F, -0.8539F));

		PartDefinition cube_r12 = bone4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-6.25F, -4.5F, 6.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4325F, 0.4962F, 0.7528F, 1.5213F, 0.8523F, -0.8539F));

		PartDefinition cube_r13 = bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(15, 0).mirror().addBox(-4.25F, -4.75F, 6.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.828F, 1.0394F, 3.3213F, 1.5316F, 0.5908F, -0.8385F));

		PartDefinition bone3 = Headspikes.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-5.1766F, 1.9689F, 2.9833F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.7501F, -1.7509F, 12.45F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4008F, -0.6008F, -0.5556F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 6).addBox(-0.5001F, -0.5009F, 10.75F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1566F, 0.0376F, 1.3487F, 2.6852F, -0.4219F, -0.7105F));

		PartDefinition bone10 = Headspikes.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-4.9667F, 2.2591F, -6.9762F));

		PartDefinition cube_r16 = bone10.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 0).addBox(-2.1F, -2.075F, 11.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.35F, -2.325F, 10.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7394F, -0.6026F, 0.5477F));

		PartDefinition cube_r17 = bone10.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(17, 0).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0894F, -6.5357F, 7.0873F, 0.7394F, -0.6026F, 0.5477F));

		PartDefinition cube_r18 = bone10.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(17, 0).addBox(-2.6F, -2.575F, 9.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 1.3846F, 1.723F, 0.9843F, -0.7018F, 0.397F));

		PartDefinition cube_r19 = bone10.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 0).addBox(-2.85F, -2.825F, 9.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0082F, 2.2754F, 3.7207F, 1.2651F, -0.7682F, 0.2099F));

		PartDefinition cube_r20 = bone10.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(17, 0).addBox(-3.1F, -3.075F, 9.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.026F, 2.6361F, 5.8721F, 1.5707F, -0.7916F, -0.004F));

		PartDefinition cube_r21 = bone10.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(17, 0).addBox(-3.35F, -3.325F, 9.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0347F, 2.4514F, 8.0429F, 1.8763F, -0.7678F, -0.2189F));

		PartDefinition cube_r22 = bone10.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 0).addBox(-3.6F, -3.575F, 9.0F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0344F, 1.7338F, 10.0982F, 2.1566F, -0.7007F, -0.4078F));

		PartDefinition bone11 = Headspikes.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-5.0201F, 2.0066F, 4.3319F));

		PartDefinition cube_r23 = bone11.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 0).addBox(-3.75F, -3.75F, 5.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-3.7501F, -3.7509F, 7.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-3.75F, 2.25F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(2.25F, -3.75F, 5.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.4008F, -0.6008F, -0.5556F));

		PartDefinition cube_r24 = bone11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 0).addBox(-3.7498F, -7.25F, 3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5168F, 0.0251F, 0.6599F, 1.6591F, -0.6008F, -0.5556F));

		PartDefinition cube_r25 = bone11.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 0).addBox(-3.75F, -3.749F, 8.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2942F, -4.871F, 3.0587F, 2.5509F, 0.0307F, -1.0533F));

		PartDefinition LowerBody = partdefinition.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -2.0F));

		PartDefinition cube_r26 = LowerBody.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 15).addBox(-3.25F, -3.15F, -0.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0306F, -18.9371F, 1.8269F, 2.5675F, -0.5002F, -0.6579F));

		PartDefinition cube_r27 = LowerBody.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -3.5F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0311F, -17.8234F, 3.8928F, 2.3427F, -0.6072F, -0.523F));

		PartDefinition cube_r28 = LowerBody.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 15).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.037F, -14.0194F, 6.0856F, 2.3052F, -0.6411F, -0.496F));

		PartDefinition cube_r29 = LowerBody.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 15).addBox(-1.3536F, -1.5F, -5.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, -9.8536F, 7.5F, 2.8174F, -0.2985F, -0.7369F));

		PartDefinition cube_r30 = LowerBody.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 15).addBox(-1.3536F, -1.5F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1464F, -9.8536F, 7.5F, 2.6514F, -0.4528F, -0.6736F));

		PartDefinition bone7 = LowerBody.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0448F, -10.4828F, -8.5635F));

		PartDefinition cube_r31 = bone7.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(34, 15).addBox(-7.85F, -6.075F, 22.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1701F, -3.0368F, -0.969F, 0.1653F, -0.1658F, 0.7854F));

		PartDefinition cube_r32 = bone7.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(34, 15).addBox(-6.85F, -5.075F, 18.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4334F, -1.3298F, -0.0489F, 0.3199F, -0.3054F, 0.7854F));

		PartDefinition cube_r33 = bone7.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(34, 15).addBox(-4.85F, -4.825F, 13.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5291F, -0.4792F, 0.6557F));

		PartDefinition bone8 = LowerBody.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0581F, -20.9851F, 13.7959F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r34 = bone8.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(34, 15).addBox(-6.85F, -5.075F, 21.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2731F, 10.4656F, -18.3284F, 0.1653F, -0.1658F, 0.7854F));

		PartDefinition cube_r35 = bone8.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(34, 15).addBox(-5.85F, -4.075F, 17.75F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5364F, 12.1725F, -17.4083F, 0.3199F, -0.3054F, 0.7854F));

		PartDefinition cube_r36 = bone8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(34, 15).addBox(-3.85F, -3.825F, 11.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(34, 15).addBox(-2.85F, -2.825F, 13.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.103F, 13.5023F, -17.3594F, 0.5291F, -0.4792F, 0.6557F));

		PartDefinition bone9 = LowerBody.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0581F, -15.9851F, 13.7959F, -0.567F, -0.0113F, 0.0027F));

		PartDefinition cube_r37 = bone9.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 15).addBox(-5.35F, -3.575F, 22.75F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(34, 15).addBox(-5.85F, -4.075F, 17.75F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5364F, 14.4225F, -17.4083F, 0.3199F, -0.3054F, 0.7854F));

		PartDefinition cube_r38 = bone9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(34, 15).addBox(-5.05F, -3.575F, 13.25F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4392F, 12.3097F, -12.3973F, 0.1667F, -0.1467F, 0.8221F));

		PartDefinition PIERNA_LEFT = partdefinition.addOrReplaceChild("PIERNA_LEFT", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 14.0F, 8.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition Lbottomleg = PIERNA_LEFT.addOrReplaceChild("Lbottomleg", CubeListBuilder.create(), PartPose.offset(-6.4309F, 10.0F, -9.4776F));

		PartDefinition LFoot = Lbottomleg.addOrReplaceChild("LFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LToe1 = LFoot.addOrReplaceChild("LToe1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Claw1 = LToe1.addOrReplaceChild("Claw1", CubeListBuilder.create(), PartPose.offset(-0.0265F, -0.1768F, -0.0533F));

		PartDefinition Topclaw = Claw1.addOrReplaceChild("Topclaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Segment5_r1 = Topclaw.addOrReplaceChild("Segment5_r1", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment5_r2 = Topclaw.addOrReplaceChild("Segment5_r2", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment5_r3 = Topclaw.addOrReplaceChild("Segment5_r3", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(3.5735F, -4.9492F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment1_r1 = Topclaw.addOrReplaceChild("Segment1_r1", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment4_r1 = Topclaw.addOrReplaceChild("Segment4_r1", CubeListBuilder.create().texOffs(0, 43).addBox(0.3735F, -8.1492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.4961F, -0.4459F, 0.6713F));

		PartDefinition Segment3_r1 = Topclaw.addOrReplaceChild("Segment3_r1", CubeListBuilder.create().texOffs(0, 43).addBox(1.1735F, -7.3492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.3506F, -0.3347F, 0.7258F));

		PartDefinition Segment2_r1 = Topclaw.addOrReplaceChild("Segment2_r1", CubeListBuilder.create().texOffs(0, 43).addBox(2.6735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.6735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.1249F, -0.1222F, 0.7755F));

		PartDefinition Segment1_r2 = Topclaw.addOrReplaceChild("Segment1_r2", CubeListBuilder.create().texOffs(0, 43).addBox(2.7735F, -5.7492F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment1_r3 = Topclaw.addOrReplaceChild("Segment1_r3", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bottomclaw = Claw1.addOrReplaceChild("Bottomclaw", CubeListBuilder.create().texOffs(0, 43).addBox(5.9F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.1F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0265F, 0.1768F, 0.0533F));

		PartDefinition cube_r39 = Bottomclaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 43).addBox(5.1F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.9F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Toe = LToe1.addOrReplaceChild("Toe", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -2.2274F, -2.8638F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Toe.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.6F, -2.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r41 = Toe.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -1.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Toe.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.1F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2797F, 0.1503F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Toe.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8467F, -0.1307F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Toe.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -1.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7844F, 0.7347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition LToe2 = LFoot.addOrReplaceChild("LToe2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Claw2 = LToe2.addOrReplaceChild("Claw2", CubeListBuilder.create(), PartPose.offset(-0.0265F, -0.1768F, -0.0533F));

		PartDefinition Topclaw2 = Claw2.addOrReplaceChild("Topclaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Segment6_r1 = Topclaw2.addOrReplaceChild("Segment6_r1", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment6_r2 = Topclaw2.addOrReplaceChild("Segment6_r2", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment6_r3 = Topclaw2.addOrReplaceChild("Segment6_r3", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(3.5735F, -4.9492F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment2_r2 = Topclaw2.addOrReplaceChild("Segment2_r2", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment5_r4 = Topclaw2.addOrReplaceChild("Segment5_r4", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0452F, -0.7356F, -7.5247F, 0.4961F, -0.4459F, 0.6713F));

		PartDefinition Segment4_r2 = Topclaw2.addOrReplaceChild("Segment4_r2", CubeListBuilder.create().texOffs(0, 43).addBox(1.1735F, -7.3492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.3506F, -0.3347F, 0.7258F));

		PartDefinition Segment3_r2 = Topclaw2.addOrReplaceChild("Segment3_r2", CubeListBuilder.create().texOffs(0, 43).addBox(2.6735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.6735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.1249F, -0.1222F, 0.7755F));

		PartDefinition Segment2_r3 = Topclaw2.addOrReplaceChild("Segment2_r3", CubeListBuilder.create().texOffs(0, 43).addBox(2.7735F, -5.7492F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment2_r4 = Topclaw2.addOrReplaceChild("Segment2_r4", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bottomclaw2 = Claw2.addOrReplaceChild("Bottomclaw2", CubeListBuilder.create().texOffs(0, 43).addBox(5.9F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.1F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0265F, 0.1768F, 0.0533F));

		PartDefinition cube_r45 = Bottomclaw2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 43).addBox(5.1F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.9F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Toe2 = LToe2.addOrReplaceChild("Toe2", CubeListBuilder.create().texOffs(0, 27).addBox(4.9998F, -2.2274F, -2.8638F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Toe2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.6F, -2.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Toe2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -1.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Toe2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.1F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2797F, 0.1503F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Toe2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8467F, -0.1307F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Toe2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 27).addBox(4.9999F, -1.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7844F, 0.7347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leg = Lbottomleg.addOrReplaceChild("Leg", CubeListBuilder.create(), PartPose.offset(-1.3234F, -0.2274F, -0.7898F));

		PartDefinition cube_r51 = Leg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 27).addBox(-1.8F, -10.05F, -9.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5627F, 1.1595F, 7.5383F, -0.1852F, -0.7813F, 0.1202F));

		PartDefinition cube_r52 = Leg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 27).addBox(2.1F, -11.0F, -5.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5804F, 1.158F, 7.5568F, 0.5864F, -0.7023F, -0.4165F));

		PartDefinition cube_r53 = Leg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 27).addBox(0.1F, -4.6F, 6.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0146F, -0.5243F, -0.07F, 0.3615F, 0.7521F, 0.248F));

		PartDefinition cube_r54 = Leg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 27).addBox(0.6F, -3.8F, 5.9F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Legbracer = Leg.addOrReplaceChild("Legbracer", CubeListBuilder.create(), PartPose.offset(1.3234F, 0.2274F, 0.7898F));

		PartDefinition cube_r55 = Legbracer.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(21, 30).addBox(0.6F, -5.6F, 4.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(21, 30).addBox(0.6F, -6.6F, 4.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3088F, -0.7517F, -0.8598F, -0.1242F, 0.7844F, -0.0879F));

		PartDefinition cube_r56 = Legbracer.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(21, 30).addBox(5.5F, -5.75F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5901F, -3.1523F, 3.9132F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r57 = Legbracer.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(21, 30).addBox(5.5F, -6.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5901F, -3.0662F, 4.1538F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Lupperleg = PIERNA_LEFT.addOrReplaceChild("Lupperleg", CubeListBuilder.create(), PartPose.offset(-6.4309F, 10.0F, -9.4776F));

		PartDefinition cube_r58 = Lupperleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(38, 21).addBox(0.85F, -9.45F, 6.45F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3916F, -4.5284F, -1.6006F, -0.6569F, 0.7161F, -0.4345F));

		PartDefinition cube_r59 = Lupperleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 51).addBox(2.35F, -12.45F, 4.05F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.376F, -7.0619F, -0.9855F, -1.4434F, 0.1819F, -0.802F));

		PartDefinition cube_r60 = Lupperleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(52, 31).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4759F, -7.5042F, 4.4417F, -1.317F, 0.3061F, -0.7721F));

		PartDefinition PIERNA_RIGHT = partdefinition.addOrReplaceChild("PIERNA_RIGHT", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 14.0F, 8.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Rbottomleg2 = PIERNA_RIGHT.addOrReplaceChild("Rbottomleg2", CubeListBuilder.create(), PartPose.offset(-5.1953F, 10.0F, -9.6949F));

		PartDefinition RFoot2 = Rbottomleg2.addOrReplaceChild("RFoot2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RToe3 = RFoot2.addOrReplaceChild("RToe3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Claw3 = RToe3.addOrReplaceChild("Claw3", CubeListBuilder.create(), PartPose.offset(-0.0265F, -0.1768F, -0.0533F));

		PartDefinition Topclaw3 = Claw3.addOrReplaceChild("Topclaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Segment6_r4 = Topclaw3.addOrReplaceChild("Segment6_r4", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment6_r5 = Topclaw3.addOrReplaceChild("Segment6_r5", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment6_r6 = Topclaw3.addOrReplaceChild("Segment6_r6", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(3.5735F, -4.9492F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment2_r5 = Topclaw3.addOrReplaceChild("Segment2_r5", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment5_r5 = Topclaw3.addOrReplaceChild("Segment5_r5", CubeListBuilder.create().texOffs(0, 43).addBox(0.3735F, -8.1492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.4961F, -0.4459F, 0.6713F));

		PartDefinition Segment4_r3 = Topclaw3.addOrReplaceChild("Segment4_r3", CubeListBuilder.create().texOffs(0, 43).addBox(1.1735F, -7.3492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.3506F, -0.3347F, 0.7258F));

		PartDefinition Segment3_r3 = Topclaw3.addOrReplaceChild("Segment3_r3", CubeListBuilder.create().texOffs(0, 43).addBox(2.6735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.6735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.1249F, -0.1222F, 0.7755F));

		PartDefinition Segment2_r6 = Topclaw3.addOrReplaceChild("Segment2_r6", CubeListBuilder.create().texOffs(0, 43).addBox(2.7735F, -5.7492F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment2_r7 = Topclaw3.addOrReplaceChild("Segment2_r7", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment2_r8 = Topclaw3.addOrReplaceChild("Segment2_r8", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8336F, -1.591F, -4.75F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bottomclaw3 = Claw3.addOrReplaceChild("Bottomclaw3", CubeListBuilder.create().texOffs(0, 43).addBox(5.9F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.1F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0265F, 0.1768F, 0.0533F));

		PartDefinition cube_r61 = Bottomclaw3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 43).addBox(5.1F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.9F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Toe3 = RToe3.addOrReplaceChild("Toe3", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -2.2274F, -2.8638F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r62 = Toe3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.6F, -2.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r63 = Toe3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -1.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r64 = Toe3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.1F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2797F, 0.1503F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Toe3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 27).addBox(5.002F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8467F, -0.1307F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r66 = Toe3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 27).addBox(5.001F, -1.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7844F, 0.7347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RToe4 = RFoot2.addOrReplaceChild("RToe4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 2.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition Claw4 = RToe4.addOrReplaceChild("Claw4", CubeListBuilder.create(), PartPose.offset(-0.0265F, -0.1768F, -0.0533F));

		PartDefinition Topclaw4 = Claw4.addOrReplaceChild("Topclaw4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Segment7_r1 = Topclaw4.addOrReplaceChild("Segment7_r1", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.475F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment7_r2 = Topclaw4.addOrReplaceChild("Segment7_r2", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment7_r3 = Topclaw4.addOrReplaceChild("Segment7_r3", CubeListBuilder.create().texOffs(0, 43).addBox(3.3F, -4.95F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(3.5735F, -4.9492F, -4.525F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1859F, 0.1853F, 0.7732F));

		PartDefinition Segment3_r4 = Topclaw4.addOrReplaceChild("Segment3_r4", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3858F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment6_r7 = Topclaw4.addOrReplaceChild("Segment6_r7", CubeListBuilder.create().texOffs(0, 43).addBox(0.3735F, -8.1492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.4961F, -0.4459F, 0.6713F));

		PartDefinition Segment5_r6 = Topclaw4.addOrReplaceChild("Segment5_r6", CubeListBuilder.create().texOffs(0, 43).addBox(1.1735F, -7.3492F, -7.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.3506F, -0.3347F, 0.7258F));

		PartDefinition Segment4_r4 = Topclaw4.addOrReplaceChild("Segment4_r4", CubeListBuilder.create().texOffs(0, 43).addBox(2.6735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.6735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.7492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.7735F, -5.8492F, -8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0076F, -1.2566F, 1.017F, 0.1249F, -0.1222F, 0.7755F));

		PartDefinition Segment3_r5 = Topclaw4.addOrReplaceChild("Segment3_r5", CubeListBuilder.create().texOffs(0, 43).addBox(2.7735F, -5.7492F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment3_r6 = Topclaw4.addOrReplaceChild("Segment3_r6", CubeListBuilder.create().texOffs(0, 43).addBox(2.5F, -5.75F, -6.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1932F, -0.1932F, 0.0033F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Segment3_r7 = Topclaw4.addOrReplaceChild("Segment3_r7", CubeListBuilder.create().texOffs(0, 43).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8336F, -1.591F, -4.75F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bottomclaw4 = Claw4.addOrReplaceChild("Bottomclaw4", CubeListBuilder.create().texOffs(0, 43).addBox(5.9F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.1F, -1.7678F, -5.3033F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0265F, 0.1768F, 0.0533F));

		PartDefinition cube_r67 = Bottomclaw4.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 43).addBox(5.1F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(5.9F, 2.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Toe4 = RToe4.addOrReplaceChild("Toe4", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -2.2274F, -2.8638F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r68 = Toe4.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 27).addBox(4.9997F, -3.6F, -2.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r69 = Toe4.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -1.5F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r70 = Toe4.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 27).addBox(5.0F, -3.1F, -2.4F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2797F, 0.1503F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r71 = Toe4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 27).addBox(4.9998F, -3.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8467F, -0.1307F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Toe4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 27).addBox(4.9999F, -1.5F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7844F, 0.7347F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leg2 = Rbottomleg2.addOrReplaceChild("Leg2", CubeListBuilder.create(), PartPose.offset(-1.3234F, -0.2274F, -0.7898F));

		PartDefinition cube_r73 = Leg2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 27).addBox(-1.8F, -10.05F, -9.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5627F, 1.1595F, 7.5383F, -0.1852F, -0.7813F, 0.1202F));

		PartDefinition cube_r74 = Leg2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 27).addBox(2.1F, -11.0F, -5.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5804F, 1.158F, 7.5568F, 0.5864F, -0.7023F, -0.4165F));

		PartDefinition cube_r75 = Leg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 27).addBox(0.1F, -4.6F, 6.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0146F, -0.5243F, -0.07F, 0.3615F, 0.7521F, 0.248F));

		PartDefinition cube_r76 = Leg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 27).addBox(0.6F, -3.8F, 5.9F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Legbracer2 = Leg2.addOrReplaceChild("Legbracer2", CubeListBuilder.create(), PartPose.offset(1.3234F, 0.2274F, 0.7898F));

		PartDefinition cube_r77 = Legbracer2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(21, 30).addBox(0.6F, -5.6F, 4.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(21, 30).addBox(0.6F, -6.6F, 4.9F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3088F, -0.7517F, -0.8598F, -0.1242F, 0.7844F, -0.0879F));

		PartDefinition cube_r78 = Legbracer2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(21, 30).addBox(5.5F, -5.75F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5901F, -3.1523F, 3.9132F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r79 = Legbracer2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(21, 30).addBox(5.5F, -6.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5901F, -3.0662F, 4.1538F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Lupperleg2 = PIERNA_RIGHT.addOrReplaceChild("Lupperleg2", CubeListBuilder.create(), PartPose.offset(-5.1953F, 10.0F, -9.6949F));

		PartDefinition cube_r80 = Lupperleg2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(44, 21).addBox(0.85F, -9.45F, 6.45F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3916F, -4.5284F, -1.6006F, -0.6569F, 0.7161F, -0.4345F));

		PartDefinition cube_r81 = Lupperleg2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(1, 53).addBox(2.35F, -12.45F, 4.05F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.376F, -7.0619F, -0.9855F, -1.4434F, 0.1819F, -0.802F));

		PartDefinition cube_r82 = Lupperleg2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(52, 31).addBox(3.35F, -9.45F, 3.05F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3916F, -4.5284F, -1.6006F, -1.317F, 0.3061F, -0.7721F));

		PartDefinition UpperBody = partdefinition.addOrReplaceChild("UpperBody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8726F, -3.75F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r83 = UpperBody.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(-2.25F, -9.5F, -1.6F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.991F, 2.5314F, 7.1997F, 1.4468F, -0.1231F, -0.7854F));

		PartDefinition cube_r84 = UpperBody.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(-2.25F, -0.5F, -1.6F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9492F, 2.4493F, 6.4955F, 1.4294F, -0.5124F, -0.731F));

		PartDefinition cube_r85 = UpperBody.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 12).addBox(-1.75F, -0.5F, -1.6F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9492F, 2.4493F, 6.4955F, 1.4294F, 0.5124F, 0.731F));

		PartDefinition cube_r86 = UpperBody.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(37, 12).addBox(-1.75F, -9.5F, -1.6F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.991F, 2.5314F, 7.1997F, 1.4468F, 0.1231F, 0.7854F));

		PartDefinition cube_r87 = UpperBody.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(37, 12).addBox(-2.0F, -4.5F, 0.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.009F, 9.7105F, 16.7575F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r88 = UpperBody.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(8.0F, -7.5F, 4.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.5382F, 0.6863F, 10.4219F, -2.4401F, -0.3383F, -0.2719F));

		PartDefinition cube_r89 = UpperBody.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(-1.5F, -3.5F, -0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2978F, 3.2435F, 11.217F, -2.4576F, -0.2712F, -0.2135F));

		PartDefinition cube_r90 = UpperBody.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(8.0F, -6.0F, 36.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.4667F, -18.7861F, 35.7863F, -2.476F, -0.1689F, -0.1297F));

		PartDefinition cube_r91 = UpperBody.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(37, 12).addBox(-11.0F, -6.0F, 36.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.4607F, -18.7677F, 35.7706F, -2.476F, 0.1689F, 0.1297F));

		PartDefinition cube_r92 = UpperBody.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(37, 12).addBox(-11.0F, -6.0F, 18.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.8688F, -7.3924F, 20.9497F, -2.4576F, 0.2712F, 0.2135F));

		PartDefinition cube_r93 = UpperBody.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(37, 12).addBox(-11.0F, -7.5F, 4.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5323F, 0.7047F, 10.4062F, -2.4401F, 0.3383F, 0.2719F));

		PartDefinition cube_r94 = UpperBody.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(37, 12).addBox(-3.0F, -7.5F, -3.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4142F, 9.5F, -2.3177F, 0.5924F, 0.5412F));

		PartDefinition cube_r95 = UpperBody.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(35, 15).addBox(-18.5F, -5.0F, -18.5F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.6274F, 3.0F, -1.5708F, 0.0F, 0.7854F));

		PartDefinition cube_r96 = UpperBody.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(35, 15).addBox(-3.5F, -2.5F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, -1.5708F, 0.0F, 0.7854F));

		PartDefinition BRAZO_LEFT = partdefinition.addOrReplaceChild("BRAZO_LEFT", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3568F, 7.1905F, -0.511F, 0.3054F, -0.1745F, 0.0F));

		PartDefinition cube_r97 = BRAZO_LEFT.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(31, 61).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2548F, 4.3621F, -10.8438F, 0.3648F, -0.0425F, 0.2293F));

		PartDefinition cube_r98 = BRAZO_LEFT.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(38, 38).addBox(-1.4541F, -3.3126F, -0.2871F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3028F, 1.0641F, -6.5244F, -0.4206F, -0.0425F, 0.2293F));

		PartDefinition cube_r99 = BRAZO_LEFT.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(41, 33).addBox(-1.8838F, -2.1273F, -2.8609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 33).addBox(-3.8838F, -0.1273F, -3.8609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 33).addBox(0.1162F, -0.1273F, -3.8609F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 54).addBox(-2.8838F, -1.1273F, -4.8609F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.027F, 1.9746F, -6.0925F, 0.3648F, -0.0425F, 0.2293F));

		PartDefinition cube_r100 = BRAZO_LEFT.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(44, 40).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1313F, 0.5937F, -1.9775F, 0.4363F, -0.5672F, 0.0F));

		PartDefinition bone15 = BRAZO_LEFT.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2549F, 4.3095F, -10.8439F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bone14 = bone15.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0526F, 0.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition cube_r101 = bone14.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(26, 41).addBox(-0.2305F, -0.9585F, -1.5323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -2.8126F, -1.7128F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r102 = bone14.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(26, 41).addBox(-0.7271F, -0.9063F, -0.1436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -0.8126F, -0.7128F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition bone13 = bone15.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0526F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition cube_r103 = bone13.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(26, 41).addBox(-0.2305F, -0.9585F, -1.5323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -2.8126F, -1.7128F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r104 = bone13.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(26, 41).addBox(-0.7271F, -0.9063F, -0.1436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -0.8126F, -0.7128F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition bone12 = bone15.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.4541F, -2.76F, -1.7128F));

		PartDefinition cube_r105 = bone12.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(26, 41).addBox(-0.2305F, -0.9585F, -1.5323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r106 = bone12.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(26, 41).addBox(-0.7271F, -0.9063F, -0.1436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition BRAZO_RIGHT = partdefinition.addOrReplaceChild("BRAZO_RIGHT", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6432F, 7.1905F, -0.511F, 0.8187F, 0.9354F, 0.8015F));

		PartDefinition cube_r107 = BRAZO_RIGHT.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(41, 33).addBox(-2.9624F, -1.8376F, -5.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 33).addBox(1.0376F, -1.8376F, -5.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 33).addBox(-0.9624F, -3.8376F, -4.7423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 61).addBox(-1.5069F, -1.8376F, -7.7423F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 54).addBox(-1.9624F, -2.8376F, -6.7423F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2501F, 2.0835F, -4.4774F, 0.4035F, -0.8005F, -0.3839F));

		PartDefinition cube_r108 = BRAZO_RIGHT.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(38, 38).addBox(-1.1962F, -2.19F, -1.4068F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.084F, -0.3334F, -5.6392F, -0.4255F, -0.8005F, -0.3839F));

		PartDefinition cube_r109 = BRAZO_RIGHT.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(44, 40).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3418F, 0.3051F, -2.3079F, 0.3054F, -0.5672F, 0.0F));

		PartDefinition bone16 = BRAZO_RIGHT.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2549F, 2.3095F, -9.8439F, 1.1028F, -0.5628F, -0.5173F));

		PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0526F, 0.0F, 0.0F, 0.0F, 1.2654F));

		PartDefinition cube_r110 = bone17.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(26, 41).addBox(-0.2305F, -0.9585F, -1.5323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -2.8126F, -1.7128F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r111 = bone17.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(26, 41).addBox(-0.7271F, -0.9063F, -0.1323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -0.8126F, -0.7128F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition bone18 = bone16.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0526F, 0.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition cube_r112 = bone18.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(26, 41).addBox(-0.2305F, -0.9585F, -1.5323F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -2.8126F, -1.7128F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r113 = bone18.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(26, 41).addBox(-0.7271F, -0.9063F, -0.1436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4541F, -0.8126F, -0.7128F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition bone19 = bone16.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offset(0.4541F, -2.76F, -1.7128F));

		PartDefinition cube_r114 = bone19.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(26, 41).addBox(-0.0658F, -0.74F, -1.6823F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.3684F, -0.0425F, 0.2293F));

		PartDefinition cube_r115 = bone19.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(26, 41).addBox(-0.5658F, -0.64F, -0.1436F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, 0.932F, -0.0425F, 0.2293F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.005F, 16.2F, 13.31F, -0.2618F, 0.0F, -3.1416F));

		PartDefinition cube_r116 = Tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(2.5F, 1.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(55, 0).addBox(-4.5F, 1.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 18).addBox(-1.5F, -1.5F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.505F, -0.7F, 0.19F, 1.5272F, 0.0F, 0.0F));

		PartDefinition bone20 = Tail.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0017F, -0.2755F, 4.3203F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r117 = bone20.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, -0.7642F, -1.0365F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0033F, -0.1129F, 11.4089F, 2.5744F, 0.0F, 0.0F));

		PartDefinition cube_r118 = bone20.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(41, 18).addBox(-3.0F, -3.0F, -1.5F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0033F, 1.1327F, 8.941F, 2.0508F, 0.0F, 0.0F));

		PartDefinition cube_r119 = bone20.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 36).mirror().addBox(0.0F, -1.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0033F, 1.5762F, 9.1719F, 2.041F, 0.1001F, -0.1942F));

		PartDefinition cube_r120 = bone20.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(5, 36).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9967F, 1.5762F, 9.1719F, 2.041F, -0.1001F, 0.1942F));

		PartDefinition cube_r121 = bone20.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(20, 12).mirror().addBox(0.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9933F, 2.237F, 5.9881F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r122 = bone20.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(20, 12).addBox(-3.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0067F, 2.237F, 5.9881F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r123 = bone20.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(41, 18).addBox(-2.5F, -2.8389F, -3.0477F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0067F, 0.1407F, 4.9174F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r124 = bone20.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(20, 12).mirror().addBox(2.5F, 3.5F, -2.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 12).addBox(-4.5F, 3.5F, -2.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(41, 18).addBox(-1.5F, 0.5F, -2.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5067F, -1.4245F, -2.1303F, 1.2217F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		CABEZA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PIERNA_LEFT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PIERNA_RIGHT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		UpperBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BRAZO_LEFT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BRAZO_RIGHT.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}