package com.darkskripe.skriperya.blocks;

import com.darkskripe.skriperya.Skriperya;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    ///////////////////BLOCKS///////////////////////////
    public static final Block DUNG_LAMP =registerBlock("dung_lamp",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));




    ////////////////////////////METHODS/////////////////////
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Skriperya.MOD_ID,name),
                block);

    };

    private static Item registerBlockItem(String name, Block block){
         return Registry.register(Registries.ITEM,new Identifier(Skriperya.MOD_ID,name),
                 new BlockItem(block,new FabricItemSettings()));

     };

    ////////////////////////////////////////////LOG
    public static void registerBlocks(){
        Skriperya.LOGGER.info("Registering blocks for skriperya");
    }
}
