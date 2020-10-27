
public class Thread_2 extends Thread{
	Circle c1;
	Thread_2(Circle c1)
	{
		this.c1=c1;
	}
	public void run()
	{
		try {
			c1.area();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
