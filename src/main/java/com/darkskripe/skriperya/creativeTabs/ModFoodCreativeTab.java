package com.darkskripe.skriperya.creativeTabs;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.blocks.ModBlocks;
import com.darkskripe.skriperya.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModFoodCreativeTab {
    public static final ItemGroup FOOD_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skriperya.MOD_ID,"food_skriperya"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.food_skriperya")).
                    icon(()->new ItemStack(ModItems.SHULKERS_FRUIT)).
                    entries(((displayContext, entries) ->{
                        //////////care se adauga
                        entries.add(ModItems.SHULKERS_FRUIT);
                    } )).
                    build()
    );
    ////////////////////////////////logs//////////////////////////////////
    public static void registerFoodTab(){
        Skriperya.LOGGER.info("Register food creative tab for skriperya");
    }
}
