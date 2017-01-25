package com.mowmaster.neoa.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by KingMowmaster on 1/25/2017.
 */
public class RecipeRemover
{
    public static void removeCrafting(Item item)
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        Iterator<IRecipe> removeCrafting = recipes.iterator();

        while (removeCrafting.hasNext())
        {
            ItemStack is = removeCrafting.next().getRecipeOutput();
            if (is != null && is.getItem() == item)
                removeCrafting.remove();
        }
    }

    public static void removedCraftingItems() {
    }



    public static void removeSmelting(Item item)
    {
        Map<ItemStack, ItemStack> smeltingList = FurnaceRecipes.instance().getSmeltingList();
        Iterator<ItemStack> smeltingOutputIter = smeltingList.values().iterator();
        while (smeltingOutputIter.hasNext())
        {
            ItemStack output = smeltingOutputIter.next();
            if (output.getItem() == item)
            {
                smeltingOutputIter.remove();
            }
        }
    }

    public static void removedSmeltingItems()
    {
        //removeSmelting(Items.IRON_INGOT);
    }

}
