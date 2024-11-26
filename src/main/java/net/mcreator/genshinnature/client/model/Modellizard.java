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
public class Modellizard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modellizard"), "main");
	public final ModelPart head;
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;
	public final ModelPart rightleg1;
	public final ModelPart rightleg2;
	public final ModelPart bb_main;

	public Modellizard(ModelPart root) {
		this.head = root.getChild("head");
		this.leftleg1 = root.getChild("leftleg1");
		this.leftleg2 = root.getChild("leftleg2");
		this.rightleg1 = root.getChild("rightleg1");
		this.rightleg2 = root.getChild("rightleg2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -2.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 0).addBox(-0.5F, -2.5F, -1.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 21.0F, -3.25F));
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offset(-0.384F, 21.799F, -1.5F));
		PartDefinition cube_r1 = leftleg1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offset(-0.384F, 21.799F, 2.5F));
		PartDefinition cube_r2 = leftleg2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 60).mirror().addBox(0.0F, -0.634F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition rightleg1 = partdefinition.addOrReplaceChild("rightleg1", CubeListBuilder.create().texOffs(60, 60).addBox(0.366F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.384F, 22.799F, -1.5F, 0.0F, 0.0F, -0.5236F));
		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(60, 60).addBox(-0.134F, -0.134F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.384F, 21.799F, 2.5F, 0.0F, 0.0F, -0.5236F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-1.0F, -4.0F, -3.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 0).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -2.5F, 4.0F, -0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightleg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
