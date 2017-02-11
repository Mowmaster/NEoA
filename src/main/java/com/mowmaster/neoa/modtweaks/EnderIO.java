package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;


public class EnderIO
{
    public static void checkEIO()
    {
        if(Loader.isModLoaded("EnderIO"))
        {
            //Item EIInvPan = Item.REGISTRY.getObject(new ResourceLocation("enderio:blockInventoryPanel"));
            //Item EITravStaf = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemTravelStaff"));
            //EIRemInv = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemRemoteInvAccess"));

            Item EISolarPanel = Item.REGISTRY.getObject(new ResourceLocation("enderio:blockSolarPanel"));
            Item EICapacitor = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemBasicCapacitor"));

            //GameRegistry.addShapedRecipe(new ItemStack(EIRemInv, 1), "  X", "XYX", "XZX", 'X', Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 'Y', EIInvPan, 'Z', EITravStaf);
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EISolarPanel,1,1), new Object[]{"XYX","ZYZ", "ABA", 'X',"ingotPulsatingIron",'Y', "enlightenedFusedQuartz", 'Z',"ingotVibrantAlloy", 'A', new ItemStack(EICapacitor,1,0), 'B', new ItemStack(EISolarPanel,1,0) }));



            if (Loader.isModLoaded("xreliquary")) {
                removeCrafting(Item.REGISTRY.getObject(new ResourceLocation("enderio:itemGliderWing")));

                Item EIGlider = Item.REGISTRY.getObject(new ResourceLocation("enderio:itemGliderWing"));
                Item XENORes = Item.REGISTRY.getObject(new ResourceLocation("xreliquary:mob_ingredient"));

                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EIGlider, 1, 0), new Object[]{"  X", " XY", "XYY", 'X', "ingotDarkSteel", 'Y', new ItemStack(XENORes,1,15)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EIGlider, 1, 1), new Object[]{" X ", "YXY", 'X', new ItemStack(Blocks.END_ROD), 'Y', new ItemStack(EIGlider,1,0)}));

            }
        }
    }
}
