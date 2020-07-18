
public class YieldDemo {

	public static void main(String[] args) {
		/* t1   t2  t3
		    5   2   5
		       
		 */
		
		Thread1 t1=new Thread1();
	
		Thread t11=new Thread(t1);
		t11.setPriority(8);
		t11.start();
		
		for(int i=21;i<=25;i++)
		{
			Thread.yield();//main thread pauses and checks any thread having same or higher priority
			//if any it gives chance to that thread
			System.out.println(Thread.currentThread().getName()+" i="+i);
			
			  }
			 
		}
		
		
		
	}


