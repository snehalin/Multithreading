
public class Circle {
 int radius ;
 double area;
 double perimeter;
 synchronized void input()
 {
	 radius=10;
	 System.out.println("Radius set");
	 notifyAll();
 }
 
 
 synchronized void displayArea()
 {
	 if(radius==0)
	 {
		 System.out.println("In Area() Waiting for radius to set");
		 try {
			//wait(1000,1000);
			 wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
	 
	 area=3.14*radius*radius;
	 System.out.println("Area="+area);
	 
 }
 
 
 synchronized void displayPerimeter()
 {
	 if(radius==0)
	 {
		 System.out.println("In perimeter() Waiting for radius to set");
		 try {
			//wait(1000,1000);
			 wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 } 
	 perimeter=2*3.14*radius;
	 System.out.println("Perimeter="+perimeter);
 }



}
