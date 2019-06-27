package com.techlabs.collections_app;

public class LineItem {
	
	private int id;
	private String productName;
	private double price;
	private int quantity;
	
	public LineItem(int id,String productName,double price,int quantity)
	{
		this.id=id;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double calculateItemCost()
	{
		double cost=quantity*price;
		return cost;
	}
	
}
