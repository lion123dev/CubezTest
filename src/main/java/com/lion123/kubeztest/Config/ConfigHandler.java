package com.lion123.kubeztest.config;

import java.io.File;

import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	public static boolean rndValue;
	public static void init(File configFile)
	{
		if(config == null)
		{
			config = new Configuration(configFile);
			LoadConfig();
		}
	}
	
	@SubscribeEvent
	public void OnConfigurationChanged(ConfigChangedEvent.OnConfigChangedEvent e)
	{
		if(e.modID.equalsIgnoreCase(Reg.MOD_ID))
		{
			LoadConfig();
		}
	}
	
	private static void LoadConfig()
	{
		rndValue = config.getBoolean("randomValue", Configuration.CATEGORY_GENERAL, false, "This is a testing config value");
		String s = config.getString("qwfwqf", Configuration.CATEGORY_GENERAL, "hello", "yo-yo");
		if(config.hasChanged())
		{
			config.save();
		}
	}
}
