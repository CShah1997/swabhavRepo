package com.techlabs.ocp_voilation;

public enum FestivalType {

	HOLI, NEW_YEAR, NORMAL;
	
	public String toString()
	{
		switch(this)
		{
			case HOLI:
				return "Holi";
			case NEW_YEAR:
				return "New Year";
			case NORMAL:
				return "Normal";
			default:
				return null;
		}
	}
	
}
