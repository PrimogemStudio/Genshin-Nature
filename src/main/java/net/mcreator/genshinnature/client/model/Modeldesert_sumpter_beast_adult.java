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
public class Modeldesert_sumpter_beast_adult<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modeldesert_sumpter_beast_adult"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart left_hand;
	public final ModelPart right_hand;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modeldesert_sumpter_beast_adult(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.left_hand = this.bone.getChild("left_hand");
		this.right_hand = this.bone.getChild("right_hand");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -34.0F, -16.0F, 36.0F, 34.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(128, 182)
				.addBox(-18.0F, -36.0F, -14.0F, 36.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(128, 182).addBox(-18.0F, -36.0F, 4.0F, 36.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(160, 4).addBox(-11.0F, -7.0F, -17.0F, 22.0F, 20.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(7, 166).mirror()
				.addBox(-13.0F, -9.0F, -17.0F, 6.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 166).addBox(7.0F, -9.0F, -17.0F, 6.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -19.0F, -17.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(180, 58).mirror().addBox(-1.0F, -3.0F, -6.0F, 2.0F, 26.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-12.0F, -4.0F, -7.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(180, 58).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 26.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -4.0F, -7.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition left_hand = bone.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(26, 94).addBox(-5.0F, 4.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-17.0F, -8.0F, -7.0F));
		PartDefinition right_hand = bone.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(26, 94).addBox(-5.0F, 2.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -6.0F, -7.0F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(26, 94).addBox(-5.0F, 2.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -6.0F, 15.0F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(26, 94).addBox(-5.0F, 4.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-17.0F, -8.0F, 15.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
