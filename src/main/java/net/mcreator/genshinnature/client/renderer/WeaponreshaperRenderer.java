
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.WeaponreshaperEntity;
import net.mcreator.genshinnature.client.model.Modelweapon_primal_construct_reshaper;

public class WeaponreshaperRenderer extends MobRenderer<WeaponreshaperEntity, Modelweapon_primal_construct_reshaper<WeaponreshaperEntity>> {
	public WeaponreshaperRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweapon_primal_construct_reshaper<WeaponreshaperEntity>(context.bakeLayer(Modelweapon_primal_construct_reshaper.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(WeaponreshaperEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/primal_construct_reshaper.png");
	}
}
