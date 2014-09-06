package fourswords.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.blocks.Blocks;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class AzuritePickaxe extends ItemTool {
	public static final Block blocks[] = { Block.cobblestone,
			Block.stoneDoubleSlab,
			Block.stoneSingleSlab,
			Block.stone,
			Block.sandStone,
			Block.cobblestoneMossy,
			Block.oreIron,
			Block.blockIron,
			Block.oreCoal,
			Block.blockGold,
			Block.oreGold,
			Block.oreDiamond,
			Block.blockDiamond,
			Block.ice,
			Block.netherrack,
			Block.oreLapis,
			Block.blockLapis,
			Block.oreRedstone,
			Block.oreRedstoneGlowing,
			Block.rail,
			Block.railDetector,
			Block.railPowered,
			Block.railActivator,
			Block.bookShelf,
			Block.wood,
			Block.chest,
			Block.stoneDoubleSlab,
			Block.stoneSingleSlab,
			Block.pumpkin,
			Block.pumpkinLantern,
			Blocks.enderOre };
	
	public AzuritePickaxe(int id, EnumToolMaterial material) {
		super(id, 8F, material, blocks);
		setUnlocalizedName("azuritepickaxe");
		this.setCreativeTab(CTabs.swordTab);
		setMaxStackSize(1);
		MinecraftForge.setToolClass(this, "pickaxe", 4);
		this.setMaxDamage(800);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "azuritepickaxe");
	}
}