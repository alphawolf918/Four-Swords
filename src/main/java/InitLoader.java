package fourswords;

import fourswords.blocks.Blocks;
import fourswords.creativetabs.CTabs;
import fourswords.items.Items;
import fourswords.lib.Recipes;
import fourswords.managers.Managers;
import fourswords.worldgen.treasure.Treasure;

public class InitLoader {
	public static void init() {
		Items.init();
		Blocks.init();
		Recipes.init();
		CTabs.init();
		Treasure.init();
		Managers.init();
	}
}