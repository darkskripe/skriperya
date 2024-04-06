package com.darkskripe.skriperya.items;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.items.customItems.TikiTotem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {
    ///////////////////////////////////////////////////////////////////////////////////////////
    //FUNCTIONS
    private  static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Skriperya.MOD_ID , name) ,item);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    //ITEMS//

    public static final Item FANG=registerItem("fang",new Item(new FabricItemSettings()));

    public static final Item TIKI_TOTEM=registerItem("tiki_totem",
            new TikiTotem(new FabricItemSettings().maxDamage(10)));

    public static final Item SHULKERS_FRUIT=registerItem("shulkers_fruit",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHULKERS_FRUIT)));


    //////////////////////////////////////////////////////////////////////////////////////////////
    //CreativeTabGrouping
    public static void addItemsToIngredientsGroup(FabricItemGroupEntries entries){


    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    //REGISTERING
    public static void registerModItemsLog(){
        Skriperya.LOGGER.info("Registering mod items for skriperya");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
    }
}
