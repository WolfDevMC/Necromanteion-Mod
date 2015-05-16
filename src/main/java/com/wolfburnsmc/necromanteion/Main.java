package com.wolfburnsmc.necromanteion;

import net.minecraftforge.oredict.OreDictionary;
import com.wolfburnsmc.handler.ConfigurationHandler;
import com.wolfburnsmc.init.ModBlocks;
import com.wolfburnsmc.init.ModItems;
import com.wolfburnsmc.init.Recipes;
import com.wolfburnsmc.proxy.CommonProxy;
import com.wolfburnsmc.reference.Reference;
import com.wolfburnsmc.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class Main {
	
	@Instance("Reference.MOD_ID")
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent event) {
		
		//LogHelper
		LogHelper.info("Pre Initialization Complete!");
		
		//Configuration
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		//Items
		ModItems.init();
		
		//Blocks
		ModBlocks.init();

	}
	
	@EventHandler
	public void Load(FMLInitializationEvent event) {
		
		//LogHelper
		LogHelper.info("Initialization Complete!");
		
		//Recipes
		Recipes.init();
		
	}
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent event) {
		
		//LogHelper
		LogHelper.info("Post Initialization Complete!");
		
	}	
}
