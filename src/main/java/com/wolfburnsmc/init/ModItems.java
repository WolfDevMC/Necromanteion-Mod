package com.wolfburnsmc.init;

import net.minecraft.block.material.Material;

import com.wolfburnsmc.item.ItemNM;
import com.wolfburnsmc.item.ItemPhylactery;
import com.wolfburnsmc.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

	//Items Registry
	public static final ItemNM itemPhylactery = new ItemPhylactery();
	
	public static void init() {
		
		//Game Registry
		GameRegistry.registerItem(itemPhylactery, "itemPhylactery");
		
	}
}
