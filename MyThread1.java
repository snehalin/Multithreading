
public class MyThread1 extends Thread {

	public void run()
	{//running
		if(Thread.currentThread().getName().equals("t1")) {
		for(int i=1;i<=5;i++)
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
		if(Thread.currentThread().getName().equals("t2"))//t2
		{
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
		
		
		
		
		
		
		
	}//Terminate
	public static void main(String[] args) {
		 MyThread1 t1=new MyThread1();//-- new
		 MyThread1 t2=new MyThread1();
		 t1.setName("t1");
		 t2.setName("t2");
		 t1.start();//Runnable
		 t2.start();//runnable ready to run
        System.out.println(t1.getName()+" "+t2.getName());
		 
		 for(int i=1;i<=5;i++)
			{  try {
				Thread.sleep(1000);//t1,t2  //Block waiting
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(Thread.currentThread().getName()+"--" +i);
			}
	}

}
