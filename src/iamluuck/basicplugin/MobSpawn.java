package iamluuck.basicplugin;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MobSpawn {
	public void SpawnNormalZombie(Player p, int maxHealth)
	{
		Zombie z = p.getWorld().spawn(p.getLocation(), Zombie.class);
		z.setMaxHealth(maxHealth);
		z.setHealth(maxHealth);
	}
	
	public void SpawnAdvancedZombie(Player p, int maxHealth)
	{
		Zombie z = p.getWorld().spawn(p.getLocation(), Zombie.class);
		z.setMaxHealth(maxHealth);
		z.setHealth(maxHealth);
		z.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		z.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		z.getEquipment().setItemInHand(new ItemStack(Material.IRON_AXE));
	}
	
	public void SpawnEliteZombie(Player p, int maxHealth, String name)
	{
		Zombie z = p.getWorld().spawn(p.getLocation(), Zombie.class);
		z.setMaxHealth(maxHealth);
		z.setHealth(maxHealth);
		if (name == "")
		{
			z.setCustomName("Elite zombie");
		}
		else
		{
			z.setCustomName(name);
		}
		z.setCustomNameVisible(true);
		z.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 5000, 1));
		z.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5000, 1));
		z.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 5000, 1));
		z.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
		z.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
		z.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
		z.getEquipment().setItemInHand(new ItemStack(Material.DIAMOND_SWORD));
	}
	
	public void SpawnNormalSkeleton(Player p, int maxHealth)
	{
		Skeleton s = p.getWorld().spawn(p.getLocation(), Skeleton.class);
		s.setMaxHealth(maxHealth);
		s.setHealth(maxHealth);
	}
	
	public void SpawnAdvancedSkeleton(Player p, int maxHealth)
	{
		Skeleton s = p.getWorld().spawn(p.getLocation(), Skeleton.class);
		s.setMaxHealth(maxHealth);
		s.setHealth(maxHealth);
		s.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		s.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		s.getEquipment().setBoots(new ItemStack(Material.LEATHER_BOOTS));
		s.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
	}
	
	public void SpawnEliteSkeleton(Player p, int maxHealth, String name)
	{
		Skeleton s = p.getWorld().spawn(p.getLocation(), Skeleton.class);
		s.setMaxHealth(maxHealth);
		s.setHealth(maxHealth);
		if (name == "")
		{
			s.setCustomName("Elite skeleton");
		}
		else
		{
			s.setCustomName(name);
		}
		s.setCustomNameVisible(true);
		s.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE , 5000, 1));
		s.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 5000, 3));
		s.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 5000, 2));
		s.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
		s.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
		s.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
		s.getEquipment().setHelmet(new ItemStack(Material.SKULL_ITEM));
		ItemStack enBow = new ItemStack(Material.BOW);
		enBow.addEnchantment(Enchantment.ARROW_FIRE, 1);
		s.getEquipment().setItemInHand(enBow);
	}
	
	public void SpawnNormalCreeper(Player p, int maxHealth)
	{
		Creeper c = p.getWorld().spawn(p.getLocation(), Creeper.class);
		c.setMaxHealth(maxHealth);
		c.setHealth(maxHealth);
	}
	
	public void SpawnAdvancedCreeper(Player p, int maxHealth)
	{
		Creeper c = p.getWorld().spawn(p.getLocation(), Creeper.class);
		c.setMaxHealth(maxHealth);
		c.setHealth(maxHealth);
		c.setPowered(true);
		c.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY , 5000, 1));
		c.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
	}
	
}
