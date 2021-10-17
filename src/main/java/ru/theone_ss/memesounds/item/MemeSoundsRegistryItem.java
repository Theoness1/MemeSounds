package ru.theone_ss.memesounds.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.theone_ss.memesounds.MemeSounds;
import ru.theone_ss.memesounds.soundregistry.MemeSoundsRegistry;

public class MemeSoundsRegistryItem {

    public static final Item AMOGUS_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.AMOGUS_SOUND_EVENT);
    public static final Item OUH_STEVE_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.OUH_SOUND_EVENT);
    public static final Item ALERT_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.ALERT_SOUND_EVENT);
    public static final Item BONK_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.BONK_SOUND_EVENT);
    public static final Item BOOM_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.BOOM_SOUND_EVENT);
    public static final Item BRUH_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.BRUH_SOUND_EVENT);
    public static final Item CREEPER_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.CREEPER_SOUND_EVENT);
    public static final Item CS_BOMB_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.CS_BOMB_SOUND_EVENT);
    public static final Item CS_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.CS_SOUND_EVENT);
    public static final Item FBI_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.FBI_SOUND_EVENT);
    public static final Item GNOME_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.GNOME_SOUND_EVENT);
    public static final Item HAMBURGER_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.HAMBURGER_SOUND_EVENT);
    public static final Item HEHE_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.HEHE_SOUND_EVENT);
    public static final Item HIT_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.HIT_SOUND_EVENT);
    public static final Item NIOCE_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.NIOCE_SOUND_EVENT);
    public static final Item NOPE_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.NOPE_SOUND_EVENT);
    public static final Item PING_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.PING_SOUND_EVENT);
    public static final Item ROBLOX_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.ROBLOX_SOUND_EVENT);
    public static final Item SKULL_TRUMPET_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.SKULL_TRUMPET_SOUND_EVENT);
    public static final Item STEAM_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.STEAM_SOUND_EVENT);
    public static final Item WINDOWS_ERROR_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.WINDOWS_ERROR_SOUND_EVENT);
    public static final Item WOO_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.WOO_SOUND_EVENT);
    public static final Item WOW_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.WOW_SOUND_EVENT);
    public static final Item ZOMBIE_ITEM = new MemeSoundsItem(new FabricItemSettings().group(MemeSounds.MEME_SOUNDS_GROUP), MemeSoundsRegistry.ZOMBIE_SOUND_EVENT);


    public static void reg_items() {

        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "amogus"), AMOGUS_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "ouh_steve"), OUH_STEVE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "alert"), ALERT_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "bomb"), CS_BOMB_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "bonk"), BONK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "bruh"), BRUH_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "creeper"), CREEPER_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "fbi"), FBI_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "gnome"), GNOME_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "hamburger"), HAMBURGER_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "hehe_boy"), HEHE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "hit"), HIT_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "nioce"), NIOCE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "nope"), NOPE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "okletsgo"), CS_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "oof"), ROBLOX_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "ping"), PING_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "skull_trumpet"), SKULL_TRUMPET_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "steam"), STEAM_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "vine_boom"), BOOM_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "windowsxperror"), WINDOWS_ERROR_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "woo"), WOO_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "wow"), WOW_ITEM);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "zombie"), ZOMBIE_ITEM);


    }
}
