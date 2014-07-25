package com.lion123.kubeztest.blocks;

import com.lion123.kubeztest.references.Reg;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reg.MOD_ID)
public class BlocksManager {
	public static final BlockBase marble = new Marble();
	
	public static void initBlocks()
	{
		GameRegistry.registerBlock(marble, "marble");
	}
}
