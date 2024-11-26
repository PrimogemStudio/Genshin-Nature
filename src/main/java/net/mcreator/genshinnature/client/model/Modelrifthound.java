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
public class Modelrifthound<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelrifthound"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart lefthand;
	public final ModelPart righthand;
	public final ModelPart rightleg;
	public final ModelPart leftleg;

	public Modelrifthound(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.lefthand = root.getChild("lefthand");
		this.righthand = root.getChild("righthand");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.9875F, -4.0213F, -9.315F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.9875F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-4.9875F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.9875F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-4.9875F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.9875F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-4.9875F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-5.9875F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-5.9875F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 0).addBox(5.0125F, 1.9787F, -3.715F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(5.0125F, -1.0213F, -5.315F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(4.0125F, -4.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(4.0125F, -3.0213F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(4.0125F, -2.0213F, -8.315F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(4.0125F, -1.0213F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 0).addBox(4.0125F, 0.9787F, -6.315F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(4.0125F, 1.9787F, -7.315F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(-3.9875F, -5.0213F, -5.315F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-3.9875F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0).addBox(1.0125F, -5.0213F, -9.115F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.9875F, -1.0213F, -15.315F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 10).addBox(-1.9875F, -1.0313F, -14.315F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.9875F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(2.0125F, 1.9787F, -14.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(2.0025F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.9775F, 1.9787F, -11.315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.9875F, 11.0213F, -1.685F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(58, 0).addBox(-1.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0).mirror().addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.4875F, -4.0213F, -5.815F, 0.0F, 0.0F, -0.3054F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(58, 0).addBox(-0.5F, -5.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-1.5F, -3.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5125F, -4.0213F, -5.815F, 0.0F, 0.0F, 0.3054F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(0, 16).addBox(1.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(1.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-2.5F, -2.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-2.5F, -2.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 11).mirror()
						.addBox(-2.0F, 0.01F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(22, 12).mirror().addBox(-1.5F, -1.01F, -6.02F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16).mirror()
						.addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0125F, 2.9787F, -9.315F, 0.4363F, 0.0F, 0.0F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4875F, -1.5213F, -0.815F, 0.0F, -0.6545F, 0.0F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(38, 20).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5125F, -1.5213F, -0.815F, 0.0F, 0.6545F, 0.0F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.5764F, 0.4891F, 0.3819F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.62F, -0.4891F, -0.3819F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(38, 20).addBox(-2.0F, 0.0F, 0.5F, 4.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0125F, -3.0213F, -1.815F, 0.6109F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 26).addBox(-3.0F, -14.0F, 9.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-3.0F, -14.0F, -3.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 52).addBox(-1.0F, -0.9176F, -0.8954F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -18.0301F, 22.9681F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 44).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -12.0F, 14.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition lefthand = partdefinition.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offset(9.7664F, 12.5839F, -2.7512F));
		PartDefinition cube_r3 = lefthand.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror()
				.addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2219F, 0.145F, -1.5606F, -0.8727F, -0.1309F, 0.0F));
		PartDefinition cube_r4 = lefthand.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 37).mirror()
						.addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1648F, 7.359F, -4.2973F, -0.48F, -0.1309F, 0.0F));
		PartDefinition cube_r5 = lefthand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 49).addBox(0.0325F, -1.8098F, -7.1351F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.2618F, -0.829F, 0.0F));
		PartDefinition cube_r6 = lefthand.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(54, 49).addBox(1.1898F, -0.6715F, -6.3054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r7 = lefthand.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2506F, -0.6715F, -6.2563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r8 = lefthand.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(54, 49).addBox(1.0473F, -1.7235F, -6.2071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.3054F, 0.3491F, 0.0F));
		PartDefinition cube_r9 = lefthand.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(54, 49).addBox(1.991F, -3.5715F, -7.8006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.5236F, -0.2182F, 0.0F));
		PartDefinition cube_r10 = lefthand.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6045F, 10.359F, -9.0955F, -0.7854F, -0.3054F, 0.0F));
		PartDefinition cube_r11 = lefthand.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 58).addBox(-1.123F, -1.2287F, -4.239F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.3054F, 0.0F));
		PartDefinition righthand = partdefinition.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offset(-6.744F, 12.5772F, -2.7512F));
		PartDefinition cube_r12 = righthand.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 49).addBox(0.7611F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5081F, 10.8657F, -11.3508F, 0.2618F, -0.3927F, 0.0F));
		PartDefinition cube_r13 = righthand.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2389F, 0.0571F, -3.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5081F, 10.8657F, -11.3508F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r14 = righthand.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(54, 49).addBox(-1.2389F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.491F, 10.8657F, -11.0898F, 0.3054F, 0.7854F, 0.0F));
		PartDefinition cube_r15 = righthand.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2836F, -0.5F, -2.6624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8817F, 11.4228F, -13.0585F, 0.5236F, 0.2182F, 0.0F));
		PartDefinition cube_r16 = righthand.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2389F, 0.0571F, -1.9829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.491F, 10.8657F, -11.0898F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r17 = righthand.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror()
				.addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2677F, 0.1517F, -1.5606F, -0.8727F, 0.1309F, 0.0F));
		PartDefinition cube_r18 = righthand.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 37).mirror()
						.addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3248F, 7.3657F, -4.2973F, -0.48F, 0.1309F, 0.0F));
		PartDefinition cube_r19 = righthand.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(39, 51).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5384F, 10.3657F, -9.685F, -0.7854F, 0.1309F, 0.0F));
		PartDefinition cube_r20 = righthand.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-2.0F, 3.0F, -9.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0638F, 7.3657F, -2.3144F, 0.0F, 0.1309F, 0.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-6.744F, 12.5772F, 11.2488F));
		PartDefinition cube_r21 = rightleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(54, 49).addBox(0.7611F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5081F, 10.8657F, -11.3508F, 0.2618F, -0.3927F, 0.0F));
		PartDefinition cube_r22 = rightleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2389F, 0.0571F, -3.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5081F, 10.8657F, -11.3508F, 0.0F, 0.0873F, 0.0F));
		PartDefinition cube_r23 = rightleg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(54, 49).addBox(-1.2389F, 0.0571F, -2.9829F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.491F, 10.8657F, -11.0898F, 0.3054F, 0.7854F, 0.0F));
		PartDefinition cube_r24 = rightleg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2836F, -0.5F, -2.6624F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8817F, 11.4228F, -13.0585F, 0.5236F, 0.2182F, 0.0F));
		PartDefinition cube_r25 = rightleg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2389F, 0.0571F, -1.9829F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.491F, 10.8657F, -11.0898F, 0.0F, 0.2182F, 0.0F));
		PartDefinition cube_r26 = rightleg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror()
				.addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2677F, 0.1517F, -1.5606F, -0.8727F, 0.1309F, 0.0F));
		PartDefinition cube_r27 = rightleg.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 37).mirror()
						.addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3248F, 7.3657F, -4.2973F, -0.48F, 0.1309F, 0.0F));
		PartDefinition cube_r28 = rightleg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(39, 51).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5384F, 10.3657F, -9.685F, -0.7854F, 0.1309F, 0.0F));
		PartDefinition cube_r29 = rightleg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-2.0F, 3.0F, -9.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0638F, 7.3657F, -2.3144F, 0.0F, 0.1309F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(9.7664F, 12.5839F, 11.2488F));
		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(53, 37).mirror().addBox(-1.1305F, -2.3448F, 1.9177F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror()
				.addBox(-1.1305F, -2.3448F, -0.0823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2219F, 0.145F, -1.5606F, -0.8727F, -0.1309F, 0.0F));
		PartDefinition cube_r31 = leftleg.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-2.0F, -8.0F, -1.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(53, 37).mirror()
						.addBox(-0.4312F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 56).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.1648F, 7.359F, -4.2973F, -0.48F, -0.1309F, 0.0F));
		PartDefinition cube_r32 = leftleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(54, 49).addBox(0.0325F, -1.8098F, -7.1351F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.2618F, -0.829F, 0.0F));
		PartDefinition cube_r33 = leftleg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(54, 49).addBox(1.1898F, -0.6715F, -6.3054F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r34 = leftleg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(54, 49).addBox(-0.2506F, -0.6715F, -6.2563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.2182F, 0.0F));
		PartDefinition cube_r35 = leftleg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(54, 49).addBox(1.0473F, -1.7235F, -6.2071F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.3054F, 0.3491F, 0.0F));
		PartDefinition cube_r36 = leftleg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(54, 49).addBox(1.991F, -3.5715F, -7.8006F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.5236F, -0.2182F, 0.0F));
		PartDefinition cube_r37 = leftleg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 51).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6045F, 10.359F, -9.0955F, -0.7854F, -0.3054F, 0.0F));
		PartDefinition cube_r38 = leftleg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 58).addBox(-1.123F, -1.2287F, -4.239F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4676F, 11.5876F, -6.8973F, 0.0F, -0.3054F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		lefthand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		righthand.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
