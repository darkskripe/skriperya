package com.darkskripe.skriperya.blocks;

import com.darkskripe.skriperya.Skriperya;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Instrument;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    ///////////////////BLOCKS///////////////////////////
    public static final Block SEQUOIA_LOG_BLOCK =registerBlock("sequoia_log",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD)));



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
