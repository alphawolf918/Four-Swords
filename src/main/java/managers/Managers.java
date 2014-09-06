package fourswords.managers;

import cpw.mods.fml.common.registry.GameRegistry;

public class Managers {
	
	public static EventManager em = new EventManager();
	
	public static void init() {
		GameRegistry.registerWorldGenerator(em);
	}
}