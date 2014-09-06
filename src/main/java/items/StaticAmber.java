package fourswords.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class StaticAmber extends Item {
	
	String uname = "staticamber";
	
	public StaticAmber(int par1) {
		super(par1);
		this.setUnlocalizedName(uname);
		this.setCreativeTab(CTabs.swordTab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ uname);
	}
}