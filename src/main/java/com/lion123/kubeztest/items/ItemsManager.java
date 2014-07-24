package com.lion123.kubeztest.items;

import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.common.registry.GameRegistry;
@GameRegistry.ObjectHolder(Reg.MOD_ID)
public class ItemsManager {
	public static final ItemBase mouse = new Mouse();
	
	public static void Init()
	{
		GameRegistry.registerItem(mouse, "mouse");
	}
}
