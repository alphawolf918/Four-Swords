package fourswords.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fourswords.blocks.Blocks;
import fourswords.items.Items;

public class Recipes {
	public static void init() {
		
		/*
		 * Blocks
		 */
		
		// Garnet Block
		GameRegistry.addRecipe(new ItemStack(Blocks.garnetBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.garnet
				});
		
		// Aquamarine Block
		GameRegistry.addRecipe(new ItemStack(Blocks.aquaBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.aquamarine
				});
		
		// Amber Block
		GameRegistry.addRecipe(new ItemStack(Blocks.amberBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.amber
				});
		
		// Ender Block
		GameRegistry.addRecipe(new ItemStack(Blocks.enderBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.enderIngot
				});
		
		// Opal Block
		GameRegistry.addRecipe(new ItemStack(Blocks.opalBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.opal
				});
		
		// Azurite Block
		GameRegistry.addRecipe(new ItemStack(Blocks.azuriteBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.azurite
				});
		
		// Fire Garnet Block
		GameRegistry.addRecipe(new ItemStack(Blocks.fireGarnetBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.fireGarnet
				});
		
		// Icy Aqua Block
		GameRegistry.addRecipe(new ItemStack(Blocks.icyAquaBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.icyAqua
				});
		
		// Static Amber Block
		GameRegistry.addRecipe(new ItemStack(Blocks.staticAmberBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.staticAmber
				});
		
		// Ender Opal Block
		GameRegistry.addRecipe(new ItemStack(Blocks.enderOpalBlock, 1),
				new Object[] {
						"GGG", "GGG", "GGG", 'G', Items.enderOpal
				});
		
		/*
		 * Items
		 */
		
		// Garnet (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.garnet, 9),
				new Object[] {
				Blocks.garnetBlock
				});
		
		// Aquamarine (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.aquamarine, 9),
				new Object[] {
				Blocks.aquaBlock
				});
		
		// Amber (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.amber, 9),
				new Object[] {
				Blocks.amberBlock
				});
		
		// Ender Ingot (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.enderIngot, 9),
				new Object[] {
				Blocks.enderBlock
				});
		
		// Opal (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.opal, 9),
				new Object[] {
				Blocks.opalBlock
				});
		
		// Azurite (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.azurite, 9),
				new Object[] {
				Blocks.azuriteBlock
				});
		
		// Fire Garnet (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.fireGarnet, 9),
				new Object[] {
				Blocks.fireGarnetBlock
				});
		
		// Icy Aqua (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.icyAqua, 9),
				new Object[] {
				Blocks.icyAquaBlock
				});
		
		// Static Amber (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.staticAmber, 9),
				new Object[] {
				Blocks.staticAmberBlock
				});
		
		// Ender Opal (from block)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.enderOpal, 9),
				new Object[] {
				Blocks.enderOpalBlock
				});
		
		// Fire Garnet
		GameRegistry.addRecipe(new ItemStack(Items.fireGarnet, 1),
				new Object[] {
						"BBB", "BGB", "BBB", 'B', Item.blazePowder, 'G',
						Blocks.garnetBlock
				});
		
		// Icy Aqua
		GameRegistry.addRecipe(new ItemStack(Items.icyAqua, 1),
				new Object[] {
						"BBB", "BGB", "BBB", 'B', Block.ice, 'G',
						Blocks.aquaBlock
				});
		
		// Static Amber
		GameRegistry.addRecipe(new ItemStack(Items.staticAmber, 1),
				new Object[] {
						"BBB", "BGB", "BBB", 'B', Blocks.azuriteBlock, 'G',
						Blocks.amberBlock
				});
		
		// Ender Opal
		GameRegistry.addRecipe(new ItemStack(Items.enderOpal, 1),
				new Object[] {
						"BBB", "BGB", "BBB", 'B', Blocks.opalBlock, 'G',
						Blocks.enderBlock
				});
		
		// Diablo Sword
		GameRegistry.addRecipe(new ItemStack(Items.diabloSword, 1),
				new Object[] {
						"FFF", " F ", " S ", 'F', Blocks.fireGarnetBlock, 'S',
						Item.stick
				});
		
		// Ender Sword
		GameRegistry.addRecipe(new ItemStack(Items.enderSword, 1),
				new Object[] {
						" F ", "FFF", " S ", 'F', Blocks.enderOpalBlock, 'S',
						Item.stick
				});
		
		// Thor Sword
		GameRegistry.addRecipe(new ItemStack(Items.thorSword, 1),
				new Object[] {
						" FF", "FF ", " S ", 'F', Blocks.staticAmberBlock, 'S',
						Item.stick
				});
		
		// Glacies Sword
		GameRegistry.addRecipe(new ItemStack(Items.glaciesSword, 1),
				new Object[] {
						" F ", " F ", "FSF", 'F', Blocks.icyAquaBlock, 'S',
						Item.stick
				});
		
		// Azurite Pickaxe
		GameRegistry.addRecipe(new ItemStack(Items.azuritePickaxe, 1),
				new Object[] {
						"AAA", "ASA", " S ", 'A', Blocks.azuriteBlock, 'S',
						Item.stick
				});
		
		SmeltingRecipes.init();
	}
	
	public static class SmeltingRecipes {
		public static void init() {
			// Ender Ingot
			GameRegistry.addSmelting(Blocks.enderOre.blockID, new ItemStack(
					Items.enderIngot, 1), 5F);
		}
	}
}