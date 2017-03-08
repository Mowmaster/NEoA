package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

public class Chisel
{
    public static void checkChisel()
    {
        if(Loader.isModLoaded("chisel"))
        {
            Item ClavaStone = Item.REGISTRY.getObject(new ResourceLocation("chisel:lavastone"));

            removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("chisel:lavastone")));
            GameRegistry.addShapedRecipe(new ItemStack(ClavaStone,4), new Object[]{"X X", " Y ","X X", 'X', new ItemStack(Blocks.STONE),'Y',new ItemStack(Items.LAVA_BUCKET)});
        }
    }
}
