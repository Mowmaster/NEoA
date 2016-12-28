package com.mowmaster.neoa.configabs;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import java.io.File;


public class Config 
{
  
  public static Configuration configFile;
  
  
  
  public static boolean RecyclableGlass;
  public static boolean FlintForDays;
  public static boolean LeatherForDays;
  
  
  
  public static void initCongif(File file)
  {
    configFile = new Configuration(file);
    syncConfig();
  }
  
  public static void syncConfig()
  {
    String category;
    
    catagory = "Vanilla Tweaks";
    configFile.addCustomCatagoryComment(catagory, "Added by NEoA");
    
    RecyclableGlass = configFile.getBoolean("Recyclable Glass", catagory, true, "Do you want to enable the crafting and smelting of glass dust?");
    FlintForDays = configFile.getBoolean("Flint for Days", catagory, true, "Should two gravel amke flint?");
    LeatherForDays = configFile.getBoolean("Leather for Days", catagory, true, "Can leather be smelted from flesh?");
    
  }
  
}
