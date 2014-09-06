package fourswords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class AmberBlock extends Block {
	public AmberBlock(int par1) {
		super(par1, Material.rock);
		this.setUnlocalizedName("amberblock");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(8F);
		this.setResistance(8F);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "amberblock");
	}
}