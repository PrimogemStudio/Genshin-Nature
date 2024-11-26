// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Modelpyro_whopperflower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pyro_whopperflower"), "main");
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
	private final ModelPart decorations5;
	private final ModelPart decorations6;
	private final ModelPart decorations7;

	public Modelpyro_whopperflower(ModelPart root) {
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
		this.decorations5 = root.getChild("decorations5");
		this.decorations6 = root.getChild("decorations6");
		this.decorations7 = root.getChild("decorations7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(36, 16).addBox(-1.5F, -11.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition leaves = Head.addOrReplaceChild("leaves", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Head_r1 = leaves.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, -3.5F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r2 = leaves.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9088F, -11.7135F, -7.5419F, 2.138F, -0.6981F, 0.0F));

		PartDefinition leaves2 = Head.addOrReplaceChild("leaves2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, 1.5708F, 0.3491F));

		PartDefinition Head_r3 = leaves2.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -7.0F, -3.5F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r4 = leaves2.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9088F, -11.7135F, -7.5419F, 2.138F, -0.6981F, 0.0F));

		PartDefinition leaves3 = Head.addOrReplaceChild("leaves3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6832F, -11.7055F, 4.3444F, 2.6467F, -0.5989F, -2.8086F));

		PartDefinition Head_r5 = leaves3.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(56, 33).addBox(-1.0F, -8.0F, -0.5F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1749F, 2.3978F, 4.2074F, 0.8727F, -0.6981F, 0.0F));

		PartDefinition Head_r6 = leaves3.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(52, 19).addBox(-2.4088F, -8.7865F, 0.0419F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2661F, -2.3156F, 0.1655F, 2.138F, -0.6981F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 23).addBox(-1.0F, -17.0F, -2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 53).addBox(-1.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 23).addBox(-1.0F, -17.0F, 1.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-3.0F, -8.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-2.0F, -8.0F, 1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-2.0F, -8.0F, -3.03F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 42).addBox(1.0F, -8.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(2, 45).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 45).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 45).addBox(1.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 45).addBox(-2.0F, -5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 54).addBox(0.5F, 0.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -8.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 54).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -8.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 23).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.5F, 1.5F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 23).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.5F, 1.5F, 0.0F, 0.0F, 0.6109F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 25).addBox(-2.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(1.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(1.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-2.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.5F, 1.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 25).addBox(1.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-2.0F, 3.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-2.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(1.0F, 7.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.5F, -1.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(19, 42).addBox(3.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(19, 42).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 22.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(1.5F, 5.5F, 0.0F));

		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 25).addBox(-0.5F, 6.5F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 2.5F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 6.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 2.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-1.5F, 5.5F, 0.0F));

		PartDefinition cube_r8 = leftarm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 25).addBox(-0.5F, 6.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 6.5F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 2.5F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, 2.5F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition decorations = partdefinition.addOrReplaceChild("decorations", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition cube_r9 = decorations.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8681F, 4.0886F, -4.7588F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r10 = decorations.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, -2.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations2 = partdefinition.addOrReplaceChild("decorations2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r11 = decorations2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8681F, 4.0886F, -4.7588F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r12 = decorations2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, -2.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations3 = partdefinition.addOrReplaceChild("decorations3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r13 = decorations3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8681F, 4.0886F, -4.7588F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r14 = decorations3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, -2.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations4 = partdefinition.addOrReplaceChild("decorations4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = decorations4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5681F, -0.541F, 1.328F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, -0.541F, -1.672F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 0).addBox(-0.5681F, 0.459F, -0.672F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8681F, 4.0886F, -4.7588F, -0.2877F, 0.5467F, -0.5175F));

		PartDefinition cube_r16 = decorations4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.5F, -2.0F, -0.5208F, 0.3352F, -1.05F));

		PartDefinition decorations5 = partdefinition.addOrReplaceChild("decorations5", CubeListBuilder.create().texOffs(38, 43).addBox(7.0F, -17.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(7.5F, -16.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(7.5F, -16.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(7.5F, -18.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(7.5F, -15.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(9.0F, -16.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(6.0F, -16.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition decorations6 = partdefinition.addOrReplaceChild("decorations6", CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 8.0F, 1.0F));

		PartDefinition decorations7 = partdefinition.addOrReplaceChild("decorations7", CubeListBuilder.create().texOffs(38, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 43).addBox(-2.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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
		decorations5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		decorations7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}