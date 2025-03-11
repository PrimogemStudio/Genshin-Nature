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

import net.mcreator.genshinnature.world.inventory.TrounceblossomguiMenu;
import net.mcreator.genshinnature.network.TrounceblossomguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TrounceblossomguiScreen extends AbstractContainerScreen<TrounceblossomguiMenu> {
	private final static HashMap<String, Object> guistate = TrounceblossomguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_claim;

	public TrounceblossomguiScreen(TrounceblossomguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("genshin_nature:textures/screens/trounceblossomgui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.trounceblossomgui.label_you_have_to_put_at_least_60_orig"), -45, -36, -65485, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.trounceblossomgui.label_tienes_que_poner_al_menos_60_res"), -65, -16, -65485, false);
	}

	@Override
	public void init() {
		super.init();
		button_claim = Button.builder(Component.translatable("gui.genshin_nature.trounceblossomgui.button_claim"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TrounceblossomguiButtonMessage(0, x, y, z));
				TrounceblossomguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 54, 51, 20).build();
		guistate.put("button:button_claim", button_claim);
		this.addRenderableWidget(button_claim);
	}
}
