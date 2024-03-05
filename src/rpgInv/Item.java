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
	boolean held;
	boolean picked;
	
	public Item(String name, int damage, int cc, int cd, int defence, int missPer, int tag) 
	{
		this.name = name;
		this.damage = damage;
		this.cc = cc;
		this.cd = cd; 
		this.defence = defence;
		this.missPer = missPer;
		this.tag = tag;
		this.picked = false;
		this.held = false;
	}

	
}
