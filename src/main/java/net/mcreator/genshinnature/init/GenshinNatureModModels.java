
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.genshinnature.client.model.Modelshooting_minion;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_tornado;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_serpent;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_missiles;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_fist;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis_explosion;
import net.mcreator.genshinnature.client.model.Modelpyro_hypostasis;
import net.mcreator.genshinnature.client.model.Modelliving_bubble;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis_tornado;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis_dolphin;
import net.mcreator.genshinnature.client.model.Modelhydro_hypostasis;
import net.mcreator.genshinnature.client.model.Modelhilichurl_woodenshield_guard;
import net.mcreator.genshinnature.client.model.Modelhilichurl_unusual;
import net.mcreator.genshinnature.client.model.Modelhilichurl_unarmed;
import net.mcreator.genshinnature.client.model.Modelhilichurl_shooter;
import net.mcreator.genshinnature.client.model.Modelhilichurl_rockshield_guard;
import net.mcreator.genshinnature.client.model.Modelhilichurl_pyro_shooter;
import net.mcreator.genshinnature.client.model.Modelhilichurl_pyro_grenadier;
import net.mcreator.genshinnature.client.model.Modelhilichurl_iceshield_guard;
import net.mcreator.genshinnature.client.model.Modelhilichurl_fighter;
import net.mcreator.genshinnature.client.model.Modelhilichurl_electro_shooter;
import net.mcreator.genshinnature.client.model.Modelhilichurl_electro_grenadier;
import net.mcreator.genshinnature.client.model.Modelhilichurl_cryo_shooter;
import net.mcreator.genshinnature.client.model.Modelhilichurl_cryo_grenadier;
import net.mcreator.genshinnature.client.model.Modelhilichurl_berserker;
import net.mcreator.genshinnature.client.model.Modelhateful_oceanid;
import net.mcreator.genshinnature.client.model.Modelglacial_mine;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_pillar;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_phase3;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_phase2;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_hands;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis_hammer;
import net.mcreator.genshinnature.client.model.Modelgeo_hypostasis;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_triangle;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_missiles;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_laser;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_hands;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis_cage;
import net.mcreator.genshinnature.client.model.Modelelectro_hypostasis;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_wheel;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_phase_7;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_phase2;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_icicles;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis_clap;
import net.mcreator.genshinnature.client.model.Modelcryo_hypostasis;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_tornado;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_small;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_missiles;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis_butterfly;
import net.mcreator.genshinnature.client.model.Modelanemo_hypostasis;
import net.mcreator.genshinnature.client.model.Modelanemo_bullet;
import net.mcreator.genshinnature.client.model.Modelabyssmage_shielded;
import net.mcreator.genshinnature.client.model.Modelabyssmage_pyro;
import net.mcreator.genshinnature.client.model.Modelabyssmage_hydro;
import net.mcreator.genshinnature.client.model.Modelabyssmage_electro;
import net.mcreator.genshinnature.client.model.Modelabyssmage_cryo;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GenshinNatureModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelanemo_bullet.LAYER_LOCATION, Modelanemo_bullet::createBodyLayer);
		event.registerLayerDefinition(Modelanemo_hypostasis_tornado.LAYER_LOCATION, Modelanemo_hypostasis_tornado::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis_hammer.LAYER_LOCATION, Modelgeo_hypostasis_hammer::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis_laser.LAYER_LOCATION, Modelelectro_hypostasis_laser::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_rockshield_guard.LAYER_LOCATION, Modelhilichurl_rockshield_guard::createBodyLayer);
		event.registerLayerDefinition(Modelhydro_hypostasis_dolphin.LAYER_LOCATION, Modelhydro_hypostasis_dolphin::createBodyLayer);
		event.registerLayerDefinition(Modelabyssmage_pyro.LAYER_LOCATION, Modelabyssmage_pyro::createBodyLayer);
		event.registerLayerDefinition(Modelabyssmage_hydro.LAYER_LOCATION, Modelabyssmage_hydro::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis.LAYER_LOCATION, Modelpyro_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_cryo_shooter.LAYER_LOCATION, Modelhilichurl_cryo_shooter::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_unusual.LAYER_LOCATION, Modelhilichurl_unusual::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_berserker.LAYER_LOCATION, Modelhilichurl_berserker::createBodyLayer);
		event.registerLayerDefinition(Modelglacial_mine.LAYER_LOCATION, Modelglacial_mine::createBodyLayer);
		event.registerLayerDefinition(Modelhydro_hypostasis.LAYER_LOCATION, Modelhydro_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelliving_bubble.LAYER_LOCATION, Modelliving_bubble::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis_tornado.LAYER_LOCATION, Modelpyro_hypostasis_tornado::createBodyLayer);
		event.registerLayerDefinition(Modelhydro_hypostasis_tornado.LAYER_LOCATION, Modelhydro_hypostasis_tornado::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis_hands.LAYER_LOCATION, Modelelectro_hypostasis_hands::createBodyLayer);
		event.registerLayerDefinition(Modelanemo_hypostasis_butterfly.LAYER_LOCATION, Modelanemo_hypostasis_butterfly::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis_fist.LAYER_LOCATION, Modelpyro_hypostasis_fist::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_woodenshield_guard.LAYER_LOCATION, Modelhilichurl_woodenshield_guard::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_pyro_shooter.LAYER_LOCATION, Modelhilichurl_pyro_shooter::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis_triangle.LAYER_LOCATION, Modelelectro_hypostasis_triangle::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis.LAYER_LOCATION, Modelcryo_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis.LAYER_LOCATION, Modelgeo_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_cryo_grenadier.LAYER_LOCATION, Modelhilichurl_cryo_grenadier::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_unarmed.LAYER_LOCATION, Modelhilichurl_unarmed::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis.LAYER_LOCATION, Modelelectro_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis_phase3.LAYER_LOCATION, Modelgeo_hypostasis_phase3::createBodyLayer);
		event.registerLayerDefinition(Modelshooting_minion.LAYER_LOCATION, Modelshooting_minion::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis_serpent.LAYER_LOCATION, Modelpyro_hypostasis_serpent::createBodyLayer);
		event.registerLayerDefinition(Modelabyssmage_electro.LAYER_LOCATION, Modelabyssmage_electro::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_fighter.LAYER_LOCATION, Modelhilichurl_fighter::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_pyro_grenadier.LAYER_LOCATION, Modelhilichurl_pyro_grenadier::createBodyLayer);
		event.registerLayerDefinition(Modelhateful_oceanid.LAYER_LOCATION, Modelhateful_oceanid::createBodyLayer);
		event.registerLayerDefinition(Modelabyssmage_cryo.LAYER_LOCATION, Modelabyssmage_cryo::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis_missiles.LAYER_LOCATION, Modelpyro_hypostasis_missiles::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis_icicles.LAYER_LOCATION, Modelcryo_hypostasis_icicles::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_shooter.LAYER_LOCATION, Modelhilichurl_shooter::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis_clap.LAYER_LOCATION, Modelcryo_hypostasis_clap::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis_phase2.LAYER_LOCATION, Modelgeo_hypostasis_phase2::createBodyLayer);
		event.registerLayerDefinition(Modelanemo_hypostasis.LAYER_LOCATION, Modelanemo_hypostasis::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis_phase2.LAYER_LOCATION, Modelcryo_hypostasis_phase2::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis_missiles.LAYER_LOCATION, Modelelectro_hypostasis_missiles::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis_phase_7.LAYER_LOCATION, Modelcryo_hypostasis_phase_7::createBodyLayer);
		event.registerLayerDefinition(Modelcryo_hypostasis_wheel.LAYER_LOCATION, Modelcryo_hypostasis_wheel::createBodyLayer);
		event.registerLayerDefinition(Modelelectro_hypostasis_cage.LAYER_LOCATION, Modelelectro_hypostasis_cage::createBodyLayer);
		event.registerLayerDefinition(Modelanemo_hypostasis_missiles.LAYER_LOCATION, Modelanemo_hypostasis_missiles::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_electro_grenadier.LAYER_LOCATION, Modelhilichurl_electro_grenadier::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_iceshield_guard.LAYER_LOCATION, Modelhilichurl_iceshield_guard::createBodyLayer);
		event.registerLayerDefinition(Modelabyssmage_shielded.LAYER_LOCATION, Modelabyssmage_shielded::createBodyLayer);
		event.registerLayerDefinition(Modelpyro_hypostasis_explosion.LAYER_LOCATION, Modelpyro_hypostasis_explosion::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis_pillar.LAYER_LOCATION, Modelgeo_hypostasis_pillar::createBodyLayer);
		event.registerLayerDefinition(Modelanemo_hypostasis_small.LAYER_LOCATION, Modelanemo_hypostasis_small::createBodyLayer);
		event.registerLayerDefinition(Modelhilichurl_electro_shooter.LAYER_LOCATION, Modelhilichurl_electro_shooter::createBodyLayer);
		event.registerLayerDefinition(Modelgeo_hypostasis_hands.LAYER_LOCATION, Modelgeo_hypostasis_hands::createBodyLayer);
	}
}
