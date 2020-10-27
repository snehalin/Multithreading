
public class Thread_1 extends Thread{
Circle c1;
Thread_1(Circle c1)
{
	this.c1=c1;
}
	
	
	public void run()
{
	c1.input();
}
}
