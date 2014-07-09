package com.OfflinePlayer.DimensionStorage;

import com.OfflinePlayer.DimensionStorage.Handler.ConfigurationHandler;
import com.OfflinePlayer.DimensionStorage.init.ModBlocks;
import com.OfflinePlayer.DimensionStorage.init.ModItems;
import com.OfflinePlayer.DimensionStorage.reference.reference;
import com.OfflinePlayer.DimensionStorage.Proxy.IProxy;
import com.OfflinePlayer.DimensionStorage.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.Mod_ID,name = reference.Mod_name,version = reference.Mod_version,guiFactory = reference.GUI_FACTORY_CLASS)
public class DimensionStorage {
    @Mod.Instance
    public static DimensionStorage instance;

    @SidedProxy(clientSide = reference.Client_Proxy_Class,serverSide = reference.Server_Proxy_Class)
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.debug("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();

    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        LogHelper.warn("Initialization Complete!");

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.trace("Post Initialization Complete!");
    }
}
