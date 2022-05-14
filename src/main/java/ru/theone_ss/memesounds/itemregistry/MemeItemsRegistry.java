package ru.theone_ss.memesounds.itemregistry;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import ru.theone_ss.memesounds.MemeSounds;
import ru.theone_ss.memesounds.item.MemeBookItem;
import ru.theone_ss.memesounds.item.MemeItem;
import ru.theone_ss.memesounds.item.weapon.weaponmaterial.MemeSwordToolMaterial;

public class MemeItemsRegistry {


    public static final Item MEME_BOOK = new MemeBookItem(new Item.Settings().maxCount(1).group(MemeSounds.MEME_SOUNDS_GROUP).rarity(Rarity.EPIC));
    public static final Item FAKE_DIAMOND = new MemeItem(new Item.Settings().group(MemeSounds.MEME_SOUNDS_GROUP).rarity(Rarity.COMMON));
    public static final Item FAKE_DIAMOND_SWORD = new SwordItem(MemeSwordToolMaterial.INSTANCE, 11, -3.5F, new Item.Settings().group(MemeSounds.MEME_SOUNDS_GROUP));



    public static void reg_meme_items() {

        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "meme_book"), MEME_BOOK);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "fake_diamond"), FAKE_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier("memesoundsid", "fake_diamond_sword"), FAKE_DIAMOND_SWORD);



    }
}
