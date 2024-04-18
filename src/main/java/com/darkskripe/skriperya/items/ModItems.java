package com.darkskripe.skriperya.items;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.interfaces.RegisterItem;
import com.darkskripe.skriperya.items.customItems.customItems.TikiTotem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;



public class ModItems implements RegisterItem {
    ////////////////////////////////////////////////////////////////////////////////////////////
    //ITEMS//

    public static final Item FANG= RegisterItem.registerItem("fang",new Item(new FabricItemSettings()));

    public static final Item MIDDLE_HARD_BONE = RegisterItem.registerItem("middle_hard_bone",new Item(new FabricItemSettings()));

    public static final Item ENDER_HIDE_SMALL= RegisterItem.registerItem("ender_hide_small",new Item(new FabricItemSettings()));

    public static final Item ENDER_HIDE_MEDIUM= RegisterItem.registerItem("ender_hide_medium",new Item(new FabricItemSettings()));

    public static final Item ENDER_HIDE_BIG= RegisterItem.registerItem("ender_hide_big",new Item(new FabricItemSettings()));

    public static final Item TIKI_TOTEM= RegisterItem.registerItem("tiki_totem",
            new TikiTotem(new FabricItemSettings()));
    //////////////////////////////////////////////////////////////////////////////////////////////
    //CreativeTabGrouping
    public static void addItemsToIngredientsGroup(FabricItemGroupEntries entries){
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    //REGISTERING
    public static void registerModItemsLog(){
        Skriperya.LOGGER.info("Registering mod items for skriperya");
        ModWeapons.registerModSwordsLog();
        ModFood.registerModFoodLog();
        ModArmor.registerModArmourLog();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
    }
}
