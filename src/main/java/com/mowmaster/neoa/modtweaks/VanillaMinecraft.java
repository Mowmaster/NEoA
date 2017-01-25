package com.mowmaster.neoa.modtweaks;

import com.mowmaster.neoa.configabs.Config;
import net.minecraft.init.Items;
import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

public class VanillaMinecraft
{
    public static void checkVanilla()
    {
        //Removed Metal Armor

        //Iron
        removeCrafting(Items.IRON_HELMET);
        removeCrafting(Items.IRON_CHESTPLATE);
        removeCrafting(Items.IRON_LEGGINGS);
        removeCrafting(Items.IRON_BOOTS);

        //Gold
        removeCrafting(Items.GOLDEN_HELMET);
        removeCrafting(Items.GOLDEN_CHESTPLATE);
        removeCrafting(Items.GOLDEN_LEGGINGS);
        removeCrafting(Items.GOLDEN_BOOTS);

        if (Config.flintForDays)
        {
            //Remove other flint recipes
            removeCrafting(Items.FLINT);
        }
    }
}
