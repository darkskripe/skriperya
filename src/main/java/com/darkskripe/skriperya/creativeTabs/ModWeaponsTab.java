package com.darkskripe.skriperya.creativeTabs;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.items.ModWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModWeaponsTab {
    public static final ItemGroup WEAPONS_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skriperya.MOD_ID,"weapons_skriperya"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weapons_skriperya")).
                    icon(()->new ItemStack(ModWeapons.BLOODY_DAO)).
                    entries(((displayContext, entries) ->{
                        //////////care se adauga
                        entries.add(ModWeapons.BLOODY_DAO);

                    } )).
                    build()
    );
    public static void registerWeaponTab(){
        Skriperya.LOGGER.info("Register weapon creative tab for skriperya");
    }
}
