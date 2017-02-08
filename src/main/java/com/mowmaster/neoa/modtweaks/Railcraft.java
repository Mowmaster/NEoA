package com.mowmaster.neoa.modtweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

/**
 * Created by KingMowmaster on 2/7/2017.
 */
public class Railcraft
{
    public static void checkRailcraft()
    {
        if(Loader.isModLoaded("railcraft"))
        {
            //if(Loader.isModLoaded("immersiveengineering"))
            //{
                Item IEHammer = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:tool"));
                Item Plate = Item.REGISTRY.getObject(new ResourceLocation("railcraft:plate"));
            /*
            0=iron
            1=steel
            2=tin
            3=copper
            4=lead
            5=silver
            */

                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("railcraft:plate")));

                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 0), new Object[]{"XY", 'X', "plateIron", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 1), new Object[]{"XY", 'X', "plateSteel", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 2), new Object[]{"XY", 'X', "plateTin", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 3), new Object[]{"XY", 'X', "plateCopper", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 4), new Object[]{"XY", 'X', "plateLead", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, 5), new Object[]{"XY", 'X', "plateSilver", 'Y', new ItemStack(IEHammer,1,0)}));

            //}
        }
    }
}
