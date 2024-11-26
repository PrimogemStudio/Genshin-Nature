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
public class Modelshaggy_sumpter_beast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelshaggy_sumpter_beast"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart horn;
	public final ModelPart horn2;
	public final ModelPart left_hand;
	public final ModelPart right_hand;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modelshaggy_sumpter_beast(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.horn = this.head.getChild("horn");
		this.horn2 = this.head.getChild("horn2");
		this.left_hand = this.bone.getChild("left_hand");
		this.right_hand = this.bone.getChild("right_hand");
		this.right_leg = this.bone.getChild("right_leg");
		this.left_leg = this.bone.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -17.0F, -8.0F, 18.0F, 17.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create().texOffs(80, 2).addBox(-5.5F, -5.0F, -8.5F, 11.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -8.0F, -8.5F));
		PartDefinition horn = head.addOrReplaceChild("horn",
				CubeListBuilder.create().texOffs(68, 63).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 48).mirror().addBox(-2.0F, -6.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -4.0F, -6.5F, 1.0472F, 0.0F, 0.0F));
		PartDefinition horn2 = head.addOrReplaceChild("horn2",
				CubeListBuilder.create().texOffs(68, 63).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 48).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -4.0F, -6.5F, 1.0472F, 0.0F, 0.0F));
		PartDefinition left_hand = bone.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, -2.5F, -3.5F));
		PartDefinition right_hand = bone.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, -1.5F, -3.5F));
		PartDefinition right_leg = bone.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, -1.5F, 7.5F));
		PartDefinition left_leg = bone.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(13, 47).addBox(-2.5F, 0.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, -2.5F, 7.5F));
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
