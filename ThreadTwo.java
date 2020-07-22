
public class ThreadTwo extends Thread{
	Circle c1;
	public ThreadTwo(Circle  c1)
	{
		this.c1=c1;
	}
	
	public void run()
	{
		c1.displayArea();
	}

}
