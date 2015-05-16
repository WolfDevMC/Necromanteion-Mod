package com.wolfburnsmc.handler;

import java.io.File;

import com.wolfburnsmc.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import scala.util.control.Exception.Finally;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile) {
		
		//Create Configuration Object From The Given Configuration File
		if(configuration == null) {
			
		configuration = new Configuration(configFile);
		loadConfiguration();
		
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This Is An Example Configuration Value");
	
		if(configuration.hasChanged()) {
			configuration.save();
		}
	}	
}
