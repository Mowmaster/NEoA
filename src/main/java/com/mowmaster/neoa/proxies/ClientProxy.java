package com.mowmaster.neoa.proxies;

import com.mowmaster.neoa.items.ItemRenderRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by KingMowmaster on 12/25/2016.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    @SideOnly(Side.CLIENT)

    public void PreInit()
    {
        ItemRenderRegistry.ItemRR();
    }



}
