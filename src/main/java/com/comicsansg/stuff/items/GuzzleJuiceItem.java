package com.comicsansg.stuff.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class GuzzleJuiceItem extends Item {
    public GuzzleJuiceItem(Item.Settings settings) {
        super(settings);
    }
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
