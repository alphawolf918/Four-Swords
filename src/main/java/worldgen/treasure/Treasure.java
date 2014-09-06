package fourswords.worldgen.treasure;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import fourswords.items.Items;

public class Treasure {
	private static ArrayList<String> chestTypes = new ArrayList<String>();
	private static ArrayList<WeightedRandomChestContent> items = new ArrayList<WeightedRandomChestContent>();
	
	private static WeightedRandomChestContent item1 = new WeightedRandomChestContent(
			new ItemStack(Items.opal, 1), 1, 10, 5);
	private static WeightedRandomChestContent item2 = new WeightedRandomChestContent(
			new ItemStack(Items.garnet, 1), 1, 10, 5);
	private static WeightedRandomChestContent item3 = new WeightedRandomChestContent(
			new ItemStack(Items.aquamarine, 1), 10, 10, 5);
	private static WeightedRandomChestContent item8 = new WeightedRandomChestContent(
			new ItemStack(Items.azurite, 1), 1, 10, 2);
	
	static {
		addChestTypes();
	}
	
	public static void init() {
		addItems();
	}
	
	private static void addItems() {
		addChestItem(item1);
		addChestItem(item2);
		addChestItem(item3);
		addChestItem(item8);
	}
	
	private static void addChestItem(WeightedRandomChestContent item) {
		int i;
		for (i = 0; i < chestTypes.size(); i++) {
			ChestGenHooks.addItem(chestTypes.get(i), item);
		}
	}
	
	private static void addChestTypes() {
		chestTypes.add(ChestGenHooks.DUNGEON_CHEST);
		chestTypes.add(ChestGenHooks.MINESHAFT_CORRIDOR);
		chestTypes.add(ChestGenHooks.PYRAMID_DESERT_CHEST);
		chestTypes.add(ChestGenHooks.PYRAMID_JUNGLE_CHEST);
		chestTypes.add(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER);
		chestTypes.add(ChestGenHooks.STRONGHOLD_CORRIDOR);
		chestTypes.add(ChestGenHooks.STRONGHOLD_CROSSING);
		chestTypes.add(ChestGenHooks.STRONGHOLD_LIBRARY);
		chestTypes.add(ChestGenHooks.VILLAGE_BLACKSMITH);
	}
}