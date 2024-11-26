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
public class Modelmagatsu_mitake_narukami_no_mikoto_puppet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("genshin_nature", "modelmagatsu_mitake_narukami_no_mikoto_puppet"), "main");
	public final ModelPart bone60;
	public final ModelPart baal;
	public final ModelPart head;
	public final ModelPart headDeco;
	public final ModelPart TrueEventaille;
	public final ModelPart Eventaille3;
	public final ModelPart bone13;
	public final ModelPart bone15;
	public final ModelPart bone12;
	public final ModelPart bone14;
	public final ModelPart Eventaille4;
	public final ModelPart bone11;
	public final ModelPart Eventaille5;
	public final ModelPart Eventaille6;
	public final ModelPart Eventaille7;
	public final ModelPart Eventaille8;
	public final ModelPart TrueFlower;
	public final ModelPart Flower;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart Flower2;
	public final ModelPart bone6;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone10;
	public final ModelPart Papillon;
	public final ModelPart bone16;
	public final ModelPart bone17;
	public final ModelPart bone18;
	public final ModelPart bone19;
	public final ModelPart Hairs;
	public final ModelPart bone34;
	public final ModelPart bone35;
	public final ModelPart bone36;
	public final ModelPart bone37;
	public final ModelPart bone38;
	public final ModelPart bone39;
	public final ModelPart bone40;
	public final ModelPart bone41;
	public final ModelPart armRight;
	public final ModelPart armLeft;
	public final ModelPart armLeftDeco2;
	public final ModelPart bone30;
	public final ModelPart bone31;
	public final ModelPart body;
	public final ModelPart RedKnot;
	public final ModelPart BackDeco;
	public final ModelPart skirt;
	public final ModelPart part2;
	public final ModelPart part1;
	public final ModelPart part3;
	public final ModelPart part4;
	public final ModelPart bone32;
	public final ModelPart bone33;
	public final ModelPart RedRibbonBehind;
	public final ModelPart legLeft;
	public final ModelPart legRight;
	public final ModelPart TrueFlower2;
	public final ModelPart Flower3;
	public final ModelPart bone20;
	public final ModelPart bone21;
	public final ModelPart bone22;
	public final ModelPart bone23;
	public final ModelPart bone24;
	public final ModelPart Flower4;
	public final ModelPart bone25;
	public final ModelPart bone26;
	public final ModelPart bone27;
	public final ModelPart bone28;
	public final ModelPart bone29;
	public final ModelPart puppet_stuff;
	public final ModelPart bone47;
	public final ModelPart bone48;
	public final ModelPart bone49;
	public final ModelPart rotate_puppet_arm;
	public final ModelPart rotate_puppet_arm2;
	public final ModelPart bone42;
	public final ModelPart bone44;
	public final ModelPart bone45;
	public final ModelPart bone43;
	public final ModelPart bone46;
	public final ModelPart bone54;
	public final ModelPart bone50;
	public final ModelPart bone51;
	public final ModelPart bone53;
	public final ModelPart bone52;
	public final ModelPart bone55;
	public final ModelPart bone56;
	public final ModelPart bone57;
	public final ModelPart bone58;
	public final ModelPart bone59;

	public Modelmagatsu_mitake_narukami_no_mikoto_puppet(ModelPart root) {
		this.bone60 = root.getChild("bone60");
		this.baal = this.bone60.getChild("baal");
		this.head = this.baal.getChild("head");
		this.headDeco = this.head.getChild("headDeco");
		this.TrueEventaille = this.headDeco.getChild("TrueEventaille");
		this.Eventaille3 = this.TrueEventaille.getChild("Eventaille3");
		this.bone13 = this.TrueEventaille.getChild("bone13");
		this.bone15 = this.TrueEventaille.getChild("bone15");
		this.bone12 = this.TrueEventaille.getChild("bone12");
		this.bone14 = this.TrueEventaille.getChild("bone14");
		this.Eventaille4 = this.TrueEventaille.getChild("Eventaille4");
		this.bone11 = this.TrueEventaille.getChild("bone11");
		this.Eventaille5 = this.TrueEventaille.getChild("Eventaille5");
		this.Eventaille6 = this.TrueEventaille.getChild("Eventaille6");
		this.Eventaille7 = this.TrueEventaille.getChild("Eventaille7");
		this.Eventaille8 = this.TrueEventaille.getChild("Eventaille8");
		this.TrueFlower = this.headDeco.getChild("TrueFlower");
		this.Flower = this.TrueFlower.getChild("Flower");
		this.bone = this.Flower.getChild("bone");
		this.bone2 = this.Flower.getChild("bone2");
		this.bone3 = this.Flower.getChild("bone3");
		this.bone4 = this.Flower.getChild("bone4");
		this.bone5 = this.Flower.getChild("bone5");
		this.Flower2 = this.TrueFlower.getChild("Flower2");
		this.bone6 = this.Flower2.getChild("bone6");
		this.bone7 = this.Flower2.getChild("bone7");
		this.bone8 = this.Flower2.getChild("bone8");
		this.bone9 = this.Flower2.getChild("bone9");
		this.bone10 = this.Flower2.getChild("bone10");
		this.Papillon = this.headDeco.getChild("Papillon");
		this.bone16 = this.Papillon.getChild("bone16");
		this.bone17 = this.Papillon.getChild("bone17");
		this.bone18 = this.headDeco.getChild("bone18");
		this.bone19 = this.headDeco.getChild("bone19");
		this.Hairs = this.head.getChild("Hairs");
		this.bone34 = this.head.getChild("bone34");
		this.bone35 = this.bone34.getChild("bone35");
		this.bone36 = this.bone34.getChild("bone36");
		this.bone37 = this.bone34.getChild("bone37");
		this.bone38 = this.head.getChild("bone38");
		this.bone39 = this.bone38.getChild("bone39");
		this.bone40 = this.bone38.getChild("bone40");
		this.bone41 = this.bone38.getChild("bone41");
		this.armRight = this.baal.getChild("armRight");
		this.armLeft = this.baal.getChild("armLeft");
		this.armLeftDeco2 = this.armLeft.getChild("armLeftDeco2");
		this.bone30 = this.armLeftDeco2.getChild("bone30");
		this.bone31 = this.armLeftDeco2.getChild("bone31");
		this.body = this.baal.getChild("body");
		this.RedKnot = this.body.getChild("RedKnot");
		this.BackDeco = this.body.getChild("BackDeco");
		this.skirt = this.body.getChild("skirt");
		this.part2 = this.skirt.getChild("part2");
		this.part1 = this.skirt.getChild("part1");
		this.part3 = this.skirt.getChild("part3");
		this.part4 = this.skirt.getChild("part4");
		this.bone32 = this.part4.getChild("bone32");
		this.bone33 = this.part4.getChild("bone33");
		this.RedRibbonBehind = this.body.getChild("RedRibbonBehind");
		this.legLeft = this.baal.getChild("legLeft");
		this.legRight = this.baal.getChild("legRight");
		this.TrueFlower2 = this.legRight.getChild("TrueFlower2");
		this.Flower3 = this.TrueFlower2.getChild("Flower3");
		this.bone20 = this.Flower3.getChild("bone20");
		this.bone21 = this.Flower3.getChild("bone21");
		this.bone22 = this.Flower3.getChild("bone22");
		this.bone23 = this.Flower3.getChild("bone23");
		this.bone24 = this.Flower3.getChild("bone24");
		this.Flower4 = this.TrueFlower2.getChild("Flower4");
		this.bone25 = this.Flower4.getChild("bone25");
		this.bone26 = this.Flower4.getChild("bone26");
		this.bone27 = this.Flower4.getChild("bone27");
		this.bone28 = this.Flower4.getChild("bone28");
		this.bone29 = this.Flower4.getChild("bone29");
		this.puppet_stuff = this.bone60.getChild("puppet_stuff");
		this.bone47 = this.puppet_stuff.getChild("bone47");
		this.bone48 = this.puppet_stuff.getChild("bone48");
		this.bone49 = this.puppet_stuff.getChild("bone49");
		this.rotate_puppet_arm = this.puppet_stuff.getChild("rotate_puppet_arm");
		this.rotate_puppet_arm2 = this.puppet_stuff.getChild("rotate_puppet_arm2");
		this.bone42 = this.rotate_puppet_arm2.getChild("bone42");
		this.bone44 = this.bone42.getChild("bone44");
		this.bone45 = this.bone42.getChild("bone45");
		this.bone43 = this.bone42.getChild("bone43");
		this.bone46 = this.bone42.getChild("bone46");
		this.bone54 = this.puppet_stuff.getChild("bone54");
		this.bone50 = this.bone54.getChild("bone50");
		this.bone51 = this.bone54.getChild("bone51");
		this.bone53 = this.bone54.getChild("bone53");
		this.bone52 = this.bone54.getChild("bone52");
		this.bone55 = this.puppet_stuff.getChild("bone55");
		this.bone56 = this.bone55.getChild("bone56");
		this.bone57 = this.bone55.getChild("bone57");
		this.bone58 = this.bone55.getChild("bone58");
		this.bone59 = this.bone55.getChild("bone59");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone60 = partdefinition.addOrReplaceChild("bone60", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition baal = bone60.addOrReplaceChild("baal", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition head = baal.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, -20.9F, 0.0F));
		PartDefinition headDeco = head.addOrReplaceChild("headDeco", CubeListBuilder.create(), PartPose.offset(0.0F, 17.9F, -0.8F));
		PartDefinition TrueEventaille = headDeco.addOrReplaceChild("TrueEventaille", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.2F, -23.35F, 1.55F, -0.0873F, 0.4363F, 0.0F));
		PartDefinition Eventaille3 = TrueEventaille.addOrReplaceChild("Eventaille3", CubeListBuilder.create().texOffs(27, 73).addBox(0.0067F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone13 = TrueEventaille.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 0.05F, 0.05F, -0.2849F, 0.274F, -0.8249F));
		PartDefinition bone15 = TrueEventaille.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 76).addBox(0.075F, 0.0F, -3.0385F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.65F, 0.45F, 0.1414F, 0.6614F, -0.7517F));
		PartDefinition bone12 = TrueEventaille.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -0.3F, -0.05F, -0.4614F, 0.0823F, -0.796F));
		PartDefinition bone14 = TrueEventaille.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(0, 76).addBox(-0.0318F, 0.0329F, -2.801F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -0.3F, -0.05F, -0.4614F, 0.0823F, -0.796F));
		PartDefinition Eventaille4 = TrueEventaille.addOrReplaceChild("Eventaille4", CubeListBuilder.create().texOffs(27, 73).addBox(0.0065F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, -0.2618F, 0.3927F, 0.0F));
		PartDefinition bone11 = TrueEventaille.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 76).addBox(-0.1318F, 0.0829F, -3.001F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.05F, 0.05F, -0.1133F, 0.4552F, -0.864F));
		PartDefinition Eventaille5 = TrueEventaille.addOrReplaceChild("Eventaille5", CubeListBuilder.create().texOffs(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.2618F, 0.3927F, 0.0F));
		PartDefinition Eventaille6 = TrueEventaille.addOrReplaceChild("Eventaille6", CubeListBuilder.create().texOffs(27, 73).addBox(0.0064F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, 0.5236F, 0.3927F, 0.0F));
		PartDefinition Eventaille7 = TrueEventaille.addOrReplaceChild("Eventaille7", CubeListBuilder.create().texOffs(27, 73).addBox(0.0066F, -0.75F, -3.0385F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.05F, -0.5236F, 0.3927F, 0.0F));
		PartDefinition Eventaille8 = TrueEventaille.addOrReplaceChild("Eventaille8", CubeListBuilder.create().texOffs(0, 83).addBox(0.0066F, 0.0294F, -2.5885F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -1.0F, 0.05F, -0.6425F, -0.0352F, -0.6323F));
		PartDefinition TrueFlower = headDeco.addOrReplaceChild("TrueFlower", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8F, -23.1F, -0.1F, 0.0F, -0.9599F, 0.0F));
		PartDefinition Flower = TrueFlower.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.8F, -1.0F, -0.0013F, -0.0334F, -1.5774F));
		PartDefinition bone = Flower.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));
		PartDefinition bone2 = Flower.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));
		PartDefinition bone3 = Flower.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));
		PartDefinition bone4 = Flower.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));
		PartDefinition bone5 = Flower.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));
		PartDefinition Flower2 = TrueFlower.addOrReplaceChild("Flower2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.6F, -1.1F, 0.0264F, -0.0323F, -1.3591F));
		PartDefinition bone6 = Flower2.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));
		PartDefinition bone7 = Flower2.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));
		PartDefinition bone8 = Flower2.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));
		PartDefinition bone9 = Flower2.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));
		PartDefinition bone10 = Flower2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));
		PartDefinition Papillon = headDeco.addOrReplaceChild("Papillon", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -23.5F, 2.4F, 0.4363F, 0.0F, 0.0F));
		PartDefinition bone16 = Papillon.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone17 = Papillon.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(7, 90).addBox(0.0F, -1.5F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone18 = headDeco.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 96).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 96).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9F, -22.5F, 2.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone19 = headDeco.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(0, 100).addBox(-0.01F, -4.5F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.2F, -23.3F, -0.3F, 0.1308F, -0.0057F, 0.0433F));
		PartDefinition Hairs = head.addOrReplaceChild("Hairs",
				CubeListBuilder.create().texOffs(100, 0).addBox(-3.5F, 0.0F, -1.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 4).addBox(-3.0F, 2.0F, -1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 7)
						.addBox(-2.5F, 2.5F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 10).addBox(-3.0F, 3.5F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 14)
						.addBox(-2.5F, 5.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 22).addBox(-2.5F, 7.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 26)
						.addBox(-2.0F, 8.5F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 18).addBox(-2.0F, 5.0F, -1.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0)
						.addBox(2.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0).addBox(1.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0)
						.addBox(1.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0).addBox(-2.5F, 7.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0)
						.addBox(-2.5F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 6).addBox(-2.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 3)
						.addBox(1.5F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 0).addBox(-3.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 9)
						.addBox(1.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 9).addBox(-2.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 32)
						.addBox(-1.5F, 12.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 36).addBox(-1.0F, 13.5F, -1.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 12)
						.addBox(0.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 12).addBox(-1.5F, 12.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 15)
						.addBox(-1.0F, 19.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 18).addBox(-0.5F, 20.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 18)
						.addBox(0.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 15).addBox(1.0F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 18)
						.addBox(-2.0F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 15).addBox(-1.5F, 13.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 45)
						.addBox(-1.5F, 16.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3F, 4.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone34 = head.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, -2.1F, -3.35F, -3.0218F, -0.0536F, -2.839F));
		PartDefinition bone35 = bone34.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.6F));
		PartDefinition bone36 = bone34.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, 4.0F, -0.1F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone37 = bone34.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, 4.0F, -0.1F, 0.0F, 0.0F, 1.2654F));
		PartDefinition bone38 = head.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, 0.6F, -3.45F, -0.1311F, 0.0038F, -0.0872F));
		PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create().texOffs(112, 71).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.6F));
		PartDefinition bone40 = bone38.addOrReplaceChild("bone40", CubeListBuilder.create().texOffs(117, 71).addBox(-0.8188F, -1.2889F, -0.5174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, 4.0F, -0.1F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone41 = bone38.addOrReplaceChild("bone41", CubeListBuilder.create().texOffs(106, 71).addBox(-0.2189F, -0.0967F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, 4.0F, -0.1F, 0.0F, 0.0F, 1.2654F));
		PartDefinition armRight = baal.addOrReplaceChild("armRight",
				CubeListBuilder.create().texOffs(83, 95).addBox(-0.8823F, 1.0305F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 106).addBox(-1.3823F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-4.0F, -20.5F, 0.0F, -0.6941F, 0.0749F, 0.5438F));
		PartDefinition armLeft = baal.addOrReplaceChild("armLeft",
				CubeListBuilder.create().texOffs(97, 82).addBox(-1.6177F, 0.2805F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(-0.3F)).texOffs(98, 106).addBox(-1.1177F, 1.0307F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -20.5F, 0.0F, 0.0F, -0.48F, -0.4363F));
		PartDefinition armLeftDeco2 = armLeft.addOrReplaceChild("armLeftDeco2",
				CubeListBuilder.create().texOffs(53, 84).addBox(0.4F, 0.3F, -0.5F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 72).addBox(0.9F, 0.3F, 1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 80)
						.addBox(0.9F, 0.79F, 0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 80).addBox(0.9F, 0.79F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 88)
						.addBox(0.9F, 4.8F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 92).addBox(0.9F, 4.8F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 88)
						.addBox(0.9F, 4.3F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 88).addBox(0.9F, 4.3F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, 0.0F, 2.0F, 3.1416F, 0.0F, 3.098F));
		PartDefinition bone30 = armLeftDeco2.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(53, 97).addBox(-1.0F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 97).addBox(-0.5F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 104)
						.addBox(-1.0F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 104).addBox(-1.0F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 107)
						.addBox(-1.0F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 107).addBox(-1.0F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4F, 1.5F, 3.5F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition bone31 = armLeftDeco2.addOrReplaceChild("bone31",
				CubeListBuilder.create().texOffs(53, 97).addBox(-0.5F, -0.71F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 97).addBox(0.0F, -0.7101F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 104)
						.addBox(-0.5F, -0.7101F, -0.49F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 104).addBox(-0.5F, 0.281F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 107)
						.addBox(-0.5F, 2.2899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 107).addBox(-0.5F, 2.7899F, -0.99F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4F, 1.5F, 0.5F, 0.0F, -0.7854F, 0.0F));
		PartDefinition body = baal.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -10.499F, -2.3F, 8.0F, 12.0F, 4.6F, new CubeDeformation(-0.1F)).texOffs(16, 32).addBox(-4.2F, -10.799F, -2.4F, 8.4F, 12.6F, 4.8F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, -10.5F, 0.0F));
		PartDefinition RedKnot = body.addOrReplaceChild("RedKnot",
				CubeListBuilder.create().texOffs(53, 110).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 114).addBox(-2.0F, 0.275F, 0.01F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -10.4F, -2.3F, -0.1309F, 0.0F, 0.0F));
		PartDefinition BackDeco = body.addOrReplaceChild("BackDeco",
				CubeListBuilder.create().texOffs(98, 49).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 59).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.1F, -5.5F, 2.2F, 0.0873F, 0.0F, 0.0F));
		PartDefinition skirt = body.addOrReplaceChild("skirt", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, 0.0F));
		PartDefinition part2 = skirt.addOrReplaceChild("part2",
				CubeListBuilder.create().texOffs(27, 83).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(-0.1F)).texOffs(27, 111).addBox(-0.1F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.9F, -9.1F, 0.0F));
		PartDefinition part1 = skirt.addOrReplaceChild("part1",
				CubeListBuilder.create().texOffs(27, 79).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 119).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, -9.1F, -2.2F, -0.0873F, 0.0F, 0.0F));
		PartDefinition part3 = skirt.addOrReplaceChild("part3",
				CubeListBuilder.create().texOffs(27, 90).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(-0.1F)).texOffs(0, 109).addBox(-0.9F, -0.1F, -2.3F, 1.0F, 2.0F, 4.6F, new CubeDeformation(0.0F)),
				PartPose.offset(3.9F, -9.1F, 0.0F));
		PartDefinition part4 = skirt.addOrReplaceChild("part4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.1F, 2.2F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone32 = part4.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r1 = bone32.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 76).addBox(-2.0F, -0.5F, -0.8F, 4.0F, 9.0F, 1.6F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(1.9F, 0.4F, -0.7F, 0.2618F, 0.0F, 0.0F));
		PartDefinition bone33 = part4.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r2 = bone33.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 97).addBox(-2.0F, -0.5F, -0.8F, 4.0F, 9.0F, 1.6F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-1.9F, 0.4F, -0.7F, 0.2618F, 0.0F, 0.0F));
		PartDefinition RedRibbonBehind = body.addOrReplaceChild("RedRibbonBehind",
				CubeListBuilder.create().texOffs(55, 19).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 28).addBox(-9.0F, 0.0F, -1.0F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(55, 19)
						.addBox(-9.0F, 0.0F, -0.5F, 9.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 39).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 48)
						.addBox(-1.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 48).addBox(-2.0F, 6.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 60)
						.addBox(-2.5F, 0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 63).addBox(-1.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 54)
						.addBox(-9.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 38).addBox(-7.5F, 4.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 44)
						.addBox(-5.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 47).addBox(-4.0F, 5.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 47)
						.addBox(-3.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 38).addBox(-4.5F, 4.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 41)
						.addBox(-7.0F, 3.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 41).addBox(-6.5F, 3.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 42)
						.addBox(-6.0F, 2.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 57).addBox(-8.5F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 54)
						.addBox(-9.0F, 0.5F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 51).addBox(-7.0F, 1.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -8.5F, 1.8F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition legLeft = baal.addOrReplaceChild("legLeft",
				CubeListBuilder.create().texOffs(82, 55).addBox(-1.751F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 68).addBox(-1.951F, 0.0F, -1.7F, 3.4F, 9.1F, 3.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition legRight = baal.addOrReplaceChild("legRight",
				CubeListBuilder.create().texOffs(82, 42).addBox(-1.249F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 81).addBox(-1.449F, 0.0F, -1.7F, 3.4F, 9.1F, 3.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition TrueFlower2 = legRight.addOrReplaceChild("TrueFlower2", CubeListBuilder.create(), PartPose.offset(-1.9F, 6.6F, 0.5F));
		PartDefinition Flower3 = TrueFlower2.addOrReplaceChild("Flower3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -0.8F, -1.0F, -0.0013F, -0.0334F, -1.5774F));
		PartDefinition bone20 = Flower3.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));
		PartDefinition bone21 = Flower3.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));
		PartDefinition bone22 = Flower3.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));
		PartDefinition bone23 = Flower3.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));
		PartDefinition bone24 = Flower3.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));
		PartDefinition Flower4 = TrueFlower2.addOrReplaceChild("Flower4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7F, 0.6F, -0.2F, 0.0264F, -0.0323F, -1.3591F));
		PartDefinition bone25 = Flower4.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(43, 70).addBox(0.3657F, 4.3241F, 10.0818F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, 0.0F, 0.0F));
		PartDefinition bone26 = Flower4.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(43, 70).addBox(-3.6678F, 2.677F, 10.3723F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -1.2566F, 0.0F));
		PartDefinition bone27 = Flower4.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(43, 70).addBox(-3.3235F, -1.6097F, 11.1281F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7226F, -11.2159F, 3.6107F, -1.3963F, -2.5133F, 0.0F));
		PartDefinition bone28 = Flower4.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(43, 70).addBox(-0.6194F, -0.7564F, -0.192F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, -0.2159F, -0.3893F, -1.3963F, 2.5133F, 0.0F));
		PartDefinition bone29 = Flower4.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(43, 70).addBox(-1.8615F, -1.6134F, -1.0563F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2774F, 0.7841F, -1.3893F, -1.3963F, 1.2566F, 0.0F));
		PartDefinition puppet_stuff = bone60.addOrReplaceChild("puppet_stuff",
				CubeListBuilder.create().texOffs(215, 104).addBox(-18.0F, -44.0F, 8.0F, 11.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(178, 162).addBox(-6.0F, -49.0F, 14.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(171, 194)
						.addBox(-24.0F, -42.0F, 13.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(210, 197).addBox(-26.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197)
						.addBox(-20.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197).addBox(-3.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197)
						.addBox(-9.0F, -41.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(171, 194).addBox(-7.0F, -42.0F, 13.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(200, 193)
						.addBox(-16.0F, -54.0F, 13.0F, 6.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(210, 197).addBox(-14.0F, -56.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197)
						.addBox(-14.0F, -48.0F, 14.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 162).addBox(-23.0F, -49.0F, 14.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 162)
						.addBox(-20.0F, -52.0F, 14.0F, 13.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(234, 242).addBox(-19.0F, -42.0F, 6.0F, 8.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(236, 245)
						.addBox(-21.0F, -40.0F, 5.0F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r3 = puppet_stuff.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(220, 168).addBox(-1.0F, -2.5F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.3377F, -24.2898F, -15.0358F, -0.5968F, -0.9721F, -0.6857F));
		PartDefinition cube_r4 = puppet_stuff.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(220, 168).addBox(-2.1674F, 0.2753F, -0.5769F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.6738F, -24.6495F, -14.6565F, -0.9905F, -0.5545F, -0.1356F));
		PartDefinition cube_r5 = puppet_stuff.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 218).addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -38.0F, 20.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r6 = puppet_stuff.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(178, 162).addBox(-1.0F, -3.5F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -48.5F, 14.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r7 = puppet_stuff.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(178, 162).addBox(-0.5F, 8.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 162).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -38.5F, 14.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r8 = puppet_stuff.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(178, 162).addBox(-1.0F, 8.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 162).addBox(-1.3F, -0.8F, -0.5F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -38.5F, 14.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r9 = puppet_stuff.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(178, 162).addBox(-0.5F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -48.0F, 14.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r10 = puppet_stuff.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(210, 197).addBox(-4.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197)
				.addBox(2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(171, 194).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -47.0F, 14.5F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r11 = puppet_stuff.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(210, 197).addBox(-4.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(210, 197)
				.addBox(2.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(171, 194).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -47.0F, 14.5F, 0.0F, 0.0F, 0.3491F));
		PartDefinition bone47 = puppet_stuff.addOrReplaceChild("bone47", CubeListBuilder.create(), PartPose.offset(13.0F, -45.3325F, 3.5553F));
		PartDefinition cube_r12 = bone47.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1916F, 0.2815F, -0.1201F));
		PartDefinition cube_r13 = bone47.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(6, 218).addBox(-1.0F, -1.0F, 5.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.3325F, 16.9447F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone48 = puppet_stuff.addOrReplaceChild("bone48", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4725F, -19.1925F, 12.6245F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r14 = bone48.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7549F, -22.2562F, -9.0693F, -0.1916F, 0.2815F, -0.1201F));
		PartDefinition cube_r15 = bone48.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(6, 218).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7549F, -14.9237F, 7.8755F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone49 = puppet_stuff.addOrReplaceChild("bone49", CubeListBuilder.create(), PartPose.offsetAndRotation(17.2809F, -17.8443F, 12.6245F, 0.2132F, 0.0469F, 1.314F));
		PartDefinition cube_r16 = bone49.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -1.7102F, -14.0391F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6336F, -4.5785F, -9.0693F, -0.1916F, 0.2815F, -0.1201F));
		PartDefinition cube_r17 = bone49.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(6, 218).addBox(-2.0F, -2.0F, -17.5F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(6, 218).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6336F, 2.754F, 7.8755F, -0.3927F, 0.0F, 0.0F));
		PartDefinition rotate_puppet_arm = puppet_stuff.addOrReplaceChild("rotate_puppet_arm", CubeListBuilder.create().texOffs(164, 236).addBox(-2.5F, -1.5F, -3.0F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.5F, -34.5F, 6.0F, -0.413F, -0.1451F, 0.9904F));
		PartDefinition rotate_puppet_arm2 = puppet_stuff.addOrReplaceChild("rotate_puppet_arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-27.5F, -32.5F, 0.0F, -0.413F, -0.1451F, 0.9904F));
		PartDefinition cube_r18 = rotate_puppet_arm2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(138, 162).addBox(-3.7147F, -0.0075F, -3.7396F, 6.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9147F, 10.486F, -4.2335F, -1.027F, -0.2324F, 0.2F));
		PartDefinition cube_r19 = rotate_puppet_arm2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(124, 239).addBox(-3.5F, 0.5F, -2.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 2.0F, 2.0F, -0.7F, -0.0668F, 0.0562F));
		PartDefinition bone42 = rotate_puppet_arm2.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7354F, 21.4335F, -15.1099F, 0.0306F, -0.1719F, -0.1772F));
		PartDefinition bone44 = bone42.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4647F, -5.2421F, 0.7208F, 0.6545F, 0.0F, 0.0F));
		PartDefinition cube_r20 = bone44.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(220, 168).addBox(-1.6843F, -1.572F, -0.393F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5353F, 7.2421F, -4.7208F, 0.5404F, -0.9433F, -1.8702F));
		PartDefinition cube_r21 = bone44.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(220, 168).addBox(-2.3531F, -6.9497F, -0.393F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5353F, 7.2421F, -4.7208F, -0.7717F, -0.792F, -0.2932F));
		PartDefinition cube_r22 = bone44.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(220, 168).addBox(-2.2024F, -2.7726F, -0.3072F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7262F, 3.4445F, -1.0007F, -1.027F, -0.2324F, 0.2F));
		PartDefinition bone45 = bone42.addOrReplaceChild("bone45", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4909F, -5.8568F, 2.268F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r23 = bone45.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, 0.5404F, -0.9433F, -1.8702F));
		PartDefinition cube_r24 = bone45.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, -0.7717F, -0.792F, -0.2932F));
		PartDefinition cube_r25 = bone45.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7524F, 5.0591F, -0.5479F, -1.027F, -0.2324F, 0.2F));
		PartDefinition bone43 = bone42.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offsetAndRotation(5.4909F, -8.8568F, 2.268F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone43.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, 0.5404F, -0.9433F, -1.8702F));
		PartDefinition cube_r27 = bone43.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, -0.7717F, -0.792F, -0.2932F));
		PartDefinition cube_r28 = bone43.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7524F, 5.0591F, -0.5479F, -1.027F, -0.2324F, 0.2F));
		PartDefinition bone46 = bone42.addOrReplaceChild("bone46", CubeListBuilder.create(), PartPose.offset(6.4909F, -9.8568F, 0.268F));
		PartDefinition cube_r29 = bone46.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(220, 168).addBox(-1.5712F, -1.4229F, -3.5497F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, 0.5404F, -0.9433F, -1.8702F));
		PartDefinition cube_r30 = bone46.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(220, 168).addBox(-2.166F, -6.9568F, -3.5497F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5091F, 8.8568F, -4.268F, -0.7717F, -0.792F, -0.2932F));
		PartDefinition cube_r31 = bone46.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(220, 168).addBox(-2.2785F, -3.0932F, -3.4523F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7524F, 5.0591F, -0.5479F, -1.027F, -0.2324F, 0.2F));
		PartDefinition bone54 = puppet_stuff.addOrReplaceChild("bone54", CubeListBuilder.create().texOffs(206, 0).addBox(-6.0F, -1.5F, -6.5F, 12.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -3.5F, -8.5F, 0.3193F, 0.2909F, 0.0945F));
		PartDefinition cube_r32 = bone54.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(237, 56).addBox(-4.4129F, -1.5F, -1.4383F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5669F, 0.0F, -1.5296F, 0.0F, -1.3526F, 0.0F));
		PartDefinition cube_r33 = bone54.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(150, 20).addBox(-6.5F, -1.49F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, 0.0F, 3.0F, 0.0F, -0.829F, 0.0F));
		PartDefinition bone50 = bone54.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(176, 0).addBox(-1.01F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -0.1982F, -5.7828F, 0.1331F, 0.1264F, 0.0341F));
		PartDefinition cube_r34 = bone50.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(213, 41).addBox(-1.01F, -2.9912F, -0.5328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r35 = bone50.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(176, 0).addBox(-1.01F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone51 = bone54.addOrReplaceChild("bone51", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -0.1982F, -5.7828F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bone51.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bone51.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone53 = bone54.addOrReplaceChild("bone53", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -0.1982F, -5.7828F, -0.0866F, -0.1744F, -0.0077F));
		PartDefinition cube_r38 = bone53.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone53.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone52 = bone54.addOrReplaceChild("bone52", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.1982F, -5.7828F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bone52.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -1.6212F, -3.5328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r41 = bone52.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone55 = puppet_stuff.addOrReplaceChild("bone55", CubeListBuilder.create().texOffs(206, 0).mirror().addBox(-6.0F, -1.5F, -6.5F, 12.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.0F, -3.5F, -8.5F, 0.3193F, -0.2909F, -0.0945F));
		PartDefinition cube_r42 = bone55.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(237, 56).mirror().addBox(-0.4129F, -1.5F, -1.4383F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.4331F, 0.0F, -1.5296F, 0.0F, 1.3526F, 0.0F));
		PartDefinition cube_r43 = bone55.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(150, 20).mirror().addBox(-2.5F, -1.49F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.5F, 0.0F, 3.0F, 0.0F, 0.829F, 0.0F));
		PartDefinition bone56 = bone55.addOrReplaceChild("bone56", CubeListBuilder.create().texOffs(176, 0).addBox(-1.01F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -0.1982F, -5.7828F, 0.1331F, 0.1264F, 0.0341F));
		PartDefinition cube_r44 = bone56.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(213, 41).addBox(-1.01F, -2.9912F, -0.5328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r45 = bone56.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(176, 0).addBox(-1.01F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone57 = bone55.addOrReplaceChild("bone57", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -0.1982F, -5.7828F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r46 = bone57.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r47 = bone57.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone58 = bone55.addOrReplaceChild("bone58", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -0.1982F, -5.7828F, -0.0866F, -0.1744F, -0.0077F));
		PartDefinition cube_r48 = bone58.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -2.5212F, -1.8328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r49 = bone58.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -3.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		PartDefinition bone59 = bone55.addOrReplaceChild("bone59", CubeListBuilder.create().texOffs(176, 0).addBox(-1.0F, -0.8018F, -4.7172F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -0.1982F, -5.7828F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r50 = bone59.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(213, 41).addBox(-1.0F, -1.6212F, -3.5328F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.4806F, -9.6844F, -0.829F, 0.0F, 0.0F));
		PartDefinition cube_r51 = bone59.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(166, 53).addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1982F, -4.2172F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		bone60.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}
