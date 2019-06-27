package circle;

public class Circle {
	
	
	
	private static double PI=3.14;
	private float radius;
	private BorderColor color;
	
	public Circle(float radius,BorderColor color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	public float getRadius()
	{
		return this.radius;
	}
	
	public BorderColor getColor()
	{
		return this.color;
	}
	
	public float calArea()
	{
		return (float) (PI*radius*radius);
	}

}
