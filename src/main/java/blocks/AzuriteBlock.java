package fourswords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class AzuriteBlock extends Block {
	public AzuriteBlock(int id) {
		super(id, Material.glass);
		this.setUnlocalizedName("azuriteblock");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(6F);
		this.setResistance(10F);
		this.setStepSound(Block.soundGlassFootstep);
		this.setLightValue(1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "azuriteblock");
	}
}