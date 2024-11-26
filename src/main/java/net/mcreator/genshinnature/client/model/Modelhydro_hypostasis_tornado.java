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
public class Modelhydro_hypostasis_tornado<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelhydro_hypostasis_tornado"), "main");
	public final ModelPart bone;
	public final ModelPart inside_cube;
	public final ModelPart outside_cubes;

	public Modelhydro_hypostasis_tornado(ModelPart root) {
		this.bone = root.getChild("bone");
		this.inside_cube = this.bone.getChild("inside_cube");
		this.outside_cubes = this.bone.getChild("outside_cubes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition inside_cube = bone.addOrReplaceChild("inside_cube", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition outside_cubes = bone
				.addOrReplaceChild(
						"outside_cubes", CubeListBuilder.create().texOffs(12, 81).addBox(-10.0F, 7.0F, -10.0F, 20.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(23, 110).addBox(-8.0F, 13.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
								.texOffs(32, 43).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-14.0F, -7.0F, -14.0F, 28.0F, 6.0F, 28.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 7.0F, 0.0F));
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
