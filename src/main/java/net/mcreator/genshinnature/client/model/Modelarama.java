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
public class Modelarama<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelarama"), "main");
	public final ModelPart arama;
	public final ModelPart ANIMAR_LEFT_ARM;
	public final ModelPart ANIMAR_RIGHT_ARM;
	public final ModelPart ANIMAR_CABEZA;
	public final ModelPart Scarfstrap;
	public final ModelPart Head;
	public final ModelPart Leaves;
	public final ModelPart LeafLeft;
	public final ModelPart leafLeft1;
	public final ModelPart LeafLeft2;
	public final ModelPart LeafLeft3;
	public final ModelPart LeafRight4;
	public final ModelPart leafRight5;
	public final ModelPart LeafRight6;
	public final ModelPart LeafRight7;
	public final ModelPart headVines;
	public final ModelPart Flower;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone10;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart bone13;
	public final ModelPart bone14;
	public final ModelPart bone15;
	public final ModelPart bone16;
	public final ModelPart earLeft;
	public final ModelPart earRight;
	public final ModelPart LegLeft;
	public final ModelPart LegRight;

	public Modelarama(ModelPart root) {
		this.arama = root.getChild("arama");
		this.ANIMAR_LEFT_ARM = this.arama.getChild("ANIMAR_LEFT_ARM");
		this.ANIMAR_RIGHT_ARM = this.arama.getChild("ANIMAR_RIGHT_ARM");
		this.ANIMAR_CABEZA = this.arama.getChild("ANIMAR_CABEZA");
		this.Scarfstrap = this.ANIMAR_CABEZA.getChild("Scarfstrap");
		this.Head = this.ANIMAR_CABEZA.getChild("Head");
		this.Leaves = this.Head.getChild("Leaves");
		this.LeafLeft = this.Leaves.getChild("LeafLeft");
		this.leafLeft1 = this.LeafLeft.getChild("leafLeft1");
		this.LeafLeft2 = this.leafLeft1.getChild("LeafLeft2");
		this.LeafLeft3 = this.LeafLeft2.getChild("LeafLeft3");
		this.LeafRight4 = this.Leaves.getChild("LeafRight4");
		this.leafRight5 = this.LeafRight4.getChild("leafRight5");
		this.LeafRight6 = this.leafRight5.getChild("LeafRight6");
		this.LeafRight7 = this.LeafRight6.getChild("LeafRight7");
		this.headVines = this.Head.getChild("headVines");
		this.Flower = this.headVines.getChild("Flower");
		this.bone3 = this.Flower.getChild("bone3");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone6 = this.Flower.getChild("bone6");
		this.bone7 = this.bone6.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone10 = this.Flower.getChild("bone10");
		this.bone11 = this.bone10.getChild("bone11");
		this.bone12 = this.bone11.getChild("bone12");
		this.bone13 = this.bone12.getChild("bone13");
		this.bone14 = this.bone10.getChild("bone14");
		this.bone15 = this.bone14.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.earLeft = this.Head.getChild("earLeft");
		this.earRight = this.Head.getChild("earRight");
		this.LegLeft = this.arama.getChild("LegLeft");
		this.LegRight = this.arama.getChild("LegRight");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition arama = partdefinition.addOrReplaceChild("arama", CubeListBuilder.create().texOffs(52, 0).addBox(-3.0F, -16.0F, 0.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 24.0F, -3.0F));
		PartDefinition ANIMAR_LEFT_ARM = arama.addOrReplaceChild("ANIMAR_LEFT_ARM", CubeListBuilder.create().texOffs(52, 14).addBox(-2.3F, -1.6F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-3.4F, -13.9F, 3.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition ANIMAR_RIGHT_ARM = arama.addOrReplaceChild("ANIMAR_RIGHT_ARM", CubeListBuilder.create().texOffs(52, 14).mirror().addBox(-1.7F, -1.6F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(6.4F, -13.9F, 3.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition ANIMAR_CABEZA = arama.addOrReplaceChild("ANIMAR_CABEZA", CubeListBuilder.create(), PartPose.offset(1.5F, -16.5F, 3.0F));
		PartDefinition cube_r1 = ANIMAR_CABEZA.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 41).addBox(-5.5F, -2.0F, -4.0F, 11.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Scarfstrap = ANIMAR_CABEZA.addOrReplaceChild("Scarfstrap", CubeListBuilder.create(), PartPose.offset(-2.3985F, 1.2588F, 2.6782F));
		PartDefinition cube_r2 = Scarfstrap.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(83, 90).addBox(-1.0F, 0.0F, 0.0F, 8.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1015F, -0.2588F, 0.3218F, 0.3491F, 0.0F, -0.7854F));
		PartDefinition Head = ANIMAR_CABEZA.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -12.7F, -5.0F, 16.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.8F, 0.0F));
		PartDefinition Leaves = Head.addOrReplaceChild("Leaves", CubeListBuilder.create(), PartPose.offset(26.6F, 0.1F, 0.0F));
		PartDefinition LeafLeft = Leaves.addOrReplaceChild("LeafLeft", CubeListBuilder.create(), PartPose.offset(-53.2F, 0.0F, 0.0F));
		PartDefinition cube_r3 = LeafLeft.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(2.074F, -7.8752F, -12.774F, 11.0F, 6.0F, 11.0F, new CubeDeformation(2.0F)).mirror(false),
				PartPose.offsetAndRotation(17.1146F, -17.1226F, 0.0F, 0.0F, -0.7854F, 1.3963F));
		PartDefinition leafLeft1 = LeafLeft.addOrReplaceChild("leafLeft1", CubeListBuilder.create(), PartPose.offset(17.3F, -17.2F, 0.0F));
		PartDefinition cube_r4 = leafLeft1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-3.7F, -5.9F, -7.0F, 11.0F, 6.0F, 11.0F, new CubeDeformation(2.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2F, 11.3F, 0.0F, 0.0F, -0.7854F, 0.6981F));
		PartDefinition LeafLeft2 = leafLeft1.addOrReplaceChild("LeafLeft2", CubeListBuilder.create(), PartPose.offset(-5.8F, 7.6F, 0.0F));
		PartDefinition cube_r5 = LeafLeft2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 30).mirror().addBox(-3.7F, -8.9F, -6.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(1.5F)).mirror(false),
				PartPose.offsetAndRotation(-2.5F, 9.0F, 0.0F, 0.0F, -0.7854F, 1.1345F));
		PartDefinition LeafLeft3 = LeafLeft2.addOrReplaceChild("LeafLeft3", CubeListBuilder.create(), PartPose.offset(-6.6F, 2.7F, 0.0F));
		PartDefinition cube_r6 = LeafLeft3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 49).mirror().addBox(-3.7F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F)).mirror(false),
				PartPose.offsetAndRotation(-4.9F, 6.9F, 0.0F, 0.0F, -0.7854F, 1.4835F));
		PartDefinition LeafRight4 = Leaves.addOrReplaceChild("LeafRight4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r7 = LeafRight4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 111).addBox(-13.074F, -7.8752F, -12.774F, 11.0F, 6.0F, 11.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-17.1146F, -17.1226F, 0.0F, 0.0F, 0.7854F, -1.3963F));
		PartDefinition leafRight5 = LeafRight4.addOrReplaceChild("leafRight5", CubeListBuilder.create(), PartPose.offset(-17.3F, -17.2F, 0.0F));
		PartDefinition cube_r8 = leafRight5.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 23).addBox(-7.3F, -5.9F, -7.0F, 11.0F, 6.0F, 11.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-1.2F, 11.3F, 0.0F, 0.0F, 0.7854F, -0.6981F));
		PartDefinition LeafRight6 = leafRight5.addOrReplaceChild("LeafRight6", CubeListBuilder.create(), PartPose.offset(5.8F, 7.6F, 0.0F));
		PartDefinition cube_r9 = LeafRight6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 30).addBox(-6.3F, -8.9F, -6.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(1.5F)),
				PartPose.offsetAndRotation(2.5F, 9.0F, 0.0F, 0.0F, 0.7854F, -1.1345F));
		PartDefinition LeafRight7 = LeafRight6.addOrReplaceChild("LeafRight7", CubeListBuilder.create(), PartPose.offset(6.6F, 2.7F, 0.0F));
		PartDefinition cube_r10 = LeafRight7.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(30, 49).addBox(-4.3F, -7.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(4.9F, 6.9F, 0.0F, 0.0F, 0.7854F, -1.4835F));
		PartDefinition headVines = Head.addOrReplaceChild("headVines", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, -11.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.2F, 0.0F));
		PartDefinition cube_r11 = headVines.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, -6.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -3.1416F, -0.9599F, 3.1416F));
		PartDefinition cube_r12 = headVines.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 0).addBox(-4.0F, -6.5F, 0.0F, 8.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, -3.1416F, 0.5672F, 3.1416F));
		PartDefinition Flower = headVines.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.8F, 0.0F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bone3 = Flower.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.1F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(112, 23).addBox(-3.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.2F, -8.4F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(112, 37).addBox(-3.7071F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(1.2F, -2.2F, 0.0F, 0.0F, -0.7854F, 0.5672F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, -6.6F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r15 = bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(112, 48).addBox(-3.7071F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.3054F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, -2.5F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r16 = bone5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(112, 61).addBox(-1.7454F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.05F, 0.1F, 0.0F, 0.0F, -0.7854F, -0.3054F));
		PartDefinition bone6 = Flower.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, 0.1F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r17 = bone6.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-1.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-0.2F, -8.4F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r18 = bone6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(112, 37).mirror().addBox(-0.2929F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-1.2F, -2.2F, 0.0F, 0.0F, 0.7854F, -0.5672F));
		PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -6.6F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r19 = bone7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(112, 48).mirror().addBox(-0.2929F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.3054F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -2.5F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(112, 61).mirror().addBox(-0.2546F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false),
				PartPose.offsetAndRotation(-0.05F, 0.1F, 0.0F, 0.0F, 0.7854F, 0.3054F));
		PartDefinition bone10 = Flower.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 46.0F, 0.0F, -3.1416F, -1.4399F, 3.1416F));
		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, -45.9F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r21 = bone11.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(112, 23).addBox(-3.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.2F, -8.4F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r22 = bone11.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(112, 37).addBox(-3.7071F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(1.2F, -2.2F, 0.0F, 0.0F, -0.7854F, 0.5672F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2F, -6.6F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r23 = bone12.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(112, 48).addBox(-3.7071F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.3054F));
		PartDefinition bone13 = bone12.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.75F, -2.5F, 0.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r24 = bone13.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(112, 61).addBox(-1.7454F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(0.05F, 0.1F, 0.0F, 0.0F, -0.7854F, -0.3054F));
		PartDefinition bone14 = bone10.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9F, -45.9F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r25 = bone14.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(112, 23).mirror().addBox(-1.0F, 1.5F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-0.2F, -8.4F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r26 = bone14.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(112, 37).mirror().addBox(-0.2929F, -0.2F, -0.2929F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.25F)).mirror(false),
				PartPose.offsetAndRotation(-1.2F, -2.2F, 0.0F, 0.0F, 0.7854F, -0.5672F));
		PartDefinition bone15 = bone14.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2F, -6.6F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r27 = bone15.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(112, 48).mirror().addBox(-0.2929F, -2.8F, -0.2929F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.35F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.3054F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, -2.5F, 0.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r28 = bone16.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(112, 61).mirror().addBox(-0.2546F, -2.8006F, -0.2546F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false),
				PartPose.offsetAndRotation(-0.05F, 0.1F, 0.0F, 0.0F, 0.7854F, 0.3054F));
		PartDefinition earLeft = Head.addOrReplaceChild("earLeft", CubeListBuilder.create(), PartPose.offset(-8.0F, -9.9F, 0.0F));
		PartDefinition cube_r29 = earLeft.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.7F, -5.5F, -4.0F, 4.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, 3.7F, 0.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition earRight = Head.addOrReplaceChild("earRight", CubeListBuilder.create(), PartPose.offset(8.0F, -9.9F, 0.0F));
		PartDefinition cube_r30 = earRight.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 53).addBox(-3.3F, -5.5F, -4.0F, 4.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 3.7F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition LegLeft = arama.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(58, 61).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 3.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition LegRight = arama.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(58, 61).mirror().addBox(-1.0F, -1.0F, -1.3F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.5F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -8.0F, 2.3F, 0.0F, 0.0F, 0.1309F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		arama.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
