package com.OfflinePlayer.DimensionStorage.init;


        import com.OfflinePlayer.DimensionStorage.Item.ItemDS;
        import com.OfflinePlayer.DimensionStorage.Item.ItemMeteoriteIngot;
        import com.OfflinePlayer.DimensionStorage.Item.ItemWirelessMatterCombiner;
        import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemDS WirelessMatterCombiner = new ItemWirelessMatterCombiner();
    public static final ItemDS MeteoriteIngot = new ItemMeteoriteIngot();


    public static void init()
    {
        //Registers Items
        GameRegistry.registerItem(WirelessMatterCombiner, "WirelessMatterCombiner");
        GameRegistry.registerItem(MeteoriteIngot,"MeteoriteIngot");


    }
}