
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WeaponprospectorEntity;
import net.mcreator.genshinnature.client.model.Modelweapon_primal_construct_prospector;

public class WeaponprospectorRenderer extends MobRenderer<WeaponprospectorEntity, Modelweapon_primal_construct_prospector<WeaponprospectorEntity>> {
	public WeaponprospectorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweapon_primal_construct_prospector<WeaponprospectorEntity>(context.bakeLayer(Modelweapon_primal_construct_prospector.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeaponprospectorEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_prospector.png");
	}
}
