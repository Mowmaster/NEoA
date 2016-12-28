package com.mowmaster.neoa;

import com.mowmaster.neoa.configabs.Config;
import com.mowmaster.neoa.proxies.CommonProxy;
import com.mowmaster.neoa.recipes.VanillaTweakss;
import com.mowmaster.neoa.references.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;


@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
    public class NewEraOfAdventure
    {
        @Mod.Instance(References.MODID)
        public static NewEraOfAdventure instance;

        @SidedProxy(serverSide = References.SERVER_SIDE, clientSide = References.CLIENT_SIDE)
        public static CommonProxy proxy;
        
        
        private static File configDir;
        public static File getConfigDir()
        {
            return configDir;
        }

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
            configDir = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
            configDir.mkdirs();
            Config.InitConfig(new File(configDir.getPath(), References.MODID + ".cfg"));

        }
        @Mod.EventHandler
        public void init(FMLInitializationEvent event)
        {
            proxy.PreInit();
            MinecraftForge.EVENT_BUS.register(this);
        }
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {
            VanillaTweakss.vT();
        }

    }
