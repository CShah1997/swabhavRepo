package com.techlabs.srp_solution;

public class InvoicePrinter {
	
	public void printInvoice(Invoice invoicePrint)
	{

		System.out.println("Number: "+invoicePrint.number);
		System.out.println("Date: "+invoicePrint.date);
		System.out.println("Tax(including GST): "+invoicePrint.calculateTax());
		System.out.println("Discount of Rs. : "+invoicePrint.calculateDiscountCost());
		System.out.println("Amount to be paid: "+invoicePrint.calculateTotalCost());
	}

}
