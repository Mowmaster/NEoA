package com.mowmaster.neoa.configabs;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import java.io.File;


public class Config 
{
  
  public static Configuration configFile;
  
  
  
  public static boolean recyclableGlass;
  public static boolean flintForDays;
  public static boolean leatherForDays;
  
  
  
  public static void InitConfig(File file)
  {
    configFile = new Configuration(file);
    SyncConfig();
  }
  
  public static void SyncConfig()
  {
    String category;
    
    category = "Vanilla Tweaks";
    configFile.addCustomCategoryComment(category, "Added by NEoA");
    
    recyclableGlass = configFile.getBoolean("Recyclable Glass", category, true, "Do you want to enable the crafting and smelting of glass dust?");
    flintForDays = configFile.getBoolean("Flint for Days", category, true, "Should two gravel amke flint?");
    leatherForDays = configFile.getBoolean("Leather for Days", category, true, "Can leather be smelted from flesh?");
    
  }
  
}
