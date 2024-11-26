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

import net.mcreator.genshinnature.world.inventory.WeaponascensionguiMenu;
import net.mcreator.genshinnature.network.WeaponascensionguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WeaponascensionguiScreen extends AbstractContainerScreen<WeaponascensionguiMenu> {
	private final static HashMap<String, Object> guistate = WeaponascensionguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ascend;
	Button button_auto;

	public WeaponascensionguiScreen(WeaponascensionguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 237;
		this.imageHeight = 189;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("genshin_nature:textures/screens/weaponascensiongui.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_ascend = Button.builder(Component.translatable("gui.genshin_nature.weaponascensiongui.button_ascend"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new WeaponascensionguiButtonMessage(0, x, y, z));
				WeaponascensionguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 40, 56, 20).build();
		guistate.put("button:button_ascend", button_ascend);
		this.addRenderableWidget(button_ascend);
		button_auto = Button.builder(Component.translatable("gui.genshin_nature.weaponascensiongui.button_auto"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new WeaponascensionguiButtonMessage(1, x, y, z));
				WeaponascensionguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 171, this.topPos + 25, 46, 20).build();
		guistate.put("button:button_auto", button_auto);
		this.addRenderableWidget(button_auto);
	}
}