package com.lion123.kubeztest;
import net.minecraftforge.common.config.Configuration;

import com.lion123.kubeztest.Config.ConfigHandler;
import com.lion123.kubeztest.blocks.BlocksManager;
import com.lion123.kubeztest.items.ItemsManager;
import com.lion123.kubeztest.proxy.IProxy;
import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
@Mod(modid=Reg.MOD_ID,version=Reg.VERSION,name=Reg.MOD_NAME,guiFactory=Reg.GUI_FACTORY)
public class KubezTest {
	
	@Mod.Instance(Reg.MOD_ID)
	public static KubezTest instance;
	
	@SidedProxy(clientSide=Reg.CLIENT_PROXY,serverSide=Reg.SERVER_PROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler()
	public void PreInit(FMLPreInitializationEvent e)
	{
		ConfigHandler.init(e.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		ItemsManager.Init();
		BlocksManager.Init();
	}
	
	@Mod.EventHandler()
	public void init(FMLInitializationEvent e)
	{
		
	}
	
	@Mod.EventHandler()
	public void PostInit(FMLPostInitializationEvent e)
	{
		
	}
}
