
package net.mcreator.genshinnature.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.genshinnature.entity.FloatingdendrofungusEntity;
import net.mcreator.genshinnature.client.model.Modelfloating_dendro_fungi;

public class FloatingdendrofungusRenderer extends MobRenderer<FloatingdendrofungusEntity, Modelfloating_dendro_fungi<FloatingdendrofungusEntity>> {
	public FloatingdendrofungusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfloating_dendro_fungi<FloatingdendrofungusEntity>(context.bakeLayer(Modelfloating_dendro_fungi.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FloatingdendrofungusEntity entity) {
		return ResourceLocation.parse("genshin_nature:textures/entities/floating_dendro_fungi.png");
	}
}
