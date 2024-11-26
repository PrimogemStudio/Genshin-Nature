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
public class Modelelectro_hypostasis_hands<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelelectro_hypostasis_hands"), "main");
	public final ModelPart bb_main;

	public Modelelectro_hypostasis_hands(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -9.0F, -1.0F, 12.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-16.0F, -17.0F, -1.0F, 13.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-22.0F, -24.0F, -1.0F, 13.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-10.6667F, 3.6667F, -1.0F, 12.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-14.6667F, -4.3333F, -1.0F, 13.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror().addBox(-20.6667F, -11.3333F, -1.0F, 13.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.6667F, -12.6667F, 0.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
