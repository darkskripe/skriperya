package com.darkskripe.skriperya.interfaces;

import com.darkskripe.skriperya.Skriperya;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public interface RegisterItem {
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(Skriperya.MOD_ID , name) ,item);
    }
}
