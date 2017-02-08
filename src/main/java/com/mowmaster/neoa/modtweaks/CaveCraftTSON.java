package com.mowmaster.neoa.modtweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

/**
 * Created by KingMowmaster on 2/6/2017.
 */
public class CaveCraftTSON
{
    public static void checkTSON()
    {
        if(Loader.isModLoaded("cavecraft"))
        {

            Item TSONStick = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:stickIron"));
            Item TSONCatalyst = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:woodCatalystb"));


            removeCrafting(TSONStick);
            removeCrafting(TSONCatalyst);

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TSONCatalyst, 1), new Object[]{"XX","XX", 'X', "barkWood"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TSONStick, 6), new Object[]{"  X"," X ","X  ", 'X', "ingotIron"}));

        }
    }
}
