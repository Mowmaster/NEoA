package com.mowmaster.neoa.modtweaks;

import com.mowmaster.neoa.configabs.Config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.neoa.items.ItemRegistry.glass_pile;
import static com.mowmaster.neoa.items.ItemRegistry.glass_tinypile;
import static com.mowmaster.neoa.items.ItemRegistry.tool_crusher;
import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

public class VanillaMinecraft
{
    public static void checkVanilla()
    {
        if (Config.flintForDays)
        {
            //Remove other flint recipes
            removeCrafting(Items.FLINT);
        }

        if (Config.flintForDays)
        {
            // Craft 2 Gravel into 1 Flint
            GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"XX", 'X', new ItemStack(Blocks.GRAVEL)});
            GameRegistry.addShapedRecipe(new ItemStack(Items.FLINT,1), new Object[]{"X","X", 'X', new ItemStack(Blocks.GRAVEL)});
        }

        if (Config.leatherForDays)
        {
            // Smelt 1 Rotten Flesh into 1 Leather
            GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH),new ItemStack(Items.LEATHER,1), 0.1F);
        }

        if (Config.compactUncrafting)
        {
            //Uncraft Nether wart Blocks and Magma Blocks
            GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_WART,9), new ItemStack(Blocks.NETHER_WART_BLOCK));
            GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM,4), new ItemStack(Blocks.MAGMA));
        }

        if (Config.craftableelytra)
        {
            // Craft the ELytra, requires Leather, L.Chest, Nether Star
            GameRegistry.addShapedRecipe(new ItemStack(Items.ELYTRA,1), new Object[]{"X X","XYX", "XZX", 'X', new ItemStack(Items.LEATHER), 'Y', new ItemStack(Items.LEATHER_CHESTPLATE), 'Z', new ItemStack(Items.NETHER_STAR)});
        }

        if (Config.recyclableGlass)
        {
            //Bottles into glass piles and panes into tiny piles, smelt piles into glass
            GameRegistry.addShapelessRecipe(new ItemStack(glass_tinypile, 1), new ItemStack(Blocks.GLASS_PANE, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(glass_pile, 1), new ItemStack(Items.GLASS_BOTTLE, 1));
            GameRegistry.addShapedRecipe(new ItemStack(glass_pile, 1), new Object[]{"XX", "XX", 'X', new ItemStack(glass_tinypile, 1)});
            GameRegistry.addSmelting(new ItemStack(glass_pile), new ItemStack(Blocks.GLASS, 1), 0.1F);
        }
        if (Config.blockcrusher) {
            if (Loader.isModLoaded("immersiveengineering")) {
                Item IEmachinepart = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:metalDecoration0"));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool_crusher, 1), new Object[]{"XXX", "YZY", "AAA", 'X', "gearSteel", 'Y', new ItemStack(IEmachinepart, 1, 5), 'Z', "cobblestone", 'A', "blockSteel"}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[]{"XY", 'X', "stoneGranite", 'Y', new ItemStack(tool_crusher.setContainerItem(tool_crusher))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[]{"XY", 'X', "stoneDiorite", 'Y', new ItemStack(tool_crusher.setContainerItem(tool_crusher))}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.COBBLESTONE), new Object[]{"XY", 'X', "stoneAndesite", 'Y', new ItemStack(tool_crusher.setContainerItem(tool_crusher))}));
            }
        }

        //Removed Metal Armor

        //Iron
        removeCrafting(Items.IRON_HELMET);
        removeCrafting(Items.IRON_CHESTPLATE);
        removeCrafting(Items.IRON_LEGGINGS);
        removeCrafting(Items.IRON_BOOTS);

        //Gold
        removeCrafting(Items.GOLDEN_HELMET);
        removeCrafting(Items.GOLDEN_CHESTPLATE);
        removeCrafting(Items.GOLDEN_LEGGINGS);
        removeCrafting(Items.GOLDEN_BOOTS);




        //if (Config.)
        //{}

    }
}
