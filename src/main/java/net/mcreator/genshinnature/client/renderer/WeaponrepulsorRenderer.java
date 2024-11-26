
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WeaponrepulsorEntity;
import net.mcreator.genshinnature.client.model.Modelweapon_primal_construct_repulsor;

public class WeaponrepulsorRenderer extends MobRenderer<WeaponrepulsorEntity, Modelweapon_primal_construct_repulsor<WeaponrepulsorEntity>> {
	public WeaponrepulsorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweapon_primal_construct_repulsor<WeaponrepulsorEntity>(context.bakeLayer(Modelweapon_primal_construct_repulsor.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeaponrepulsorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_repulsor.png");
	}
}
