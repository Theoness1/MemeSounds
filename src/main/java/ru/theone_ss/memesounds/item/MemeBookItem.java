package ru.theone_ss.memesounds.item;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import ru.theone_ss.memesounds.itemregistry.MemeItemsRegistry;

import java.util.Random;

public class MemeBookItem extends Item {

    public MemeBookItem(Settings settings) {
        super(settings);
    }

     void sendMessage(String memeText) {
        MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(Text.of(memeText));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {

        Random random = new Random();
        int i = random.nextInt(15);

        if(world.isClient) {
            // восклицательный знак !world - на сервере вызываю, без !, на стороне клиента

            player.getItemCooldownManager().set(this, 90);

            switch (i) {
                case 0 -> sendMessage("Trololo");
                case 1 -> sendMessage(Formatting.DARK_AQUA + "Forge Port");
                case 2 -> sendMessage("3000 часов на де_дасте? Чел харош. Но как насчёт сменить карту на де_зодорант?");
                case 3 -> sendMessage(Formatting.BLACK + "Dungeon Master");
                case 4 -> sendMessage("Подожди тут вообще песня!");
                case 5 -> sendMessage(Formatting.RED + "AMOGUS");
                case 6 -> sendMessage("SHEEEEEESH");
                case 7 -> sendMessage("Нюхай бебру");
                case 8 -> sendMessage("OK BOOMER");
                case 9 -> sendMessage(Formatting.GOLD + "CRINGE");
                case 10 -> sendMessage(Formatting.GREEN + "Toxic");
                case 11 -> sendMessage("Погнали в Аквадискотеку");
                case 12 -> sendMessage(Formatting.YELLOW + "Хорошая работа, ОЛЕГ!");
                case 13 -> sendMessage(Formatting.BLUE + "Хаги Ваги");
                case 14 -> sendMessage("Открыл новый танк в War Thunder? А как насчёт того, чтобы открыть тетрадь с ДЗ?");
            }

        }

        if(!world.isClient) {
            if(i == 5) {
                player.giveItemStack(new ItemStack(MemeItemsRegistry.FAKE_DIAMOND));
            }
        }

        return TypedActionResult.success(player.getStackInHand(hand));
    }







}
