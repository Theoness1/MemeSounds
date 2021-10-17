package ru.theone_ss.memesounds;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ru.theone_ss.memesounds.item.MemeSoundsRegistryItem;
import ru.theone_ss.memesounds.soundregistry.MemeSoundsRegistry;

public class MemeSounds implements ModInitializer {

	public static final ItemGroup MEME_SOUNDS_GROUP = FabricItemGroupBuilder.create(
		new Identifier("memesounds","items"))
			.icon(() -> new ItemStack(MemeSoundsRegistryItem.AMOGUS_ITEM))
			.build();

	@Override
	public void onInitialize() {

		MemeSoundsRegistryItem.reg_items();

		MemeSoundsRegistry.reg_sounds();
	}
}
