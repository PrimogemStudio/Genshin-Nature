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
public class Modeldefense_mechanism<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modeldefense_mechanism"), "main");
	public final ModelPart bone;
	public final ModelPart triangle;
	public final ModelPart triangle2;
	public final ModelPart triangle3;

	public Modeldefense_mechanism(ModelPart root) {
		this.bone = root.getChild("bone");
		this.triangle = this.bone.getChild("triangle");
		this.triangle2 = this.bone.getChild("triangle2");
		this.triangle3 = this.bone.getChild("triangle3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -18.0F, 0.0F, 18.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(23, 33).addBox(-4.0F, -12.0F, -1.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition triangle = bone.addOrReplaceChild("triangle",
				CubeListBuilder.create().texOffs(34, 47).addBox(-7.0F, -17.0F, -1.0F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(-5.0F, -23.0F, -1.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));
		PartDefinition triangle2 = bone.addOrReplaceChild("triangle2",
				CubeListBuilder.create().texOffs(34, 47).addBox(-7.0F, -17.0F, -1.01F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(-5.0F, -23.0F, -1.01F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -8.0F, 0.0F, 0.0F, 0.0F, -2.1817F));
		PartDefinition triangle3 = bone.addOrReplaceChild("triangle3",
				CubeListBuilder.create().texOffs(34, 47).addBox(-7.0F, -17.0F, -1.1F, 14.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57).addBox(-5.0F, -23.0F, -1.1F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 2.1817F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
