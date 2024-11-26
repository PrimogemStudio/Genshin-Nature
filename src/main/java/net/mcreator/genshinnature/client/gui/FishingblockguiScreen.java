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

import net.mcreator.genshinnature.world.inventory.FishingblockguiMenu;
import net.mcreator.genshinnature.network.FishingblockguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FishingblockguiScreen extends AbstractContainerScreen<FishingblockguiMenu> {
	private final static HashMap<String, Object> guistate = FishingblockguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_activate;

	public FishingblockguiScreen(FishingblockguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("genshin_nature:textures/screens/fishingblockgui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.fishingblockgui.label_bait"), 22, 21, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.fishingblockgui.label_cebo"), 157, 21, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		button_activate = Button.builder(Component.translatable("gui.genshin_nature.fishingblockgui.button_activate"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new FishingblockguiButtonMessage(0, x, y, z));
				FishingblockguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 67, this.topPos + 81, 67, 20).build();
		guistate.put("button:button_activate", button_activate);
		this.addRenderableWidget(button_activate);
	}
}
