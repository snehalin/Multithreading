
public class MyThread extends Thread {
	
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i="+i);
			
			try {
				Thread.sleep(1000);//pause 1 sec
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MyThread m1=new MyThread();//1.New
		MyThread m2=new MyThread();
		
		m1.setName("m1");
		m2.setName("m2");
		m1.start();//ready to run //run()
		m2.start();//ready to run
		//System.out.println("First Thread name="+m1.getName());
		//System.out.println("Second Thread name="+m2.getName());
		//m1.run();
		//m2.run();
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName()+ " i="+i);
	}
	}

}
