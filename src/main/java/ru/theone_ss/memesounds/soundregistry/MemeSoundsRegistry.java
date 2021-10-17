package ru.theone_ss.memesounds.soundregistry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MemeSoundsRegistry {

    public static final Identifier AMOGUS_SOUND_ID = new Identifier("memesoundsid:amogus_sound");
    public static SoundEvent AMOGUS_SOUND_EVENT = new SoundEvent(AMOGUS_SOUND_ID);
    public static final Identifier OUH_SOUND_ID = new Identifier("memesoundsid:ouh_sound");
    public static SoundEvent OUH_SOUND_EVENT = new SoundEvent(OUH_SOUND_ID);
    public static final Identifier ALERT_SOUND_ID = new Identifier("memesoundsid:alert_sound");
    public static SoundEvent ALERT_SOUND_EVENT = new SoundEvent(ALERT_SOUND_ID);
    public static final Identifier BONK_SOUND_ID = new Identifier("memesoundsid:bonk_sound");
    public static SoundEvent BONK_SOUND_EVENT = new SoundEvent(BONK_SOUND_ID);
    public static final Identifier BOOM_SOUND_ID = new Identifier("memesoundsid:boom_sound");
    public static SoundEvent BOOM_SOUND_EVENT = new SoundEvent(BOOM_SOUND_ID);
    public static final Identifier BRUH_SOUND_ID = new Identifier("memesoundsid:bruh_sound");
    public static SoundEvent BRUH_SOUND_EVENT = new SoundEvent(BRUH_SOUND_ID);
    public static final Identifier CREEPER_SOUND_ID = new Identifier("memesoundsid:creeper_sound");
    public static SoundEvent CREEPER_SOUND_EVENT = new SoundEvent(CREEPER_SOUND_ID);
    public static final Identifier CS_BOMB_SOUND_ID = new Identifier("memesoundsid:cs_bomb_sound");
    public static SoundEvent CS_BOMB_SOUND_EVENT = new SoundEvent(CS_BOMB_SOUND_ID);
    public static final Identifier CS_SOUND_ID = new Identifier("memesoundsid:cs_sound");
    public static SoundEvent CS_SOUND_EVENT = new SoundEvent(CS_SOUND_ID);
    public static final Identifier FBI_SOUND_ID = new Identifier("memesoundsid:fbi_sound");
    public static SoundEvent FBI_SOUND_EVENT = new SoundEvent(FBI_SOUND_ID);
    public static final Identifier GNOME_SOUND_ID = new Identifier("memesoundsid:gnome_sound");
    public static SoundEvent GNOME_SOUND_EVENT = new SoundEvent(GNOME_SOUND_ID);
    public static final Identifier HAMBURGER_SOUND_ID = new Identifier("memesoundsid:hamburger_sound");
    public static SoundEvent HAMBURGER_SOUND_EVENT = new SoundEvent(HAMBURGER_SOUND_ID);
    public static final Identifier HEHE_SOUND_ID = new Identifier("memesoundsid:hehe_sound");
    public static SoundEvent HEHE_SOUND_EVENT = new SoundEvent(HEHE_SOUND_ID);
    public static final Identifier HIT_SOUND_ID = new Identifier("memesoundsid:hit_sound");
    public static SoundEvent HIT_SOUND_EVENT = new SoundEvent(HIT_SOUND_ID);
    public static final Identifier NIOCE_SOUND_ID = new Identifier("memesoundsid:nioce_sound");
    public static SoundEvent NIOCE_SOUND_EVENT = new SoundEvent(NIOCE_SOUND_ID);
    public static final Identifier NOPE_SOUND_ID = new Identifier("memesoundsid:nope_sound");
    public static SoundEvent NOPE_SOUND_EVENT = new SoundEvent(NOPE_SOUND_ID);
    public static final Identifier PING_SOUND_ID = new Identifier("memesoundsid:ping_sound");
    public static SoundEvent PING_SOUND_EVENT = new SoundEvent(PING_SOUND_ID);
    public static final Identifier ROBLOX_SOUND_ID = new Identifier("memesoundsid:roblox_sound");
    public static SoundEvent ROBLOX_SOUND_EVENT = new SoundEvent(ROBLOX_SOUND_ID);
    public static final Identifier SKULL_TRUMPET_SOUND_ID = new Identifier("memesoundsid:skull_trumpet_sound");
    public static SoundEvent SKULL_TRUMPET_SOUND_EVENT = new SoundEvent(SKULL_TRUMPET_SOUND_ID);
    public static final Identifier STEAM_SOUND_ID = new Identifier("memesoundsid:steam_sound");
    public static SoundEvent STEAM_SOUND_EVENT = new SoundEvent(STEAM_SOUND_ID);
    public static final Identifier WINDOWS_ERROR_SOUND_ID = new Identifier("memesoundsid:windows_error_sound");
    public static SoundEvent WINDOWS_ERROR_SOUND_EVENT = new SoundEvent(WINDOWS_ERROR_SOUND_ID);
    public static final Identifier WOW_SOUND_ID = new Identifier("memesoundsid:wow_sound");
    public static SoundEvent WOW_SOUND_EVENT = new SoundEvent(WOW_SOUND_ID);
    public static final Identifier WOO_SOUND_ID = new Identifier("memesoundsid:woo_sound");
    public static SoundEvent WOO_SOUND_EVENT = new SoundEvent(WOO_SOUND_ID);
    public static final Identifier ZOMBIE_SOUND_ID = new Identifier("memesoundsid:zombie_sound");
    public static SoundEvent ZOMBIE_SOUND_EVENT = new SoundEvent(ZOMBIE_SOUND_ID);



    public static void reg_sounds() {

        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.AMOGUS_SOUND_ID, AMOGUS_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.OUH_SOUND_ID, OUH_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.ALERT_SOUND_ID, ALERT_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.BONK_SOUND_ID, BONK_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.BOOM_SOUND_ID, BOOM_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.BRUH_SOUND_ID, BRUH_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.CREEPER_SOUND_ID, CREEPER_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.CS_BOMB_SOUND_ID, CS_BOMB_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.CS_SOUND_ID, CS_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.FBI_SOUND_ID, FBI_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.GNOME_SOUND_ID, GNOME_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.HAMBURGER_SOUND_ID, HAMBURGER_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.HEHE_SOUND_ID, HEHE_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.HIT_SOUND_ID, HIT_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.NIOCE_SOUND_ID, NIOCE_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.NOPE_SOUND_ID, NOPE_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.PING_SOUND_ID, PING_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.ROBLOX_SOUND_ID, ROBLOX_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.SKULL_TRUMPET_SOUND_ID, SKULL_TRUMPET_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.STEAM_SOUND_ID, STEAM_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.WINDOWS_ERROR_SOUND_ID, WINDOWS_ERROR_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.WOO_SOUND_ID, WOO_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.WOW_SOUND_ID, WOW_SOUND_EVENT);
        Registry.register(Registry.SOUND_EVENT, MemeSoundsRegistry.ZOMBIE_SOUND_ID, ZOMBIE_SOUND_EVENT);


    }


}
