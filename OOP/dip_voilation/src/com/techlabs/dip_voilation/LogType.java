package com.techlabs.dip_voilation;

public enum LogType {
	
	FILE, DB;
	
	public String toString()
	{
		switch(this)
		{
			case FILE:
				return "FILE";
			case DB:
				return "DB";
			default:
				return null;
		}
	}

}
