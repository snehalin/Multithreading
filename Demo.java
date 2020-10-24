//Thread-->It is smallest unit of process
//Process-->Program in Execution
//threads are light weigth process coz they share same address space
//Executing Multiple Threads simulteneously is called Multithreading
//Advantage-->To increase speed of prg
/*
 To create Thread 
 1.By Extending ThreadClass
 2.By Implementing Runnable interface
 
 Life Cycle of Thread
 1.New
 2.Runnable
 3.Running
 4.NonRunnable
 5.Terminated
  
  
  
  
  
  
  
 */



public class Demo {
	static void m1() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
	
		//m1();
		//m1();//10s
		
	
		MyThread  t1=new MyThread();
		Thread ta=new Thread(t1);
		MyThread  t2=new MyThread();
		Thread tb=new Thread(t1);
		ta.start();
		tb.start();
    
	}

}
