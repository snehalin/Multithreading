
public class ThreadThree extends Thread{
Circle c1;
ThreadThree(Circle c1)
{
	this.c1=c1;
}
 public void run()
 {
	 c1.displayPerimeter();
 }
	
}
