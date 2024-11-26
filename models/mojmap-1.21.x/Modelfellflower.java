// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelfellflower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "fellflower"), "main");
	private final ModelPart Head;
	private final ModelPart leaves;
	private final ModelPart leaves2;
	private final ModelPart leaves3;
	private final ModelPart body;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart decorations;
	private final ModelPart decorations2;
	private final ModelPart decorations3;
	private final ModelPart decorations4;
	private final ModelPart decorations6;
	private final ModelPart decorations7;
	private final ModelPart decorations5;

	public Modelfellflower(ModelPart root) {
		this.Head = root.getChild("Head");
		this.leaves = this.Head.getChild("leaves");
		this.leaves2 = this.Head.getChild("leaves2");
		this.leaves3 = this.Head.getChild("leaves3");
		this.body = root.getChild("body");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.decorations = root.getChild("decorations");
		this.decorations2 = root.getChild("decorations2");
		this.decorations3 = root.getChild("decorations3");
		this.decorations4 = root.getChild("decorations4");
		this.decorations6 = root.getChild("decorations6");
		this.decorations7 = root.getChild("decorations7");
		this.decorations5 = root.getChild("decorations5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -24.0F, -12.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(108, 48).addBox(-4.5F, -33.0F, -6.0F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -33.0F, 0.0F));

		PartDefinition leaves = Head.addOrReplaceChild("leaves", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r1 = leaves.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -21.0F, -10.5F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r2 = leaves.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.7265F, -35.1404F, -22.6257F, 2.138F, -0.6981F, 0.0F));

		PartDefinition leaves2 = Head.addOrReplaceChild("leaves2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition Head_r3 = leaves2.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -21.0F, -10.5F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r4 = leaves2.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.7265F, -35.1404F, -22.6257F, 2.138F, -0.6981F, 0.0F));

		PartDefinition leaves3 = Head.addOrReplaceChild("leaves3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0497F, -35.1166F, 13.0332F, 2.6467F, -0.5989F, -2.8086F));

		PartDefinition Head_r5 = leaves3.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(168, 99).addBox(-3.0F, -24.0F, -1.5F, 9.0F, 30.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.5248F, 7.1935F, 12.6223F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r6 = leaves3.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(156, 57).addBox(-7.2265F, -26.3596F, 0.1257F, 15.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7983F, -6.9468F, 0.4966F, 2.138F, -0.6981F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, -57.0F, -3.0F, 6.0F, 57.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(53, 73).addBox(-3.0F, -51.0F, -6.0F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 53).addBox(-3.0F, -57.0F, -6.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(51, 83).addBox(-3.0F, -51.0F, 3.0F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 118).addBox(-9.0F, -24.0F, -6.0F, 6.0F, 24.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 110).addBox(-6.0F, -24.0F, 3.0F, 12.0F, 24.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 109).addBox(-6.0F, -24.0F, -9.0F, 12.0F, 24.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 168).addBox(-6.0F, -24.0F, -9.09F, 12.0F, 24.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 115).addBox(3.0F, -24.0F, -6.0F, 6.0F, 24.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(4, 132).addBox(3.0F, -15.0F, -12.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(2, 140).addBox(-6.0F, -15.0F, -12.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(10, 95).addBox(3.0F, -15.0F, 9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(30, 105).addBox(-6.0F, -15.0F, 9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(174, 162).addBox(1.5F, 0.0F, -3.0F, 3.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5F, -24.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(174, 162).addBox(-4.5F, 0.0F, -3.0F, 3.0F, 24.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, -24.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 74).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(53, 73).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -49.5F, 4.5F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 68).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(53, 73).addBox(-3.0F, -1.5F, -10.5F, 6.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -49.5F, 4.5F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(93, 76).addBox(-6.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 77).addBox(3.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(92, 78).addBox(3.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 76).addBox(-6.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 76).addBox(-3.0F, 1.5F, -1.5F, 6.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -55.5F, 4.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 76).addBox(3.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 77).addBox(-6.0F, 10.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(92, 76).addBox(-6.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 77).addBox(3.0F, 22.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 75).addBox(-3.0F, 1.5F, -1.5F, 6.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -55.5F, -4.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(56, 129).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(10.5F, 18.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(57, 128).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.5F, 18.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(4.5F, -31.5F, 0.0F));

		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(91, 76).addBox(-1.5F, 19.5F, 3.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 76).addBox(-1.5F, 7.5F, 3.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 77).addBox(-1.5F, 19.5F, -6.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 76).addBox(-1.5F, 7.5F, -6.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 75).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 33.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-4.5F, -31.5F, 0.0F));

		PartDefinition cube_r8 = leftarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(92, 75).addBox(-1.5F, 19.5F, -6.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 77).addBox(-1.5F, 19.5F, 3.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 77).addBox(-1.5F, 7.5F, 3.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(93, 77).addBox(-1.5F, 7.5F, -6.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 75).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 33.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition decorations = partdefinition.addOrReplaceChild("decorations", CubeListBuilder.create(), PartPose.offset(0.0F, -36.0F, 0.0F));

		PartDefinition cube_r9 = decorations.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.6042F, 12.2658F, -14.2763F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r10 = decorations.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.5F, -6.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations2 = partdefinition.addOrReplaceChild("decorations2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = decorations2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.6042F, 12.2658F, -14.2763F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r12 = decorations2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.5F, -6.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations3 = partdefinition.addOrReplaceChild("decorations3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r13 = decorations3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.6042F, 12.2658F, -14.2763F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r14 = decorations3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.5F, -6.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations4 = partdefinition.addOrReplaceChild("decorations4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = decorations4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(180, 0).addBox(-1.7042F, -1.6229F, 3.984F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(180, 0).addBox(-1.7042F, -1.6229F, -5.016F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(174, 0).addBox(-1.7042F, 1.3771F, -2.016F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.6042F, 12.2658F, -14.2763F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r16 = decorations4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(174, 0).addBox(-1.5F, -1.5F, -3.0F, 3.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 4.5F, -6.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations6 = partdefinition.addOrReplaceChild("decorations6", CubeListBuilder.create().texOffs(113, 129).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(115, 132).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(115, 131).addBox(-1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(114, 129).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(114, 130).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(116, 134).addBox(3.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(116, 133).addBox(-6.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-24.0F, -24.0F, 3.0F));

		PartDefinition decorations7 = partdefinition.addOrReplaceChild("decorations7", CubeListBuilder.create().texOffs(112, 128).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(117, 133).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(116, 133).addBox(-1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(118, 130).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(117, 131).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(116, 133).addBox(3.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(117, 131).addBox(-6.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 21.0F));

		PartDefinition decorations5 = partdefinition.addOrReplaceChild("decorations5", CubeListBuilder.create().texOffs(114, 129).addBox(21.0F, -51.0F, 0.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(115, 130).addBox(22.5F, -49.5F, -3.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(115, 133).addBox(22.5F, -49.5F, 6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(115, 131).addBox(22.5F, -54.0F, 1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(117, 133).addBox(22.5F, -45.0F, 1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(115, 130).addBox(27.0F, -49.5F, 1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(117, 131).addBox(18.0F, -49.5F, 1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}