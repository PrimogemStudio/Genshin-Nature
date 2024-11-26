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
public class Modelosial_final<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelosial_final"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart head2;
	public final ModelPart head3;
	public final ModelPart head4;
	public final ModelPart head5;

	public Modelosial_final(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.head2 = this.bone.getChild("head2");
		this.head3 = this.bone.getChild("head3");
		this.head4 = this.bone.getChild("head4");
		this.head5 = this.bone.getChild("head5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(38, 83).addBox(-7.1411F, -152.5312F, -25.7911F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.1411F, -70.3512F, -11.7443F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1411F, 2.3512F, 4.7443F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1411F, -69.3512F, -4.7443F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -112.3098F, 25.961F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -136.3098F, 25.961F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2018F, -146.0312F, 2.5067F, -0.1797F, 0.6784F, -0.2817F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -146.0312F, -18.2911F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -146.0312F, -18.2911F, 0.1447F, 0.6855F, 0.2262F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6857F, -146.0312F, 3.1495F, -0.1447F, -0.6855F, 0.2262F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -146.0312F, -18.2911F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -146.0312F, -18.2911F, 0.1447F, -0.6855F, -0.2262F));
		PartDefinition head2 = bone.addOrReplaceChild("head2",
				CubeListBuilder.create().texOffs(38, 83).addBox(-7.1411F, -151.5312F, -25.7911F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.1411F, -69.3512F, -11.7443F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1411F, 1.3512F, 4.7443F, 0.0F, 0.3054F, -0.2618F));
		PartDefinition cube_r10 = head2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1411F, -68.3512F, -4.7443F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r11 = head2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -111.3098F, 25.961F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r12 = head2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -135.3098F, 25.961F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r13 = head2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2018F, -145.0312F, 2.5067F, -0.1797F, 0.6784F, -0.2817F));
		PartDefinition cube_r14 = head2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r15 = head2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.1447F, 0.6855F, 0.2262F));
		PartDefinition cube_r16 = head2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6857F, -145.0312F, 3.1495F, -0.1447F, -0.6855F, 0.2262F));
		PartDefinition cube_r17 = head2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r18 = head2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.1447F, -0.6855F, -0.2262F));
		PartDefinition head3 = bone.addOrReplaceChild("head3",
				CubeListBuilder.create().texOffs(38, 83).addBox(-7.1411F, -151.5312F, -25.7911F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.1411F, -69.3512F, -11.7443F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1411F, 1.3512F, 4.7443F, 0.0371F, 0.2602F, 0.3276F));
		PartDefinition cube_r19 = head3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1411F, -68.3512F, -4.7443F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r20 = head3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -111.3098F, 25.961F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r21 = head3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -135.3098F, 25.961F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r22 = head3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2018F, -145.0312F, 2.5067F, -0.1797F, 0.6784F, -0.2817F));
		PartDefinition cube_r23 = head3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r24 = head3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.1447F, 0.6855F, 0.2262F));
		PartDefinition cube_r25 = head3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6857F, -145.0312F, 3.1495F, -0.1447F, -0.6855F, 0.2262F));
		PartDefinition cube_r26 = head3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r27 = head3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.1447F, -0.6855F, -0.2262F));
		PartDefinition head4 = bone.addOrReplaceChild("head4",
				CubeListBuilder.create().texOffs(38, 83).addBox(-7.1411F, -151.5312F, -25.7911F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.1411F, -69.3512F, -11.7443F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1411F, 1.3512F, 4.7443F, 0.3755F, 0.2975F, 0.4722F));
		PartDefinition cube_r28 = head4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1411F, -68.3512F, -4.7443F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r29 = head4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -111.3098F, 25.961F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r30 = head4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -135.3098F, 25.961F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r31 = head4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2018F, -145.0312F, 2.5067F, -0.1797F, 0.6784F, -0.2817F));
		PartDefinition cube_r32 = head4.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r33 = head4.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.1447F, 0.6855F, 0.2262F));
		PartDefinition cube_r34 = head4.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6857F, -145.0312F, 3.1495F, -0.1447F, -0.6855F, 0.2262F));
		PartDefinition cube_r35 = head4.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r36 = head4.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.1447F, -0.6855F, -0.2262F));
		PartDefinition head5 = bone.addOrReplaceChild("head5",
				CubeListBuilder.create().texOffs(38, 83).addBox(-7.1411F, -151.5312F, -25.7911F, 14.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-7.1411F, -69.3512F, -11.7443F, 14.0F, 68.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1411F, 1.3512F, 4.7443F, 0.2399F, 0.4666F, -0.5064F));
		PartDefinition cube_r37 = head5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-6.99F, -52.0F, -6.0F, 14.0F, 56.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1411F, -68.3512F, -4.7443F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r38 = head5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-7.01F, -24.1986F, -8.7053F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -111.3098F, 25.961F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r39 = head5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -26.2214F, -11.7521F, 14.0F, 30.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1311F, -135.3098F, 25.961F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r40 = head5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2018F, -145.0312F, 2.5067F, -0.1797F, 0.6784F, -0.2817F));
		PartDefinition cube_r41 = head5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(76, 0).addBox(-19.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r42 = head5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(76, 0).addBox(-14.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6411F, -145.0312F, -18.2911F, 0.1447F, 0.6855F, 0.2262F));
		PartDefinition cube_r43 = head5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(76, 0).addBox(-9.0F, -1.5F, -3.0F, 18.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6857F, -145.0312F, 3.1495F, -0.1447F, -0.6855F, 0.2262F));
		PartDefinition cube_r44 = head5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(76, 0).addBox(3.5F, -1.5F, 5.5F, 17.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r45 = head5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(76, 0).addBox(-4.5F, -2.5F, -3.5F, 19.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3589F, -145.0312F, -18.2911F, 0.1447F, -0.6855F, -0.2262F));
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
