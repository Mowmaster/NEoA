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
            if(Loader.isModLoaded("immersiveengineering"))
            {
                Item IEHammer = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:tool"));
                Item Plate = Item.REGISTRY.getObject(new ResourceLocation("railcraft:plate"));

                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("railcraft:plate")));

                String[] metal= new String[] {"Iron","Steel","Tin","Copper","Lead","Silver"};
                for(int x = 0; x < metal.length; x++) {
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Plate, 1, x), new Object[]{"XY", 'X', "plate" + metal[x], 'Y', new ItemStack(IEHammer,1,0)}));
                }
            }
            String[] type= new String[] {"helmet","chestplate","leggings","boots"};
            for(int x = 0; x < type.length; x++) {
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("railcraft:armor_" + type[x] + "_steel")));
            }
        }
    }
}
