package com.lion123.kubeztest.blocks;

import com.lion123.kubeztest.references.Reg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBase extends Block {
	public BlockBase(Material material)
	{
		super(material);
	}
	
	public BlockBase()
	{
		this(Material.rock);
	}
	
	@Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reg.MOD_ID_COLON, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
