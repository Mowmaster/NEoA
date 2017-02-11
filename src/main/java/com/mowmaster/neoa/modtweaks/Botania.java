package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import vazkii.botania.api.recipe.RecipeElvenTrade;
import vazkii.botania.api.recipe.RecipeManaInfusion;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;
import static vazkii.botania.api.BotaniaAPI.elvenTradeRecipes;
import static vazkii.botania.api.BotaniaAPI.manaInfusionRecipes;
import static vazkii.botania.api.BotaniaAPI.registerManaInfusionRecipe;

/**
 * Created by KingMowmaster on 2/10/2017.
 */
public class Botania
{
    public static void checkBotania()
    {
        String[] type= new String[] {"Helm","Chest","Legs","Boots"};
        for(int x = 0; x < type.length; x++) {
            removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("botania:manasteel" + type[x])));
        }

        Item BHelm = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelHelm"));
        Item BChest = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelChest"));
        Item BLegs = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelLegs"));
        Item BBoots = Item.REGISTRY.getObject(new ResourceLocation("botania:manasteelBoots"));


        //registerManaInfusionRecipe(new RecipeManaInfusion(new ItemStack(BHelm,1),Items.IRON_HELMET,15000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BHelm),new ItemStack(Items.IRON_HELMET),15000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BChest),new ItemStack(Items.IRON_CHESTPLATE),24000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BLegs),new ItemStack(Items.IRON_LEGGINGS),21000));
        manaInfusionRecipes.add(new RecipeManaInfusion(new ItemStack(BBoots),new ItemStack(Items.IRON_BOOTS),12000));
    }
}
