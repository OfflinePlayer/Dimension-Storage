package com.OfflinePlayer.DimensionStorage.blocks;


import com.OfflinePlayer.DimensionStorage.reference.reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockDS extends Block
{
    public BlockDS (Material material)
    {
        super(material);
    }

    public BlockDS()
    {
        this(Material.glass);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", reference.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
