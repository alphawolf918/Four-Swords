package fourswords.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fourswords.items.swords.SwordDiablo;
import fourswords.items.swords.SwordEnder;
import fourswords.items.swords.SwordGlacies;
import fourswords.items.swords.SwordThor;
import fourswords.lib.Ids;

public class Items {
	
	public static final Item opal = new Opal(Ids.opal);
	public static final Item amber = new Amber(Ids.amber);
	public static final Item garnet = new Garnet(Ids.garnet);
	public static final Item aquamarine = new Aquamarine(Ids.aquamarine);
	public static final Item enderIngot = new EnderIngot(Ids.enderIngot);
	public static final Item azurite = new Azurite(Ids.azurite);
	public static final Item diabloSword = new SwordDiablo(Ids.diabloSword,
			EnumToolMaterial.EMERALD);
	public static final Item thorSword = new SwordThor(Ids.thorSword,
			EnumToolMaterial.EMERALD);
	public static final Item enderSword = new SwordEnder(Ids.enderSword,
			EnumToolMaterial.EMERALD);
	public static final Item glaciesSword = new SwordGlacies(Ids.glaciesSword,
			EnumToolMaterial.EMERALD);
	public static final Item fireGarnet = new FireGarnet(Ids.fireGarnet);
	public static final Item staticAmber = new StaticAmber(Ids.staticAmber);
	public static final Item icyAqua = new IcyAqua(Ids.icyAqua);
	public static final Item enderOpal = new EnderOpal(Ids.enderOpal);
	public static final Item azuritePickaxe = new AzuritePickaxe(
			Ids.azuritePickaxe, EnumToolMaterial.EMERALD);
	
	public static void init() {
		LanguageRegistry.addName(opal, "Opal");
		LanguageRegistry.addName(amber, "Amber");
		LanguageRegistry.addName(garnet, "Garnet");
		LanguageRegistry.addName(aquamarine, "Aquamarine");
		LanguageRegistry.addName(enderIngot, "Ender Ingot");
		LanguageRegistry.addName(azurite, "Azurite");
		LanguageRegistry.addName(diabloSword, "Diablo Sword");
		LanguageRegistry.addName(thorSword, "Thor Sword");
		LanguageRegistry.addName(enderSword, "Ender Sword");
		LanguageRegistry.addName(glaciesSword, "Glacies Sword");
		LanguageRegistry.addName(fireGarnet, "Fire Garnet");
		LanguageRegistry.addName(staticAmber, "Static Amber");
		LanguageRegistry.addName(enderOpal, "Ender Opal");
		LanguageRegistry.addName(icyAqua, "Icy Aqua");
		LanguageRegistry.addName(azuritePickaxe, "Azurite Pickaxe");
	}
}