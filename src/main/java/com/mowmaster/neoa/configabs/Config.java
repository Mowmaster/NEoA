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
  public static boolean compactUncrafting;
  public static boolean craftableelytra;
  public static boolean blockcrusher;

  public static boolean VoidDrums;
  
  
  
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
    flintForDays = configFile.getBoolean("Flint for Days", category, true, "Should two gravel make flint?");
    leatherForDays = configFile.getBoolean("Leather for Days", category, true, "Can leather be smelted from flesh?");
    compactUncrafting = configFile.getBoolean("Uncrafting Vanilla Compact Blocks", category, true, "Can you uncraft vanilla compact blocks");
    craftableelytra = configFile.getBoolean("Craftable Elytra", category, false, "Can you craft elytras");


    category = "Modded Tweaks";
    configFile.addCustomCategoryComment(category, "May require other mods to work");
    blockcrusher = configFile.getBoolean("Handheld Block Crusher *Requires IE* ", category, true, "Can you craft other blocks into cobblestone with a handheld crusher?");


    category = "Extra Utilities 2";
    configFile.addCustomCategoryComment(category,"Extra Utils 2 Tweeks");
    VoidDrums = configFile.getBoolean("Void Drums",category,false,"Can you void liquids by crafting drums?");




    configFile.save();
    
  }
  
}
