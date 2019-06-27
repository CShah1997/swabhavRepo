package singleton_app_test;

import singleton_app.DataService;

public class DataServiceTest {
	
	public static void main(String args[])
	{
		DataService sv1=DataService.getInstance();
		sv1.doSomething();
		DataService sv2=DataService.getInstance();
		sv2.doSomething();
		System.out.println("SV1: "+sv1.hashCode());
		System.out.println("SV2: "+sv2.hashCode());
	}

}
