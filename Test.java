package com.restaurant.system;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/*
 * This main class tests the ordering system of the program.
 * There are different items added to the list.
 * Also, order total and no of items ordered is shown.
 * The system can be enhanced to use Scanner  to take input and by front end  to provide the selective option(Lunch or dinner) to user and take input from them 
 * and display lunch or drink item as chosen and take the order. 
 */
public class Test {

	public static void main(String[] args) {
		Item cake = new Item("cake", new BigDecimal(21.00), "dessert", "Maxican", null);
		Item bigos = new Item("bigos", new BigDecimal(20.00), "Lunch", "Polish", cake);
		Item ice = new Item("Ice", new BigDecimal(5.00), "addOn", null, null);
		Item lemon = new Item("Lemon", new BigDecimal(5.00), "addOn", null, null);
		Item potato = new Item("Potato", new BigDecimal(23.00), "Lunch", "Italian", null);
		Item drink1 = new Item("Mockato", new BigDecimal(24.00), "Drink", "Italian", ice);
		Item drink2 = new Item("jackd", new BigDecimal(40.00), "Drink", "Maxican", lemon);
		List<Item> orderItems = new ArrayList<Item>();
		/*
		 * list.add(cake); list.add(cheese);
		 */orderItems.add(potato);
		/*
		 * list.add(drink1); list.add(drink2);
		 */
		Order order = new Order();
		order.add(drink1, 2);
		order.add(drink2, 2);
		for (Entry<Item, Integer> entry : order.getItemsOfOrder().entrySet()) {
			Item item = (Item) entry.getKey();
			System.out.println("Item Name>" + item.getItemname());
			System.out.println("Item Price>" + item.getPrice());
			System.out.println("Item Quantity>" + entry.getValue());
			System.out.println("Addon>" + item.getAddOn().getItemname());
		}

		System.out.println("your order Total:");
		System.out.println(order.getTotal());
	}
}
