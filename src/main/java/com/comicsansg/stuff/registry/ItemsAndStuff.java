package com.comicsansg.stuff.registry;

import com.comicsansg.stuff.items.GuzzleJuiceItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsAndStuff {
    public static final GuzzleJuiceItem guzzle_juice;
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("comicsansg-stuff", "guzzle_juice"), guzzle_juice);
    }
    static {
        guzzle_juice = new GuzzleJuiceItem((new Item.Settings()).group(ItemGroup.BREWING).maxCount(16).fireproof().food((new FoodComponent.Builder()).saturationModifier(2.0F).snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 230, 2), 1.0F).build()));
    }
}