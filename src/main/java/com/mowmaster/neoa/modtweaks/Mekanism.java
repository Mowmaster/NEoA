package com.mowmaster.neoa.modtweaks;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

/**
 * Created by KingMowmaster on 2/14/2017.
 */
public class Mekanism
{
    public static void checkMekanism()
    {
        if(Loader.isModLoaded("MekanismTools"))
        {/*
            String[] metal= new String[] {"Steel","Glowstone","Bronze","Osmium","LapizLazuli"};
            for (int y = 0; y < metal.length; y++)
            {*/
                String[] type= new String[] {"Helmet","Chestplate","Leggings","Boots"};
                for(int x = 0; x < type.length; x++){
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanismtools:Steel" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanismtools:Glowstone" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanismtools:Bronze" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanismtools:Osmium" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanismtools:LapisLazuli" + type[x])));
                }
/*
                String[] type= new String[] {"Helmet","Chestplate","Leggings","Boots"};
                for(int x = 0; x < type.length; x++) {
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:" + metal[y] + type[x])));

                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:Steel" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:Glowstone" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:Bronze" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:Osmium" + type[x])));
                    removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("mekanism:LapisLazuli" + type[x])));
                }
                */

        }
    }
}
