package com.techlabs.dip_voilation;

public class TaxCalculator {

	private LogType log;

	public TaxCalculator(LogType log) {
		super();
		this.log = log;
	}

	public int calculateTax(int amount, int rate) {
		int r = 0;
		try {
			r = amount / rate;
		} catch (Exception e) {
			if (log == LogType.DB) {
				new DBLogger().log(e.getMessage());
			}
			if (log == LogType.FILE) {
				new FileLogger().log(e.getMessage());
			}
		}
		return r;
	}
}
