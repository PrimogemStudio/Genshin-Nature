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
public class Modelfrostarm_lawachurl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelfrostarm_lawachurl"), "main");
	public final ModelPart head;
	public final ModelPart left_leg;
	public final ModelPart left_leg2;
	public final ModelPart lower_left_leg;
	public final ModelPart right_leg;
	public final ModelPart right_leg2;
	public final ModelPart lower_right_Leg;
	public final ModelPart left_hand;
	public final ModelPart left_hand2;
	public final ModelPart lower_left_hand;
	public final ModelPart right_hand;
	public final ModelPart right_hand2;
	public final ModelPart lower_right_hand;
	public final ModelPart body;
	public final ModelPart bodydecorations;

	public Modelfrostarm_lawachurl(ModelPart root) {
		this.head = root.getChild("head");
		this.left_leg = root.getChild("left_leg");
		this.left_leg2 = this.left_leg.getChild("left_leg2");
		this.lower_left_leg = this.left_leg2.getChild("lower_left_leg");
		this.right_leg = root.getChild("right_leg");
		this.right_leg2 = this.right_leg.getChild("right_leg2");
		this.lower_right_Leg = this.right_leg2.getChild("lower_right_Leg");
		this.left_hand = root.getChild("left_hand");
		this.left_hand2 = this.left_hand.getChild("left_hand2");
		this.lower_left_hand = this.left_hand2.getChild("lower_left_hand");
		this.right_hand = root.getChild("right_hand");
		this.right_hand2 = this.right_hand.getChild("right_hand2");
		this.lower_right_hand = this.right_hand2.getChild("lower_right_hand");
		this.body = root.getChild("body");
		this.bodydecorations = root.getChild("bodydecorations");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(12, 9).mirror().addBox(2.29F, -1.5736F, -13.6476F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 43)
						.addBox(-3.025F, -4.3653F, -13.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 9).addBox(-5.29F, -1.5736F, -13.6476F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(106, 65)
						.addBox(-4.0F, -2.2102F, -13.85F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 5).addBox(-1.0F, -0.2102F, -13.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 126)
						.addBox(-3.0F, -6.2102F, -13.85F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 75).addBox(-5.0F, -11.2102F, -13.85F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 15)
						.addBox(-1.0F, -13.2102F, -13.85F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 75).addBox(-5.75F, -13.0F, -11.0F, 12.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-15.75F, -13.0F, -5.0F, 32.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(82, 0).addBox(-8.75F, -22.0F, 0.5F, 18.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(48, 107)
						.addBox(-12.75F, -8.8592F, -10.8438F, 25.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -56.2898F, 4.6F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(138, 107).mirror().addBox(-21.0F, -16.5F, -2.5F, 20.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(138, 107).addBox(1.0F, -16.5F, -2.5F, 20.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(172, 0).addBox(-6.0F, -5.0F, -0.75F, 12.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, 4.6408F, -8.5938F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(152, 27).addBox(-8.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4497F, -16.3112F, 9.5493F, -1.301F, 0.0461F, -0.54F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(154, 159).addBox(-15.5F, -6.0F, -12.75F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4497F, -16.3112F, 9.5493F, -1.1942F, 0.0653F, -1.4751F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(154, 159).mirror().addBox(3.5F, -6.0F, -13.0F, 12.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.4497F, -16.3112F, 9.5493F, -1.1942F, -0.0653F, 1.4751F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(152, 27).mirror().addBox(-5.5F, -8.0F, -4.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.4497F, -16.3112F, 9.5493F, -1.301F, -0.0461F, 0.54F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(136, 0).mirror().addBox(-3.0F, -17.0F, 1.5F, 17.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.25F, -14.0F, -11.0F, -0.6028F, -0.0461F, 0.54F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(136, 0).addBox(-14.0F, -17.0F, 1.5F, 17.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.6028F, 0.0461F, -0.54F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 31).addBox(-6.0F, -10.0F, 0.5F, 12.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.25F, -14.0F, -11.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(136, 126).addBox(-7.0826F, -11.0F, -3.6082F, 13.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7925F, 0.0F, 0.0F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(94, 142).mirror().addBox(-15.2151F, -8.0F, -3.8571F, 13.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7898F, -0.123F, -0.045F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(94, 142).addBox(2.797F, -8.0F, -3.9008F, 13.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1674F, 5.2568F, 12.5322F, -2.7898F, 0.123F, 0.045F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(38, 148).addBox(2.797F, -6.0F, -3.9008F, 13.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5267F, 0.1071F, 0.0754F));
		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(141, 81).addBox(-7.0826F, -9.0F, -3.6082F, 13.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5307F, 0.0F, 0.0F));
		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(38, 148).mirror().addBox(-15.2151F, -6.0F, -3.8571F, 13.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1674F, -0.7432F, 15.2822F, -2.5267F, -0.1071F, -0.0754F));
		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(164, 44).addBox(-6.25F, -14.0F, -17.0F, 13.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -2.2253F, 0.0F, 0.0F));
		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(168, 135).mirror().addBox(-12.25F, -11.0F, -17.0F, 13.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -2.2211F, -0.0795F, -0.1041F));
		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(168, 135).addBox(-0.5F, -11.0F, -17.0F, 13.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -2.2211F, 0.0795F, 0.1041F));
		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.75F, -16.5F, -4.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 0).mirror()
				.addBox(1.25F, -22.5F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.75F, -6.5F, 11.5F, -0.7113F, -0.2217F, -0.2719F));
		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(82, 0).addBox(-3.25F, -22.5F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.75F, -16.5F, -4.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.75F, -6.5F, 11.5F, -0.7113F, 0.2217F, 0.2719F));
		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 11).mirror().addBox(-1.75F, -1.0F, -0.26F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.25F, -5.25F, -10.75F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 11).addBox(-1.25F, -1.0F, -0.26F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.25F, -5.25F, -10.75F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r11_r1 = head.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(36, 138).mirror().addBox(-1.75F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.25F, -12.2102F, -13.35F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r10_r1 = head.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(36, 138).addBox(-2.25F, -4.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.25F, -12.2102F, -13.35F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r10_r2 = head.addOrReplaceChild("cube_r10_r2", CubeListBuilder.create().texOffs(96, 127).mirror().addBox(-0.5152F, 3.7513F, -6.4491F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2244F, -15.1719F, -17.9092F, -2.1296F, 0.2336F, 0.2525F));
		PartDefinition cube_r9_r1 = head.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(72, 171).mirror().addBox(-1.3152F, -0.0294F, -4.8281F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2244F, -15.1719F, -17.9092F, -1.6496F, 0.2336F, 0.2525F));
		PartDefinition cube_r7_r1 = head.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(78, 69).mirror().addBox(-2.4639F, 1.4625F, 0.4073F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2244F, -15.1719F, -17.9092F, 0.0F, 0.2618F, 0.2182F));
		PartDefinition cube_r8_r1 = head.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(166, 93).mirror().addBox(-2.0639F, 0.4848F, -1.2216F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2244F, -15.1719F, -17.9092F, -0.8727F, 0.2618F, 0.2182F));
		PartDefinition cube_r9_r2 = head.addOrReplaceChild("cube_r9_r2", CubeListBuilder.create().texOffs(96, 127).addBox(-0.4848F, 3.7513F, -6.4491F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2244F, -15.1719F, -17.9092F, -2.1296F, -0.2336F, -0.2525F));
		PartDefinition cube_r8_r2 = head.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(72, 171).addBox(-0.6848F, -0.0294F, -4.8281F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2244F, -15.1719F, -17.9092F, -1.6496F, -0.2336F, -0.2525F));
		PartDefinition cube_r7_r2 = head.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(166, 93).addBox(-1.9361F, 0.4848F, -1.2216F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2244F, -15.1719F, -17.9092F, -0.8727F, -0.2618F, -0.2182F));
		PartDefinition cube_r6_r1 = head.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(78, 69).addBox(-2.5361F, 1.4625F, 0.4073F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2244F, -15.1719F, -17.9092F, 0.0F, -0.2618F, -0.2182F));
		PartDefinition cube_r4_r1 = head.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-2.5F, -7.0F, 0.25F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.8324F, -7.7471F, -13.1F, 0.0F, 0.3491F, -0.3927F));
		PartDefinition cube_r9_r3 = head.addOrReplaceChild("cube_r9_r3", CubeListBuilder.create().texOffs(93, 42).addBox(-1.25F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6266F, -6.0985F, -13.1F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r8_r3 = head.addOrReplaceChild("cube_r8_r3", CubeListBuilder.create().texOffs(127, 7).addBox(-1.75F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6266F, -6.0985F, -13.1F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r3_r1 = head.addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(0, 94).addBox(-2.5F, -7.0F, 0.25F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.8324F, -7.7471F, -13.1F, 0.0F, -0.3491F, 0.3927F));
		PartDefinition cube_r6_r2 = head.addOrReplaceChild("cube_r6_r2", CubeListBuilder.create().texOffs(0, 104).addBox(-1.75F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0675F, -4.4641F, -10.85F, -0.0285F, 0.1278F, -0.9181F));
		PartDefinition cube_r5_r1 = head.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(39, 132).addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8611F, -3.4333F, -11.1F, 0.1882F, -0.4896F, -0.4453F));
		PartDefinition cube_r7_r3 = head.addOrReplaceChild("cube_r7_r3", CubeListBuilder.create().texOffs(0, 104).mirror().addBox(-2.25F, -1.25F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0675F, -4.4641F, -10.85F, -0.0285F, -0.1278F, 0.9181F));
		PartDefinition cube_r6_r3 = head.addOrReplaceChild("cube_r6_r3", CubeListBuilder.create().texOffs(39, 132).mirror().addBox(-2.0F, -0.25F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.8611F, -3.4333F, -11.1F, 0.1882F, 0.4896F, 0.4453F));
		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-5.863F, 0.1505F, -0.007F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -0.8924F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(4.863F, 0.1505F, -0.007F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 0.8924F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(12, 13).addBox(-5.7459F, -2.0498F, -0.007F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -1.3724F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(12, 13).mirror().addBox(3.7459F, -2.0498F, -0.007F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 1.3724F));
		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 41).addBox(-4.2744F, -4.2598F, 0.0098F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -1.6778F));
		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 0).addBox(2.7091F, -2.9045F, 0.0014F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -2.2014F));
		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 7).addBox(-2.6164F, -6.6203F, -0.007F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-2.7256F, -4.2598F, 0.0098F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 1.6778F));
		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(-5.7091F, -2.9045F, 0.0014F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 2.2014F));
		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(12, 7).mirror().addBox(-0.3836F, -6.6203F, -0.007F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.1651F, -13.6574F, 0.0F, 0.0F, 0.48F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(52, 126).addBox(-5.5F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 95).addBox(-6.2626F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.5126F, -22.085F, 5.8085F));
		PartDefinition left_leg2 = left_leg.addOrReplaceChild("left_leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition cube_r34 = left_leg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(70, 148).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r35 = left_leg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(158, 59).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r36 = left_leg2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(88, 160).addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition cube_r37 = left_leg2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(24, 164).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));
		PartDefinition cube_r38 = left_leg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 164).addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));
		PartDefinition cube_r39 = left_leg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(168, 117).addBox(-3.25F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition cube_r40 = left_leg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 169).addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r41 = left_leg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(106, 172).addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));
		PartDefinition lower_left_leg = left_leg2.addOrReplaceChild("lower_left_leg",
				CubeListBuilder.create().texOffs(0, 138).addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 143).addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 131)
						.addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(94, 133).addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(126, 142)
						.addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 138).addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 138)
						.addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(153, 147).addBox(-4.0F, -3.0509F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition cube_r42 = lower_left_leg.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(39, 122).addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 143).addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r43 = lower_left_leg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(138, 27).addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(52, 126).mirror().addBox(-12.2752F, 10.9491F, -4.6685F, 11.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 95)
				.mirror().addBox(-12.5126F, -4.0509F, -5.6685F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.5126F, -22.085F, 5.8085F));
		PartDefinition right_leg2 = right_leg.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(153, 147).mirror().addBox(-4.0F, 18.9491F, -4.1685F, 8.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-6.7752F, 23.0F, 0.0F));
		PartDefinition cube_r44 = right_leg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(70, 148).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r45 = right_leg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(158, 59).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r46 = right_leg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(88, 160).mirror().addBox(-2.5F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition cube_r47 = right_leg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(24, 164).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, -1.5708F, 0.3491F));
		PartDefinition cube_r48 = right_leg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 164).mirror().addBox(-3.0F, 3.636F, -8.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, -0.3491F));
		PartDefinition cube_r49 = right_leg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(168, 117).mirror().addBox(-2.75F, -3.5F, -4.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.0515F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition cube_r50 = right_leg2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 169).mirror().addBox(-3.25F, -3.5F, -1.5F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r51 = right_leg2.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(106, 172).mirror().addBox(-3.0F, 3.636F, 2.92F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.4491F, 0.3315F, -0.3491F, 0.0F, 0.0F));
		PartDefinition lower_right_Leg = right_leg2.addOrReplaceChild("lower_right_Leg",
				CubeListBuilder.create().texOffs(0, 138).mirror().addBox(-3.5F, -1.0509F, -7.1685F, 7.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 143).mirror()
						.addBox(1.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(124, 131).mirror().addBox(-1.0F, -1.0509F, -10.1685F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(126, 142).mirror().addBox(-3.5F, -1.0509F, -9.1685F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 133).mirror().addBox(-3.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(26, 138).mirror().addBox(-1.0F, -0.8009F, -13.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 138).mirror()
						.addBox(1.5F, -0.8009F, -12.1685F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition cube_r52 = lower_right_Leg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(39, 122).mirror().addBox(-3.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(26, 143).mirror()
				.addBox(1.5F, -1.25F, -2.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -11.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r53 = lower_right_Leg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(138, 27).mirror().addBox(-1.0F, -1.75F, -3.6667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -0.0182F, -10.8821F, 0.48F, 0.0F, 0.0F));
		PartDefinition left_hand = partdefinition.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(106, 42).addBox(-4.2695F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.3069F, -48.1449F, 4.6F, 0.0F, 0.0F, 1.5708F));
		PartDefinition left_hand2 = left_hand.addOrReplaceChild("left_hand2", CubeListBuilder.create().texOffs(126, 147).addBox(8.1769F, 4.8551F, -5.5F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(93, 18)
				.addBox(0.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 122).addBox(16.1769F, -8.1449F, -6.5F, 13.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(12.5536F, 0.0F, 1.0F));
		PartDefinition cube_r54 = left_hand2.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(39, 126).addBox(-16.5F, -2.25F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(138, 17).addBox(-10.5F, -2.25F, -3.5F, 15.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition lower_left_hand = left_hand2.addOrReplaceChild("lower_left_hand", CubeListBuilder.create().texOffs(98, 107).addBox(0.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(15.1769F, -1.1449F, -1.0F));
		PartDefinition right_hand = partdefinition.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-12.7305F, -5.1449F, -5.0F, 17.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.3069F, -48.1449F, 4.6F, 0.0F, 0.0F, -1.5708F));
		PartDefinition right_hand2 = right_hand.addOrReplaceChild("right_hand2", CubeListBuilder.create().texOffs(126, 147).mirror().addBox(-16.1769F, 4.8551F, -5.5F, 8.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(93, 18)
				.mirror().addBox(-16.1769F, -6.1449F, -6.5F, 16.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-12.5536F, 0.0F, 1.0F));
		PartDefinition cube_r55 = right_hand2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(138, 17).mirror().addBox(-4.5F, -2.25F, -3.5F, 15.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 126).mirror()
				.addBox(10.5F, -2.25F, -2.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.0F, -6.1946F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition lower_right_hand = right_hand2.addOrReplaceChild("lower_right_hand", CubeListBuilder.create().texOffs(98, 107).mirror().addBox(-15.0F, -4.0F, -4.0F, 15.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 122)
				.mirror().addBox(-14.0F, -7.0F, -5.5F, 13.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-15.1769F, -1.1449F, -1.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 31).addBox(-10.3173F, -10.7602F, -5.88F, 13.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(124, 159).addBox(-2.7573F, -6.5202F, -7.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(84, 131).addBox(-3.1573F, 8.5198F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 70).addBox(-9.8773F, 8.5198F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 65)
						.addBox(-3.1573F, 13.9798F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 126).addBox(-9.8773F, 13.9798F, -6.3F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 153)
						.addBox(-17.8773F, -6.5202F, -7.14F, 13.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(128, 65).addBox(-0.0348F, 15.1538F, -4.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(94, 126)
						.addBox(-16.7999F, 15.1538F, -4.46F, 9.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0373F, -45.2898F, 4.6F));
		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(91, 69).addBox(0.18F, -10.3F, -5.46F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(54, 31).addBox(-12.42F, -10.3F, -5.46F, 13.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0747F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition bodydecorations = partdefinition.addOrReplaceChild("bodydecorations", CubeListBuilder.create().texOffs(173, 77).addBox(-3.78F, -0.5497F, -7.5F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(130, 175)
				.addBox(-2.78F, 0.4503F, -9.5F, 6.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 50).addBox(-1.78F, 8.4503F, -6.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.5863F, 5.64F));
		PartDefinition cube_r58 = bodydecorations.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(44, 138).addBox(-2.5F, 10.75F, 1.75F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.889F, 0.6875F, 4.98F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r59 = bodydecorations.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 122).mirror().addBox(-1.0F, 1.25F, 1.75F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.889F, 0.6875F, 4.98F, 0.0F, 0.0F, -1.4399F));
		PartDefinition cube_r60 = bodydecorations.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(127, 0).mirror().addBox(-0.5F, 5.5F, 5.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.2947F, 0.5452F, -5.3763F, 0.8206F, -0.0829F, -1.3688F));
		PartDefinition cube_r61 = bodydecorations.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(106, 42).mirror().addBox(-3.0F, -3.0F, 1.25F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-16.7369F, -0.5011F, 0.5338F, -1.5708F, 0.0F, -1.5708F));
		PartDefinition cube_r62 = bodydecorations.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(95, 69).mirror().addBox(-1.5F, -3.5F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-14.2947F, 0.5452F, -5.9037F, -0.8206F, 0.0829F, -1.3688F));
		PartDefinition cube_r63 = bodydecorations.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(98, 107).mirror().addBox(0.0F, -5.0F, -0.25F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.1342F, 5.2787F, -7.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r64 = bodydecorations.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(49, 132).addBox(0.2321F, -1.0F, -0.366F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4082F, 7.7003F, -8.3418F, -3.1416F, 0.5672F, 3.1416F));
		PartDefinition cube_r65 = bodydecorations.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(41, 69).addBox(-3.0F, -7.0F, 1.25F, 12.0F, 25.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6342F, 5.2787F, -7.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r66 = bodydecorations.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(98, 107).addBox(-3.0F, -5.0F, -0.25F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6342F, 5.2787F, -7.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r67 = bodydecorations.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(95, 69).addBox(-1.5F, -3.5F, 2.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7947F, 0.5452F, -5.9037F, -0.8206F, -0.0829F, 1.3688F));
		PartDefinition cube_r68 = bodydecorations.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(106, 42).addBox(-1.0F, -3.0F, 1.25F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.2369F, -0.5011F, 0.5338F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition cube_r69 = bodydecorations.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, 1.25F, 1.75F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.389F, 0.6875F, 4.98F, 0.0F, 0.0F, 1.5272F));
		PartDefinition cube_r70 = bodydecorations.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(127, 0).addBox(-2.5F, 5.5F, 5.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7947F, 0.5452F, -5.3763F, 0.8206F, 0.0829F, 1.3688F));
		PartDefinition cube_r71 = bodydecorations.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(141, 100).mirror().addBox(3.0F, -6.0F, 0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5484F, 5.6219F, -7.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r72 = bodydecorations.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(141, 100).addBox(-6.0F, -6.0F, 0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0484F, 5.6219F, -7.0F, 0.0F, 0.0F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 208, 208);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		left_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		right_hand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bodydecorations.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
