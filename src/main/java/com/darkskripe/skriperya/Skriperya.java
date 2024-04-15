package com.darkskripe.skriperya;

import com.darkskripe.skriperya.blocks.ModBlocks;
import com.darkskripe.skriperya.creativeTabs.RegisterAllSkriperyaTabs;
import com.darkskripe.skriperya.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skriperya implements ModInitializer {
	public static final String MOD_ID ="skriperya";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItemsLog();
		RegisterAllSkriperyaTabs.registerTabs();
		ModBlocks.registerBlocks();
	}
}