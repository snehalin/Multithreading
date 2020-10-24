
public class MyThread2 extends Thread {

	public void run()
	{//running
		for(int i=11;i<=15;i++)
		{  try {
			Thread.sleep(1000);//t1,t2  //Block waiting
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}

}
}
