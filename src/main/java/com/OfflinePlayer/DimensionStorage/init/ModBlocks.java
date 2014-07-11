package com.OfflinePlayer.DimensionStorage.init;


import com.OfflinePlayer.DimensionStorage.blocks.BlockBHStabelizer;
import com.OfflinePlayer.DimensionStorage.blocks.BlockBlackHoleConstructer;
import com.OfflinePlayer.DimensionStorage.blocks.BlockDS;
import com.OfflinePlayer.DimensionStorage.blocks.BlockMeteoriteOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockDS BlackHoleConstructer = new BlockBlackHoleConstructer();
    public static final BlockDS MeteoriteOre = new BlockMeteoriteOre();
    public static final BlockDS B_H_Stabelizler = new BlockBHStabelizer();

    public static void init()
    {
        //Register Block
        GameRegistry.registerBlock(BlackHoleConstructer, "BlackHoleConstructer");
        GameRegistry.registerBlock(MeteoriteOre, "MeteoriteOre");
        GameRegistry.registerBlock(B_H_Stabelizler,"B.H.Stabelizer");



    }

}
