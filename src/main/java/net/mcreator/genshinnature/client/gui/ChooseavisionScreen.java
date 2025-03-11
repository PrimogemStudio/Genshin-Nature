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

import net.mcreator.genshinnature.world.inventory.ChooseavisionMenu;
import net.mcreator.genshinnature.network.ChooseavisionButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChooseavisionScreen extends AbstractContainerScreen<ChooseavisionMenu> {
	private final static HashMap<String, Object> guistate = ChooseavisionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_anemo;
	Button button_none;
	Button button_cryo;
	Button button_electro;
	Button button_geo;
	Button button_hydro;
	Button button_pyro;
	Button button_dendro;

	public ChooseavisionScreen(ChooseavisionMenu container, Inventory inventory, Component text) {
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
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/anemo_icon.png"), this.leftPos + 50, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/cryo_icon.png"), this.leftPos + 110, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/dendro_icon.png"), this.leftPos + 170, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/electro_icon.png"), this.leftPos + 170, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/geo_icon.png"), this.leftPos + -5, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/hydro_icon.png"), this.leftPos + 50, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/pyro_icon.png"), this.leftPos + 110, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("genshin_nature:textures/screens/no_vision_icon.png"), this.leftPos + -5, this.topPos + 4, 0, 0, 16, 16, 16, 16);

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
	}

	@Override
	public void init() {
		super.init();
		button_anemo = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_anemo"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(0, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 35, this.topPos + 24, 51, 20).build();
		guistate.put("button:button_anemo", button_anemo);
		this.addRenderableWidget(button_anemo);
		button_none = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_none"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(1, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -20, this.topPos + 24, 46, 20).build();
		guistate.put("button:button_none", button_none);
		this.addRenderableWidget(button_none);
		button_cryo = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_cryo"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(2, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 95, this.topPos + 24, 46, 20).build();
		guistate.put("button:button_cryo", button_cryo);
		this.addRenderableWidget(button_cryo);
		button_electro = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_electro"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(3, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 24, 61, 20).build();
		guistate.put("button:button_electro", button_electro);
		this.addRenderableWidget(button_electro);
		button_geo = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_geo"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(4, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -15, this.topPos + 84, 40, 20).build();
		guistate.put("button:button_geo", button_geo);
		this.addRenderableWidget(button_geo);
		button_hydro = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_hydro"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(5, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 35, this.topPos + 84, 51, 20).build();
		guistate.put("button:button_hydro", button_hydro);
		this.addRenderableWidget(button_hydro);
		button_pyro = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_pyro"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(6, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 95, this.topPos + 84, 46, 20).build();
		guistate.put("button:button_pyro", button_pyro);
		this.addRenderableWidget(button_pyro);
		button_dendro = Button.builder(Component.translatable("gui.genshin_nature.chooseavision.button_dendro"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ChooseavisionButtonMessage(7, x, y, z));
				ChooseavisionButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 150, this.topPos + 84, 56, 20).build();
		guistate.put("button:button_dendro", button_dendro);
		this.addRenderableWidget(button_dendro);
	}
}
