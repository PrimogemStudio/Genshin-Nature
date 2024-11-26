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
public class Modelmitachurl_noweapon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelmitachurl_noweapon"), "main");
	public final ModelPart bone4;
	public final ModelPart bone;
	public final ModelPart belt;
	public final ModelPart PIERNA_LEFT;
	public final ModelPart bone11;
	public final ModelPart PIERNA_RIGHT;
	public final ModelPart bone12;
	public final ModelPart rotatetors;
	public final ModelPart BRAZO_RIGHT;
	public final ModelPart bone5;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart BRAZO_LEFT;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone10;
	public final ModelPart CABEZA;
	public final ModelPart headrotate;

	public Modelmitachurl_noweapon(ModelPart root) {
		this.bone4 = root.getChild("bone4");
		this.bone = this.bone4.getChild("bone");
		this.belt = this.bone.getChild("belt");
		this.PIERNA_LEFT = this.belt.getChild("PIERNA_LEFT");
		this.bone11 = this.PIERNA_LEFT.getChild("bone11");
		this.PIERNA_RIGHT = this.belt.getChild("PIERNA_RIGHT");
		this.bone12 = this.PIERNA_RIGHT.getChild("bone12");
		this.rotatetors = this.bone4.getChild("rotatetors");
		this.BRAZO_RIGHT = this.rotatetors.getChild("BRAZO_RIGHT");
		this.bone5 = this.BRAZO_RIGHT.getChild("bone5");
		this.bone8 = this.bone5.getChild("bone8");
		this.bone9 = this.bone8.getChild("bone9");
		this.BRAZO_LEFT = this.rotatetors.getChild("BRAZO_LEFT");
		this.bone6 = this.BRAZO_LEFT.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone10 = this.bone7.getChild("bone10");
		this.CABEZA = this.rotatetors.getChild("CABEZA");
		this.headrotate = this.CABEZA.getChild("headrotate");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone = bone4.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(48, 0).addBox(-5.5F, 0.8362F, -3.3867F, 11.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 44).addBox(-6.5F, -5.1638F, -4.1289F, 13.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.8011F, 3.0977F, 0.0F, -0.1571F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 107).addBox(-1.1992F, -5.1992F, -2.6367F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -0.1638F, -0.3555F, 0.0F, 0.0F, -0.1265F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 107).addBox(-6.8869F, -37.4557F, 1.2106F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4667F, 32.6029F, -4.2028F, 0.0F, 0.0F, 0.1265F));
		PartDefinition belt = bone.addOrReplaceChild("belt",
				CubeListBuilder.create().texOffs(42, 44).addBox(-6.8984F, 0.7734F, -3.75F, 14.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 54).addBox(-6.5273F, 0.0F, 0.1367F, 13.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(123, 18)
						.addBox(1.5352F, 0.0F, -3.5273F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(119, 9).mirror().addBox(-6.5352F, 0.0F, -3.5273F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(51, 104)
						.addBox(-1.6484F, 0.2734F, -4.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.3011F, -0.3477F));
		PartDefinition cube_r3 = belt.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(37, 137).addBox(-6.5F, -2.6602F, 0.207F, 13.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.5F, 4.0F, 0.2138F, 0.0F, 0.0F));
		PartDefinition cube_r4 = belt.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(133, 9).addBox(-2.526F, -1.2844F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2891F, 0.1647F, 2.1953F, -2.4959F, 0.6F, -2.0061F));
		PartDefinition cube_r5 = belt.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(139, 2).addBox(-0.7773F, -2.2819F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2891F, 0.1647F, 2.1953F, 2.7469F, 0.7755F, 2.8127F));
		PartDefinition cube_r6 = belt.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(133, 9).addBox(-2.526F, -1.2844F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7383F, 0.6413F, -2.168F, 2.6489F, -0.1012F, -1.6156F));
		PartDefinition cube_r7 = belt.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(139, 2).addBox(-0.7773F, -2.2819F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7383F, 0.6413F, -2.168F, 2.9992F, -0.4832F, -2.7011F));
		PartDefinition cube_r8 = belt.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 136).addBox(-6.5F, -0.4669F, 0.4837F, 13.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.2006F, -3.5622F, -0.4756F, 0.0F, 0.0F));
		PartDefinition PIERNA_LEFT = belt.addOrReplaceChild("PIERNA_LEFT", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.787F, 3.6812F, -1.1253F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r9 = PIERNA_LEFT.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 88).addBox(-1.276F, 5.8705F, 1.2215F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7497F, -4.683F, 0.5646F, -0.4781F, 0.0345F, 0.0943F));
		PartDefinition cube_r10 = PIERNA_LEFT.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 17).addBox(-0.4348F, 3.9609F, -1.8975F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7095F, -6.6812F, 1.4043F, -0.1571F, 0.0F, 0.3491F));
		PartDefinition bone11 = PIERNA_LEFT.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-0.7497F, 4.1621F, -5.1212F));
		PartDefinition cube_r11 = bone11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(122, 36).mirror().addBox(-2.8732F, 5.1669F, -4.2135F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(45, 80).mirror()
				.addBox(0.4901F, 5.1473F, -4.2565F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.304F, 0.0568F, 0.0235F));
		PartDefinition cube_r12 = bone11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(67, 67).addBox(-0.1507F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8764F, 11.2155F, -3.8559F, 0.8415F, 0.2269F, 0.0478F));
		PartDefinition cube_r13 = bone11.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(20, 74).addBox(-0.5F, 4.9822F, -6.0498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4F, 11.6095F, -4.1879F, 0.7767F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone11.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(77, 4).addBox(-0.8493F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.33F, 11.2155F, -3.8559F, 0.8415F, -0.2269F, -0.0478F));
		PartDefinition cube_r15 = bone11.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(126, 57).addBox(-0.7751F, 6.7156F, -4.5717F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1897F, 10.0482F, -2.0816F, 0.4139F, -0.2269F, -0.0478F));
		PartDefinition cube_r16 = bone11.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(101, 126).addBox(0.6055F, 6.6539F, -4.6964F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9275F, 10.0482F, -2.0816F, 0.4145F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bone11.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 127).addBox(-1.4382F, 6.7156F, -4.5554F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9275F, 10.0482F, -2.0816F, 0.4075F, 0.1509F, 0.0141F));
		PartDefinition cube_r18 = bone11.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 53).addBox(-2.8281F, 6.2536F, -2.3174F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0994F, 10.3325F, 2.2989F, -0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bone11.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(108, 96).addBox(-1.6927F, 2.2613F, -2.933F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6805F, 4.6981F, 0.6132F, 0.2528F, 0.0163F, 0.0134F));
		PartDefinition PIERNA_RIGHT = belt.addOrReplaceChild("PIERNA_RIGHT", CubeListBuilder.create(), PartPose.offsetAndRotation(4.787F, 3.6812F, -0.0628F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r20 = PIERNA_RIGHT.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 90).addBox(-3.724F, 5.8705F, 1.2215F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4909F, -4.6829F, -0.4013F, -0.4781F, -0.0345F, -0.0943F));
		PartDefinition cube_r21 = PIERNA_RIGHT.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(93, 84).addBox(-5.5652F, 3.9609F, -1.8975F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9683F, -6.6812F, 0.4384F, -0.1571F, 0.0F, -0.3491F));
		PartDefinition bone12 = PIERNA_RIGHT.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(3.3673F, 15.3777F, -9.943F));
		PartDefinition cube_r22 = bone12.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(49, 77).addBox(-0.8493F, 4.9468F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.8415F, -0.2269F, -0.0478F));
		PartDefinition cube_r23 = bone12.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(78, 49).addBox(-0.5F, 4.9822F, -6.0498F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4764F, 0.3939F, -0.332F, 0.7767F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone12.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(84, 17).addBox(-0.1507F, 4.9898F, -6.5321F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2064F, 0.0F, 0.0F, 0.8415F, 0.2269F, 0.0478F));
		PartDefinition cube_r25 = bone12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(127, 84).addBox(-1.9393F, -5.0522F, -3.1318F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1462F, 10.243F, 4.9403F, 0.4139F, 0.2269F, 0.0478F));
		PartDefinition cube_r26 = bone12.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(127, 125).addBox(-0.4081F, -5.0652F, -2.9987F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1462F, 10.243F, 4.9403F, 0.4145F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone12.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(109, 128).addBox(1.2938F, -5.1118F, -3.2448F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1462F, 10.243F, 4.9403F, 0.4075F, -0.1509F, -0.0141F));
		PartDefinition cube_r28 = bone12.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(111, 61).addBox(-2.1719F, 6.2536F, -2.3174F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.777F, -0.883F, 6.1549F, -0.0087F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone12.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(38, 125).addBox(-2.4901F, 5.1473F, -4.2565F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 123).addBox(-1.1268F, 5.1669F, -4.2135F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8764F, -11.2155F, 3.8559F, 0.304F, -0.0568F, -0.0235F));
		PartDefinition cube_r30 = bone12.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(16, 113).mirror().addBox(-2.3073F, 2.2613F, -2.933F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1959F, -6.5175F, 4.4691F, 0.2528F, -0.0163F, -0.0134F));
		PartDefinition rotatetors = bone4.addOrReplaceChild("rotatetors", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -39.5694F, 2.1197F, 0.0353F, -0.1483F, -0.0052F));
		PartDefinition cube_r31 = rotatetors.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -2.2489F, -3.1247F, 15.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.088F, -1.6122F, 0.1091F, 0.0F, 0.0F));
		PartDefinition BRAZO_RIGHT = rotatetors.addOrReplaceChild("BRAZO_RIGHT", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7999F, -2.8628F, -0.0904F, -0.1262F, 0.0538F, 0.2728F));
		PartDefinition cube_r32 = BRAZO_RIGHT.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(89, 113).addBox(6.5087F, -6.3284F, -1.7282F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.265F, 2.9409F, -1.3506F, 0.0783F, -0.076F, 0.7344F));
		PartDefinition cube_r33 = BRAZO_RIGHT.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(78, 5).addBox(4.2384F, -4.5521F, -1.7478F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.265F, 2.9409F, -1.3506F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone5 = BRAZO_RIGHT.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2741F, 1.1019F, -0.3656F, 0.5774F, 0.2643F, 0.5457F));
		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(98, 69).addBox(11.2384F, -4.224F, -1.3767F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.2226F, 1.839F, -0.9851F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone8 = bone5.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2735F, -0.8041F, -0.0348F, 0.2651F, 0.3986F, 0.2513F));
		PartDefinition cube_r35 = bone8.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(13, 99).addBox(23.3321F, -4.8568F, -2.3767F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(106, 38).addBox(20.7149F, -4.6068F, -1.8298F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.4961F, 2.6431F, -0.9503F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition cube_r36 = bone8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(121, 73).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.715F, -1.26F, -0.1269F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition cube_r37 = bone8.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(78, 39).addBox(4.2721F, 1.2485F, 7.1732F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4964F, -1.5045F, -9.9518F, 0.109F, -0.0038F, -0.0002F));
		PartDefinition bone9 = bone8.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(7.696F, 1.1028F, 0.2648F, 1.1946F, -0.0408F, 0.0657F));
		PartDefinition cube_r38 = bone9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(126, 118).addBox(-26.8179F, 1.5673F, 21.5699F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 2.7807F, 0.6451F, 2.9489F));
		PartDefinition cube_r39 = bone9.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(129, 67).addBox(-22.6801F, 0.3598F, 25.5488F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 2.9779F, 0.8399F, 3.023F));
		PartDefinition cube_r40 = bone9.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(64, 130).addBox(-27.4218F, -0.9766F, 22.1379F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, -3.0554F, 0.661F, -3.1104F));
		PartDefinition cube_r41 = bone9.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 44).addBox(22.1668F, -9.6475F, 17.9941F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, 7.9363F, -1.6787F, 1.2145F, 0.0146F, 0.3759F));
		PartDefinition cube_r42 = bone9.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(130, 99).addBox(17.3881F, 1.8999F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, -0.0571F, 0.9281F, -0.1493F));
		PartDefinition cube_r43 = bone9.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 131).addBox(17.474F, 0.3598F, 25.7172F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.1799F, 0.9171F, 0.1472F));
		PartDefinition cube_r44 = bone9.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(131, 63).addBox(17.6945F, -1.2978F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.3934F, 0.8661F, 0.4208F));
		PartDefinition cube_r45 = bone9.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(118, 28).addBox(27.1485F, -1.2108F, 0.1043F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-26.2416F, -1.0637F, -1.6787F, 0.109F, -0.0001F, 0.0038F));
		PartDefinition BRAZO_LEFT = rotatetors.addOrReplaceChild("BRAZO_LEFT", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.7999F, -2.8628F, -0.0904F, -0.1907F, -0.0098F, -0.4315F));
		PartDefinition cube_r46 = BRAZO_LEFT.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(111, 79).addBox(-8.5087F, -6.3284F, -1.7282F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7185F, 2.7599F, -1.0452F, 0.0783F, 0.076F, -0.7344F));
		PartDefinition cube_r47 = BRAZO_LEFT.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-11.2384F, -4.5521F, -1.7478F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.7185F, 2.7599F, -1.0452F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone6 = BRAZO_LEFT.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.8205F, 0.9209F, -0.0601F, -0.4276F, 0.0F, -0.3054F));
		PartDefinition cube_r48 = bone6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(98, 0).mirror().addBox(-18.2384F, -4.224F, -1.3767F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.2226F, 1.839F, -0.9851F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2735F, -0.8041F, -0.0348F, -0.1746F, -0.1674F, -0.6871F));
		PartDefinition cube_r49 = bone7.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(86, 96).addBox(-26.3321F, -4.8568F, -2.3767F, 3.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(94, 58).mirror()
				.addBox(-25.7149F, -4.6068F, -1.8298F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(18.4961F, 2.6431F, -0.9503F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition cube_r50 = bone7.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(114, 46).mirror().addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.715F, -1.26F, -0.1269F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition cube_r51 = bone7.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(75, 74).addBox(-13.2721F, 1.2485F, 7.1732F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4964F, -1.5045F, -9.9518F, 0.109F, 0.0038F, 0.0002F));
		PartDefinition bone10 = bone7.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.3992F, 0.5012F, 0.2648F, 2.9187F, -0.2202F, 0.0221F));
		PartDefinition cube_r52 = bone10.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(117, 69).mirror().addBox(21.8179F, 1.5673F, 21.5699F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 2.7807F, -0.6451F, -2.9489F));
		PartDefinition cube_r53 = bone10.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(121, 80).mirror().addBox(17.6801F, 0.3598F, 25.5488F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 2.9779F, -0.8399F, -3.023F));
		PartDefinition cube_r54 = bone10.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(123, 24).mirror().addBox(22.4218F, -0.9766F, 21.1379F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, -3.0554F, -0.661F, 3.1104F));
		PartDefinition cube_r55 = bone10.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 18).addBox(-27.2879F, -6.6554F, 10.412F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 1.2145F, -0.0146F, -0.3759F));
		PartDefinition cube_r56 = bone10.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(125, 53).addBox(-22.3881F, 1.8999F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, -0.0571F, -0.9281F, 0.1493F));
		PartDefinition cube_r57 = bone10.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(126, 44).addBox(-22.474F, 0.3598F, 25.7172F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.1799F, -0.9171F, -0.1472F));
		PartDefinition cube_r58 = bone10.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(126, 48).addBox(-22.6945F, -1.2978F, 25.7836F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.3934F, -0.8661F, -0.4208F));
		PartDefinition cube_r59 = bone10.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(115, 110).addBox(-33.1485F, -1.2108F, 0.1043F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.4417F, -1.7327F, -1.7318F, 0.109F, 0.0001F, -0.0038F));
		PartDefinition CABEZA = rotatetors.addOrReplaceChild("CABEZA", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0486F, 0.1238F, -2.8027F, -0.0044F, 0.0262F, -0.0001F));
		PartDefinition cube_r60 = CABEZA.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(61, 118).addBox(-0.6914F, -3.0F, -2.582F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2616F, 1.4339F, 6.6748F, -1.4953F, -0.0234F, 0.2432F));
		PartDefinition cube_r61 = CABEZA.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 125).addBox(0.2578F, -3.0F, -2.582F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8724F, 1.4339F, 6.6748F, -1.4953F, 0.0234F, 0.0F));
		PartDefinition cube_r62 = CABEZA.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(26, 92).addBox(-1.5F, -2.3282F, 3.8359F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 106).addBox(-0.5391F, -2.3282F, 1.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7111F, -8.828F, -5.7516F, 0.1761F, 0.2049F, 0.1957F));
		PartDefinition cube_r63 = CABEZA.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(73, 0).addBox(-4.5F, 0.3711F, 0.7148F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8791F, -11.6873F, -5.7516F, 0.6778F, -0.0401F, 0.1429F));
		PartDefinition cube_r64 = CABEZA.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(17, 18).addBox(-4.5F, 0.6249F, -2.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0774F, -14.6719F, -0.0583F, 0.3506F, -0.0401F, 0.1429F));
		PartDefinition cube_r65 = CABEZA.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(105, 113).addBox(0.0F, -3.5F, -3.5F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8956F, -8.2252F, 6.5256F, -0.3001F, 0.1215F, 0.105F));
		PartDefinition cube_r66 = CABEZA.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(42, 11).addBox(-3.5F, 0.332F, -3.1836F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5167F, -13.0512F, 8.0191F, -0.0378F, -0.0401F, 0.1429F));
		PartDefinition cube_r67 = CABEZA.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(18, 58).addBox(-3.0F, 0.3164F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8613F, -9.3514F, 9.9851F, -0.6137F, -0.0401F, 0.1429F));
		PartDefinition cube_r68 = CABEZA.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(42, 63).addBox(0.1055F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7551F, -5.4411F, 6.7747F, -0.9754F, 0.0427F, 0.0608F));
		PartDefinition cube_r69 = CABEZA.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(75, 118).addBox(-0.1758F, -3.5F, -1.6953F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0227F, -2.7013F, 6.8707F, -1.4921F, -0.0066F, 0.0257F));
		PartDefinition cube_r70 = CABEZA.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(88, 0).addBox(-2.5F, -0.0039F, -2.8008F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0376F, -3.4572F, 10.8099F, -1.2316F, -0.0161F, 0.1475F));
		PartDefinition cube_r71 = CABEZA.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.2695F, -2.5195F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6696F, 1.1358F, 10.383F, -1.2423F, -0.0234F, 0.2432F));
		PartDefinition cube_r72 = CABEZA.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(26, 92).addBox(1.5F, -2.3282F, 4.8359F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 106).addBox(0.5391F, -2.3282F, 1.5F, 0.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8063F, -8.828F, -5.7516F, 0.1761F, -0.2049F, -0.1957F));
		PartDefinition cube_r73 = CABEZA.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(73, 0).addBox(-3.5F, 0.3711F, 0.7148F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9743F, -11.6873F, -5.7516F, 0.6778F, 0.0401F, -0.1429F));
		PartDefinition cube_r74 = CABEZA.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(17, 18).addBox(-3.5F, 0.6249F, -2.0F, 8.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1726F, -14.6719F, -0.0583F, 0.3506F, 0.0401F, -0.1429F));
		PartDefinition cube_r75 = CABEZA.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(105, 113).addBox(0.0F, -3.5F, -3.5F, 0.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.9908F, -8.2252F, 6.5256F, -0.3001F, -0.1215F, -0.105F));
		PartDefinition cube_r76 = CABEZA.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(42, 11).addBox(-3.5F, 0.332F, -3.1836F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6118F, -13.0512F, 8.0191F, -0.0378F, 0.0401F, -0.1429F));
		PartDefinition cube_r77 = CABEZA.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(18, 58).addBox(-3.0F, 0.3164F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9564F, -9.3514F, 9.9851F, -0.6137F, 0.0401F, -0.1429F));
		PartDefinition cube_r78 = CABEZA.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(42, 63).addBox(-0.1055F, -3.5F, -3.5F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8503F, -5.4411F, 6.7747F, -0.9754F, -0.0427F, -0.0608F));
		PartDefinition cube_r79 = CABEZA.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(75, 118).addBox(0.1758F, -3.5F, -1.6953F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1178F, -2.7013F, 6.8707F, -1.4921F, 0.0066F, -0.0257F));
		PartDefinition cube_r80 = CABEZA.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(88, 0).addBox(-2.5F, -0.0039F, -2.8008F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1327F, -3.4572F, 10.8099F, -1.2316F, 0.0161F, -0.1475F));
		PartDefinition cube_r81 = CABEZA.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.2695F, -2.5195F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7648F, 1.1358F, 10.383F, -1.2423F, 0.0234F, -0.2432F));
		PartDefinition cube_r82 = CABEZA.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(61, 118).mirror().addBox(-1.3086F, -3.0F, -2.582F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4623F, 1.4339F, 6.6748F, -1.4953F, 0.0234F, -0.2432F));
		PartDefinition cube_r83 = CABEZA.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(104, 10).addBox(-2.0703F, -3.1055F, -3.0742F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4386F, -2.6701F, 7.2531F, -1.4934F, -0.0161F, 0.1475F));
		PartDefinition cube_r84 = CABEZA.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(124, 99).addBox(1.875F, -3.5F, -2.5F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.561F, -3.1421F, 6.8224F, -1.4934F, 0.0161F, 0.0F));
		PartDefinition cube_r85 = CABEZA.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(104, 10).mirror().addBox(-2.9297F, -3.1055F, -3.0742F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6392F, -2.6701F, 7.2531F, -1.4934F, 0.0161F, -0.1475F));
		PartDefinition cube_r86 = CABEZA.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(23, 70).addBox(-0.2309F, -10.9003F, -2.7521F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5632F, -3.786F, -0.5349F, -0.9742F, -0.0161F, 0.1475F));
		PartDefinition cube_r87 = CABEZA.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(33, 99).addBox(-1.3863F, -10.9003F, -2.7521F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0476F, -3.786F, -0.5349F, -0.9742F, 0.0161F, 0.0F));
		PartDefinition cube_r88 = CABEZA.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(23, 70).mirror().addBox(-5.7691F, -10.9003F, -2.7521F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3626F, -3.786F, -0.5349F, -0.9742F, 0.0161F, -0.1475F));
		PartDefinition cube_r89 = CABEZA.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(61, 99).addBox(-1.1402F, -10.7714F, -1.006F, 2.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0476F, -3.786F, -0.5349F, -0.2979F, 0.0161F, 0.0F));
		PartDefinition cube_r90 = CABEZA.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(56, 11).addBox(-0.4184F, -10.7714F, -1.006F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5632F, -3.786F, -0.5349F, -0.2979F, -0.0161F, 0.1475F));
		PartDefinition cube_r91 = CABEZA.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(56, 11).mirror().addBox(-6.5816F, -10.7714F, -1.006F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3626F, -3.786F, -0.5349F, -0.2979F, 0.0161F, -0.1475F));
		PartDefinition cube_r92 = CABEZA.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(99, 103).addBox(-0.5659F, -10.4839F, -0.3747F, 1.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0476F, -3.786F, -0.5349F, 0.1079F, 0.0161F, 0.0F));
		PartDefinition cube_r93 = CABEZA.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-6.9956F, -10.4057F, -0.3747F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(32, 18).mirror()
				.addBox(-7.0386F, -9.4057F, -3.3513F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3626F, -3.786F, -0.5349F, 0.1079F, 0.0161F, -0.1475F));
		PartDefinition cube_r94 = CABEZA.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(35, 54).addBox(-1.0044F, -10.4057F, -0.3747F, 8.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-0.9535F, -9.4069F, -3.3747F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5632F, -3.786F, -0.5349F, 0.1079F, -0.0161F, 0.1475F));
		PartDefinition cube_r95 = CABEZA.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(57, 62).addBox(-0.4961F, -9.4881F, -3.3278F, 1.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0476F, -3.786F, -0.5349F, 0.1091F, 0.0F, 0.0F));
		PartDefinition headrotate = CABEZA.addOrReplaceChild("headrotate", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2185F, -9.4412F, -4.9821F, 0.162F, 0.0005F, -0.044F));
		PartDefinition cube_r96 = headrotate.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(73, 0).addBox(-4.5F, -0.1406F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0977F, -2.2461F, -0.7695F, 0.7607F, -0.0401F, 0.1429F));
		PartDefinition cube_r97 = headrotate.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(73, 0).addBox(-3.5F, -0.1406F, -2.0F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7557F, -2.2461F, -0.7695F, 0.7607F, 0.0401F, -0.1429F));
		PartDefinition cube_r98 = headrotate.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(63, 88).mirror().addBox(3.9727F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.6193F, 0.328F, -1.2848F, 0.3334F, 0.2414F, -0.0297F));
		PartDefinition cube_r99 = headrotate.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(85, 132).mirror().addBox(4.0F, 0.4057F, 0.6434F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.6841F, -0.9835F, -5.4946F, -0.0715F, 0.225F, -0.0539F));
		PartDefinition cube_r100 = headrotate.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(129, 131).mirror().addBox(2.0F, -0.4682F, -1.48F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.6841F, -0.9835F, -5.4946F, -0.7173F, 0.225F, -0.0539F));
		PartDefinition cube_r101 = headrotate.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(46, 131).mirror().addBox(-0.5F, 0.4805F, -4.3682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6841F, -0.9835F, -5.4946F, -1.0446F, 0.225F, -0.0539F));
		PartDefinition cube_r102 = headrotate.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(46, 131).addBox(-0.5F, 0.4805F, -4.3682F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7762F, -0.9835F, -5.4946F, -1.0446F, -0.225F, 0.0539F));
		PartDefinition cube_r103 = headrotate.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(129, 131).addBox(-4.0F, -0.4682F, -1.48F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7762F, -0.9835F, -5.4946F, -0.7173F, -0.225F, 0.0539F));
		PartDefinition cube_r104 = headrotate.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(85, 132).addBox(-6.0F, 0.4057F, 0.6434F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.7762F, -0.9835F, -5.4946F, -0.0715F, -0.225F, 0.0539F));
		PartDefinition cube_r105 = headrotate.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(63, 88).addBox(-5.9727F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7113F, 0.328F, -1.2848F, 0.3334F, -0.2414F, 0.0297F));
		PartDefinition cube_r106 = headrotate.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(39, 7).mirror().addBox(-4.0F, -1.0F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4288F, 0.7502F, -2.9939F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r107 = headrotate.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(34, 50).addBox(0.0F, -1.0F, -0.5F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3155F, 0.7502F, -2.9939F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r108 = headrotate.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(35, 58).mirror().addBox(-7.0F, -2.0F, -0.25F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3546F, 3.7502F, -3.2439F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r109 = headrotate.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(0, 62).addBox(4.0F, -2.0F, -0.25F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(99, 96).addBox(0.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3155F, 3.7502F, -3.2439F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r110 = headrotate.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.9365F, -1.5F, 0.3767F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.6923F, 6.2658F, -3.465F, 0.066F, 0.1306F, 0.0086F));
		PartDefinition cube_r111 = headrotate.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(58, 54).addBox(-0.0635F, -1.5F, 0.3767F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3624F, 6.2658F, -3.465F, 0.066F, -0.1306F, -0.0086F));
		PartDefinition cube_r112 = headrotate.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-1.9365F, -1.5F, -0.6233F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3624F, 6.2658F, -2.965F, 0.066F, 0.1306F, 0.0086F));
		PartDefinition cube_r113 = headrotate.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 78).addBox(-0.0635F, -1.5F, -0.6233F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3624F, 6.2658F, -2.965F, 0.066F, -0.1306F, -0.0086F));
		PartDefinition cube_r114 = headrotate.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(89, 84).mirror().addBox(-4.0F, -2.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4288F, 3.7502F, -3.2439F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r115 = headrotate.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(121, 129).addBox(-1.0034F, -3.6894F, -0.9939F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.171F, 2.9263F, -1.2476F, 0.2163F, -0.0243F, 0.0023F));
		PartDefinition cube_r116 = headrotate.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(120, 90).addBox(0.4386F, -3.8168F, -0.9308F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3447F, 2.9263F, -1.2476F, 0.2174F, -0.0103F, 0.148F));
		PartDefinition cube_r117 = headrotate.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(122, 0).mirror().addBox(-6.4386F, -3.8168F, -0.9308F, 6.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5811F, 2.9263F, -1.2476F, 0.2174F, 0.0103F, -0.148F));
		PartDefinition cube_r118 = headrotate.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(28, 125).addBox(-0.6033F, -8.8396F, -4.6375F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.171F, 5.6553F, 4.4472F, 0.2749F, 0.0F, 0.0F));
		PartDefinition cube_r119 = headrotate.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 84).mirror().addBox(-6.3535F, -8.8795F, -4.7274F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5811F, 5.6553F, 4.4472F, 0.272F, 0.0401F, -0.1429F));
		PartDefinition cube_r120 = headrotate.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(71, 84).addBox(-0.3848F, -8.8795F, -4.7469F, 7.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3447F, 5.6553F, 4.4472F, 0.272F, -0.0401F, 0.1429F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
