package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

public class Substratum
{
    public static void checkSubstratum()
    {
        if (Loader.isModLoaded("substratum")) {
            Item SPlate = Item.REGISTRY.getObject(new ResourceLocation("substratum:plate"));
            Item SDust = Item.REGISTRY.getObject(new ResourceLocation("substratum:dust"));
            Item IEHammer = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:tool"));


            //Removed Recipies


            String[] metals= new String[] {"Bronze","Copper","Electrum","Enderium","Invar","Lumium","Signalum","Silver","Steel","Aluminium"};
            for(int x = 0; x < metals.length; x++) {
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:helmet" + metals[x])));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:chestplate" + metals[x])));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:leggings" + metals[x])));
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("substratum:boots" + metals[x])));
            }
                removeCrafting(SPlate);



            if(Loader.isModLoaded("immersiveengineering")) {
                //Added Recipies
                //GameRegistry.addShapedRecipe(new ItemStack(CFBCounter,1), new Object[]{"X","Y", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', new ItemStack(Blocks.CHEST)});
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CFBTable,1), new Object[]{"XXX","YZY", "YYY", 'X',new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15),'Y', "logWood",'Z', new ItemStack(CFBBook,1,2)}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 0), new Object[]{"XXY", 'X', "ingotIron", 'Y', new ItemStack(IEHammer,1,0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 1), new Object[]{"XY", 'X', "ingotGold", 'Y', new ItemStack(IEHammer, 1, 0)}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 2), new Object[]{"XXY", 'X', "ingotCopper", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 3), new Object[]{"XY", 'X', "ingotTin", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 4), new Object[]{"XY", 'X', "ingotBronze", 'Y', new ItemStack(IEHammer, 1, 0)}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 5), new Object[]{"XXY", 'X', "ingotElectrum", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 6), new Object[]{"XY", 'X', "ingotInvar", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 7), new Object[]{"XY", 'X', "ingotNickel", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 8), new Object[]{"XY", 'X', "ingotZinc", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 9), new Object[]{"XY", 'X', "ingotBrass", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 10), new Object[]{"XY", 'X', "ingotSilver", 'Y', new ItemStack(IEHammer, 1, 0)}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 11), new Object[]{"XXY", 'X', "ingotSteel", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 12), new Object[]{"XXY", 'X', "ingotLead", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 13), new Object[]{"XY", 'X', "ingotPlatinum", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 14), new Object[]{"XY", 'X', "ingotCupronickel", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 15), new Object[]{"XY", 'X', "ingotSignalum", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 16), new Object[]{"XY", 'X', "ingotLumium", 'Y', new ItemStack(IEHammer, 1, 0)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 17), new Object[]{"XY", 'X', "ingotEnderium", 'Y', new ItemStack(IEHammer, 1, 0)}));
                //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 18), new Object[]{"XXY", 'X', "ingotAluminium", 'Y', new ItemStack(tool_hammer.setContainerItem(tool_hammer))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SPlate, 1, 19), new Object[]{"XY", 'X', "ingotChromium", 'Y', new ItemStack(IEHammer, 1, 0)}));
            }
            }


            //Added Steel Dust
            //GameRegistry.addShapelessRecipe(new ItemStack(SDust, 1, 12), new ItemStack(SDust, 1, 1), new ItemStack(SDust, 1, 20), new ItemStack(SDust, 1, 20));
            //GameRegistry.addShapelessRecipe(new ItemStack(SDust, 1, 12), new ItemStack(SDust, 1, 1), new ItemStack(SDust, 1, 0));


        }
    }

