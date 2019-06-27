package circle_test;



import circle.BorderColor;
import circle.Circle;

public class CircleTest {

	public static void main(String args[]) {
		
		Circle[] arr; 
		   
        arr = new Circle[5]; 
  
        arr[0] = new Circle(10,BorderColor.BLUE);
        System.out.println(arr[0].getRadius()); 
        System.out.println(arr[0].getColor());
        System.out.println("Using Enum"+BorderColor.BLUE);
        System.out.println(arr[0].calArea());
        System.out.println("");
              
        arr[1] = new Circle(20,BorderColor.GREEN);
        System.out.println(arr[1].getRadius()); 
        System.out.println(arr[1].getColor());
        //System.out.println("Using Enum"+BorderColor.GREEN);
        System.out.println(arr[1].calArea());
        System.out.println("");
        
        arr[2] = new Circle(30,BorderColor.RED);
        System.out.println(arr[2].getRadius()); 
        System.out.println(arr[2].getColor());
        //System.out.println("Using Enum"+BorderColor.RED);
        System.out.println(arr[2].calArea());
        System.out.println("");
        
        arr[3] = new Circle(40,BorderColor.GREEN);
        System.out.println(arr[3].getRadius()); 
        System.out.println(arr[3].getColor());
        //System.out.println("Using Enum"+BorderColor.BLUE);
        System.out.println(arr[3].calArea());
        System.out.println("");
        
        arr[4] = new Circle(50,BorderColor.BLUE);
        System.out.println(arr[4].getRadius());
        System.out.println(arr[4].getColor());
        //System.out.println("Using Enum"+BorderColor.GREEN);
        System.out.println(arr[4].calArea());
        System.out.println("");
        
        
        
        
        
        
	}
}
