package com.lion123.kubeztest.utils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.lion123.kubeztest.blocks.BlocksManager;
import com.lion123.kubeztest.items.ItemsManager;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesManager {
	public static void initRecipes()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ItemsManager.mouse), "bib","iri","iii",'b',Blocks.stone_button,'i',Items.iron_ingot,'r',Blocks.redstone_block);
		GameRegistry.addShapedRecipe(new ItemStack(Items.apple), " g","g ",'g',Items.gold_nugget);
		GameRegistry.addSmelting(Blocks.stone, new ItemStack(BlocksManager.marble), 1);
		//ShapedOreRecipe(..,"stickWood","oreGold",...);
	}
}
