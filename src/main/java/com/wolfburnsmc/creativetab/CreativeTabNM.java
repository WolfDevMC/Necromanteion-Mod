package com.wolfburnsmc.creativetab;

import com.wolfburnsmc.init.ModItems;
import com.wolfburnsmc.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNM {

	public static final CreativeTabs NM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		
		@Override
		public Item getTabIconItem() {
			
			return ModItems.itemPhylactery;
		}
		
	};
	
}
