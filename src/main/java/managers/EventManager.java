package fourswords.managers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import fourswords.blocks.Blocks;
import fourswords.worldgen.WorldGenEndMinable;
import fourswords.worldgen.WorldGenNetherMinable;

public class EventManager implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		// Opal Ore
		this.addOreSpawn(Blocks.opalOre, world, random, x, z, 16, 16,
				2 + random.nextInt(3), 4, 12, 16);
		// Amber Ore
		this.addOreSpawn(Blocks.amberOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		// Garnet Ore
		this.addOreSpawn(Blocks.garnetOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		// Aquamarine Ore
		this.addOreSpawn(Blocks.aquaOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(80);
		int Zcoord = z + random.nextInt(16);
		// Ender Ore
		(new WorldGenEndMinable(Blocks.enderOre.blockID, 4, 25)).generate(
				world, random, Xcoord, Ycoord, Zcoord);
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = z + random.nextInt(16);
		// Azurite
		(new WorldGenNetherMinable(Blocks.azuriteOre.blockID, 4, 30)).generate(
				world, random, Xcoord, Ycoord, Zcoord);
	}
	
	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + (maxY - 1);
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block.blockID, maxVeinSize)).generate(world,
					random, posX, posY, posZ);
		}
	}
}