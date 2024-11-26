
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MagatsumitakenarukaminomikotopuppetEntity;
import net.mcreator.genshinnature.client.model.Modelmagatsu_mitake_narukami_no_mikoto_puppet;

public class MagatsumitakenarukaminomikotopuppetRenderer extends MobRenderer<MagatsumitakenarukaminomikotopuppetEntity, Modelmagatsu_mitake_narukami_no_mikoto_puppet<MagatsumitakenarukaminomikotopuppetEntity>> {
	public MagatsumitakenarukaminomikotopuppetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagatsu_mitake_narukami_no_mikoto_puppet<MagatsumitakenarukaminomikotopuppetEntity>(context.bakeLayer(Modelmagatsu_mitake_narukami_no_mikoto_puppet.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagatsumitakenarukaminomikotopuppetEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/magatsu_mitake_narukami_no_mikoto_puppet.png");
	}
}
