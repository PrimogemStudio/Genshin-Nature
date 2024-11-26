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
public class Modelruin_destroyer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelruin_destroyer"), "main");
	public final ModelPart HEAD;
	public final ModelPart bb_main;

	public Modelruin_destroyer(ModelPart root) {
		this.HEAD = root.getChild("HEAD");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition HEAD = partdefinition.addOrReplaceChild("HEAD", CubeListBuilder.create(), PartPose.offset(0.6837F, -2.1867F, -5.1115F));
		PartDefinition cube_r1 = HEAD.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0811F, -2.5475F, -1.6314F, -1.8733F, 0.1525F, 0.1201F));
		PartDefinition cube_r2 = HEAD.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 0).addBox(7.0F, 2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9189F, -6.5475F, -5.6314F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = HEAD.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 30).mirror().addBox(-8.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0811F, -6.5475F, -5.6314F, 0.0F, -0.0873F, -0.0436F));
		PartDefinition cube_r4 = HEAD.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 30).addBox(0.0F, -1.0F, -3.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9189F, -6.5475F, -5.6314F, 0.0F, 0.0873F, 0.0436F));
		PartDefinition cube_r5 = HEAD.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8483F, -2.4987F, -5.8885F, 0.0436F, 0.0F, 0.829F));
		PartDefinition cube_r6 = HEAD.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-5.0F, -1.0F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5239F, -2.6591F, -5.8885F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(6, 15).addBox(7.0F, 1.0F, 0.6553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 15).addBox(7.0F, -5.0F, 0.6553F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 15)
						.addBox(7.0F, -1.342F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 15).addBox(7.0F, -1.342F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
						.addBox(3.0F, -3.0F, -1.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4157F, -19.658F, -0.1553F, -1.6039F, -0.9947F, -1.1882F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(0.0F, -1.0F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1705F, -0.0376F, -0.215F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(15, 55).addBox(-8.0F, -1.0F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1705F, 0.0376F, 0.215F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.797F, -2.0279F, 3.7041F, 1.3526F, -1.3963F, -1.5708F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6696F, -23.5124F, -2.2971F, -2.4726F, 0.356F, -0.8616F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9764F, -11.7328F, -0.5003F, -0.4673F, -0.5982F, -2.9911F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, 0.0865F, -0.0114F, 1.0031F));
		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 55).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.797F, -2.0279F, 3.7041F, 1.3526F, 1.3963F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		HEAD.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
