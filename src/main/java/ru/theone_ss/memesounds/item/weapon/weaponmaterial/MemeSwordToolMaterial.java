package ru.theone_ss.memesounds.item.weapon.weaponmaterial;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MemeSwordToolMaterial implements ToolMaterial {

    public static final MemeSwordToolMaterial INSTANCE = new MemeSwordToolMaterial();

    @Override
    public int getDurability() {
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 2;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
