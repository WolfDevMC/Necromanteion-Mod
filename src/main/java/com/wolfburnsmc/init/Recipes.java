package com.wolfburnsmc.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {
		
	    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemPhylactery), "isi", "scs", "isi", 'c', new ItemStack(Blocks.chest), 'i', new ItemStack(Items.iron_ingot), 's', "stickWood"));
	}
	
}
