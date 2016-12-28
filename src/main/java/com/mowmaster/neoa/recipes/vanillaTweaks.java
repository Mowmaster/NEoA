package com.mowmaster.neoa.recipes;

import com.mowmaster.neoa.configabs.Config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class VanillaTweaks
{
  public static void vT()
  {
    if (Config.flintForDays)
    {
      // Craft Gravel into Flint
      GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"XX", 'X', new ItemStack(Blocks.GRAVEL)});
      GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"X","X", 'X', new ItemStack(Blocks.GRAVEL)});
    }
    
    if (Config.leatherForDays)
    {
      // Smelt Rotten Flesh into Leather
      GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH),new ItemStack(Items.LEATHER,1), 0.1F);
    }
    
  }
}
