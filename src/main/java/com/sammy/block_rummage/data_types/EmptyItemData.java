package com.sammy.block_rummage.data_types;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.checkerframework.checker.nullness.qual.NonNull;

public class EmptyItemData extends HeldData {

    public EmptyItemData() {
    }

    @Override
    public boolean matches(Player player, InteractionHand hand, ItemStack heldItem) {
        return player.getItemInHand(hand).isEmpty();
    }

    @Override
    public @NonNull Ingredient getIngredient() {
        return Ingredient.EMPTY;
    }
}