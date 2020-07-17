//	program-set of instructions
	//	process-program under execution
	//Multithreading-Executing multiple treads simulteneously.
	//	thread-smallest unit of process
		/* process                  Thread
		 2.Heavy Weight Process   2.Light weight process
		
		 We can create thread by using 2 ways
		 1.By Extending Thread Class //lang
		 2.By Implementing Runnable Interface
		 */
public class Demo {

	static void m1() throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		
		
			m1();//5sec
		    m1();//10sec
		   
		
	}
}
