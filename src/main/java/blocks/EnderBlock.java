package fourswords.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class EnderBlock extends Block {
	public EnderBlock(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName("enderblock");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(8F);
		this.setResistance(8F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setLightValue(0.5F);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "enderblock");
	}
}