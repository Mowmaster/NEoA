package com.mowmaster.neoa.modtweaks;

import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
import de.ellpeck.actuallyadditions.api.recipe.LensConversionRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import static de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI.*;

/**
 * Created by KingMowmaster on 2/5/2017.
 */
public class ActuallyAdditions
{
    public static void checkActuallyAdditons()
    {
        if(Loader.isModLoaded("actuallyadditions"))
        {
            Item SubZinc = Item.REGISTRY.getObject(new ResourceLocation("substratum:ingot"));
            Item SubBlockZinc = Item.REGISTRY.getObject(new ResourceLocation("substratum:blockMetal1"));




            //Not the best way but it works
            for(ItemStack stack : OreDictionary.getOres("ingotLead")) {
                RECONSTRUCTOR_LENS_CONVERSION_RECIPES.add(new LensConversionRecipe(stack,new ItemStack(SubZinc,1,6),120,lensDefaultConversion));
            }
            for(ItemStack stack : OreDictionary.getOres("blockLead")) {
                RECONSTRUCTOR_LENS_CONVERSION_RECIPES.add(new LensConversionRecipe(stack,new ItemStack(SubBlockZinc,1,6),1200,lensDefaultConversion));
            }

            OIL_GENERATOR_RECIPES.put("seed.oil",40);
            OIL_GENERATOR_RECIPES.put("creosote",60);


            if(Loader.isModLoaded("Quark"))
            {
                if(Loader.isModLoaded("earthworks"))
                {
                    Item QThatch = Item.REGISTRY.getObject(new ResourceLocation("quark:thatch"));
                    Item EThatch = Item.REGISTRY.getObject(new ResourceLocation("earthworks:block_thatch"));
                    Item EReed = Item.REGISTRY.getObject(new ResourceLocation("earthworks:block_reed"));


                    CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(QThatch), new ItemStack(Items.WHEAT,4),new ItemStack(Items.WHEAT_SEEDS,1),1));
                    CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(EThatch), new ItemStack(Items.WHEAT,4),new ItemStack(Items.WHEAT_SEEDS,1),1));
                    CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(EReed), new ItemStack(Items.REEDS,4),new ItemStack(Items.SUGAR,1),1));
                }
            }

            if (Loader.isModLoaded("substratum"))
            {
                Item EPDUST = Item.REGISTRY.getObject(new ResourceLocation("substratum:dust"));
                Item EPSDUST = Item.REGISTRY.getObject(new ResourceLocation("substratum:dustSmall"));
                //meta = 16

                CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(Items.ENDER_PEARL),new ItemStack(EPDUST,1,16),new ItemStack(EPSDUST,1,16),10));
            }

        }
    }
}

