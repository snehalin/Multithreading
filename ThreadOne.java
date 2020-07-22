
public class ThreadOne extends Thread{
	Circle c1;
	ThreadOne(Circle c1)
	{
		this.c1=c1;
	}
	
	public void run()
	{
		c1.input();
	}

}
