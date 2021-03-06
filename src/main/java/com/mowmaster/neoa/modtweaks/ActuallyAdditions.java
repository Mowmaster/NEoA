package com.mowmaster.neoa.modtweaks;

//import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
//import de.ellpeck.actuallyadditions.api.recipe.LensConversionRecipe;
import de.ellpeck.actuallyadditions.api.recipe.CrusherRecipe;
import de.ellpeck.actuallyadditions.api.recipe.LensConversionRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;
import static com.mowmaster.neoa.recipes.RecipeRemover.removedCraftingItems;
import static de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI.*;
//import static de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI.*;


public class ActuallyAdditions
{

    public static void checkActuallyAdditons()
    {
        if(Loader.isModLoaded("actuallyadditions"))
        {

            String[] type= new String[] {"Helm","Chest","Pants","Boots","Sword","Axe","Pickaxe","Shovel","Hoe"};
            for(int x = 0; x < type.length; x++) {
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:item" + type[x] + "Obsidian")));
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



            Item AAHelm = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemHelmObsidian"));
            Item AAChest = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemChestObsidian"));
            Item AAPants = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemPantsObsidian"));
            Item AABoots = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemBootsObsidian"));

            Item AASword = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemSwordObsidian"));
            Item AAAxe = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemAxeObsidian"));
            Item AAPickaxe = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemPickaxeObsidian"));
            Item AAShovel = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemShovelObsidian"));
            Item AAHoe = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemHoeObsidian"));


            if (Loader.isModLoaded("EnderIO"))
            {
                Item EIORObsidian = Item.REGISTRY.getObject(new ResourceLocation("enderio:blockReinforcedObsidian"));


                GameRegistry.addShapedRecipe(new ItemStack(AAHelm,1), new Object[]{"XXX", "X X", 'X', new ItemStack(EIORObsidian)});
                GameRegistry.addShapedRecipe(new ItemStack(AAChest,1), new Object[]{"X X", "XXX", "XXX", 'X', new ItemStack(EIORObsidian)});
                GameRegistry.addShapedRecipe(new ItemStack(AAPants,1), new Object[]{"XXX", "X X", "X X", 'X', new ItemStack(EIORObsidian)});
                GameRegistry.addShapedRecipe(new ItemStack(AABoots,1), new Object[]{"X X", "X X", 'X', new ItemStack(EIORObsidian)});

                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AASword,1), new Object[]{" X ", " X "," Y ", 'X', new ItemStack(EIORObsidian), 'Y', "rodBronze"}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AAAxe,1), new Object[]{"XX ", "XY "," Y ", 'X', new ItemStack(EIORObsidian), 'Y', "rodBronze"}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AAPickaxe,1), new Object[]{"XXX", " Y "," Y ", 'X', new ItemStack(EIORObsidian), 'Y', "rodBronze"}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AAShovel,1), new Object[]{" X ", " Y "," Y ", 'X', new ItemStack(EIORObsidian), 'Y', "rodBronze"}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AAHoe,1), new Object[]{"XX ", " Y "," Y ", 'X', new ItemStack(EIORObsidian), 'Y', "rodBronze"}));
            }



            if (Loader.isModLoaded("betterwithmods"))
            {
                Item BWMDirt = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods:dirt_pile"));
                Item BWMSand = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods:sand_pile"));

                removeCrafting(BWMDirt);
                removeCrafting(BWMSand);


                CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(Blocks.DIRT),new ItemStack(BWMDirt,2),new ItemStack(BWMDirt,2),100));
                CRUSHER_RECIPES.add(new CrusherRecipe(new ItemStack(Blocks.SAND),new ItemStack(BWMSand,2),new ItemStack(BWMSand,2),100));


            }
            // SolidifiedExperience
            Item SolidXP = Item.REGISTRY.getObject(new ResourceLocation("actuallyadditions:itemSolidifiedExperience"));
            RECONSTRUCTOR_LENS_CONVERSION_RECIPES.add(new LensConversionRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE,1),new ItemStack(SolidXP,1),500,lensDefaultConversion));






        }
    }

}

