package ru.theone_ss.memesounds.loottableregistry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import ru.theone_ss.memesounds.itemregistry.MemeItemsRegistry;

public class MemeLootTableRegistry {

    private static final Identifier BOOK_SHELF_LOOT_TABLE_ID = Blocks.BOOKSHELF.getLootTableId();


    public static void reg_meme_loot_table() {

        LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, id, table, setter) -> {

            if(BOOK_SHELF_LOOT_TABLE_ID.equals(id)) {

                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(MemeItemsRegistry.MEME_BOOK));

                table.pool(poolBuilder);
            }

        }));

    }

}
