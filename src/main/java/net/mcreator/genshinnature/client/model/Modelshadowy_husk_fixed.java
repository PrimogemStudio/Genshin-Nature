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
public class Modelshadowy_husk_fixed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelshadowy_husk_fixed"), "main");
	public final ModelPart bone;
	public final ModelPart body;
	public final ModelPart cube_r10;
	public final ModelPart cube_r11;
	public final ModelPart cube_r15;
	public final ModelPart cube_r16;
	public final ModelPart head;
	public final ModelPart cube_r7;
	public final ModelPart cube_r8;
	public final ModelPart cube_r9;
	public final ModelPart cube_r12;
	public final ModelPart cube_r13;
	public final ModelPart cube_r14;
	public final ModelPart leftarm;
	public final ModelPart cube_r6;
	public final ModelPart cube_r2;
	public final ModelPart cube_r3;
	public final ModelPart rightarm;
	public final ModelPart cube_r1;
	public final ModelPart cube_r5;
	public final ModelPart cube_r4;
	public final ModelPart leftleg;
	public final ModelPart cube_r17;
	public final ModelPart cube_r18;
	public final ModelPart cube_r19;
	public final ModelPart rightleg;
	public final ModelPart cube_r20;
	public final ModelPart cube_r21;
	public final ModelPart cube_r22;

	public Modelshadowy_husk_fixed(ModelPart root) {
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.cube_r10 = this.body.getChild("cube_r10");
		this.cube_r11 = this.body.getChild("cube_r11");
		this.cube_r15 = this.body.getChild("cube_r15");
		this.cube_r16 = this.body.getChild("cube_r16");
		this.head = this.bone.getChild("head");
		this.cube_r7 = this.head.getChild("cube_r7");
		this.cube_r8 = this.head.getChild("cube_r8");
		this.cube_r9 = this.head.getChild("cube_r9");
		this.cube_r12 = this.head.getChild("cube_r12");
		this.cube_r13 = this.head.getChild("cube_r13");
		this.cube_r14 = this.head.getChild("cube_r14");
		this.leftarm = this.bone.getChild("leftarm");
		this.cube_r6 = this.leftarm.getChild("cube_r6");
		this.cube_r2 = this.leftarm.getChild("cube_r2");
		this.cube_r3 = this.leftarm.getChild("cube_r3");
		this.rightarm = this.bone.getChild("rightarm");
		this.cube_r1 = this.rightarm.getChild("cube_r1");
		this.cube_r5 = this.rightarm.getChild("cube_r5");
		this.cube_r4 = this.rightarm.getChild("cube_r4");
		this.leftleg = this.bone.getChild("leftleg");
		this.cube_r17 = this.leftleg.getChild("cube_r17");
		this.cube_r18 = this.leftleg.getChild("cube_r18");
		this.cube_r19 = this.leftleg.getChild("cube_r19");
		this.rightleg = this.bone.getChild("rightleg");
		this.cube_r20 = this.rightleg.getChild("cube_r20");
		this.cube_r21 = this.rightleg.getChild("cube_r21");
		this.cube_r22 = this.rightleg.getChild("cube_r22");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -39.0F, -7.0F, 8.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -31.0F, -6.0F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -48.0F, -8.0F, 8.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(30, 25).addBox(-1.0F, -47.0F, -12.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-1.0F, -47.0F, 8.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 25).addBox(-4.0F, -50.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 44)
						.addBox(-3.0F, -53.0F, -4.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(106, 19).addBox(-2.0F, -50.0F, 6.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 15)
						.addBox(-2.0F, -50.0F, -10.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 17).addBox(-4.0F, -22.0F, -1.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 44)
						.addBox(-4.0F, -25.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(108, 0).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.5F, 5.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 108).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -50.5F, -5.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 43).addBox(-4.0F, -5.0F, 9.0F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -52.0F, -5.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 101).addBox(-4.0F, -1.0F, -3.0F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -52.0F, -5.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(56, 52).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 39)
				.addBox(-4.0F, -5.5F, -6.0F, 8.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(70, 94).addBox(-3.0F, -10.5F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -68.5F, 0.0F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 28).addBox(-1.0F, -4.0F, -0.5F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.5F, 0.5F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -4.0F, -0.5F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.5F, -0.5F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 110).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 3.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(107, 111).addBox(-3.0F, -4.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(111, 31).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -3.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(112, 64).addBox(-3.0F, -1.5F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 3.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition leftarm = bone.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 84).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 76)
				.addBox(-3.0F, 13.5F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(88, 22).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -64.5F, 13.0F));
		PartDefinition cube_r6 = leftarm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 98).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, 3.0F, 0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r2 = leftarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(49, 52).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, 2.0F, -1.1345F, 0.0F, 0.0F));
		PartDefinition cube_r3 = leftarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 33).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition rightarm = bone.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(73, 76).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
				.addBox(-3.0F, 13.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -64.5F, -13.0F));
		PartDefinition cube_r1 = rightarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(21, 47).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, -3.0F, -2.0508F, 0.0F, 0.0F));
		PartDefinition cube_r5 = rightarm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(97, 77).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.5F, -1.0F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r4 = rightarm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(97, 67).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 1.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition leftleg = bone.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(24, 94).addBox(-3.2143F, 31.5714F, -3.2143F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 102).addBox(-1.2143F, 36.5714F, -3.2143F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(88, 98).addBox(-0.2143F, 38.5714F, -3.2143F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-4.2143F, 1.5714F, -3.2143F, 7.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(49, 67)
						.addBox(-4.2143F, 16.5714F, -3.2143F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 15).addBox(-5.2143F, -3.4286F, -3.7143F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 61)
						.addBox(-3.2143F, 24.5714F, -3.2143F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.2143F, -40.5714F, 3.7143F));
		PartDefinition cube_r17 = leftleg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7857F, 36.0714F, -0.2143F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r18 = leftleg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(104, 100).addBox(-3.0F, -1.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2143F, 37.8214F, -0.2143F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r19 = leftleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(16, 105).addBox(-1.0F, -3.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7857F, 39.0714F, -0.2143F, 0.0F, 0.0F, -0.7854F));
		PartDefinition rightleg = bone.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(91, 87).addBox(-3.2143F, 31.5714F, -2.7857F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(102, 11).addBox(-1.2143F, 36.5714F, -2.7857F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
						.texOffs(98, 56).addBox(-0.2143F, 38.5714F, -2.7857F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 31).addBox(-5.2143F, -3.4286F, -4.2857F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 52)
						.addBox(-4.2143F, 1.5714F, -3.7857F, 7.0F, 15.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 69).addBox(-4.2143F, 16.5714F, -3.7857F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 87)
						.addBox(-3.2143F, 24.5714F, -2.7857F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.2143F, -40.5714F, -3.7143F));
		PartDefinition cube_r20 = rightleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(91, 106).addBox(-1.0F, -2.5F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.7857F, 36.0714F, 0.2143F, 0.0F, 0.0F, -0.48F));
		PartDefinition cube_r21 = rightleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2143F, 37.8214F, 0.2143F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r22 = rightleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(75, 103).addBox(-1.0F, -3.5F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7857F, 39.0714F, 0.2143F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
