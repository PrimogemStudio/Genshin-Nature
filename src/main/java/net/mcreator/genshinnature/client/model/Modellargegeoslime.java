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
public class Modellargegeoslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modellargegeoslime"), "main");
	public final ModelPart bone;
	public final ModelPart helmet;

	public Modellargegeoslime(ModelPart root) {
		this.bone = root.getChild("bone");
		this.helmet = root.getChild("helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 118).addBox(10.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(-8.0F, -2.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-6.0F, -22.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(31, 110).addBox(8.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(31, 110)
						.addBox(10.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(10.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0)
						.addBox(8.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(6.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(31, 110)
						.addBox(-12.0F, -6.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).mirror().addBox(-12.0F, -16.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 0).mirror()
						.addBox(-10.0F, -18.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 0).mirror().addBox(-8.0F, -20.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 0)
						.addBox(-14.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).mirror().addBox(12.0F, -14.0F, -8.0F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(31, 110)
						.addBox(-10.0F, -4.0F, -8.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -18.0F, -10.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 108)
						.addBox(-6.0F, -20.0F, -10.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 114).addBox(-10.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 114).mirror()
						.addBox(8.0F, -16.0F, -10.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(120, 116).mirror().addBox(-12.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(120, 116)
						.addBox(10.0F, -14.0F, -10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 118).addBox(-12.0F, -14.0F, 8.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(-10.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 110).addBox(-8.0F, -18.0F, 8.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 112)
						.addBox(-6.0F, -20.0F, 8.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 114).addBox(8.0F, -16.0F, 8.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet",
				CubeListBuilder.create().texOffs(0, 43).addBox(14.0F, -23.0F, -11.0F, 2.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-16.0F, -23.0F, -11.0F, 2.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-15.0F, -23.0F, 9.0F, 30.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-14.0F, -26.0F, -10.0F, 28.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(2.0F, -23.0F, -12.0F, 13.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-1.0F, -23.0F, -12.0F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-15.0F, -23.0F, -12.0F, 14.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-13.0F, -14.0F, -12.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(8.0F, -14.0F, -12.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-15.0F, -14.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(13.0F, -14.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = helmet.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(60, 70).mirror().addBox(6.0F, -14.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(60, 70).addBox(-12.0F, -14.0F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.0F, 4.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r2 = helmet.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 70).mirror().addBox(-3.0F, -11.5F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.0F, -22.5F, -4.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r3 = helmet.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 70).addBox(-3.0F, -11.5F, -3.0F, 6.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -22.5F, -4.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r4 = helmet.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(60, 70).addBox(-3.0F, -10.5F, -11.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.5F, -2.0F, 0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
