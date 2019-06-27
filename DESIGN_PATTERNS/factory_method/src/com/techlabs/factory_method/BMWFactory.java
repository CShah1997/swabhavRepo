package com.techlabs.factory_method;

public class BMWFactory implements IAutoFactory{
	
	private static BMWFactory container;

	@Override
	public IAutoable make() {
		
		return new BMW();
	}
	
	public static BMWFactory getInstance()
	{
		if(container==null)
		{
			container=new BMWFactory();
		}
		return container;
	}

}
