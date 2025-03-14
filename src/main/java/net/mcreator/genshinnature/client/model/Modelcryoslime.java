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
public class Modelcryoslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelcryoslime"), "main");
	public final ModelPart bb_main;

	public Modelcryoslime(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 55).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-6.0F, -3.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-7.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).mirror()
						.addBox(6.0F, -7.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror().addBox(-6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror()
						.addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0).mirror().addBox(-4.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 0)
						.addBox(5.0F, -8.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(3.0F, -10.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-3.0F, -11.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 59)
						.addBox(-6.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 57).addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 59)
						.addBox(5.0F, -7.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 57).addBox(-3.0F, -10.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(5.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(4.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 56)
						.addBox(-3.0F, -10.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-5.0F, -8.0F, 4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-6.0F, -7.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(-1.0F, -10.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 30).addBox(7.0F, -7.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(7.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 30).addBox(7.0F, -7.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(-8.0F, -7.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 30).addBox(-8.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 30)
						.addBox(-8.0F, -7.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
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
