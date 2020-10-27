import java.util.Scanner;

public class Circle {

	int radius;
	synchronized void input()
	{
		System.out.println("Inside Input()");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		radius=sc.nextInt();
		notify();
	}
	
	synchronized void area() throws InterruptedException
	{
		System.out.println("Inside Area()");
		if(radius==0)
		{
			System.out.println("Waiting.......");
			wait(1000,10);
		}
		double area=3.14*radius*radius;
		System.out.println("Area="+area);
	}
	
}
