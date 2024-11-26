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
public class Modelmaranas_avatar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelmaranas_avatar"), "main");
	public final ModelPart bone;

	public Modelmaranas_avatar(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-15.0F, -25.0F, -15.0F, 5.0F, 20.0F, 29.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(83, 2).addBox(-10.0F, -25.0F, -14.0F, 2.0F, 20.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(83, 2).mirror().addBox(8.0F, -25.0F, -14.0F, 2.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 94).addBox(-15.0F, -30.0F, -15.0F, 30.0F, 5.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(94, 3)
						.addBox(-8.0F, -7.0F, -14.0F, 16.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.0F, -25.0F, -15.0F, 5.0F, 20.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-15.0F, -30.0F, 14.0F, 30.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 45).addBox(-5.0F, -19.0F, -8.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 3).addBox(-8.0F, -1.0F, 0.0F, 16.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, -14.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-15.0F, -2.5F, -14.5F, 30.0F, 5.0F, 29.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.5F, -0.5F, 0.0F, 0.0F, -3.1416F));
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
