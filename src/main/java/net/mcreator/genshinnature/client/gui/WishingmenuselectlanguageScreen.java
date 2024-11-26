package net.mcreator.genshinnature.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.genshinnature.world.inventory.WishingmenuselectlanguageMenu;
import net.mcreator.genshinnature.network.WishingmenuselectlanguageButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WishingmenuselectlanguageScreen extends AbstractContainerScreen<WishingmenuselectlanguageMenu> {
	private final static HashMap<String, Object> guistate = WishingmenuselectlanguageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_espaol;
	Button button_english;

	public WishingmenuselectlanguageScreen(WishingmenuselectlanguageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.wishingmenuselectlanguage.label_select_your_language"), -45, 31, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.wishingmenuselectlanguage.label_elige_tu_idioma"), 115, 31, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_espaol = Button.builder(Component.translatable("gui.genshin_nature.wishingmenuselectlanguage.button_espaol"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new WishingmenuselectlanguageButtonMessage(0, x, y, z));
				WishingmenuselectlanguageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 71, 61, 20).build();
		guistate.put("button:button_espaol", button_espaol);
		this.addRenderableWidget(button_espaol);
		button_english = Button.builder(Component.translatable("gui.genshin_nature.wishingmenuselectlanguage.button_english"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new WishingmenuselectlanguageButtonMessage(1, x, y, z));
				WishingmenuselectlanguageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 0, this.topPos + 71, 61, 20).build();
		guistate.put("button:button_english", button_english);
		this.addRenderableWidget(button_english);
	}
}
