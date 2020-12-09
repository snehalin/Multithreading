//t1 t2 main
/*
 yield()-->pauses current thread execution and give chance to another thread 
 having same priority .
 
 */
public class YieldDemonew {

	public static void main(String[] args) {
		System.out.println("Max priority="+Thread.MAX_PRIORITY);
		System.out.println("Min priority="+Thread.MIN_PRIORITY);
		System.out.println("Norm priority="
		+Thread.NORM_PRIORITY);
		System.out.println("main's priority"+Thread.currentThread().getPriority());
		Thread_One t1=new Thread_One();
		Thread_two t2=new Thread_two();
		System.out.println("t1 priority"+t1.getPriority());
		//System.out.println("t2 priority"+t2.getPriority());
		t1.start();
		t2.start();
		
		for(int i=0;i<10;i++)
		{
			
			Thread.yield();
			System.out.println(i+ Thread.currentThread().getName());
		}
		
	}

}
