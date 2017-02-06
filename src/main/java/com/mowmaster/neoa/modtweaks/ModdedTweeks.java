package com.mowmaster.neoa.modtweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.omg.CORBA._IDLTypeStub;

/**
 * Created by KingMowmaster on 2/6/2017.
 */
public class ModdedTweeks
{
    public static void checkModdedTweeks()
    {
        if(Loader.isModLoaded("immersiveengineering")) {
            if(Loader.isModLoaded("backpack")) {
                if(Loader.isModLoaded("cavecraft")) {
                    Item BPStick = Item.REGISTRY.getObject(new ResourceLocation("backpack:stick"));
                    //0=stone   1=iron
                    Item IEStick = Item.REGISTRY.getObject(new ResourceLocation("immersiveengineering:material"));
                    //0=treated,  1=iron, 2=steel, 3=aluminum
                    Item TSONStick = Item.REGISTRY.getObject(new ResourceLocation("cavecraft:stickIron"));

                    GameRegistry.addShapelessRecipe(new ItemStack(BPStick,1,1), new ItemStack(TSONStick,1));
                    GameRegistry.addShapelessRecipe(new ItemStack(IEStick,1,1), new ItemStack(BPStick,1,1));
                    GameRegistry.addShapelessRecipe(new ItemStack(TSONStick,1), new ItemStack(IEStick,1,1));
                }
            }
        }



        if(Loader.isModLoaded("Quark"))
        {
            if(Loader.isModLoaded("earthworks"))
            {
                Item QThatch = Item.REGISTRY.getObject(new ResourceLocation("quark:thatch"));
                Item EThatch = Item.REGISTRY.getObject(new ResourceLocation("earthworks:block_thatch"));


                GameRegistry.addShapelessRecipe(new ItemStack(QThatch,1),new ItemStack(EThatch,1));
                GameRegistry.addShapelessRecipe(new ItemStack(EThatch,1),new ItemStack(QThatch,1));
            }
        }
    }
}
