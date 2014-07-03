package com.OfflinePlayer.DimensionStorage;

import com.OfflinePlayer.DimensionStorage.reference.reference;
import com.OfflinePlayer.DimensionStorage.Proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import scala.tools.nsc.doc.model.Public;

@Mod(modid = reference.Mod_ID,name = reference.Mod_name,version = reference.Mod_version)
public class DimensionStorage {
    @Mod.Instance
    public static DimensionStorage instance;

    @SidedProxy(clientSide = "com.OfflinePlayer.DimensionStorage.Proxy.ClientProxy",serverSide = "com.OfflinePlayer.DimensionStorage.Proxy.ServerProxy")
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){



    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
