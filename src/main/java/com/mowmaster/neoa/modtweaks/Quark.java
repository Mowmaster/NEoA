package com.mowmaster.neoa.modtweaks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Quark
{
    public static void checkQuark()
    {
        if(Loader.isModLoaded("Quark"))
        {
            Item QBeds = Item.REGISTRY.getObject(new ResourceLocation("quark:colored_bed_item"));
            Item QChest = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_chest"));
            Item QTCrest = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_chest_trap"));
            Item QFrame = Item.REGISTRY.getObject(new ResourceLocation("quark:colored_item_frame"));
            Item QShelf = Item.REGISTRY.getObject(new ResourceLocation("quark:custom_bookshelf"));


            //Quark Chests/BookShelves into their Vanilla counterparts

            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CHEST, 1), new ItemStack(QChest, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TRAPPED_CHEST, 1), new ItemStack(QTCrest, 1, OreDictionary.WILDCARD_VALUE));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BOOKSHELF, 1), new ItemStack(QShelf, 1, OreDictionary.WILDCARD_VALUE));


            // String of comments, the colors.length is so the loop only goes from starting = 0 and loops through all colors(length of the string)
            String[] color= new String[] {"dyeWhite","dyeOrange","dyeMagenta","dyeLightBlue","dyeYellow","dyeLime","dyePink","dyeGray","dyeLightGray","dyeCyan","dyePurple","dyeBlue","dyeBrown","dyeGreen","dyeBlack"};
            String[] colors= new String[] {"dyeWhite","dyeOrange","dyeMagenta","dyeLightBlue","dyeYellow","dyeLime","dyePink","dyeGray","dyeLightGray","dyeCyan","dyePurple","dyeBlue","dyeBrown","dyeGreen","dyeRed","dyeBlack"};

            for(int x = 0; x < color.length; x++) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, x), color[x], new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QBeds, 1, x), color[x], new ItemStack(Items.BED)));
            }

            for(int x = 0; x < colors.length; x++) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(QFrame, 1, x), colors[x], new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
            }
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.BED), "dyeRed", new ItemStack(QBeds, 1, OreDictionary.WILDCARD_VALUE)));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ITEM_FRAME), "listAllwater", new ItemStack(QFrame, 1, OreDictionary.WILDCARD_VALUE)));
            //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ITEM_FRAME), Items.POTIONITEM, new ItemStack(QFrame,1,meta))); //Potions wash Frames?!

        }
    }
}
