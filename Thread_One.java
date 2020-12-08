
public class Thread_One extends Thread{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
			Thread.sleep(1000);//1 sec  t1  t2
			}catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
		
		
		
	}
}
