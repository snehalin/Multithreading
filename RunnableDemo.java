
public class RunnableDemo {
public static void main(String args[])
{
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	
	Thread t11=new Thread(t1);
	Thread t22=new Thread(t2);
	

	t11.setPriority(8);
	t22.setPriority(3);
	
	System.out.println(t11.getPriority()+" "+t22.getPriority());
	System.out.println(Thread.currentThread().getPriority());
	
	System.out.println("Min priority="+Thread.MIN_PRIORITY);
	System.out.println("Max priority="+Thread.MAX_PRIORITY);
	System.out.println("Normal priority="+Thread.NORM_PRIORITY);
	
	t11.start();
    t22.start();
	
	
}
}
