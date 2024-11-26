package net.mcreator.genshinnature.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.genshinnature.world.inventory.WishingmenuenglishMenu;
import net.mcreator.genshinnature.network.WishingmenuenglishButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WishingmenuenglishScreen extends AbstractContainerScreen<WishingmenuenglishMenu> {
	private final static HashMap<String, Object> guistate = WishingmenuenglishMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_make_a_wish;

	public WishingmenuenglishScreen(WishingmenuenglishMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("genshin_nature:textures/screens/wishingmenuenglish.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.wishingmenuenglish.label_use_fates_to_make_basic_wishes"), 10, -14, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.wishingmenuenglish.label_use_resins_to_make_special_wishe"), 5, -29, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		button_make_a_wish = Button.builder(Component.translatable("gui.genshin_nature.wishingmenuenglish.button_make_a_wish"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new WishingmenuenglishButtonMessage(0, x, y, z));
				WishingmenuenglishButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 45, this.topPos + 51, 82, 20).build();
		guistate.put("button:button_make_a_wish", button_make_a_wish);
		this.addRenderableWidget(button_make_a_wish);
	}
}
