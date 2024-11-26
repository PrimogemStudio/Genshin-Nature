
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.genshinnature.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.genshinnature.world.inventory.WishingmenuspanishMenu;
import net.mcreator.genshinnature.world.inventory.WishingmenuselectlanguageMenu;
import net.mcreator.genshinnature.world.inventory.WishingmenuenglishMenu;
import net.mcreator.genshinnature.world.inventory.WeaponascensionguiMenu;
import net.mcreator.genshinnature.world.inventory.VisionsmenuguiMenu;
import net.mcreator.genshinnature.world.inventory.TrounceblossomguiMenu;
import net.mcreator.genshinnature.world.inventory.SouvenirshoplangchooseMenu;
import net.mcreator.genshinnature.world.inventory.SouvenirshopguispanishMenu;
import net.mcreator.genshinnature.world.inventory.SouvenirshopguiMenu;
import net.mcreator.genshinnature.world.inventory.Quest9Menu;
import net.mcreator.genshinnature.world.inventory.Quest8Menu;
import net.mcreator.genshinnature.world.inventory.Quest7Menu;
import net.mcreator.genshinnature.world.inventory.Quest6Menu;
import net.mcreator.genshinnature.world.inventory.Quest5Menu;
import net.mcreator.genshinnature.world.inventory.Quest4Menu;
import net.mcreator.genshinnature.world.inventory.Quest3Menu;
import net.mcreator.genshinnature.world.inventory.Quest2Menu;
import net.mcreator.genshinnature.world.inventory.Quest20Menu;
import net.mcreator.genshinnature.world.inventory.Quest1Menu;
import net.mcreator.genshinnature.world.inventory.Quest19Menu;
import net.mcreator.genshinnature.world.inventory.Quest18Menu;
import net.mcreator.genshinnature.world.inventory.Quest17Menu;
import net.mcreator.genshinnature.world.inventory.Quest16Menu;
import net.mcreator.genshinnature.world.inventory.Quest15Menu;
import net.mcreator.genshinnature.world.inventory.Quest14Menu;
import net.mcreator.genshinnature.world.inventory.Quest13Menu;
import net.mcreator.genshinnature.world.inventory.Quest12Menu;
import net.mcreator.genshinnature.world.inventory.Quest11Menu;
import net.mcreator.genshinnature.world.inventory.Quest10Menu;
import net.mcreator.genshinnature.world.inventory.PyrochallengeMenu;
import net.mcreator.genshinnature.world.inventory.PlacebubblesMenu;
import net.mcreator.genshinnature.world.inventory.HydrochallengeMenu;
import net.mcreator.genshinnature.world.inventory.GenshinbackpackinventoryMenu;
import net.mcreator.genshinnature.world.inventory.FloraconverterlangchooseMenu;
import net.mcreator.genshinnature.world.inventory.FloraconverterguispanishMenu;
import net.mcreator.genshinnature.world.inventory.FloraconverterguiMenu;
import net.mcreator.genshinnature.world.inventory.FishingblockguiMenu;
import net.mcreator.genshinnature.world.inventory.ElectrochallengeMenu;
import net.mcreator.genshinnature.world.inventory.CryochallengeMenu;
import net.mcreator.genshinnature.world.inventory.ChooseavisionMenu;
import net.mcreator.genshinnature.world.inventory.ArtifactguiMenu;
import net.mcreator.genshinnature.world.inventory.AranarainventoryMenu;
import net.mcreator.genshinnature.GenshinNatureMod;

