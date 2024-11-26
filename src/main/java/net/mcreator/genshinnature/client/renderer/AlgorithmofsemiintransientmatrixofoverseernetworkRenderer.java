
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.AlgorithmofsemiintransientmatrixofoverseernetworkEntity;
import net.mcreator.genshinnature.client.model.Modelalgorithm_of_semi_intransient_matrix_of_overseer_network;

public class AlgorithmofsemiintransientmatrixofoverseernetworkRenderer
		extends
			MobRenderer<AlgorithmofsemiintransientmatrixofoverseernetworkEntity, Modelalgorithm_of_semi_intransient_matrix_of_overseer_network<AlgorithmofsemiintransientmatrixofoverseernetworkEntity>> {
	public AlgorithmofsemiintransientmatrixofoverseernetworkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalgorithm_of_semi_intransient_matrix_of_overseer_network<AlgorithmofsemiintransientmatrixofoverseernetworkEntity>(context.bakeLayer(Modelalgorithm_of_semi_intransient_matrix_of_overseer_network.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlgorithmofsemiintransientmatrixofoverseernetworkEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/algorithm_of_semi_intransient_matrix_of_overseer_network.png");
	}
}
