package fourswords.blocks.ores.end;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class EnderOre extends Block {
	public EnderOre(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName("enderore");
		this.setCreativeTab(CTabs.swordTab);
		this.setHardness(8F);
		this.setResistance(8F);
		this.setStepSound(Block.soundMetalFootstep);
		this.setLightValue(0.5F);
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 4);
	}
	
	@Override
	public boolean canEntityDestroy(World world, int x, int y, int z,
			Entity entity) {
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "enderore");
	}
}