package com.darkskripe.skriperya.creativeTabs;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModMobDropsCreativeTab {
    public static final ItemGroup MOB_DROP_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skriperya.MOD_ID,"mob_drops_skriperya"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mob_drops_skriperya")).
                    icon(()->new ItemStack(ModItems.FANG)).
                    entries(((displayContext, entries) ->{
                        //////////care se adauga
                        entries.add(ModItems.FANG);
                        entries.add(ModItems.MIDDLE_HARD_BONE);
                        entries.add(ModItems.ENDER_HIDE_SMALL);
                        entries.add(ModItems.ENDER_HIDE_MEDIUM);
                        entries.add(ModItems.ENDER_HIDE_BIG);
                        entries.add(ModItems.TIKI_TOTEM);

                    } )).
                    build()
            );
    public static void registerMobDropsTab(){
        Skriperya.LOGGER.info("Register mob drop creative tab for skriperya");
    }
}
