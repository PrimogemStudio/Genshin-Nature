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
public class Modelweasel_fixed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelweasel_fixed"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leftleg;
	public final ModelPart rightleg;
	public final ModelPart rightarm;
	public final ModelPart leftarm;

	public Modelweasel_fixed(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -2.1318F, -4.5796F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 17.4555F, 0.3632F, 1.3526F, 0.0F, -3.1416F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -2.4434F, -2.8373F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0445F, -5.3632F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 31).addBox(0.0F, 0.6819F, -2.3084F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0382F, 3.6447F, -2.0944F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.5F, -4.8333F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
				.addBox(0.5F, -2.5F, -0.8333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61).mirror().addBox(-2.5F, -2.5F, -0.8333F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, 10.0F, -2.6667F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(56, 58).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 60).addBox(-0.5F, 2.5F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 20.5F, 2.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(56, 58).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 60).mirror()
				.addBox(-0.5F, 2.5F, -4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.5F, 20.5F, 2.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.077F, -2.2336F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 60).mirror()
				.addBox(-0.5F, 1.923F, -3.2336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, 13.9747F, -0.9571F, 0.2618F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-0.5F, -0.077F, -2.2336F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 60).mirror()
				.addBox(-0.5F, 1.923F, -3.2336F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 13.9747F, -0.9571F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
