package com.lion123.kubeztest.items;

import com.lion123.kubeztest.creativetab.CreativeTabKubez;
import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {
	public ItemBase()
	{
		super();
		this.setNoRepair();
		this.setCreativeTab(CreativeTabKubez.KubexTab);
	}
	@Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reg.MOD_ID_COLON, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reg.MOD_ID_COLON, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
