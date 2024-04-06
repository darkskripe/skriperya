package com.darkskripe.skriperya.items.customItems;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;



public class TikiTotem extends Item {
    public TikiTotem(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient) {
            PlayerEntity player = context.getPlayer();
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 2));
            player.sendMessage(Text.literal("Tobi pezda"), false);
            context.getStack().damage(1, context.getPlayer(),
                    playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        }
        return super.useOnBlock(context);
    }

    

}
