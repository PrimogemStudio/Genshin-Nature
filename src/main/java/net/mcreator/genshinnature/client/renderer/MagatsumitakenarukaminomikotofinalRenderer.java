
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.MagatsumitakenarukaminomikotofinalEntity;
import net.mcreator.genshinnature.client.model.Modelmagatsu_mitake_narukami_no_mikoto;

public class MagatsumitakenarukaminomikotofinalRenderer extends MobRenderer<MagatsumitakenarukaminomikotofinalEntity, Modelmagatsu_mitake_narukami_no_mikoto<MagatsumitakenarukaminomikotofinalEntity>> {
	public MagatsumitakenarukaminomikotofinalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmagatsu_mitake_narukami_no_mikoto<MagatsumitakenarukaminomikotofinalEntity>(context.bakeLayer(Modelmagatsu_mitake_narukami_no_mikoto.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MagatsumitakenarukaminomikotofinalEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/magatsu_mitake_narukami_no_mikoto.png");
	}
}
