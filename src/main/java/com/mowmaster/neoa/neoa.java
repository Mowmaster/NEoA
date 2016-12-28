package com.mowmaster.neoa;

import com.mowmaster.neoa.proxies.CommonProxy;
import com.mowmaster.neoa.references.reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


    @Mod(modid = reference.modid, name = reference.modname, version = reference.version)
    public class neoa
    {
        @Mod.Instance(reference.modid)
        public static neoa instance;

        @SidedProxy(serverSide = reference.serverside, clientSide = reference.clientside)
        public static CommonProxy proxy;
        
        
        private static File configDir;
        public static File getConfigDir()
        {
            return configDir;
        }

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
            configDir = new File(event.getModConfigurationDirectory() + "/" + reference.modid);
            configDir.mkdirs();
            config.initCOnfig(new File(configDir.getPath(),reference.modid + ".cfg"));

        }
        @Mod.EventHandler
        public void init(FMLInitializationEvent event)
        {
            proxy.preInit();
            MinecraftForge.EVENT_BUS.register(this);
        }
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {
            vanillaTweaks.vT();
        }

    }
