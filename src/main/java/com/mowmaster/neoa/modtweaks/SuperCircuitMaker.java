package com.mowmaster.neoa.modtweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by KingMowmaster on 2/8/2017.
 */
public class SuperCircuitMaker
{
    public static void checkSCM()
    {
        Item SCMRedstone = Item.REGISTRY.getObject(new ResourceLocation("rscircuits:resource"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SCMRedstone,45,0), new Object[]{"X X"," X ","X X", 'X', "dustRedstone"}));
    }
}
