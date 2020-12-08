//2 ways to create thread
/*
 1.By Extending Thread class
 2.By Implementing Runnable Interface
 */
public class Thread_Demo {

	
	public static void main(String[] args) throws InterruptedException {
	
		/* Using Thread class
		 Thread_One t1=new Thread_One();
		Thread_One t2=new Thread_One();
		
		t1.start();//runnable  t1.run
		t2.start();//runnable   t2.run*/
		
		/* Using Runable interface */
		ThreadUsingRunable t1=new ThreadUsingRunable();
		ThreadUsingRunable t2=new ThreadUsingRunable();
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		tt1.setName("t1");
		tt2.setName("t2");
		
		System.out.println(tt1.getName()+" "+tt2.getName());
		tt1.start();
		tt2.start();
		
		
		for(int i=0;i<5;i++)
		{
			
			Thread.sleep(1000);
			
			System.out.println(i+ Thread.currentThread().getName());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
