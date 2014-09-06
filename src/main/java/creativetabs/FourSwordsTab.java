package fourswords.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import fourswords.items.Items;

public class FourSwordsTab extends CreativeTabs {
	
	public FourSwordsTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Items.diabloSword.itemID;
	}
}