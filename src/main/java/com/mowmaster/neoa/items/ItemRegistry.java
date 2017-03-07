package com.mowmaster.neoa.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ItemRegistry
{
    public static Item glass_tinypile;
    public static Item glass_pile;
    public static Item tool_crusher;
    public static Item bowl_of_cake_batter;
    public static Item bowl_of_pumpkin_pie;
    public static Item bowl_of_cookie_dough;
    public static Item bowl_of_bread_dough;




    public static void RegisterItems()
    {
            GameRegistry.register(glass_tinypile = new BasicItem("glass_tinypile").setRegistryName("glass_tinypile"));
            GameRegistry.register(glass_pile = new BasicItem("glass_pile").setRegistryName("glass_pile"));
            GameRegistry.register(tool_crusher = new BasicItem("tool_crusher").setRegistryName("tool_crusher"));
            GameRegistry.register(bowl_of_cake_batter = new BasicItem("bowl_of_cake_batter").setRegistryName("bowl_of_cake_batter"));
            GameRegistry.register(bowl_of_pumpkin_pie = new BasicItem("bowl_of_pumpkin_pie").setRegistryName("bowl_of_pumpkin_pie"));
            GameRegistry.register(bowl_of_cookie_dough = new BasicItem("bowl_of_cookie_dough").setRegistryName("bowl_of_cookie_dough"));
            GameRegistry.register(bowl_of_bread_dough = new BasicItem("bowl_of_bread_dough").setRegistryName("bowl_of_bread_dough"));
    }



}
