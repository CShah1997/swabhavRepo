package com.techlabs.factory_method;

public class AudiFactory implements IAutoFactory{
	
	private static AudiFactory container;

	@Override
	public IAutoable make() {
		return new Audi();
	}
	
	public static AudiFactory getInstance()
	{
		if(container==null)
		{
			container=new AudiFactory();
		}
		return container;
	}
	

}
