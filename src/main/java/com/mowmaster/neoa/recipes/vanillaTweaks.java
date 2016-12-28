package com.mowmaster.neoa.recipes;

import com.mowmaster.neoa.Configs.config;




public class vanillaTweaks
{
  public static void vT()
  {
    if (config.FlintForDays)
    {
      // Craft Gravel into Flint
      GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"XX", 'X', new ItemStack(Blocks.GRAVEL)});
      GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"X","X", 'X', new ItemStack(Blocks.GRAVEL)});
    }
    
    if (config.LeatherForDays)
    {
      // Smelt Rotten Flesh into Leather
      GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH),new ItemStack(Items.Leather,1), 0.1F);
    }
    
  }
}
