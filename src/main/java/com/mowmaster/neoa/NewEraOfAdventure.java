package com.mowmaster.neoa;

import com.mowmaster.neoa.configabs.Config;
import com.mowmaster.neoa.items.ItemRegistry;
import com.mowmaster.neoa.modtweaks.TinkerersConstruct;
import com.mowmaster.neoa.modtweaks.VanillaMinecraft;
import com.mowmaster.neoa.proxies.CommonProxy;
import com.mowmaster.neoa.recipes.OreDictionary;
import com.mowmaster.neoa.recipes.RecipeRemover;
import com.mowmaster.neoa.recipes.VanillaTweaks;
import com.mowmaster.neoa.references.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;


@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class NewEraOfAdventure {
    @Mod.Instance(Reference.MODID)
    public static NewEraOfAdventure instance;

    @SidedProxy(serverSide = Reference.SERVER_SIDE, clientSide = Reference.CLIENT_SIDE)
    public static CommonProxy proxy;


    private static File configDir;

    public static File getConfigDir() {
        return configDir;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
        configDir.mkdirs();
        Config.InitConfig(new File(configDir.getPath(), Reference.MODID + ".cfg"));

        ItemRegistry.RegisterItems();
        OreDictionary.addEntries();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.PreInit();
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        RecipeRemover.removedCraftingItems();
        RecipeRemover.removedSmeltingItems();

        VanillaTweaks.vT();

        TinkerersConstruct.checkTinkerersConstruct();
        VanillaMinecraft.checkVanilla();
    }

}
