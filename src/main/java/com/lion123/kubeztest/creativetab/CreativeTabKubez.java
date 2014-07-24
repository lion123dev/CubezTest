package com.lion123.kubeztest.creativetab;
import com.lion123.kubeztest.items.ItemsManager;
import com.lion123.kubeztest.references.Reg;

import net.minecraft.creativetab.*;
import net.minecraft.item.Item;
public class CreativeTabKubez {
	public static final CreativeTabs KubexTab = new CreativeTabs(Reg.MOD_ID.toLowerCase())
	{
		@Override
		public Item getTabIconItem()
		{
			return ItemsManager.mouse;
		}
	};
}
