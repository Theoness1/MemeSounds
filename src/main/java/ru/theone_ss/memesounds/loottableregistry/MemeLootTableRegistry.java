package ru.theone_ss.memesounds.loottableregistry;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import ru.theone_ss.memesounds.itemregistry.MemeItemsRegistry;

public class MemeLootTableRegistry {

    private static final Identifier BOOK_SHELF_LOOT_TABLE_ID = Blocks.BOOKSHELF.getLootTableId();


    public static void reg_meme_loot_table() {

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if(BOOK_SHELF_LOOT_TABLE_ID.equals(id)) {

                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(MemeItemsRegistry.MEME_BOOK));

                tableBuilder.pool(pool);
            }

        });

    }

}
