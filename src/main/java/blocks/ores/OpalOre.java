package fourswords.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.items.Items;
import fourswords.lib.ModInfo;

public class OpalOre extends Block {
	public OpalOre(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName("opalore");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(5F);
		this.setResistance(5F);
		this.setStepSound(Block.soundStoneFootstep);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 2);
	}
	
	@Override
	public int idDropped(int i, Random random, int j) {
		return Items.opal.itemID;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 8);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "opalore");
	}
}