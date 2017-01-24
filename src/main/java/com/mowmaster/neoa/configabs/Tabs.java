package com.mowmaster.neoa.configabs;

import net.minecraft.block.BlockSkull;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.mowmaster.neoa.items.ItemRegistry.glass_pile;

/**
 * Created by KingMowmaster on 12/27/2016.
 */
public class Tabs
{
    public static final CreativeTabs NEOATABS = new CreativeTabs("neoatabs") {
        @Override
        public Item getTabIconItem()
        {

            return glass_pile;
        }
    };
}
