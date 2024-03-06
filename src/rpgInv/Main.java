package rpgInv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	static Scanner scanner = new Scanner(System.in);
	
	static Item sword1 = new Item("sword1",2,50,150,25);
	static Item sword2 = new Item("sword2",5,20,200,90);
	static Item shield1 = new Item("shield1",20,10,50);
	static Item shield2 = new Item("shield2",50,0,0);
	static Item armor1 = new Item("armor1",5);
	static Item armor2 = new Item("armor2",10);
	
	static int i = 0;
	
	static ArrayList<Item> items = new ArrayList<Item>();
	
	public static void main(String[] args) 
	{
		
		items.add(sword1);
		items.add(sword2);
		items.add(shield1);
		items.add(shield2);
		items.add(armor1);
		items.add(armor2);
		
		
		while(true)
		{
			int x = scanner.nextInt();
		
			if(x == 0) checkInv();
			else if(x == 1) pickup(items.get(rand(0,5)));
		}
	}
	
	public static void pickup(Item x)
	{
		
		x.picked = true;
		System.out.println("You picked up " + x.name);
		
	}
	
	public static void checkInv()
	{
		i = 0;
		
		int x;
		
		items.forEach((e) -> 
		{
			
			if(e.picked) 
			{
				i++;
				if(e.tag == 0 ) System.out.println("[Weapon] " + i + ". " + e.name);
				else if(e.tag == 1 ) System.out.println("[Shield] " + i + ". " + e.name);
				else System.out.println("[Armor] " + i + ". " + e.name);
				
				e.index = i;
			}
		});
		
		x = scanner.nextInt();
		if (x <= i && x >= 0)
		{
			hold(findIndex(x));
		}
	}
	
	public static void hold(Item item)
	{
			System.out.println(item);
		
			items.forEach((e) -> 
			{
				if(e.held && e.tag == item.tag) e.held = false;
			});
			item.held = true;
			System.out.println("You equiped " + item.name);
		
	}
	
	public static Item findIndex(int x)
	{
		for (int i = items.size()-1; i>=0; i--)
		{
			if(items.get(i).index == x) return items.get(i);
		}
		System.out.println("Fatal Error: Failed to Index!");
		System.exit(0);
		return null;
	}
	
	public static int rand(int min, int max)
	{
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	

}
