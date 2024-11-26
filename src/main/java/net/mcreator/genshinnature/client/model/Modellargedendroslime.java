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
public class Modellargedendroslime<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modellargedendroslime"), "main");
	public final ModelPart bb_main;

	public Modellargedendroslime(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 110).addBox(-8.5F, -2.0937F, -8.0774F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(7.5F, -4.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(9.5F, -6.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(-10.5F, -4.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-12.5F, -6.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(-14.5F, -14.0937F, -8.0774F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).mirror()
						.addBox(11.5F, -14.0937F, -8.0774F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 0).mirror().addBox(-12.5F, -16.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(92, 0).mirror().addBox(-10.5F, -18.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 0).mirror().addBox(-8.5F, -20.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(92, 0).addBox(9.5F, -16.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(7.5F, -18.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(92, 0)
						.addBox(5.5F, -20.0937F, -8.0774F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-6.5F, -22.0937F, -8.0774F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.5F, -18.0937F, -10.0774F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 114).addBox(-10.5F, -16.0937F, -10.0774F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 116)
						.addBox(-12.5F, -14.0937F, -10.0774F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 114).addBox(7.5F, -16.0937F, -10.0774F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 115)
						.addBox(9.5F, -14.0937F, -10.0774F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 109).addBox(-6.5F, -20.0937F, -10.0774F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 113)
						.addBox(9.5F, -14.0937F, 7.9226F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(7.5F, -16.0937F, 7.9226F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 111)
						.addBox(-6.5F, -20.0937F, 7.9226F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 110).addBox(-8.5F, -18.0937F, 7.9226F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 112)
						.addBox(-10.5F, -16.0937F, 7.9226F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 115).addBox(-12.5F, -14.0937F, 7.9226F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 25)
						.addBox(-3.5F, -35.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 39).addBox(-3.0F, -11.5F, -1.5F, 6.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -22.5937F, -4.5774F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(88, 39).addBox(-3.0F, -11.5F, -1.5F, 6.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -22.5937F, 4.4226F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 39).addBox(-3.0F, -12.5F, -1.5F, 6.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4226F, -21.5937F, 0.4226F, 0.0F, 1.5708F, -0.4363F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 39).addBox(-3.0F, -12.5F, -1.5F, 6.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5774F, -21.5937F, 0.4226F, 0.0F, 1.5708F, 0.4363F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(59, 48).addBox(-2.5F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -22.0937F, 0.4226F, 0.0F, 1.5708F, 0.9599F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(59, 48).addBox(-2.5F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, -22.0937F, 0.4226F, 0.0F, 1.5708F, -0.9599F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(59, 48).addBox(-3.0F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -22.0937F, 5.4226F, -0.9599F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 48).addBox(-3.0F, -10.0F, -1.5F, 6.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -22.0937F, -5.5774F, 0.9599F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
