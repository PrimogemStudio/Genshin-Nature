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

import net.mcreator.genshinnature.world.inventory.ArtifactguiMenu;
import net.mcreator.genshinnature.network.ArtifactguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ArtifactguiScreen extends AbstractContainerScreen<ArtifactguiMenu> {
	private final static HashMap<String, Object> guistate = ArtifactguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_detect;

	public ArtifactguiScreen(ArtifactguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 185;
		this.imageHeight = 213;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("genshin_nature:textures/screens/artifactgui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_place_artifacts"), -97, 30, -52480, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_in_any_of_the_slots"), -106, 39, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_make_sure_to"), -97, 93, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_click_on_detect"), -106, 102, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_coloca_artefactos"), 200, 30, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_en_cualquier_espacio"), 191, 39, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_asegrate_de_hacer"), 200, 93, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.genshin_nature.artifactgui.label_click_en_detect"), 200, 102, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		button_detect = Button.builder(Component.translatable("gui.genshin_nature.artifactgui.button_detect"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new ArtifactguiButtonMessage(0, x, y, z));
				ArtifactguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 93, 56, 20).build();
		guistate.put("button:button_detect", button_detect);
		this.addRenderableWidget(button_detect);
	}
}
