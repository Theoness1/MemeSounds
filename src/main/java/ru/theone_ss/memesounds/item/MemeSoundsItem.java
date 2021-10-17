package ru.theone_ss.memesounds.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MemeSoundsItem extends Item {

    private final SoundEvent sound;

    public MemeSoundsItem(Settings settings, SoundEvent sound) {
        super(settings);
        this.sound = sound;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if(!world.isClient) {
            world.playSound(null, player.getBlockPos(), sound, SoundCategory.MASTER, 1f, 1f);
        }
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
