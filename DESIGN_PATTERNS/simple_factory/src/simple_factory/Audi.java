package simple_factory;

class Audi implements IAutoable{

	@Override
	public void start() {
		System.out.println("Audi starts...");
	}

	@Override
	public void stop() {
		System.out.println("Audi stops...");
	}
	
	

}
