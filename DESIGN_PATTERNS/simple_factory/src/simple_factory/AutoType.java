package simple_factory;

public enum AutoType {
	
	BMW, AUDI, TESLA;
	
	public String toString()
	{
		switch(this)
		{
			case BMW:
				return "BMW";
			case AUDI:
				return "Audi";
			case TESLA:
				return "Tesla";
			default:
				return null;
		}
	}

}
