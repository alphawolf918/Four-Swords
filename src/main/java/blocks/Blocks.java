package fourswords.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fourswords.blocks.ores.AmberOre;
import fourswords.blocks.ores.AquamarineOre;
import fourswords.blocks.ores.GarnetOre;
import fourswords.blocks.ores.OpalOre;
import fourswords.blocks.ores.end.EnderOre;
import fourswords.blocks.ores.nether.AzuriteOre;
import fourswords.lib.Ids;

public class Blocks {
	
	public static final Block opalOre = new OpalOre(Ids.opalOre);
	public static final Block opalBlock = new OpalBlock(Ids.opalBlock);
	public static final Block amberOre = new AmberOre(Ids.amberOre);
	public static final Block amberBlock = new AmberBlock(Ids.amberBlock);
	public static final Block staticAmberBlock = new StaticAmberBlock(
			Ids.staticAmberBlock);
	public static final Block garnetOre = new GarnetOre(Ids.garnetOre);
	public static final Block fireGarnetBlock = new FireGarnetBlock(
			Ids.fireGarnetBlock);
	public static final Block garnetBlock = new GarnetBlock(Ids.garnetBlock);
	public static final Block aquaOre = new AquamarineOre(Ids.aquaOre);
	public static final Block aquaBlock = new AquamarineBlock(Ids.aquaBlock);
	public static final Block icyAquaBlock = new IcyAquaBlock(Ids.icyAquaBlock);
	public static final Block enderOre = new EnderOre(Ids.enderOre);
	public static final Block enderBlock = new EnderBlock(Ids.enderBlock);
	public static final Block enderOpalBlock = new EnderOpalBlock(
			Ids.enderOpalBlock);
	public static final Block azuriteOre = new AzuriteOre(Ids.azuriteOre);
	public static final Block azuriteBlock = new AzuriteBlock(Ids.azuriteBlock);
	
	public static void init() {
		addNames(opalOre, "Opal Ore");
		addNames(opalBlock, "Opal Block");
		addNames(amberOre, "Amber Ore");
		addNames(amberBlock, "Amber Block");
		addNames(staticAmberBlock, "Static Amber Block");
		addNames(garnetOre, "Garnet Ore");
		addNames(garnetBlock, "Garnet Block");
		addNames(fireGarnetBlock, "Fire Garnet Block");
		addNames(aquaOre, "Aquamarine Ore");
		addNames(aquaBlock, "Aquamarine Block");
		addNames(icyAquaBlock, "Icy Aqua Block");
		addNames(enderOre, "Ender Ore");
		addNames(enderBlock, "Ender Block");
		addNames(enderOpalBlock, "Ender Opal Block");
		addNames(azuriteOre, "Azurite Ore");
		addNames(azuriteBlock, "Azurite Block");
	}
	
	public static void addNames(Block par1Block, String par2Name) {
		GameRegistry.registerBlock(par1Block, par2Name);
		LanguageRegistry.addName(par1Block, par2Name);
	}
}