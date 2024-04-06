package com.darkskripe.skriperya.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SHULKERS_FRUIT = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).
            statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,140,2),20).alwaysEdible().build();

}
