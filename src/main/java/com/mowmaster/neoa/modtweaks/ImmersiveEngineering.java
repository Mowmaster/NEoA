package com.mowmaster.neoa.modtweaks;

import blusunrize.immersiveengineering.api.crafting.BottlingMachineRecipe;
import blusunrize.immersiveengineering.api.crafting.MixerRecipe;
import com.mowmaster.neoa.fluids.Fluids;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.mowmaster.neoa.items.ItemRegistry.*;
import static slimeknights.tconstruct.shared.TinkerFluids.*;


public class ImmersiveEngineering
{
    public static void checkIE()
    {
        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidCake.instance,2000),new FluidStack(milk,3000), new Object[]{new ItemStack(Items.WHEAT,3),new ItemStack(Items.SUGAR,2),new ItemStack(Items.EGG,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(bowl_of_cake_batter,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidCake.instance,1000));
        GameRegistry.addSmelting(new ItemStack(bowl_of_cake_batter),new ItemStack(Items.CAKE,1), 0.1F);

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidPie.instance,2000),new FluidStack(milk,1000), new Object[]{new ItemStack(Blocks.PUMPKIN,1),new ItemStack(Items.SUGAR,1),new ItemStack(Items.EGG,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(bowl_of_pumpkin_pie,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidPie.instance,1000));
        GameRegistry.addSmelting(new ItemStack(bowl_of_pumpkin_pie),new ItemStack(Items.PUMPKIN_PIE,1), 0.1F);

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidCookie.instance,2000),new FluidStack(milk,1000), new Object[]{new ItemStack(Items.WHEAT,2),new ItemStack(Items.DYE,1,3),new ItemStack(Items.SUGAR,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(bowl_of_cookie_dough,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidCookie.instance,1000));
        GameRegistry.addSmelting(new ItemStack(bowl_of_cookie_dough),new ItemStack(Items.COOKIE,8), 0.1F);

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidBread.instance,2000),new FluidStack(FluidRegistry.WATER,1000), new Object[]{new ItemStack(Items.WHEAT,3),new ItemStack(Items.SUGAR,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(bowl_of_bread_dough,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidBread.instance,1000));
        GameRegistry.addSmelting(new ItemStack(bowl_of_bread_dough),new ItemStack(Items.BREAD,3), 0.1F);

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidMSoup.instance,2000),new FluidStack(FluidRegistry.WATER,1000), new Object[]{new ItemStack(Blocks.BROWN_MUSHROOM,1),new ItemStack(Blocks.RED_MUSHROOM,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(Items.MUSHROOM_STEW,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidMSoup.instance,1000));

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidRSoup.instance,2000),new FluidStack(FluidRegistry.WATER,1000), new Object[]{new ItemStack(Items.COOKED_RABBIT,1),new ItemStack(Items.CARROT,1),new ItemStack(Items.BAKED_POTATO,1),new ItemStack(Blocks.BROWN_MUSHROOM,1)},3200);
        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidRSoup.instance,2000),new FluidStack(FluidRegistry.WATER,1000), new Object[]{new ItemStack(Items.COOKED_RABBIT,1),new ItemStack(Items.CARROT,1),new ItemStack(Items.BAKED_POTATO,1),new ItemStack(Blocks.RED_MUSHROOM,1)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(Items.RABBIT_STEW,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidRSoup.instance,1000));

        MixerRecipe.addRecipe(new FluidStack(Fluids.FluidBSoup.instance,2000),new FluidStack(FluidRegistry.WATER,1000), new Object[]{new ItemStack(Items.BEETROOT,6)},3200);
        BottlingMachineRecipe.addRecipe(new ItemStack(Items.BEETROOT_SOUP,1),new ItemStack(Items.BOWL),new FluidStack(Fluids.FluidBSoup.instance,1000));


        if(Loader.isModLoaded("EnderIO")) {
            //Bottle of Enchanting
            BottlingMachineRecipe.addRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 1), new ItemStack(Items.GLASS_BOTTLE), new FluidStack(FluidRegistry.getFluid("xpjuice"), 200));
        }

        //MixerRecipe.addRecipe(new FluidStack(fluidConcrete,500), new FluidStack(FluidRegistry.WATER,500),new Object[]{"sand","sand",Items.CLAY_BALL,"gravel"}, 3200);

        //BottlingMachineRecipe.addRecipe(new ItemStack(Blocks.SPONGE,1,1), new ItemStack(Blocks.SPONGE,1,0), new FluidStack(FluidRegistry.WATER,1000));

    }
}