public class GenshinNatureModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, GenshinNatureMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CryochallengeMenu>> CRYOCHALLENGE = REGISTRY.register("cryochallenge", () -> IMenuTypeExtension.create(CryochallengeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ElectrochallengeMenu>> ELECTROCHALLENGE = REGISTRY.register("electrochallenge", () -> IMenuTypeExtension.create(ElectrochallengeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HydrochallengeMenu>> HYDROCHALLENGE = REGISTRY.register("hydrochallenge", () -> IMenuTypeExtension.create(HydrochallengeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PyrochallengeMenu>> PYROCHALLENGE = REGISTRY.register("pyrochallenge", () -> IMenuTypeExtension.create(PyrochallengeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WishingmenuselectlanguageMenu>> WISHINGMENUSELECTLANGUAGE = REGISTRY.register("wishingmenuselectlanguage", () -> IMenuTypeExtension.create(WishingmenuselectlanguageMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WishingmenuenglishMenu>> WISHINGMENUENGLISH = REGISTRY.register("wishingmenuenglish", () -> IMenuTypeExtension.create(WishingmenuenglishMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WishingmenuspanishMenu>> WISHINGMENUSPANISH = REGISTRY.register("wishingmenuspanish", () -> IMenuTypeExtension.create(WishingmenuspanishMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FloraconverterguiMenu>> FLORACONVERTERGUI = REGISTRY.register("floraconvertergui", () -> IMenuTypeExtension.create(FloraconverterguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FloraconverterguispanishMenu>> FLORACONVERTERGUISPANISH = REGISTRY.register("floraconverterguispanish", () -> IMenuTypeExtension.create(FloraconverterguispanishMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FloraconverterlangchooseMenu>> FLORACONVERTERLANGCHOOSE = REGISTRY.register("floraconverterlangchoose", () -> IMenuTypeExtension.create(FloraconverterlangchooseMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SouvenirshopguiMenu>> SOUVENIRSHOPGUI = REGISTRY.register("souvenirshopgui", () -> IMenuTypeExtension.create(SouvenirshopguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SouvenirshoplangchooseMenu>> SOUVENIRSHOPLANGCHOOSE = REGISTRY.register("souvenirshoplangchoose", () -> IMenuTypeExtension.create(SouvenirshoplangchooseMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SouvenirshopguispanishMenu>> SOUVENIRSHOPGUISPANISH = REGISTRY.register("souvenirshopguispanish", () -> IMenuTypeExtension.create(SouvenirshopguispanishMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ArtifactguiMenu>> ARTIFACTGUI = REGISTRY.register("artifactgui", () -> IMenuTypeExtension.create(ArtifactguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FishingblockguiMenu>> FISHINGBLOCKGUI = REGISTRY.register("fishingblockgui", () -> IMenuTypeExtension.create(FishingblockguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<PlacebubblesMenu>> PLACEBUBBLES = REGISTRY.register("placebubbles", () -> IMenuTypeExtension.create(PlacebubblesMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TrounceblossomguiMenu>> TROUNCEBLOSSOMGUI = REGISTRY.register("trounceblossomgui", () -> IMenuTypeExtension.create(TrounceblossomguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<VisionsmenuguiMenu>> VISIONSMENUGUI = REGISTRY.register("visionsmenugui", () -> IMenuTypeExtension.create(VisionsmenuguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WeaponascensionguiMenu>> WEAPONASCENSIONGUI = REGISTRY.register("weaponascensiongui", () -> IMenuTypeExtension.create(WeaponascensionguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ChooseavisionMenu>> CHOOSEAVISION = REGISTRY.register("chooseavision", () -> IMenuTypeExtension.create(ChooseavisionMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AranarainventoryMenu>> ARANARAINVENTORY = REGISTRY.register("aranarainventory", () -> IMenuTypeExtension.create(AranarainventoryMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest1Menu>> QUEST_1 = REGISTRY.register("quest_1", () -> IMenuTypeExtension.create(Quest1Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest2Menu>> QUEST_2 = REGISTRY.register("quest_2", () -> IMenuTypeExtension.create(Quest2Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest3Menu>> QUEST_3 = REGISTRY.register("quest_3", () -> IMenuTypeExtension.create(Quest3Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest4Menu>> QUEST_4 = REGISTRY.register("quest_4", () -> IMenuTypeExtension.create(Quest4Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest5Menu>> QUEST_5 = REGISTRY.register("quest_5", () -> IMenuTypeExtension.create(Quest5Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest6Menu>> QUEST_6 = REGISTRY.register("quest_6", () -> IMenuTypeExtension.create(Quest6Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest7Menu>> QUEST_7 = REGISTRY.register("quest_7", () -> IMenuTypeExtension.create(Quest7Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest8Menu>> QUEST_8 = REGISTRY.register("quest_8", () -> IMenuTypeExtension.create(Quest8Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest9Menu>> QUEST_9 = REGISTRY.register("quest_9", () -> IMenuTypeExtension.create(Quest9Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest10Menu>> QUEST_10 = REGISTRY.register("quest_10", () -> IMenuTypeExtension.create(Quest10Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest11Menu>> QUEST_11 = REGISTRY.register("quest_11", () -> IMenuTypeExtension.create(Quest11Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest12Menu>> QUEST_12 = REGISTRY.register("quest_12", () -> IMenuTypeExtension.create(Quest12Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest13Menu>> QUEST_13 = REGISTRY.register("quest_13", () -> IMenuTypeExtension.create(Quest13Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest14Menu>> QUEST_14 = REGISTRY.register("quest_14", () -> IMenuTypeExtension.create(Quest14Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest15Menu>> QUEST_15 = REGISTRY.register("quest_15", () -> IMenuTypeExtension.create(Quest15Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest16Menu>> QUEST_16 = REGISTRY.register("quest_16", () -> IMenuTypeExtension.create(Quest16Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest17Menu>> QUEST_17 = REGISTRY.register("quest_17", () -> IMenuTypeExtension.create(Quest17Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest18Menu>> QUEST_18 = REGISTRY.register("quest_18", () -> IMenuTypeExtension.create(Quest18Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest19Menu>> QUEST_19 = REGISTRY.register("quest_19", () -> IMenuTypeExtension.create(Quest19Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<Quest20Menu>> QUEST_20 = REGISTRY.register("quest_20", () -> IMenuTypeExtension.create(Quest20Menu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GenshinbackpackinventoryMenu>> GENSHINBACKPACKINVENTORY = REGISTRY.register("genshinbackpackinventory", () -> IMenuTypeExtension.create(GenshinbackpackinventoryMenu::new));
}
