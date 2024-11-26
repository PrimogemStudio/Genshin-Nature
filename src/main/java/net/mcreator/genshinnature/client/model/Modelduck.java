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
public class Modelduck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelduck"), "main");
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart wings;

	public Modelduck(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.wings = root.getChild("wings");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(4, 52).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 60).mirror()
				.addBox(-1.5F, 4.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.5F, 20.0F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(4, 52).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 60).addBox(-1.5F, 4.0F, -2.0F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 20.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 33).addBox(-4.0F, -10.0F, -4.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(37, 42).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -7.0F, 4.5F, -0.4363F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(17, 16).addBox(-1.5F, -9.3333F, -1.3333F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
				.addBox(-2.5F, -13.3333F, -2.3333F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 22).addBox(-2.5F, -11.3333F, -4.3333F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 17.3333F, -3.6667F));
		PartDefinition wings = partdefinition.addOrReplaceChild("wings",
				CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).mirror().addBox(-5.0F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
