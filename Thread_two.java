
public class Thread_two extends Thread{
	public void run()
	{
		for(int i=11;i<20;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
}
}
