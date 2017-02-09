package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.mowmaster.neoa.recipes.RecipeRemover.removeCrafting;

/**
 * Created by KingMowmaster on 2/8/2017.
 */
public class RFTools {
    public static void checkRFTools() {
        if (Loader.isModLoaded("rftools")) {
            if (Loader.isModLoaded("ironchest")) {
                if (Loader.isModLoaded("advgenerators")) {
                    Item MachineFrame = Item.REGISTRY.getObject(new ResourceLocation("rftools:machine_frame"));
                    Item CoalGen = Item.REGISTRY.getObject(new ResourceLocation("rftools:coalgenerator"));
                    Item Builder = Item.REGISTRY.getObject(new ResourceLocation("rftools:builder"));
                    Item ModularStorage = Item.REGISTRY.getObject(new ResourceLocation("rftools:modular_storage"));
                    Item ICchest = Item.REGISTRY.getObject(new ResourceLocation("ironchest:BlockIronChest"));

                    Item Controler = Item.REGISTRY.getObject(new ResourceLocation("advgenerators:Controller"));
                    Item IronFrame = Item.REGISTRY.getObject(new ResourceLocation("advgenerators:IronFrame"));


                    removeCrafting(MachineFrame);
                    removeCrafting(CoalGen);
                    removeCrafting(Builder);
                    removeCrafting(ModularStorage);


                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MachineFrame, 1), new Object[]{"XYX", "YZY", "XYX", 'X', "rodSteel", 'Y', "plateSteel", 'Z', Controler}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoalGen, 1), new Object[]{"XYX", "ZAZ", "BBB", 'X', Blocks.REDSTONE_TORCH, 'Y', "dustRedstone", 'Z', "gearIron", 'A', Blocks.FURNACE, 'B', "blockCoal"}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Builder, 1), new Object[]{"XYX", "ZAZ", "XZX", 'X', "ingotEnderium", 'Y', "gearSteel", 'Z', IronFrame, 'A', MachineFrame}));
                    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModularStorage, 1), new Object[]{"XYX", "ZAZ", "XZX", 'X', Items.REDSTONE, 'Y', new ItemStack(ICchest, 1, 4), 'Z', Blocks.QUARTZ_BLOCK, 'A', MachineFrame}));
                }
            }
        }
    }
}
