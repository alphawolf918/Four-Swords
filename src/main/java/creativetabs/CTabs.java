package fourswords.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CTabs {
	
	public static CreativeTabs swordTab = new FourSwordsTab(
			CreativeTabs.getNextID(), "swordtab");
	
	public static void init() {
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup." + "swordtab", "en_US", "Four Swords");
	}
}