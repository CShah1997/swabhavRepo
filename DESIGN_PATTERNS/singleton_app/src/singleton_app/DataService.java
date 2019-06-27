package singleton_app;

public class DataService {
	
	private static DataService container;
	
	private DataService()
	{
		System.out.println("Service created...");
	}
	
	public void doSomething()
	{
		System.out.println("Work done by: "+this.hashCode());
	}
	
	public static DataService getInstance()
	{
		if(container==null)
		{
			container=new DataService();
		}
		return container;
		
	}

}
