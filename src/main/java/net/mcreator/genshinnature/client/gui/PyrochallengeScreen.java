package net.mcreator.genshinnature.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.genshinnature.world.inventory.PyrochallengeMenu;
import net.mcreator.genshinnature.network.PyrochallengeButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PyrochallengeScreen extends AbstractContainerScreen<PyrochallengeMenu> {
	private final static HashMap<String, Object> guistate = PyrochallengeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_no;
	Button button_yes;

	public PyrochallengeScreen(PyrochallengeMenu container, Inventory inventory, Component text) {
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
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.pyrochallenge.label_start_the_pyro_challenge"), 25, 14, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_no = Button.builder(Component.translatable("gui.genshin_nature.pyrochallenge.button_no"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PyrochallengeButtonMessage(0, x, y, z));
				PyrochallengeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 125, this.topPos + 74, 35, 20).build();
		guistate.put("button:button_no", button_no);
		this.addRenderableWidget(button_no);
		button_yes = Button.builder(Component.translatable("gui.genshin_nature.pyrochallenge.button_yes"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new PyrochallengeButtonMessage(1, x, y, z));
				PyrochallengeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 15, this.topPos + 74, 40, 20).build();
		guistate.put("button:button_yes", button_yes);
		this.addRenderableWidget(button_yes);
	}
}
