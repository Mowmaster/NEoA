package com.mowmaster.neoa.items;

import net.minecraft.item.Item;

import static com.mowmaster.neoa.configabs.Tabs.NEOATABS;

/**
 * Created by KingMowmaster on 2/9/2017.
 */
public class Tool_Crusher extends Item {
    public Tool_Crusher(String unloc)
    {
        super();
        this.setUnlocalizedName(unloc);
        this.maxStackSize = 1;
        this.setCreativeTab(NEOATABS);
        this.bFull3D=true;
    }
}
