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

public class ModBlocksCreativeTab {

    public static final ItemGroup MOB_DROP_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skriperya.MOD_ID,"blocks_skriperya"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks_skriperya")).
                    icon(()->new ItemStack(ModBlocks.SEQUOIA_LOG_BLOCK)).
                    entries(((displayContext, entries) ->{
                        //////////care se adauga
                        entries.add(ModBlocks.SEQUOIA_LOG_BLOCK);
                    } )).
                    build()
    );
    ////////////////////////////////logs//////////////////////////////////
    public static void registerBlocksTab(){
        Skriperya.LOGGER.info("Register blocks creative tab for skriperya");
    }
}
