package com.techlabs.srp_solution;

public class Invoice {

	public String number;
	public String date;
	public double cost;
	public float discount;
	public float gst;
	
	public Invoice(String number, String date, double cost, float discount, float gst) {
		super();
		this.number = number;
		this.date = date;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}
	
	public double calculateTax()
	{
		double tax=cost+(cost*gst/100);
		return tax;
	}
	
	public double calculateDiscountCost()
	{
		double discountCost=cost-(cost*discount/100);
		return discountCost;
	}
	
	public double calculateTotalCost()
	{
		double totalCost=calculateDiscountCost()+calculateTax();
		return totalCost;
	}
	
}
