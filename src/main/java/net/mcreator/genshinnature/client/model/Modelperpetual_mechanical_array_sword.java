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
public class Modelperpetual_mechanical_array_sword<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelperpetual_mechanical_array_sword"), "main");
	public final ModelPart bone;
	public final ModelPart outside_cubes;

	public Modelperpetual_mechanical_array_sword(ModelPart root) {
		this.bone = root.getChild("bone");
		this.outside_cubes = this.bone.getChild("outside_cubes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.1347F, 0.0435F, 0.0873F));
		PartDefinition outside_cubes = bone.addOrReplaceChild("outside_cubes", CubeListBuilder.create().texOffs(88, 108).mirror().addBox(-5.0F, -21.5F, -4.745F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 112).mirror()
				.addBox(-5.0F, -31.5F, -2.755F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 114).mirror().addBox(-5.0F, -41.5F, -1.755F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 114)
				.mirror().addBox(-5.0F, -51.5F, -1.755F, 10.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(88, 108).addBox(4.0F, -19.5F, -4.755F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 108)
				.addBox(-14.0F, -19.5F, -4.755F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(88, 108).mirror().addBox(-5.0F, -11.5F, -4.745F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 114).mirror()
				.addBox(-5.0F, -1.5F, -3.745F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 112).mirror().addBox(-4.0F, 3.5F, -2.745F, 8.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, -13.5F, 0.745F));
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
