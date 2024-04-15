package com.darkskripe.skriperya.items;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.interfaces.RegisterItem;
import com.darkskripe.skriperya.items.customItems.BloodyDao;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;


public class ModWeapons implements RegisterItem {

    public static final Item BLOODY_DAO =RegisterItem.registerItem("bloody_dao",
            new BloodyDao(ModToolMaterial.HARDBONES,3,-2.6f,new FabricItemSettings()));

    public static void registerModSwordsLog(){
        Skriperya.LOGGER.info("Registering mod swords for skriperya");
    }
}
