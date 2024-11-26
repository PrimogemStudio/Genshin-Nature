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
public class Modelelectro_regisvine<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelelectro_regisvine"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart leftarm;
	public final ModelPart rightarm;

	public Modelelectro_regisvine(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.bone2 = this.head.getChild("bone2");
		this.bone3 = this.head.getChild("bone3");
		this.bone4 = this.head.getChild("bone4");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(94, 87).addBox(-4.0F, 5.5F, -6.0F, 9.0F, 33.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.5F, 4.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(104, 65).mirror().addBox(-4.5F, -8.5F, -1.5F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, 38.0F, -7.5F, 2.4435F, 0.0F, -3.1416F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(104, 65).addBox(-4.5F, -8.5F, -1.5F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 38.0F, 3.5F, -0.6981F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 111).mirror().addBox(-1.5F, -8.5F, -4.0F, 3.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.5F, 38.0F, -2.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 111).addBox(-1.5F, -8.5F, -4.0F, 3.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, 38.0F, -2.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 91).addBox(-4.5F, -25.6577F, -3.3126F, 9.0F, 29.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -16.5668F, 10.9249F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(94, 92).addBox(-3.9F, -20.5F, -1.9F, 9.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.5F, -53.3932F, 7.5616F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 58).addBox(-4.49F, -15.6264F, -2.7579F, 9.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(106, 14).addBox(-2.5F, -18.6264F, 3.2421F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 30)
						.addBox(-1.5F, -21.6264F, 3.2421F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 30).addBox(3.5F, -21.6264F, -1.7579F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 14).mirror()
						.addBox(3.5F, -18.6264F, -2.7579F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 14).addBox(-9.5F, -18.6264F, -2.7579F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 30).mirror()
						.addBox(-8.5F, -21.6264F, -1.7579F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(75, 26).addBox(-3.5F, -21.6264F, -4.7579F, 7.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.7084F, 0.3489F, 1.3526F, 0.0F, 0.0F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 30).mirror().addBox(-1.5F, -2.1493F, -0.5711F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -8.6706F, -18.0576F, 1.4366F, -0.1726F, -0.9047F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(25, 30).addBox(-1.5F, -2.1493F, -0.5711F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -8.6706F, -18.0576F, 1.4366F, 0.1726F, 0.9047F));
		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, 0.3168F, -14.0419F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 50).addBox(-47.9591F, -3.0862F, 4.7932F, 49.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-13.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(104, 0).addBox(-23.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-33.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-43.9591F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-13.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-23.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-33.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-43.9591F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(43.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(33.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(23.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(13.0409F, -3.0862F, -0.2068F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(13.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(23.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(33.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(43.0409F, -3.0862F, 9.7932F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 50).mirror().addBox(5.0409F, -3.0862F, 4.7932F, 49.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(5.0409F, 0.9138F, 0.7932F, 19.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).addBox(-17.9591F, 0.9138F, 0.7932F, 19.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4153F, 0.1536F, 0.7734F));
		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1917F, -6.7106F, -12.5568F, 0.3638F, 0.0819F, 1.8098F));
		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 0).addBox(-17.3668F, 0.9432F, -0.1464F, 19.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-44.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(104, 0).addBox(-34.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-14.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-24.3668F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-14.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-24.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-34.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-44.3668F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(43.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(33.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(23.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(13.6332F, -4.0568F, 8.8536F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(13.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(23.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(33.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(43.6332F, -4.0568F, -1.1464F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 50).mirror().addBox(5.6332F, -4.0568F, 3.8536F, 49.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 50)
						.addBox(-48.3668F, -4.0568F, 3.8536F, 49.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9502F, 4.3243F, -0.7707F, 1.4153F, 0.1536F, 0.7734F));
		PartDefinition bone4 = head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.1917F, -6.7106F, -12.5568F, 0.3638F, 0.0819F, 1.8098F));
		PartDefinition cube_r12 = bone4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(5.6332F, 0.9432F, -0.1464F, 19.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9502F, 4.3243F, -0.7707F, 1.4153F, 0.1536F, 0.7734F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(4.2976F, -52.8022F, 0.9342F));
		PartDefinition cube_r13 = leftarm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(64, 67).addBox(15.1987F, -2.0671F, -11.3556F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(64, 67).addBox(15.1987F, -2.0671F, 2.6444F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(48, 67).addBox(15.1987F, 2.9329F, -2.3556F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 67).addBox(15.1987F, -11.0671F, -2.3556F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 122)
						.addBox(19.1987F, -1.0671F, -1.3556F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 96).addBox(-1.8013F, -2.0671F, -2.3556F, 21.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(37.5176F, 23.5885F, -6.5786F, 1.4604F, 0.1886F, 1.0367F));
		PartDefinition cube_r14 = leftarm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(28, 108).mirror().addBox(-1.9995F, -3.3997F, -1.0152F, 21.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(19.0869F, 20.1019F, -4.4707F, 1.3598F, 0.056F, 0.2559F));
		PartDefinition cube_r15 = leftarm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 86).addBox(3.0409F, 3.9138F, 4.7932F, 30.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7976F, -0.2742F, -7.4145F, 1.4153F, 0.1536F, 0.7734F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1907F, -53.4099F, 1.5633F, -2.9138F, -0.0198F, 3.0286F));
		PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(64, 67).addBox(15.1987F, -2.0671F, -11.3556F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(64, 67).addBox(15.1987F, -2.0671F, 2.6444F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
						.texOffs(48, 67).addBox(15.1987F, 2.9329F, -2.3556F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 67).addBox(15.1987F, -11.0671F, -2.3556F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 122)
						.addBox(19.1987F, -1.0671F, -1.3556F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(21, 96).addBox(-1.8013F, -2.0671F, -2.3556F, 21.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(37.5725F, 24.7002F, -5.4583F, 1.4604F, 0.1886F, 1.0367F));
		PartDefinition cube_r17 = rightarm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(28, 108).mirror().addBox(-1.9995F, -3.4037F, -1.0152F, 21.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(19.1418F, 21.2136F, -3.3504F, 1.3598F, 0.056F, 0.2559F));
		PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 86).addBox(3.0409F, 3.9138F, 4.7932F, 30.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7427F, 0.8375F, -6.2942F, 1.4153F, 0.1536F, 0.7734F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
