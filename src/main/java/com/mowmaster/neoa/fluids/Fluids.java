package com.mowmaster.neoa.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;




/**
 * Created by KingMowmaster on 3/18/2017.
 */
public class Fluids {

    public static Fluid fluidCake;
    public static Fluid fluidPie;
    public static Fluid fluidCookie;
    public static Fluid fluidBread;
    public static Fluid fluidMSoup;
    public static Fluid fluidRSoup;
    public static Fluid fluidBSoup;




    public static void regfluids()
    {
        fluidCake = new Fluid("cake", new ResourceLocation("dust:blocks/cake_still"), new ResourceLocation("dust:blocks/cake_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidCake);


        fluidPie = new Fluid("pie", new ResourceLocation("dust:blocks/pie_still"), new ResourceLocation("dust:blocks/pie_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidPie);


        fluidCookie = new Fluid("cookie", new ResourceLocation("dust:blocks/cookie_still"), new ResourceLocation("dust:blocks/cookie_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidCookie);


        fluidBread = new Fluid("bread", new ResourceLocation("dust:blocks/bread_still"), new ResourceLocation("dust:blocks/bread_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidBread);


        fluidMSoup = new Fluid("msoup", new ResourceLocation("dust:blocks/msoup_still"), new ResourceLocation("dust:blocks/msoup_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidMSoup);


        fluidRSoup = new Fluid("rsoup", new ResourceLocation("dust:blocks/rsoup_still"), new ResourceLocation("dust:blocks/rsoup_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidRSoup);


        fluidBSoup = new Fluid("bsoup", new ResourceLocation("dust:blocks/bsoup_still"), new ResourceLocation("dust:blocks/bsoup_flowing")).setDensity(2400).setViscosity(4000);
        FluidRegistry.registerFluid(fluidBSoup);


    }

}
