
public class Thread2 implements Runnable {

	@Override
	public void run() {
		for(int i=11;i<=15;i++)
		{
			System.out.println(Thread.currentThread().getName()+" i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}


}
