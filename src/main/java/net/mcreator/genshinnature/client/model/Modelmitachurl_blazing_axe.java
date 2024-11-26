package net.mcreator.genshinnature.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmitachurl_blazing_axe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelmitachurl_blazing_axe"), "main");
	public final ModelPart bone4;
	public final ModelPart bone;
	public final ModelPart belt;
	public final ModelPart LEFT_LEG;
	public final ModelPart bone11;
	public final ModelPart bone2;
	public final ModelPart RIGHT_LEG;
	public final ModelPart bone12;
	public final ModelPart bone3;
	public final ModelPart rotatetors;
	public final ModelPart righthand2;
	public final ModelPart bone5;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart lefthand2;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone10;
	public final ModelPart CABEZA;
	public final ModelPart headrotate;
	public final ModelPart fireaxe;

	public Modelmitachurl_blazing_axe(ModelPart root) {
		this.bone4 = root.getChild("bone4");
		this.bone = this.bone4.getChild("bone");
		this.belt = this.bone.getChild("belt");
		this.LEFT_LEG = this.belt.getChild("LEFT_LEG");
		this.bone11 = this.LEFT_LEG.getChild("bone11");
		this.bone2 = this.bone11.getChild("bone2");
		this.RIGHT_LEG = this.belt.getChild("RIGHT_LEG");
		this.bone12 = this.RIGHT_LEG.getChild("bone12");
		this.bone3 = this.bone12.getChild("bone3");
		this.rotatetors = this.bone4.getChild("rotatetors");
		this.righthand2 = this.rotatetors.getChild("righthand2");
		this.bone5 = this.righthand2.getChild("bone5");
		this.bone8 = this.bone5.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.lefthand2 = this.rotatetors.getChild("lefthand2");
		this.bone6 = this.lefthand2.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone10 = this.bone7.getChild("bone10");
		this.CABEZA = this.rotatetors.getChild("CABEZA");
		this.headrotate = this.CABEZA.getChild("headrotate");
		this.fireaxe = root.getChild("fireaxe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.7031F, 0.0F, 0.1484F, 0.0F, 0.0F));
		PartDefinition bone = bone4.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(60, 32).addBox(-5.5F, 0.8362F, -3.3867F, 11.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(44, 18).addBox(-6.5F, -5.1638F, -4.1289F, 13.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.1442F, 3.0977F, -0.1484F, -0.1571F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(110, 35).addBox(-1.1992F, -5.1992F, -2.6367F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -0.1638F, -0.3555F, 0.0F, 0.0F, -0.1265F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 110).addBox(-6.8869F, -37.4557F, 1.2106F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4667F, 32.6029F, -4.2028F, 0.0F, 0.0F, 0.1265F));
		PartDefinition belt = bone.addOrReplaceChild("belt",
				CubeListBuilder.create().texOffs(60, 0).addBox(-6.8984F, 0.7734F, -3.75F, 14.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 43).addBox(-6.5273F, 0.0F, 0.1367F, 13.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(126, 89)
						.addBox(1.5352F, 0.0F, -3.5273F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(126, 40).addBox(-6.5352F, 0.0F, -3.5273F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 92)
						.addBox(-1.6484F, 0.2734F, -4.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.3011F, -0.3477F));
		PartDefinition cube_r3 = belt.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(78, 10).addBox(-6.5F, -2.6602F, 0.207F, 13.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.5F, 4.0F, 0.2138F, 0.0F, 0.0F));
		PartDefinition cube_r4 = belt.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 99).addBox(-2.526F, -1.2844F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2891F, 0.1647F, 2.1953F, -2.4959F, 0.6F, -2.0061F));
		PartDefinition cube_r5 = belt.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 0).addBox(-0.7773F, -2.2819F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2891F, 0.1647F, 2.1953F, 2.7469F, 0.7755F, 2.8127F));
		PartDefinition cube_r6 = belt.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 99).addBox(-2.526F, -1.2844F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7383F, 0.6413F, -2.168F, 2.6489F, -0.1012F, -1.6156F));
		PartDefinition cube_r7 = belt.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 0).addBox(-0.7773F, -2.2819F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7383F, 0.6413F, -2.168F, 2.9992F, -0.4832F, -2.7011F));
		PartDefinition cube_r8 = belt.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 78).addBox(-6.5F, -0.4669F, 0.4837F, 13.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.2006F, -3.5622F, -0.4756F, 0.0F, 0.0F));
		PartDefinition LEFT_LEG = belt.addOrReplaceChild("LEFT_LEG", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6911F, 1.8166F, 0.4428F, 0.6972F, 0.5786F, 0.3528F));
		PartDefinition cube_r9 = LEFT_LEG.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 25).addBox(-1.276F, 5.8705F, 1.2215F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4365F, -2.8184F, -0.9748F, -0.4781F, 0.0345F, 0.0943F));
		PartDefinition cube_r10 = LEFT_LEG.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 97).addBox(-0.4348F, 3.9609F, -1.8975F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0227F, -4.8166F, -0.1351F, -0.1571F, 0.0F, 0.3491F));
		PartDefinition bone11 = LEFT_LEG.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4365F, 12.8587F, -5.0083F, -0.0584F, -0.0664F, -0.2125F));
		PartDefinition cube_r11 = bone11.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(86, 125).addBox(-2.8732F, 5.1669F, -4.2135F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(128, 16).addBox(0.4901F, 5.1473F, -4.2565F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.832F, -1.6523F, 0.304F, 0.0568F, 0.0235F));
		PartDefinition cube_r12 = bone11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 116).addBox(-1.6927F, 2.2613F, -2.933F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6805F, -2.134F, -1.0391F, 0.2528F, 0.0163F, 0.0134F));
		PartDefinition bone2 = bone11.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8764F, 10.6335F, 0.3784F, -0.2617F, -0.004F, -0.061F));
		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 14).addBox(-0.1507F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.25F, -5.8867F, 0.8415F, 0.2269F, 0.0478F));
		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 74).addBox(-0.5F, 4.9822F, -6.0498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4764F, -5.8561F, -6.2187F, 0.7767F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(82, 49).addBox(-0.8493F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2064F, -6.25F, -5.8867F, 0.8415F, -0.2269F, -0.0478F));
		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(98, 41).addBox(-0.7751F, 6.7156F, -4.5717F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0661F, -7.4174F, -4.1124F, 0.4139F, -0.2269F, -0.0478F));
		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(10, 110).addBox(0.6055F, 6.6539F, -4.6964F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9489F, -7.4174F, -4.1124F, 0.4145F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(129, 0).addBox(-1.4382F, 6.7156F, -4.5554F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9489F, -7.4174F, -4.1124F, 0.4075F, 0.1509F, 0.0141F));
		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 51).addBox(-2.8281F, 6.2536F, -2.3174F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.777F, -7.133F, 0.2681F, -0.0087F, 0.0F, 0.0F));
		PartDefinition RIGHT_LEG = belt.addOrReplaceChild("RIGHT_LEG", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8005F, 3.4533F, 0.5483F, -0.2618F, -0.2618F, 0.0F));
		PartDefinition cube_r20 = RIGHT_LEG.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 102).addBox(-3.724F, 5.8705F, 1.2215F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3197F, -4.4551F, -0.988F, -0.4781F, -0.0345F, -0.0943F));
		PartDefinition cube_r21 = RIGHT_LEG.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(96, 101).addBox(-5.5652F, 3.9609F, -1.8975F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1395F, -6.4533F, -0.1483F, -0.1571F, 0.0F, -0.3491F));
		PartDefinition bone12 = RIGHT_LEG.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(3.1961F, 15.6055F, -10.5298F));
		PartDefinition cube_r22 = bone12.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(40, 129).addBox(-2.4901F, 5.1473F, -4.2565F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-1.1268F, 5.1669F, -4.2135F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8764F, -11.2155F, 3.8559F, 0.304F, -0.0568F, -0.0235F));
		PartDefinition cube_r23 = bone12.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 118).addBox(-2.3073F, 2.2613F, -2.933F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1959F, -6.5175F, 4.4691F, 0.2528F, -0.0163F, -0.0134F));
		PartDefinition bone3 = bone12.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4297F, 5.3242F, 7.7227F, 0.2967F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 59).addBox(-0.8493F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4297F, -5.3242F, -7.7227F, 0.8415F, -0.2269F, -0.0478F));
		PartDefinition cube_r25 = bone3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(74, 85).addBox(-0.5F, 4.9822F, -6.0498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0467F, -4.9303F, -8.0546F, 0.7767F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(54, 88).addBox(-0.1507F, 4.9898F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7767F, -5.3242F, -7.7227F, 0.8415F, 0.2269F, 0.0478F));
		PartDefinition cube_r27 = bone3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(130, 69).addBox(-1.9393F, -5.0522F, -3.1318F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7166F, 4.9188F, -2.7823F, 0.4139F, 0.2269F, 0.0478F));
		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(130, 76).addBox(-0.4081F, -5.0652F, -2.9987F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7166F, 4.9188F, -2.7823F, 0.4145F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(130, 95).addBox(1.2938F, -5.1118F, -3.2448F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7166F, 4.9188F, -2.7823F, 0.4075F, -0.1509F, -0.0141F));
		PartDefinition cube_r30 = bone3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(118, 61).addBox(-2.1719F, 6.2536F, -2.3174F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3473F, -6.2073F, -1.5678F, -0.0087F, 0.0F, 0.0F));
		PartDefinition rotatetors = bone4.addOrReplaceChild("rotatetors", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.624F, 2.1197F, 0.2597F, -0.4184F, -0.0646F));
		PartDefinition cube_r31 = rotatetors.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(12, 0).addBox(-7.5F, -2.2489F, -3.1247F, 15.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.088F, -1.6122F, 0.1091F, 0.0F, 0.0F));
		PartDefinition righthand2 = rotatetors.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7999F, -2.8628F, -0.0904F, -0.2857F, 0.4333F, 0.4894F));
		PartDefinition cube_r32 = righthand2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(74, 118).addBox(6.5087F, -6.3284F, -1.7282F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.265F, 2.9409F, -1.3506F, 0.0783F, -0.076F, 0.7344F));
		PartDefinition cube_r33 = righthand2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(20, 87).addBox(4.2384F, -4.5521F, -1.7478F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.265F, 2.9409F, -1.3506F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone5 = righthand2.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2741F, 1.1019F, -0.3656F, 0.1675F, 0.394F, 0.6403F));
		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(104, 14).addBox(11.2384F, -4.224F, -1.3767F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2226F, 1.839F, -0.9851F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone8 = bone5.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2735F, -0.8041F, -0.0348F, 0.6174F, 0.5305F, 0.3572F));
		PartDefinition cube_r35 = bone8
				.addOrReplaceChild(
						"cube_r35", CubeListBuilder.create().texOffs(104, 0).addBox(23.3321F, -4.8568F, -2.3767F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(118, 69)
								.addBox(17.7149F, -4.2943F, -1.8298F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 107).addBox(20.7149F, -4.6068F, -1.8298F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-18.4961F, 2.6431F, -0.9503F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition cube_r36 = bone8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(86, 66).addBox(4.2721F, 1.2485F, 7.1732F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4964F, -1.5045F, -9.9518F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(7.696F, 1.1028F, 0.2648F, 1.6656F, 0.125F, 0.0605F));
		PartDefinition cube_r37 = bone9.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(130, 105).addBox(-26.8179F, 1.5673F, 21.5699F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 2.7807F, 0.6451F, 2.9489F));
		PartDefinition cube_r38 = bone9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(130, 109).addBox(-22.6801F, 0.3598F, 25.5488F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 2.9779F, 0.8399F, 3.023F));
		PartDefinition cube_r39 = bone9.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(131, 24).addBox(-27.4218F, -0.9766F, 22.1379F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, -3.0554F, 0.661F, -3.1104F));
		PartDefinition cube_r40 = bone9.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 62).addBox(22.1668F, -9.6475F, 17.9941F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, 7.9363F, -1.6787F, 1.2145F, 0.0146F, 0.3759F));
		PartDefinition cube_r41 = bone9.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(131, 50).addBox(17.3881F, 1.8999F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, -0.0571F, 0.9281F, -0.1493F));
		PartDefinition cube_r42 = bone9.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(52, 132).addBox(17.474F, 0.3598F, 25.7172F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.1799F, 0.9171F, 0.1472F));
		PartDefinition cube_r43 = bone9.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(132, 123).addBox(17.6945F, -1.2978F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.3934F, 0.8661F, 0.4208F));
		PartDefinition cube_r44 = bone9.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(120, 32).addBox(27.1485F, -1.2108F, 0.1043F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.109F, -0.0001F, 0.0038F));
		PartDefinition lefthand2 = rotatetors.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7999F, -2.8628F, -0.0904F, -0.2296F, 0.1688F, -0.5781F));
		PartDefinition cube_r45 = lefthand2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(32, 116).addBox(-8.5087F, -6.3284F, -1.7282F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7185F, 2.7599F, -1.0452F, 0.0783F, 0.076F, -0.7344F));
		PartDefinition cube_r46 = lefthand2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 85).addBox(-11.2384F, -4.5521F, -1.7478F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7185F, 2.7599F, -1.0452F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone6 = lefthand2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8205F, 0.9209F, -0.0601F, -0.5824F, -0.2563F, -0.2014F));
		PartDefinition cube_r47 = bone6.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(102, 87).addBox(-18.2384F, -4.224F, -1.3767F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.2226F, 1.839F, -0.9851F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2735F, -0.8041F, -0.0348F, 1.6795F, -1.1894F, -2.4299F));
		PartDefinition cube_r48 = bone7.addOrReplaceChild(
				"cube_r48", CubeListBuilder.create().texOffs(22, 102).addBox(-26.3321F, -4.8568F, -2.3767F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(117, 0)
						.addBox(-20.7149F, -4.2943F, -1.8298F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 97).addBox(-25.7149F, -4.6068F, -1.8298F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.4961F, 2.6431F, -0.9503F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition cube_r49 = bone7.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 49).addBox(-13.2721F, 1.2485F, 7.1732F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4964F, -1.5045F, -9.9518F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.3992F, 0.5012F, 0.2648F, 0.3568F, -0.006F, 0.1062F));
		PartDefinition cube_r50 = bone10.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 83).addBox(21.8179F, 1.5673F, 21.5699F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 2.7807F, -0.6451F, -2.9489F));
		PartDefinition cube_r51 = bone10.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 88).addBox(17.6801F, 0.3598F, 25.5488F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 2.9779F, -0.8399F, -3.023F));
		PartDefinition cube_r52 = bone10.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(58, 97).addBox(22.4218F, -0.9766F, 21.1379F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, -3.0554F, -0.661F, 3.1104F));
		PartDefinition cube_r53 = bone10.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(12, 18).addBox(-27.2879F, -6.6554F, 10.412F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 1.2145F, -0.0146F, -0.3759F));
		PartDefinition cube_r54 = bone10.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(102, 97).addBox(-22.3881F, 1.8999F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, -0.0571F, -0.9281F, 0.1493F));
		PartDefinition cube_r55 = bone10.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(107, 83).addBox(-22.474F, 0.3598F, 25.7172F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.1799F, -0.9171F, -0.1472F));
		PartDefinition cube_r56 = bone10.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(126, 46).addBox(-22.6945F, -1.2978F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.3934F, -0.8661F, -0.4208F));
		PartDefinition cube_r57 = bone10.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(118, 115).addBox(-33.1485F, -1.2108F, 0.1043F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.109F, 0.0001F, -0.0038F));
		PartDefinition CABEZA = rotatetors.addOrReplaceChild("CABEZA", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0486F, -8.8762F, -2.8027F, -0.0413F, 0.2132F, -0.0019F));
		PartDefinition cube_r58 = CABEZA.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(121, 78).addBox(-0.6914F, -3.0F, -2.582F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2606F, 10.4338F, 6.7141F, -1.4953F, -0.0234F, 0.2432F));
		PartDefinition cube_r59 = CABEZA.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(70, 129).addBox(0.2578F, -3.0F, -2.582F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8735F, 10.4338F, 6.7141F, -1.4953F, 0.0234F, 0.0F));
		PartDefinition cube_r60 = CABEZA.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(60, 3).addBox(-1.5F, -2.3282F, 3.8359F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 42).addBox(-0.5391F, -2.3282F, 1.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7101F, 0.1719F, -5.7123F, 0.1761F, 0.2049F, 0.1957F));
		PartDefinition cube_r61 = CABEZA.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(40, 32).addBox(-4.5F, 0.3711F, 0.7148F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8781F, -2.6874F, -5.7123F, 0.6778F, -0.0401F, 0.1429F));
		PartDefinition cube_r62 = CABEZA.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(29, 18).addBox(-4.5F, 0.6249F, -2.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0764F, -5.6719F, -0.019F, 0.3506F, -0.0401F, 0.1429F));
		PartDefinition cube_r63 = CABEZA.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(91, 53).addBox(0.0F, -3.5F, -3.5F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8946F, 0.7747F, 6.5649F, -0.3001F, 0.1215F, 0.105F));
		PartDefinition cube_r64 = CABEZA.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(45, 0).addBox(-3.5F, 0.332F, -3.1836F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5156F, -4.0513F, 8.0584F, -0.0378F, -0.0401F, 0.1429F));
		PartDefinition cube_r65 = CABEZA.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(21, 78).addBox(-3.0F, 0.3164F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8602F, -0.3515F, 10.0243F, -0.6137F, -0.0401F, 0.1429F));
		PartDefinition cube_r66 = CABEZA.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(35, 55).addBox(0.1055F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7541F, 3.5588F, 6.814F, -0.9754F, 0.0427F, 0.0608F));
		PartDefinition cube_r67 = CABEZA.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(102, 120).addBox(-0.1758F, -3.5F, -1.6953F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0216F, 6.2986F, 6.9099F, -1.4921F, -0.0066F, 0.0257F));
		PartDefinition cube_r68 = CABEZA.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(81, 25).addBox(-2.5F, -0.0039F, -2.8008F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0365F, 5.5427F, 10.8492F, -1.2316F, -0.0161F, 0.1475F));
		PartDefinition cube_r69 = CABEZA.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, 0.2695F, -2.5195F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6686F, 10.1358F, 10.4223F, -1.2423F, -0.0234F, 0.2432F));
		PartDefinition cube_r70 = CABEZA.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(60, 3).addBox(1.5F, -2.3282F, 4.8359F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 42).addBox(0.5391F, -2.3282F, 1.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8073F, 0.1719F, -5.7123F, 0.1761F, -0.2049F, -0.1957F));
		PartDefinition cube_r71 = CABEZA.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(40, 32).addBox(-3.5F, 0.3711F, 0.7148F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9753F, -2.6874F, -5.7123F, 0.6778F, 0.0401F, -0.1429F));
		PartDefinition cube_r72 = CABEZA.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(29, 18).addBox(-3.5F, 0.6249F, -2.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1736F, -5.6719F, -0.019F, 0.3506F, 0.0401F, -0.1429F));
		PartDefinition cube_r73 = CABEZA.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(91, 53).addBox(0.0F, -3.5F, -3.5F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9918F, 0.7747F, 6.5649F, -0.3001F, -0.1215F, -0.105F));
		PartDefinition cube_r74 = CABEZA.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 0).addBox(-3.5F, 0.332F, -3.1836F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6129F, -4.0513F, 8.0584F, -0.0378F, 0.0401F, -0.1429F));
		PartDefinition cube_r75 = CABEZA.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(21, 78).addBox(-3.0F, 0.3164F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9575F, -0.3515F, 10.0243F, -0.6137F, 0.0401F, -0.1429F));
		PartDefinition cube_r76 = CABEZA.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(35, 55).addBox(-0.1055F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8513F, 3.5588F, 6.814F, -0.9754F, -0.0427F, -0.0608F));
		PartDefinition cube_r77 = CABEZA.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(102, 120).addBox(0.1758F, -3.5F, -1.6953F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1189F, 6.2986F, 6.9099F, -1.4921F, 0.0066F, -0.0257F));
		PartDefinition cube_r78 = CABEZA.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(81, 25).addBox(-2.5F, -0.0039F, -2.8008F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1338F, 5.5427F, 10.8492F, -1.2316F, 0.0161F, -0.1475F));
		PartDefinition cube_r79 = CABEZA.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(7, 0).addBox(-1.0F, 0.2695F, -2.5195F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7658F, 10.1358F, 10.4223F, -1.2423F, 0.0234F, -0.2432F));
		PartDefinition cube_r80 = CABEZA.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(121, 78).mirror().addBox(-1.3086F, -3.0F, -2.582F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4633F, 10.4338F, 6.7141F, -1.4953F, 0.0234F, -0.2432F));
		PartDefinition cube_r81 = CABEZA.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(42, 109).addBox(-2.0703F, -3.1055F, -3.0742F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4375F, 6.3298F, 7.2924F, -1.4934F, -0.0161F, 0.1475F));
		PartDefinition cube_r82 = CABEZA.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(108, 128).addBox(1.875F, -3.5F, -2.5F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.562F, 5.8578F, 6.8616F, -1.4934F, 0.0161F, 0.0F));
		PartDefinition cube_r83 = CABEZA.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(42, 109).mirror().addBox(-2.9297F, -3.1055F, -3.0742F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6402F, 6.3298F, 7.2924F, -1.4934F, 0.0161F, -0.1475F));
		PartDefinition cube_r84 = CABEZA.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(81, 78).addBox(-0.2309F, -10.9003F, -2.7521F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, 5.2139F, -0.4956F, -0.9742F, -0.0161F, 0.1475F));
		PartDefinition cube_r85 = CABEZA.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(105, 52).addBox(-1.3863F, -10.9003F, -2.7521F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0486F, 5.2139F, -0.4956F, -0.9742F, 0.0161F, 0.0F));
		PartDefinition cube_r86 = CABEZA.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-5.7691F, -10.9003F, -2.7521F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3615F, 5.2139F, -0.4956F, -0.9742F, 0.0161F, -0.1475F));
		PartDefinition cube_r87 = CABEZA.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(107, 69).addBox(-1.1402F, -10.7714F, -1.006F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0486F, 5.2139F, -0.4956F, -0.2979F, 0.0161F, 0.0F));
		PartDefinition cube_r88 = CABEZA.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(60, 71).addBox(-0.4184F, -10.7714F, -1.006F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, 5.2139F, -0.4956F, -0.2979F, -0.0161F, 0.1475F));
		PartDefinition cube_r89 = CABEZA.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(60, 71).mirror().addBox(-6.5816F, -10.7714F, -1.006F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3615F, 5.2139F, -0.4956F, -0.2979F, 0.0161F, -0.1475F));
		PartDefinition cube_r90 = CABEZA.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(84, 107).addBox(-0.5659F, -10.4839F, -0.3747F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0486F, 5.2139F, -0.4956F, 0.1079F, 0.0161F, 0.0F));
		PartDefinition cube_r91 = CABEZA.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(12, 62).addBox(-6.9956F, -10.4057F, -0.3747F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-7.0386F, -9.4057F, -3.3513F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3615F, 5.2139F, -0.4956F, 0.1079F, 0.0161F, -0.1475F));
		PartDefinition cube_r92 = CABEZA.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(61, 55).addBox(-1.0044F, -10.4057F, -0.3747F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(12, 18).addBox(-0.9535F, -9.4069F, -3.3747F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5642F, 5.2139F, -0.4956F, 0.1079F, -0.0161F, 0.1475F));
		PartDefinition cube_r93 = CABEZA.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(42, 62).addBox(-0.4961F, -9.4881F, -3.3278F, 1.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0486F, 5.2139F, -0.4956F, 0.1091F, 0.0F, 0.0F));
		PartDefinition headrotate = CABEZA.addOrReplaceChild("headrotate", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2196F, -0.4413F, -4.9428F, 0.0228F, 0.0273F, 0.0433F));
		PartDefinition cube_r94 = headrotate.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(40, 32).addBox(-4.5F, -0.1406F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0977F, -2.2461F, -0.7695F, 0.7607F, -0.0401F, 0.1429F));
		PartDefinition cube_r95 = headrotate.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(40, 32).addBox(-3.5F, -0.1406F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7557F, -2.2461F, -0.7695F, 0.7607F, 0.0401F, -0.1429F));
		PartDefinition cube_r96 = headrotate.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(12, 5).mirror().addBox(3.9727F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.6193F, 0.328F, -1.2848F, 0.3334F, 0.2414F, -0.0297F));
		PartDefinition cube_r97 = headrotate.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(118, 132).mirror().addBox(4.0F, 0.4057F, 0.6434F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.6841F, -0.9835F, -5.4946F, -0.0715F, 0.225F, -0.0539F));
		PartDefinition cube_r98 = headrotate.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(111, 24).mirror().addBox(2.0F, -0.4682F, -1.48F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.6841F, -0.9835F, -5.4946F, -0.7173F, 0.225F, -0.0539F));
		PartDefinition cube_r99 = headrotate.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 97).mirror().addBox(-0.5F, 0.4805F, -4.3682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6841F, -0.9835F, -5.4946F, -1.0446F, 0.225F, -0.0539F));
		PartDefinition cube_r100 = headrotate.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(68, 97).addBox(-0.5F, 0.4805F, -4.3682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7762F, -0.9835F, -5.4946F, -1.0446F, -0.225F, 0.0539F));
		PartDefinition cube_r101 = headrotate.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(111, 24).addBox(-4.0F, -0.4682F, -1.48F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7762F, -0.9835F, -5.4946F, -0.7173F, -0.225F, 0.0539F));
		PartDefinition cube_r102 = headrotate.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(118, 132).addBox(-6.0F, 0.4057F, 0.6434F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.7762F, -0.9835F, -5.4946F, -0.0715F, -0.225F, 0.0539F));
		PartDefinition cube_r103 = headrotate.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(12, 5).addBox(-5.9727F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7113F, 0.328F, -1.2848F, 0.3334F, -0.2414F, 0.0297F));
		PartDefinition cube_r104 = headrotate.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(51, 6).addBox(-4.0F, -1.0F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4288F, 0.7502F, -2.9939F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r105 = headrotate.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(59, 6).addBox(0.0F, -1.0F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3155F, 0.7502F, -2.9939F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r106 = headrotate.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(12, 66).addBox(-7.0F, -2.0F, -0.25F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3546F, 3.7502F, -3.2439F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r107 = headrotate.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(60, 75).addBox(4.0F, -2.0F, -0.25F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(70, 118).addBox(0.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3155F, 3.7502F, -3.2439F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r108 = headrotate.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(16, 0).addBox(-1.9365F, -1.5F, 0.3767F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6923F, 6.2658F, -3.465F, 0.066F, 0.1306F, 0.0086F));
		PartDefinition cube_r109 = headrotate.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(68, 43).addBox(-0.0635F, -1.5F, 0.3767F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3624F, 6.2658F, -3.465F, 0.066F, -0.1306F, -0.0086F));
		PartDefinition cube_r110 = headrotate.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(12, 62).addBox(-1.9365F, -1.5F, -0.6233F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3624F, 6.2658F, -2.965F, 0.066F, 0.1306F, 0.0086F));
		PartDefinition cube_r111 = headrotate.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(60, 71).addBox(-0.0635F, -1.5F, -0.6233F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3624F, 6.2658F, -2.965F, 0.066F, -0.1306F, -0.0086F));
		PartDefinition cube_r112 = headrotate.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(28, 116).addBox(-4.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4288F, 3.7502F, -3.2439F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r113 = headrotate.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(80, 131).addBox(-1.0034F, -3.6894F, -0.9939F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.171F, 2.9263F, -1.2476F, 0.2163F, -0.0243F, 0.0023F));
		PartDefinition cube_r114 = headrotate.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(116, 123).addBox(0.4386F, -3.8168F, -0.9308F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3447F, 2.9263F, -1.2476F, 0.2174F, -0.0103F, 0.148F));
		PartDefinition cube_r115 = headrotate.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(124, 7).addBox(-6.4386F, -3.8168F, -0.9308F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5811F, 2.9263F, -1.2476F, 0.2174F, 0.0103F, -0.148F));
		PartDefinition cube_r116 = headrotate.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(128, 128).addBox(-0.6033F, -8.8396F, -4.6375F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.171F, 5.6553F, 4.4472F, 0.2749F, 0.0F, 0.0F));
		PartDefinition cube_r117 = headrotate.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(80, 92).addBox(-6.3535F, -8.8795F, -4.7274F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5811F, 5.6553F, 4.4472F, 0.272F, 0.0401F, -0.1429F));
		PartDefinition cube_r118 = headrotate.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 95).addBox(-0.3848F, -8.8795F, -4.7469F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3447F, 5.6553F, 4.4472F, 0.272F, -0.0401F, 0.1429F));
		PartDefinition fireaxe = partdefinition.addOrReplaceChild("fireaxe", CubeListBuilder.create(), PartPose.offsetAndRotation(22.1328F, 8.273F, -4.023F, -0.0216F, 0.4897F, -0.8131F));
		PartDefinition cube_r119 = fireaxe.addOrReplaceChild("cube_r119",
				CubeListBuilder.create().texOffs(0, 74).addBox(-1.5F, 27.4558F, -1.4908F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 134).addBox(-2.0F, -28.0442F, -1.9908F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(116, 24)
						.addBox(-2.5F, -32.0442F, -2.4908F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 127).addBox(-2.0F, 23.7058F, -1.9908F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 116)
						.addBox(0.0F, -44.9558F, 3.4908F, 0.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(152, 12).addBox(-0.5F, -47.9558F, -14.0092F, 1.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
						.addBox(0.0F, -47.9558F, -14.0092F, 0.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(60, 32).addBox(-1.0F, -41.9558F, 2.4908F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 113)
						.addBox(-2.0F, -42.9558F, -2.5092F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.5F, -46.2058F, -1.5092F, 3.0F, 71.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 130)
						.addBox(-1.0F, 21.7058F, -0.9908F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3105F, -24.0331F, -6.8812F, 0.3272F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		fireaxe.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
