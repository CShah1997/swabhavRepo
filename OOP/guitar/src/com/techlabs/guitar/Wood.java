package com.techlabs.guitar;

public enum Wood {
	
	INDIAN_ROSEWOOD, BRAZILIZN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLA, CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toString()
	{
		switch(this)
		{
			case INDIAN_ROSEWOOD:
				return "Indian Rosewood";
			case BRAZILIZN_ROSEWOOD:
				return "Brazilian Rosewood";
			case MAHOGANY:
				return "Mahogany";
			case MAPLE:
				return "Maple";
			case COCOBOLA:
				return "Cocobola";
			case CEDAR:
				return "Cedar";
			case ADIRONDACK:
				return "Adirondack";
			case ALDER:
				return "Alder";
			case SITKA:
				return "Sitka";
			default:
				return null;
		}
	}

}
