package com.techlabs.human_app;

public class Human {
	
	private String name;
	private int age;
	private float height,weight;
	private GenderType gender;
	private static final float DEFAULT_HEIGHT=5;
	private static final float DEFAULT_WEIGHT=5;
	private static final GenderType DEFAULT_GENDER=GenderType.MALE;
	private static final float WEIGHT_LOSE_WORKOUT=(float) 0.02;
	private static final float HEIGHT_GAIN_EAT=(float) 0.05;
	private static final float WEIGHT_GAIN_EAT=(float) 0.01;
	private static final float NORMAL_WEIGHT_LIMIT=50;
	
	
	private static int count=0;
	
	public Human(String name,int age,float height,float weight,GenderType gender)
	{
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.gender=gender;
	}
	
	public int getCount()
	{
		count=count+1;
		return count;
	}
	
	public Human whoIsElder(Human h2)
	{
		if(this.age<h2.age)
		{
			return this;
		}
		return h2;
	}
	
	
	public Human(String name,int age)
	{
		
		this(name,age,DEFAULT_HEIGHT,DEFAULT_WEIGHT,DEFAULT_GENDER);
		
		//this.name=name;
		//this.age=age;
		
		//height=DEFAULT_HEIGHT;
		//weight=DEFAULT_WEIGHT;
		//gender=DEFAULT_GENDER;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public float getHeight()
	{
		return this.height;
	}
	
	public void setHeight(float newHeight)
	{
		height=newHeight;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public void setWeight(float newWeight)
	{
		weight=newWeight;
	}
	
	public void workout()
	{
		weight=weight-WEIGHT_LOSE_WORKOUT;
	}
	
	public void eat()
	{
		weight=weight+WEIGHT_GAIN_EAT;
		height=height+HEIGHT_GAIN_EAT;
	}
	
	public float calBMI()
	{
		float bmi=(float) (weight/(Math.pow(height, 2)));
		return bmi;
	}
	
	public String bodyCategory()
	{
		if(calBMI()<NORMAL_WEIGHT_LIMIT)
		{
			return "Under Weight";
		}
		if(calBMI()>NORMAL_WEIGHT_LIMIT)
		{
			return "Over Weight";
		}
		return "Normal Weight";
	}

}
