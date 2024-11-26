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
public class Modelstonehide_lawachurl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelstonehide_lawachurl"), "main");
	public final ModelPart head;
	public final ModelPart right_hand;
	public final ModelPart right_hand2;
	public final ModelPart lower_right_hand;
	public final ModelPart left_hand;
	public final ModelPart left_hand2;
	public final ModelPart lower_left_hand;
	public final ModelPart body;
	public final ModelPart legs;
	public final ModelPart left_leg;
	public final ModelPart left_leg2;
	public final ModelPart lower_left_leg;
	public final ModelPart right_leg;
	public final ModelPart right_leg2;
	public final ModelPart lower_right_Leg;

	public Modelstonehide_lawachurl(ModelPart root) {
		this.head = root.getChild("head");
		this.right_hand = root.getChild("right_hand");
		this.right_hand2 = this.right_hand.getChild("right_hand2");
		this.lower_right_hand = this.right_hand2.getChild("lower_right_hand");
		this.left_hand = root.getChild("left_hand");
		this.left_hand2 = this.left_hand.getChild("left_hand2");
		this.lower_left_hand = this.left_hand2.getChild("lower_left_hand");
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.left_leg = root.getChild("left_leg");
		this.left_leg2 = this.left_leg.getChild("left_leg2");
		this.lower_left_leg = this.left_leg2.getChild("lower_left_leg");
		this.right_leg = root.getChild("right_leg");
		this.right_leg2 = this.right_leg.getChild("right_leg2");
		this.lower_right_Leg = this.right_leg2.getChild("lower_right_Leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 110).addBox(-2.0F, 4.0F, -14.25F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(150, 15).addBox(-3.0F, -2.0F, -14.25F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 24)
						.addBox(-5.0F, -7.0F, -14.25F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 92).addBox(-5.0F, -8.0F, -12.25F, 10.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(30, 102)
						.addBox(-4.0F, 2.0F, -14.25F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -58.0F, 5.0F));
		PartDefinition cube_r63_r1 = head.addOrReplaceChild("cube_r63_r1",
				CubeListBuilder.create().texOffs(76, 24).addBox(-2.5F, 1.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 144).addBox(-3.5F, -7.0F, -2.0F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.7689F, 10.3613F, -7.8158F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r62_r1 = head.addOrReplaceChild("cube_r62_r1",
				CubeListBuilder.create().texOffs(59, 147).addBox(-2.5F, 1.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(183, 122).addBox(-3.5F, -7.0F, -2.0F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7689F, 10.3613F, -7.8158F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r61_r1 = head.addOrReplaceChild("cube_r61_r1",
				CubeListBuilder.create().texOffs(50, 77).addBox(2.0F, 13.0F, 3.25F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(189, 65).addBox(1.0F, 2.0F, 3.0F, 7.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.6378F, -10.8158F, 0.0F, 0.0F, -1.3526F));
		PartDefinition cube_r59_r1 = head.addOrReplaceChild("cube_r59_r1", CubeListBuilder.create().texOffs(70, 92).addBox(-4.0F, -1.25F, 2.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9739F, -1.905F, -2.2689F, 0.0F, 0.0F));
		PartDefinition cube_r58_r1 = head.addOrReplaceChild("cube_r58_r1", CubeListBuilder.create().texOffs(154, 78).addBox(-4.0F, -7.75F, 1.0F, 8.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.25F, -10.25F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r58_r2 = head.addOrReplaceChild("cube_r58_r2", CubeListBuilder.create().texOffs(92, 183).addBox(-3.0F, -7.0F, -1.5F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6603F, -11.0569F, -3.9126F, -0.6981F, 0.0F, -0.7854F));
		PartDefinition cube_r57_r1 = head.addOrReplaceChild("cube_r57_r1", CubeListBuilder.create().texOffs(110, 185).addBox(-3.0F, -7.0F, -1.5F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.6603F, -11.0569F, -3.9126F, -0.6981F, 0.0F, 0.7854F));
		PartDefinition cube_r54_r1 = head.addOrReplaceChild("cube_r54_r1",
				CubeListBuilder.create().texOffs(70, 180).addBox(-2.0F, -4.75F, -2.5F, 8.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(152, 33).addBox(0.0F, -8.75F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2272F, -2.4815F, -1.3127F, -0.4434F, -0.0719F, 1.6013F));
		PartDefinition cube_r55_r1 = head.addOrReplaceChild("cube_r55_r1", CubeListBuilder.create().texOffs(128, 190).addBox(-2.0F, -3.5F, -0.25F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.538F, 5.5193F, -4.2336F, 0.5219F, -0.8701F, -0.538F));
		PartDefinition cube_r55_r2 = head.addOrReplaceChild("cube_r55_r2", CubeListBuilder.create().texOffs(177, 151).addBox(-7.0F, 6.5F, -6.75F, 11.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5842F, -0.4679F, 1.8318F, 1.6997F, 0.129F, 1.522F));
		PartDefinition cube_r54_r2 = head.addOrReplaceChild("cube_r54_r2", CubeListBuilder.create().texOffs(0, 159).addBox(-7.0F, -8.75F, -0.25F, 11.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5842F, -0.4679F, 1.8318F, 0.9634F, 0.1232F, 1.5656F));
		PartDefinition cube_r55_r3 = head.addOrReplaceChild("cube_r55_r3", CubeListBuilder.create().texOffs(96, 68).addBox(-1.5F, -2.5F, -8.25F, 10.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4424F, 4.3613F, 8.3515F, 1.7599F, 0.1551F, 1.1884F));
		PartDefinition cube_r55_r4 = head.addOrReplaceChild("cube_r55_r4", CubeListBuilder.create().texOffs(177, 135).addBox(-6.75F, -1.75F, 1.0F, 11.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5842F, -0.4679F, 1.8318F, 0.9492F, -0.7744F, -1.158F));
		PartDefinition cube_r54_r3 = head.addOrReplaceChild("cube_r54_r3", CubeListBuilder.create().texOffs(52, 159).addBox(-4.25F, -1.75F, 1.0F, 11.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5842F, -0.4679F, 1.8318F, 0.9492F, 0.7744F, 1.158F));
		PartDefinition cube_r52_r1 = head.addOrReplaceChild("cube_r52_r1", CubeListBuilder.create().texOffs(40, 0).addBox(-8.5F, -6.5F, 0.0F, 11.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.9338F, -11.0542F, 2.2372F, -0.1438F, 0.7021F, 0.0443F));
		PartDefinition cube_r51_r1 = head.addOrReplaceChild("cube_r51_r1", CubeListBuilder.create().texOffs(78, 159).addBox(-5.5F, -9.5F, 1.5F, 9.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.919F, -0.6609F, 2.5102F, -0.8733F, 0.0779F, 1.6624F));
		PartDefinition cube_r50_r1 = head.addOrReplaceChild("cube_r50_r1", CubeListBuilder.create().texOffs(134, 100).addBox(-7.0F, -17.5F, 1.5F, 18.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3474F, 0.4717F, 8.3749F, -3.1416F, 1.0036F, 3.1416F));
		PartDefinition cube_r49_r1 = head.addOrReplaceChild("cube_r49_r1", CubeListBuilder.create().texOffs(194, 11).addBox(-3.75F, -3.5F, -3.0F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.375F, -10.6492F, 17.8199F, 0.0F, 1.4835F, 0.0F));
		PartDefinition cube_r48_r1 = head.addOrReplaceChild("cube_r48_r1", CubeListBuilder.create().texOffs(0, 190).addBox(-3.5F, -5.0F, -2.25F, 7.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4355F, -18.6571F, 3.6267F, -0.8588F, -0.012F, -1.2298F));
		PartDefinition cube_r47_r1 = head.addOrReplaceChild("cube_r47_r1", CubeListBuilder.create().texOffs(72, 195).addBox(-3.0F, -3.0F, -1.25F, 6.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.2502F, -20.1016F, 9.0938F, 1.5934F, 0.0407F, -1.2654F));
		PartDefinition cube_r47_r2 = head.addOrReplaceChild("cube_r47_r2", CubeListBuilder.create().texOffs(0, 94).addBox(-0.5F, -4.0F, -1.0F, 19.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.4291F, -23.4597F, 2.8184F, 0.0F, 0.0F, 0.829F));
		PartDefinition cube_r46_r1 = head.addOrReplaceChild("cube_r46_r1", CubeListBuilder.create().texOffs(147, 70).addBox(-18.5F, -4.0F, -1.0F, 19.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.4291F, -23.4597F, 2.8184F, 0.0F, 0.0F, -0.829F));
		PartDefinition cube_r45_r1 = head.addOrReplaceChild("cube_r45_r1", CubeListBuilder.create().texOffs(167, 185).addBox(-1.75F, -5.5F, -1.75F, 7.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.3114F, -6.7249F, 0.4617F, -0.646F, 0.1429F, -1.0981F));
		PartDefinition cube_r45_r2 = head.addOrReplaceChild("cube_r45_r2", CubeListBuilder.create().texOffs(148, 190).addBox(-3.0F, -5.25F, -1.0F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.5114F, -7.1853F, 12.7904F, -0.8548F, -0.116F, -1.5444F));
		PartDefinition cube_r44_r1 = head.addOrReplaceChild("cube_r44_r1", CubeListBuilder.create().texOffs(56, 195).addBox(-3.5F, -5.5F, 0.75F, 7.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.4022F, -13.5872F, 13.5637F, -1.4316F, -0.1015F, -1.4212F));
		PartDefinition cube_r40_r1 = head.addOrReplaceChild("cube_r40_r1",
				CubeListBuilder.create().texOffs(26, 179).addBox(-6.0F, -4.5F, 0.0F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(150, 20).addBox(-5.0F, -8.5F, 0.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7539F, -10.7619F, -3.1128F, -0.5979F, 0.0866F, -1.3559F));
		PartDefinition cube_r40_r2 = head.addOrReplaceChild("cube_r40_r2",
				CubeListBuilder.create().texOffs(151, 117).addBox(1.0F, -8.5F, 0.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(185, 185).addBox(0.0F, -4.5F, 0.0F, 6.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7539F, -10.7619F, -3.1128F, -0.5979F, -0.0866F, 1.3559F));
		PartDefinition cube_r38_r1 = head.addOrReplaceChild("cube_r38_r1", CubeListBuilder.create().texOffs(137, 54).addBox(-5.5F, -10.75F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.213F, -1.7632F, -2.8835F, -0.5754F, 0.1366F, -1.0886F));
		PartDefinition cube_r37_r1 = head.addOrReplaceChild("cube_r37_r1", CubeListBuilder.create().texOffs(42, 194).addBox(-2.5F, -6.5F, -1.0F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.213F, -1.7632F, -2.8835F, -0.5588F, -0.1989F, -1.6018F));
		PartDefinition cube_r33_r1 = head.addOrReplaceChild("cube_r33_r1", CubeListBuilder.create().texOffs(173, 18).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.2224F, -2.3681F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r32_r1 = head.addOrReplaceChild("cube_r32_r1", CubeListBuilder.create().texOffs(119, 119).addBox(-6.0F, -21.0F, -13.0F, 12.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4913F, 5.3774F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r31_r1 = head.addOrReplaceChild("cube_r31_r1", CubeListBuilder.create().texOffs(42, 120).addBox(-6.0F, -25.0F, -13.0F, 12.0F, 22.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4913F, 5.3774F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r30_r1 = head.addOrReplaceChild("cube_r30_r1", CubeListBuilder.create().texOffs(93, 43).addBox(-5.0F, -2.0F, -2.5F, 10.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5546F, 13.9644F, -1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r30_r2 = head.addOrReplaceChild("cube_r30_r2", CubeListBuilder.create().texOffs(0, 132).addBox(-6.0F, -15.0F, -13.0F, 12.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4913F, 5.3774F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r30_r3 = head.addOrReplaceChild("cube_r30_r3", CubeListBuilder.create().texOffs(115, 141).addBox(-6.0F, -25.0F, -1.5F, 12.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2972F, 6.6425F, -3.0107F, 0.0F, 0.0F));
		PartDefinition cube_r29_r1 = head.addOrReplaceChild("cube_r29_r1", CubeListBuilder.create().texOffs(81, 119).addBox(-7.0F, -10.5F, 6.5F, 14.0F, 20.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5546F, 13.9644F, -2.5744F, 0.0F, 0.0F));
		PartDefinition cube_r28_r1 = head.addOrReplaceChild("cube_r28_r1", CubeListBuilder.create().texOffs(177, 113).addBox(-5.0F, -18.5F, 4.5F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5546F, 13.9644F, -2.9234F, 0.0F, 0.0F));
		PartDefinition cube_r27_r1 = head.addOrReplaceChild("cube_r27_r1", CubeListBuilder.create().texOffs(108, 84).addBox(-4.0F, -24.0F, 12.5F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.4017F, 7.5712F, -1.9635F, 0.0F, 0.0F));
		PartDefinition cube_r26_r1 = head.addOrReplaceChild("cube_r26_r1", CubeListBuilder.create().texOffs(112, 15).addBox(-4.0F, -6.25F, 4.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.4017F, 7.5712F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r17_r1 = head.addOrReplaceChild("cube_r17_r1", CubeListBuilder.create().texOffs(118, 165).mirror().addBox(-0.5523F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.1977F, -19.0926F, -10.318F, 1.459F, 0.8475F, -0.287F));
		PartDefinition cube_r18_r1 = head.addOrReplaceChild("cube_r18_r1", CubeListBuilder.create().texOffs(25, 44).mirror().addBox(-1.0926F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.4074F, -15.7521F, -11.424F, 0.9901F, 0.8447F, -0.2737F));
		PartDefinition cube_r19_r1 = head.addOrReplaceChild("cube_r19_r1", CubeListBuilder.create().texOffs(187, 30).mirror().addBox(-1.5F, -2.0F, -5.5F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7467F, -13.3693F, -13.0167F, 0.641F, 0.8447F, -0.2737F));
		PartDefinition cube_r21_r1 = head.addOrReplaceChild("cube_r21_r1", CubeListBuilder.create().texOffs(6, 65).mirror().addBox(-0.4961F, -3.75F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(189, 162).mirror()
				.addBox(-1.9961F, -5.0F, -3.5F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2539F, -11.5684F, -13.8824F, 1.8191F, 0.8447F, -0.2737F));
		PartDefinition cube_r11_r1 = head.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(35, 44).mirror().addBox(-0.75F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.25F, -8.0F, -13.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r21_r2 = head.addOrReplaceChild("cube_r21_r2", CubeListBuilder.create().texOffs(139, 176).mirror().addBox(-2.5F, -2.5F, -5.5F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.9687F, -5.9663F, -14.4676F, -2.8933F, 0.8447F, -0.2737F));
		PartDefinition cube_r24_r1 = head.addOrReplaceChild("cube_r24_r1", CubeListBuilder.create().texOffs(187, 42).mirror().addBox(-3.0F, 2.75F, -1.5F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.3054F, -6.7568F, -14.085F, 0.4199F, 0.1371F, 0.4896F));
		PartDefinition cube_r23_r1 = head.addOrReplaceChild("cube_r23_r1", CubeListBuilder.create().texOffs(187, 42).addBox(-1.0F, 2.75F, -1.5F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.3054F, -6.7568F, -14.085F, 0.4199F, -0.1371F, -0.4896F));
		PartDefinition cube_r20_r1 = head.addOrReplaceChild("cube_r20_r1",
				CubeListBuilder.create().texOffs(6, 65).addBox(-0.5039F, -3.75F, 2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(189, 162).addBox(-2.0039F, -5.0F, -3.5F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2539F, -11.5684F, -13.8824F, 1.8191F, -0.8447F, 0.2737F));
		PartDefinition cube_r20_r2 = head.addOrReplaceChild("cube_r20_r2", CubeListBuilder.create().texOffs(139, 176).addBox(-2.5F, -2.5F, -5.5F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9687F, -5.9663F, -14.4676F, -2.8933F, -0.8447F, 0.2737F));
		PartDefinition cube_r18_r2 = head.addOrReplaceChild("cube_r18_r2", CubeListBuilder.create().texOffs(187, 30).addBox(-1.5F, -2.0F, -5.5F, 3.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7467F, -13.3693F, -13.0167F, 0.641F, -0.8447F, 0.2737F));
		PartDefinition cube_r17_r2 = head.addOrReplaceChild("cube_r17_r2", CubeListBuilder.create().texOffs(25, 44).addBox(-0.9074F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4074F, -15.7521F, -11.424F, 0.9901F, -0.8447F, 0.2737F));
		PartDefinition cube_r16_r1 = head.addOrReplaceChild("cube_r16_r1", CubeListBuilder.create().texOffs(118, 165).addBox(-0.4477F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1977F, -19.0926F, -10.318F, 1.459F, -0.8475F, 0.287F));
		PartDefinition cube_r10_r1 = head.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(35, 44).addBox(-2.25F, -4.0F, 0.0F, 3.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -8.0F, -13.75F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r9_r1 = head.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(33, 54).mirror().addBox(-1.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.6266F, -1.8883F, -13.5F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r8_r1 = head.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(33, 54).addBox(-1.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6266F, -1.8883F, -13.5F, 0.0F, 0.0F, -0.48F));
		PartDefinition bone_r1 = head.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(130, 31).mirror().addBox(-2.0F, -9.75F, 0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 13.0F, -14.25F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r6_r1 = head.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(40, 105).mirror().addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8611F, 0.7769F, -11.5F, 0.1882F, 0.4896F, 0.4453F));
		PartDefinition cube_r7_r1 = head.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(30, 105).mirror().addBox(-2.25F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0675F, -0.2539F, -11.25F, -0.0285F, -0.1278F, 0.9181F));
		PartDefinition cube_r4_r1 = head.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(164, 95).mirror().addBox(-2.5F, -2.0F, 0.25F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.8324F, -3.5369F, -13.5F, 0.0F, 0.3491F, -0.3927F));
		PartDefinition bone_r2 = head.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.1373F, -0.6053F, -12.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r6_r2 = head.addOrReplaceChild("cube_r6_r2", CubeListBuilder.create().texOffs(30, 105).addBox(-1.75F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0675F, -0.2539F, -11.25F, -0.0285F, 0.1278F, -0.9181F));
		PartDefinition cube_r5_r1 = head.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(40, 105).addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8611F, 0.7769F, -11.5F, 0.1882F, -0.4896F, -0.4453F));
		PartDefinition cube_r3_r1 = head.addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(164, 95).addBox(-2.5F, -2.0F, 0.25F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8324F, -3.5369F, -13.5F, 0.0F, -0.3491F, 0.3927F));
		PartDefinition bone_r3 = head.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(120, 24).mirror().addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.1711F, 2.0787F, -13.5F, 0.0F, 0.0F, -0.8727F));
		PartDefinition bone_r4 = head.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(120, 24).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1711F, 2.0787F, -13.5F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bone_r5 = head.addOrReplaceChild("bone_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1373F, -0.6053F, -12.5F, 0.0F, 0.0F, -0.3927F));
		PartDefinition bone_r6 = head.addOrReplaceChild("bone_r6", CubeListBuilder.create().texOffs(182, 78).addBox(4.0F, -20.5F, 0.75F, 8.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -14.0F, -3.1416F, -1.1781F, -3.1416F));
		PartDefinition bone_r7 = head.addOrReplaceChild("bone_r7", CubeListBuilder.create().texOffs(183, 51).addBox(-12.0F, -20.5F, 0.75F, 8.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -14.0F, -3.1416F, 1.1781F, 3.1416F));
		PartDefinition bone_r8 = head.addOrReplaceChild("bone_r8", CubeListBuilder.create().texOffs(130, 31).addBox(0.0F, -9.75F, 0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -14.25F, 0.0F, 0.0F, 0.2182F));
		PartDefinition right_hand = partdefinition.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-12.7305F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.3069F, -48.1449F, 4.6F, 0.0F, 0.0F, -1.5708F));
		PartDefinition right_hand2 = right_hand.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(125, 32).mirror().addBox(-16.1769F, 4.8551F, -5.5F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(54, 0).mirror()
				.addBox(-16.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.5536F, 0.0F, 1.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r1 = right_hand2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 147).mirror().addBox(10.5F, -2.25F, -3.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(112, 0).mirror()
				.addBox(-4.5F, -2.25F, -5.5F, 15.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition lower_right_hand = right_hand2.addOrReplaceChild("lower_right_hand", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-15.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(108, 68)
				.mirror().addBox(-14.0F, -7.0F, -5.5F, 13.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.1769F, -1.1449F, -1.0F, 0.0F, -0.0873F, 0.0F));
		PartDefinition cube_r2 = lower_right_hand.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(152, 20).mirror().addBox(-1.0F, 1.5F, -4.5F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.2695F, -6.8551F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_hand = partdefinition.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(50, 69).addBox(-4.2695F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.3069F, -48.1449F, 4.6F, 0.0F, 0.0F, 1.5708F));
		PartDefinition left_hand2 = left_hand.addOrReplaceChild("left_hand2",
				CubeListBuilder.create().texOffs(125, 32).addBox(8.1769F, 4.8551F, -5.5F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(54, 0).addBox(0.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5536F, 0.0F, 1.0F, 0.0F, 0.1309F, 0.0F));
		PartDefinition cube_r3 = left_hand2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 147).addBox(-16.5F, -2.25F, -3.5F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(112, 0).addBox(-10.5F, -2.25F, -5.5F, 15.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition lower_left_hand = left_hand2.addOrReplaceChild("lower_left_hand",
				CubeListBuilder.create().texOffs(80, 24).addBox(0.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(108, 68).addBox(1.0F, -7.0F, -5.5F, 13.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.1769F, -1.1449F, -1.0F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r4 = lower_left_hand.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(152, 20).addBox(-4.0F, 1.5F, -4.5F, 5.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.2695F, -6.8551F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.3173F, -10.7602F, -5.88F, 13.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(147, 157).addBox(-2.7573F, -6.5202F, -7.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(159, 135).addBox(-3.1573F, 8.5198F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(153, 0).addBox(-9.8773F, 8.5198F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 156)
						.addBox(-3.1573F, 13.9798F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 119).addBox(-9.8773F, 13.9798F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(147, 141)
						.addBox(-17.8773F, -6.5202F, -7.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(122, 84).addBox(-0.0348F, 15.1538F, -4.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(120, 15)
						.addBox(-16.7999F, 15.1538F, -4.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0373F, -45.2898F, 4.6F));
		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 56).addBox(0.18F, -10.3F, -5.46F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(0.18F, -10.3F, -5.46F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 31).addBox(-12.42F, -10.3F, -5.46F, 13.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0747F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition legs = partdefinition.addOrReplaceChild("legs",
				CubeListBuilder.create().texOffs(18, 196).addBox(2.22F, 10.4503F, -6.5F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-1.78F, 11.4503F, -5.75F, 4.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(70, 104)
						.addBox(3.22F, 8.4503F, -7.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(188, 0).addBox(-3.78F, -0.5497F, -7.5F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.22F, 2.4503F, -8.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(-6.72F, 2.4503F, -8.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 104).mirror()
						.addBox(-6.72F, 8.4503F, -7.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 196).mirror().addBox(-5.72F, 10.4503F, -6.5F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(80, 30)
						.addBox(-1.78F, 8.4503F, -6.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -25.5863F, 5.64F));
		PartDefinition cube_r7 = legs.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(5.75F, -8.25F, 13.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.7562F, 11.0F, -7.0F, 0.0F, 0.0F, -2.0944F));
		PartDefinition cube_r8 = legs.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 44).addBox(-8.75F, -8.25F, 13.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7562F, 11.0F, -7.0F, 0.0F, 0.0F, 2.0944F));
		PartDefinition cube_r9 = legs.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 102).mirror().addBox(-13.0F, -13.1827F, -2.25F, 13.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 9).mirror()
				.addBox(-6.0F, -16.1817F, -2.25F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.611F, 5.9549F, 8.0746F, 0.0F, 0.1745F, -1.5708F));
		PartDefinition cube_r10 = legs.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 142).mirror().addBox(0.75F, -11.75F, -0.25F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2562F, 11.0F, -7.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r11 = legs.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(34, 132).mirror().addBox(1.75F, -11.0F, -1.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.72F, 17.4503F, -6.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r12 = legs.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(93, 43).mirror().addBox(-1.0F, 1.25F, 1.75F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.889F, 0.6875F, 4.98F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r13 = legs.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(42, 94).mirror().addBox(-0.5F, 5.5F, 5.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.2947F, 0.5452F, -5.3763F, 0.8206F, -0.0829F, -1.3688F));
		PartDefinition cube_r14 = legs.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 69).mirror().addBox(-3.0F, -3.0F, 1.25F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-16.7369F, -0.5011F, 0.5338F, -1.5708F, 0.0F, -1.5708F));
		PartDefinition cube_r15 = legs.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(158, 173).mirror().addBox(-1.5F, -3.5F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.2947F, 0.5452F, -5.9037F, -0.8206F, 0.0829F, -1.3688F));
		PartDefinition cube_r16 = legs.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(137, 62).mirror().addBox(0.0F, -5.0F, -0.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.1342F, 5.2787F, -7.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r17 = legs.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 44).mirror().addBox(0.0F, -3.0F, -0.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.72F, 10.4503F, -6.5F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r18 = legs.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(25, 44).addBox(-2.0F, -3.0F, -0.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.22F, 10.4503F, -6.5F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r19 = legs.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(137, 62).addBox(-3.0F, -5.0F, -0.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6342F, 5.2787F, -7.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r20 = legs.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(34, 132).addBox(-4.75F, -11.0F, -1.5F, 3.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.22F, 17.4503F, -6.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r21 = legs.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 142).addBox(-3.75F, -11.75F, -0.25F, 3.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7562F, 11.0F, -7.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r22 = legs.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(158, 173).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7947F, 0.5452F, -5.9037F, -0.8206F, -0.0829F, 1.3688F));
		PartDefinition cube_r23 = legs.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(50, 69).addBox(-1.0F, -3.0F, 1.25F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.2369F, -0.5011F, 0.5338F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition cube_r24 = legs.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 43).addBox(-2.0F, 1.25F, 1.75F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.389F, 0.6875F, 4.98F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r25 = legs.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(42, 94).addBox(-2.5F, 5.5F, 5.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7947F, 0.5452F, -5.3763F, 0.8206F, 0.0829F, 1.3688F));
		PartDefinition cube_r26 = legs.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 9).addBox(1.0F, -16.1817F, -2.25F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 102).addBox(0.0F, -13.1827F, -2.25F, 13.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.111F, 5.9549F, 8.0746F, 0.0F, -0.1745F, 1.5708F));
		PartDefinition cube_r27 = legs.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(147, 54).addBox(-19.0F, -7.0F, -2.25F, 16.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.111F, 5.9549F, 8.0746F, 0.0F, 0.1745F, -1.5708F));
		PartDefinition cube_r28 = legs.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(99, 0).addBox(-3.5F, -5.0F, 0.0F, 9.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.111F, 6.6875F, 7.23F, 0.0F, -0.3927F, -1.5708F));
		PartDefinition cube_r29 = legs.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(64, 176).mirror().addBox(4.0F, -6.0F, 0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r30 = legs.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(64, 176).addBox(-6.0F, -6.0F, 0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0484F, 5.6219F, -7.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(0, 110).addBox(-5.5F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(86, 92).addBox(-6.2626F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5126F, -22.085F, 5.8085F));
		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(0, 44).addBox(-4.0F, 18.9491F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition cube_r31 = left_leg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(159, 117).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r32 = left_leg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(163, 33).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r33 = left_leg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(164, 0).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition cube_r34 = left_leg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(100, 165).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));
		PartDefinition cube_r35 = left_leg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(124, 167).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));
		PartDefinition cube_r36 = left_leg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(171, 167).addBox(-3.25F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition cube_r37 = left_leg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(174, 95).addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r38 = left_leg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(46, 176).addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));
		PartDefinition lower_left_leg = left_leg2.addOrReplaceChild("lower_left_leg",
				CubeListBuilder.create().texOffs(64, 144).addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(128, 185).addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(153, 5)
						.addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(182, 31).addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(158, 180)
						.addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(177, 162).addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 120)
						.addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition cube_r39 = lower_left_leg.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(122, 92).addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(151, 123).addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r40 = lower_left_leg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(122, 100).addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 110).mirror().addBox(-12.2752F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(86, 92)
				.mirror().addBox(-12.5126F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5126F, -22.085F, 5.8085F));
		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-4.0F, 18.9491F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.7752F, 23.0F, 0.0F));
		PartDefinition cube_r41 = right_leg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(159, 117).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r42 = right_leg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(163, 33).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r43 = right_leg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(164, 0).mirror().addBox(-2.5F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition cube_r44 = right_leg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(100, 165).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));
		PartDefinition cube_r45 = right_leg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(124, 167).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));
		PartDefinition cube_r46 = right_leg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(171, 167).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition cube_r47 = right_leg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(174, 95).mirror().addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r48 = right_leg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(46, 176).mirror().addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));
		PartDefinition lower_right_Leg = right_leg2.addOrReplaceChild("lower_right_Leg",
				CubeListBuilder.create().texOffs(64, 144).mirror().addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 185).mirror()
						.addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(153, 5).mirror().addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(182, 31).mirror().addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(158, 180).mirror().addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(177, 162).mirror().addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(71, 120).mirror()
						.addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition cube_r49 = lower_right_Leg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(122, 92).mirror().addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(151, 123).mirror()
				.addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r50 = lower_right_Leg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(122, 100).mirror().addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 224, 224);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		legs.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
