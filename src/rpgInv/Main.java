package rpgInv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	static Scanner scanner = new Scanner(System.in);
	
	static Item sword1 = new Item("sword1",5,2,10,0,5,6);
	static Item sword2 = new Item("sword2",10,2,0,0,26,2); 
	
	static ArrayList<Item> items = new ArrayList<Item>();
	
	public static void main(String[] args) 
	{
		
		items.add(sword1);
		items.add(sword2);
		
		checkInv();
		
		pickup(sword1);
		
		checkInv();
		
	}
	
	public static void pickup(Item x)
	{
		
		x.picked = true;
		System.out.println("You picked up " + x.name);
		
	}
	
	public static void checkInv()
	{
		items.forEach((i) -> 
		{
			if(i.picked) System.out.println(i.name);
		});
	}

}
