package com.lion123.kubeztest.client.gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.*;

import com.lion123.kubeztest.Config.*;
import com.lion123.kubeztest.references.Reg;
public class ModGuiConfig extends GuiConfig{
	public ModGuiConfig(GuiScreen screen)
	{
		super(screen,
				new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reg.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	}
}
