package com.mowmaster.neoa.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemRegistry
{
    public static Item glass_tinypile;
    public static Item glass_pile;
    public static Item tool_crusher;




    public static void RegisterItems()
    {
            GameRegistry.register(glass_tinypile = new BasicItem("glass_tinypile").setRegistryName("glass_tinypile"));
            GameRegistry.register(glass_pile = new BasicItem("glass_pile").setRegistryName("glass_pile"));
            GameRegistry.register(tool_crusher = new BasicItem("tool_crusher").setRegistryName("tool_crusher"));
    }



}
