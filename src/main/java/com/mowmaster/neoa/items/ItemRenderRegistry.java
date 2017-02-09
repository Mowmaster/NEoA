package com.mowmaster.neoa.items;

import com.mowmaster.neoa.configabs.Config;
import com.mowmaster.neoa.references.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by KingMowmaster on 1/24/2017.
 */
public class ItemRenderRegistry
{
    public static void ItemRR()
    {
        if (Config.recyclableGlass) {
            register(ItemRegistry.glass_tinypile);
            register(ItemRegistry.glass_pile);
        }
        register(ItemRegistry.tool_crusher);
    }
    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
