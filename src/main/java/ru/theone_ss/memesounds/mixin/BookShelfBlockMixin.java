package ru.theone_ss.memesounds.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.theone_ss.memesounds.itemregistry.MemeItemsRegistry;

import java.util.Random;

@Mixin(Block.class)
public class BookShelfBlockMixin {

    @Inject(at = @At("HEAD"), method = "onBroken")

    private void onBroken(WorldAccess world, BlockPos pos, BlockState state, CallbackInfo ci) {

        if(state.isOf(Blocks.BOOKSHELF)) {

            Random random = new Random();
            int i = random.nextInt(40);

            if(i == 5) {

                Block.dropStack((World)world, pos, new ItemStack(MemeItemsRegistry.MEME_BOOK));
                // метод cast ответ -> почему (World)world

            }

        }
    }

}
