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
public class Modelweapon_primal_construct_prospector<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelweapon_primal_construct_prospector"), "main");
	public final ModelPart weapon2;

	public Modelweapon_primal_construct_prospector(ModelPart root) {
		this.weapon2 = root.getChild("weapon2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition weapon2 = partdefinition.addOrReplaceChild("weapon2", CubeListBuilder.create().texOffs(3, 32).mirror().addBox(-2.5F, -1.5F, 0.6567F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(43, 29).mirror()
				.addBox(-2.5F, -7.5F, 0.6667F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 18.5F, -2.6667F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = weapon2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(29, 20).mirror().addBox(-1.0F, -3.0F, -1.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5F, 2.5F, 1.6667F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r2 = weapon2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(29, 20).addBox(-5.0F, -3.0F, -1.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 2.5F, 1.6667F, 0.0F, 0.0F, -0.4363F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		weapon2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}