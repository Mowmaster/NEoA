package com.mowmaster.neoa.items;

import net.minecraft.item.Item;

import static com.mowmaster.neoa.configabs.Tabs.NEOATABS;

public class BasicItem extends Item
{
    public BasicItem(String unloc)
    {
        super();
        this.setUnlocalizedName(unloc);
        this.maxStackSize = 64;
        this.setCreativeTab(NEOATABS);
    }
}
