package com.OfflinePlayer.DimensionStorage.init;


import com.OfflinePlayer.DimensionStorage.blocks.BlockBlackHoleConstructer;
import com.OfflinePlayer.DimensionStorage.blocks.BlockDS;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockDS BlackHoleConstructer = new BlockBlackHoleConstructer();

    public static void init()
    {
        GameRegistry.registerBlock(BlackHoleConstructer, "BlackHoleConstructer");
    }

}
