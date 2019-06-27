package com.techlabs.srp_solution_test;

import com.techlabs.srp_voilation.Invoice;

public class InvoiceTest {
	
	public static void main(String args[])
	{
		Invoice invoice=new Invoice("001", "24-6-19", 10000 ,5, 18);
		invoice.calculateTax();
		invoice.calculateDiscountCost();
		invoice.calculateTotalCost();
		invoice.printInvoice(invoice);
	}

}
