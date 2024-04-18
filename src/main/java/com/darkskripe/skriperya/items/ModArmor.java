package com.darkskripe.skriperya.items;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.interfaces.RegisterItem;
import com.darkskripe.skriperya.items.materials.ModArmourMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class ModArmor implements RegisterItem {

    public static final Item WHITE_BUNNY_HAT=RegisterItem.registerItem("white_bunny_hat",
            new ArmorItem(ModArmourMaterial.BUNNY_MATERIAL, ArmorItem.Type.HELMET,new FabricItemSettings()));









    public static void registerModArmourLog(){
        Skriperya.LOGGER.info("Registering mod armour for skriperya");
    }
}
