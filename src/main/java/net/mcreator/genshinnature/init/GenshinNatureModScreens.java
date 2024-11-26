
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.genshinnature.client.gui.WishingmenuspanishScreen;
import net.mcreator.genshinnature.client.gui.WishingmenuselectlanguageScreen;
import net.mcreator.genshinnature.client.gui.WishingmenuenglishScreen;
import net.mcreator.genshinnature.client.gui.WeaponascensionguiScreen;
import net.mcreator.genshinnature.client.gui.VisionsmenuguiScreen;
import net.mcreator.genshinnature.client.gui.TrounceblossomguiScreen;
import net.mcreator.genshinnature.client.gui.SouvenirshoplangchooseScreen;
import net.mcreator.genshinnature.client.gui.SouvenirshopguispanishScreen;
import net.mcreator.genshinnature.client.gui.SouvenirshopguiScreen;
import net.mcreator.genshinnature.client.gui.Quest9Screen;
import net.mcreator.genshinnature.client.gui.Quest8Screen;
import net.mcreator.genshinnature.client.gui.Quest7Screen;
import net.mcreator.genshinnature.client.gui.Quest6Screen;
import net.mcreator.genshinnature.client.gui.Quest5Screen;
import net.mcreator.genshinnature.client.gui.Quest4Screen;
import net.mcreator.genshinnature.client.gui.Quest3Screen;
import net.mcreator.genshinnature.client.gui.Quest2Screen;
import net.mcreator.genshinnature.client.gui.Quest20Screen;
import net.mcreator.genshinnature.client.gui.Quest1Screen;
import net.mcreator.genshinnature.client.gui.Quest19Screen;
import net.mcreator.genshinnature.client.gui.Quest18Screen;
import net.mcreator.genshinnature.client.gui.Quest17Screen;
import net.mcreator.genshinnature.client.gui.Quest16Screen;
import net.mcreator.genshinnature.client.gui.Quest15Screen;
import net.mcreator.genshinnature.client.gui.Quest14Screen;
import net.mcreator.genshinnature.client.gui.Quest13Screen;
import net.mcreator.genshinnature.client.gui.Quest12Screen;
import net.mcreator.genshinnature.client.gui.Quest11Screen;
import net.mcreator.genshinnature.client.gui.Quest10Screen;
import net.mcreator.genshinnature.client.gui.PyrochallengeScreen;
import net.mcreator.genshinnature.client.gui.PlacebubblesScreen;
import net.mcreator.genshinnature.client.gui.HydrochallengeScreen;
import net.mcreator.genshinnature.client.gui.GenshinbackpackinventoryScreen;
import net.mcreator.genshinnature.client.gui.FloraconverterlangchooseScreen;
import net.mcreator.genshinnature.client.gui.FloraconverterguispanishScreen;
import net.mcreator.genshinnature.client.gui.FloraconverterguiScreen;
import net.mcreator.genshinnature.client.gui.FishingblockguiScreen;
import net.mcreator.genshinnature.client.gui.ElectrochallengeScreen;
import net.mcreator.genshinnature.client.gui.CryochallengeScreen;
import net.mcreator.genshinnature.client.gui.ChooseavisionScreen;
import net.mcreator.genshinnature.client.gui.ArtifactguiScreen;
import net.mcreator.genshinnature.client.gui.AranarainventoryScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GenshinNatureModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(GenshinNatureModMenus.CRYOCHALLENGE.get(), CryochallengeScreen::new);
		event.register(GenshinNatureModMenus.ELECTROCHALLENGE.get(), ElectrochallengeScreen::new);
		event.register(GenshinNatureModMenus.HYDROCHALLENGE.get(), HydrochallengeScreen::new);
		event.register(GenshinNatureModMenus.PYROCHALLENGE.get(), PyrochallengeScreen::new);
		event.register(GenshinNatureModMenus.WISHINGMENUSELECTLANGUAGE.get(), WishingmenuselectlanguageScreen::new);
		event.register(GenshinNatureModMenus.WISHINGMENUENGLISH.get(), WishingmenuenglishScreen::new);
		event.register(GenshinNatureModMenus.WISHINGMENUSPANISH.get(), WishingmenuspanishScreen::new);
		event.register(GenshinNatureModMenus.FLORACONVERTERGUI.get(), FloraconverterguiScreen::new);
		event.register(GenshinNatureModMenus.FLORACONVERTERGUISPANISH.get(), FloraconverterguispanishScreen::new);
		event.register(GenshinNatureModMenus.FLORACONVERTERLANGCHOOSE.get(), FloraconverterlangchooseScreen::new);
		event.register(GenshinNatureModMenus.SOUVENIRSHOPGUI.get(), SouvenirshopguiScreen::new);
		event.register(GenshinNatureModMenus.SOUVENIRSHOPLANGCHOOSE.get(), SouvenirshoplangchooseScreen::new);
		event.register(GenshinNatureModMenus.SOUVENIRSHOPGUISPANISH.get(), SouvenirshopguispanishScreen::new);
		event.register(GenshinNatureModMenus.ARTIFACTGUI.get(), ArtifactguiScreen::new);
		event.register(GenshinNatureModMenus.FISHINGBLOCKGUI.get(), FishingblockguiScreen::new);
		event.register(GenshinNatureModMenus.PLACEBUBBLES.get(), PlacebubblesScreen::new);
		event.register(GenshinNatureModMenus.TROUNCEBLOSSOMGUI.get(), TrounceblossomguiScreen::new);
		event.register(GenshinNatureModMenus.VISIONSMENUGUI.get(), VisionsmenuguiScreen::new);
		event.register(GenshinNatureModMenus.WEAPONASCENSIONGUI.get(), WeaponascensionguiScreen::new);
		event.register(GenshinNatureModMenus.CHOOSEAVISION.get(), ChooseavisionScreen::new);
		event.register(GenshinNatureModMenus.ARANARAINVENTORY.get(), AranarainventoryScreen::new);
		event.register(GenshinNatureModMenus.QUEST_1.get(), Quest1Screen::new);
		event.register(GenshinNatureModMenus.QUEST_2.get(), Quest2Screen::new);
		event.register(GenshinNatureModMenus.QUEST_3.get(), Quest3Screen::new);
		event.register(GenshinNatureModMenus.QUEST_4.get(), Quest4Screen::new);
		event.register(GenshinNatureModMenus.QUEST_5.get(), Quest5Screen::new);
		event.register(GenshinNatureModMenus.QUEST_6.get(), Quest6Screen::new);
		event.register(GenshinNatureModMenus.QUEST_7.get(), Quest7Screen::new);
		event.register(GenshinNatureModMenus.QUEST_8.get(), Quest8Screen::new);
		event.register(GenshinNatureModMenus.QUEST_9.get(), Quest9Screen::new);
		event.register(GenshinNatureModMenus.QUEST_10.get(), Quest10Screen::new);
		event.register(GenshinNatureModMenus.QUEST_11.get(), Quest11Screen::new);
		event.register(GenshinNatureModMenus.QUEST_12.get(), Quest12Screen::new);
		event.register(GenshinNatureModMenus.QUEST_13.get(), Quest13Screen::new);
		event.register(GenshinNatureModMenus.QUEST_14.get(), Quest14Screen::new);
		event.register(GenshinNatureModMenus.QUEST_15.get(), Quest15Screen::new);
		event.register(GenshinNatureModMenus.QUEST_16.get(), Quest16Screen::new);
		event.register(GenshinNatureModMenus.QUEST_17.get(), Quest17Screen::new);
		event.register(GenshinNatureModMenus.QUEST_18.get(), Quest18Screen::new);
		event.register(GenshinNatureModMenus.QUEST_19.get(), Quest19Screen::new);
		event.register(GenshinNatureModMenus.QUEST_20.get(), Quest20Screen::new);
		event.register(GenshinNatureModMenus.GENSHINBACKPACKINVENTORY.get(), GenshinbackpackinventoryScreen::new);
	}
}
