package com.comicsansg.stuff;
import com.comicsansg.stuff.registry.ItemsAndStuff;
import net.fabricmc.api.ModInitializer;

public class ComicsansgStuff implements ModInitializer {
    public static final String MOD_ID = "comicsansg-stuff";

    public void onInitialize() {
        ItemsAndStuff.registerItems();
    }
}
