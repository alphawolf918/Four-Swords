package fourswords.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class Aquamarine extends Item {
	public Aquamarine(int par1) {
		super(par1);
		this.setUnlocalizedName("aquamarine");
		this.setCreativeTab(CTabs.swordTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "aquamarine");
	}
}