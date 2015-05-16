package com.wolfburnsmc.init;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import com.wolfburnsmc.block.BlockNM;
import com.wolfburnsmc.block.HolyWater;
import com.wolfburnsmc.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	//Block Registry
	public final static BlockNM blockHolyWater = new HolyWater();
	
	public static void init() {
		
		//Game Registry
		GameRegistry.registerBlock(blockHolyWater, "blockHolyWater");	
		
	}
	
}
