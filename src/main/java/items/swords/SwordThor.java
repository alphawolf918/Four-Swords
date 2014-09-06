package fourswords.items.swords;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fourswords.creativetabs.CTabs;
import fourswords.lib.ModInfo;

public class SwordThor extends Item
{
	private final float weaponDamage;
	private final EnumToolMaterial toolMaterial;
	
	public SwordThor(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setUnlocalizedName("thorsword");
		this.setCreativeTab(CTabs.swordTab);
		this.setMaxDamage(1000);
		this.weaponDamage = 11.0F + par2EnumToolMaterial.getDamageVsEntity();
	}
	
	public float func_82803_g()
	{
		return this.toolMaterial.getDamageVsEntity();
	}
	
	/**
	 * Returns the strength of the stack against a given block. 1.0F base,
	 * (Quality+1)*2 if correct blocktype, 1.5F if sword
	 */
	@Override
	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	{
		if (par2Block.blockID == Block.web.blockID)
		{
			return 20.0F;
		}
		else
		{
			Material material = par2Block.blockMaterial;
			return material != Material.plants && material != Material.vine
					&& material != Material.coral
					&& material != Material.leaves
					&& material != Material.pumpkin ? 1.0F : 1.5F;
		}
	}
	
	/**
	 * Current implementations of this method in child classes do not use the
	 * entry argument beside ev. They just raise the damage on the stack.
	 */
	@Override
	public boolean hitEntity(ItemStack par1ItemStack,
			EntityLivingBase par2EntityLivingBase,
			EntityLivingBase par3EntityLivingBase)
	{
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		return true;
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World,
			int par3, int par4, int par5, int par6,
			EntityLivingBase par7EntityLivingBase)
	{
		if (Block.blocksList[par3]
				.getBlockHardness(par2World, par4, par5, par6) != 0.0D)
		{
			par1ItemStack.damageItem(2, par7EntityLivingBase);
		}
		
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}
	
	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.block;
	}
	
	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer entityplayer) {
		
		float f = 2.0F;
		
		float f1 = entityplayer.prevRotationPitch
				+ (entityplayer.rotationPitch - entityplayer.prevRotationPitch)
				* f;
		
		float f2 = entityplayer.prevRotationYaw
				+ (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
		
		double d = entityplayer.prevPosX
				+ (entityplayer.posX - entityplayer.prevPosX) * f;
		
		double d1 = (entityplayer.prevPosY
				+ (entityplayer.posY - entityplayer.prevPosY) * f +
				
				1.6200000000000001D)
				- entityplayer.yOffset;
		
		double d2 = entityplayer.prevPosZ
				+ (entityplayer.posZ - entityplayer.prevPosZ) * f;
		Vec3 vec3d = null;
		vec3d = vec3d.createVectorHelper(d, d1, d2);
		
		float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
		
		float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
		
		float f5 = -MathHelper.cos(-f1 * 0.01745329F);
		
		float f6 = MathHelper.sin(-f1 * 0.01745329F);
		
		float f7 = f4 * f5;
		
		float f8 = f6;
		
		float f9 = f3 * f5;
		
		double d3 = 5000D;
		
		Vec3 vec3d1 = vec3d.addVector(f7 * d3, f8 * d3,
				f9 * d3);
		
		MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(
				vec3d, vec3d1, false, true);
		
		if (movingobjectposition == null)
		
		{
			
			return itemstack;
			
		}
		
		if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
		
		{
			
			int i = movingobjectposition.blockX;
			
			int j = movingobjectposition.blockY;
			
			int k = movingobjectposition.blockZ;
			
			for (int l = 0; l < 32; l += 4) {
				world.spawnEntityInWorld(new EntityLightningBolt(world,
						i, j, (k + l)));
			}
			if (!entityplayer.capabilities.isCreativeMode) {
				itemstack.damageItem(5, entityplayer);
			}
		}
		return itemstack;
	}
	
	/**
	 * Returns if the item (tool) can harvest results from the block type.
	 */
	@Override
	public boolean canHarvestBlock(Block par1Block)
	{
		return par1Block.blockID == Block.web.blockID;
	}
	
	/**
	 * Return the enchantability factor of the item, most of the time is based
	 * on material.
	 */
	@Override
	public int getItemEnchantability()
	{
		return this.toolMaterial.getEnchantability();
	}
	
	/**
	 * Return the name for this tool's material.
	 */
	public String getToolMaterialName()
	{
		return this.toolMaterial.toString();
	}
	
	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack)
	{
		return this.toolMaterial.getToolCraftingMaterial() == par2ItemStack.itemID ? true
				: super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	/**
	 * Gets a map of item attribute modifiers, used by ItemSword to increase hit
	 * damage.
	 */
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage
				.getAttributeUnlocalizedName(), new AttributeModifier(
				field_111210_e, "Weapon modifier", this.weaponDamage,
				0));
		return multimap;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "thorsword");
	}
}
