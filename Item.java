package com.restaurant.system;

import java.math.BigDecimal;

public class Item {

	private String itemname;
	private BigDecimal price;
	private String typeOfItem;
	private String cuisine;
	private Item addOn;

	public Item(String itemname, BigDecimal price, String typeOfItem, String cuisine, Item addon) {
		this.itemname = itemname;
		this.price = price;
		this.typeOfItem = typeOfItem;
		this.cuisine = cuisine;
		this.addOn = addon;
	}

	public String getItemname() {
		return itemname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Item getAddOn() {
		return addOn;
	}

	public String getCuisine() {
		return cuisine;
	}

	public String getTypeOfItem() {
		return typeOfItem;
	}

}
