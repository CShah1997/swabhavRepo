package com.techlabs.srp_voilation;

public class Invoice {

	private String number;
	private String date;
	private double cost;
	private float discount;
	private float gst;
	
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
	
	public void printInvoice(Invoice invoice)
	{
		System.out.println("Number: "+number);
		System.out.println("Date: "+date);
		System.out.println("Tax(including GST): "+calculateTax());
		System.out.println("Discount of Rs. : "+calculateDiscountCost());
		System.out.println("Amount to be paid: "+calculateTotalCost());
	}
}
