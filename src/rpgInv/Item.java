package rpgInv;

public class Item 
{

	String name;
	int damage;
	int cc;
	int cd;
	int defence;
	int missPer;
	int tag;
	/*
	 Weapon = 0
	 Shield = 1
	 Armor = 2
	*/
	int refChance;
	int refDamage;
	int index;
	boolean held;
	boolean picked;
	
	public Item(String name, int damage, int cc, int cd, int missPer)
	{
		this.name = name;
		this.damage = damage;
		this.cc = cc;
		this.cd = cd;
		tag = 0;
		picked = true;
		held = false;
		index = 0;
	}
	
	public Item(String name, int missPer, int refDamage, int refChance)
	{
		this.name = name;
		this.missPer = missPer;
		this.refChance = refChance;
		this.refDamage = refDamage;
		tag = 1;
		picked = true;
		held = false;
	}
	
	public Item(String name, int defence)
	{
		this.name = name;
		this.defence = defence;
		tag = 2;
		picked = true;
		held = false;
	}
	
}
