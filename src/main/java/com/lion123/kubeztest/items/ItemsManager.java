package com.lion123.kubeztest.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemsManager {
	public static final ItemBase mouse = new Mouse();
	
	public static void Init()
	{
		GameRegistry.registerItem(mouse, "mouse");
	}
}
