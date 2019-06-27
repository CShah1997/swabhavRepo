package simple_factory;

class BMW implements IAutoable{

	@Override
	public void start() {
		System.out.println("BMW starts...");
	}

	@Override
	public void stop() {
		System.out.println("BMW stops...");
	}
	
	

}
