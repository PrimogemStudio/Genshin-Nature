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
public class Modelpyro_hypostasis_fist<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelpyro_hypostasis_fist"), "main");
	public final ModelPart inside_cube;

	public Modelpyro_hypostasis_fist(ModelPart root) {
		this.inside_cube = root.getChild("inside_cube");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition inside_cube = partdefinition.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 111)
				.addBox(-7.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(92, 111).addBox(2.0F, -10.0F, -18.0F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition cube_r1 = inside_cube.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(94, 118).addBox(0.0F, -2.5F, -2.5F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -7.5F, -4.5F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r2 = inside_cube.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(94, 118).addBox(-10.0F, -2.5F, -2.5F, 11.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -7.5F, -4.5F, 0.0F, -0.5236F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		inside_cube.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
