package fourswords.blocks.ores.nether;

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

public class AzuriteOre extends Block {
	public AzuriteOre(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName("azuriteore");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(13F);
		this.setResistance(10F);
		this.setStepSound(Block.soundStoneFootstep);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 3);
	}
	
	@Override
	public int idDropped(int i, Random random, int j) {
		return Items.azurite.itemID;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
			int meta) {
		this.dropXpOnBlockBreak(world, x, y, z, 10);
	}
	
	@Override
	public int quantityDropped(Random par1) {
		int rand = (int) (Math.floor(10) * Math.random());
		if (rand >= 5)
			return 2;
		else
			return 1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "azuriteore");
	}
}