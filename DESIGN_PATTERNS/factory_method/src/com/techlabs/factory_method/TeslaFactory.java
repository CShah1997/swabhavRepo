package com.techlabs.factory_method;

public class TeslaFactory implements IAutoFactory{

	private static TeslaFactory container;
	
	@Override
	public IAutoable make() {
		return new Tesla();
	}
	
	public static TeslaFactory getInstance()
	{
		if(container==null)
		{
			container=new TeslaFactory();
		}
		return container;
	}
	

}
