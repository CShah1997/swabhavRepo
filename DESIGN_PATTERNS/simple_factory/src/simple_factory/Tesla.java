package simple_factory;

class Tesla implements IAutoable{

	@Override
	public void start() {
		System.out.println("Tesla starts...");
	}

	@Override
	public void stop() {
		System.out.println("Tesla stops...");
	}

}
