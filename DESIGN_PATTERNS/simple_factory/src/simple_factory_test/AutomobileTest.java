package simple_factory_test;

import simple_factory.AutoType;
import simple_factory.AutomobileFactory;
import simple_factory.IAutoable;

public class AutomobileTest {

	public static void main(String args[])
	{
//		AutomobileFactory factory=new AutomobileFactory();
//		IAutoable autoable=factory.make(AutoType.AUDI);
//		System.out.println("Class Name: "+autoable.getClass().getName());
		
		AutomobileFactory factory=AutomobileFactory.getInstance();
		IAutoable autoable=factory.make(AutoType.AUDI);
		autoable.start();
		autoable.stop();
	}
	
}
