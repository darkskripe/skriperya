package com.darkskripe.skriperya.items;

import com.darkskripe.skriperya.Skriperya;
import com.darkskripe.skriperya.interfaces.RegisterItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ModFood implements RegisterItem {

    public static final Item SHULKERS_FRUIT=RegisterItem.registerItem("shulkers_fruit",
            new Item(new FabricItemSettings().food(new FoodComponent.
                    Builder().
                    hunger(3).
                    saturationModifier(0.25f).
                    statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 147,2), 0.50f).
                    build()
            ))
    );



    public static void registerModFoodLog(){
        Skriperya.LOGGER.info("Registering mod food for skriperya");
    }
}
