
public class MyThread1 extends Thread {

	Pattern p1;
	
	MyThread1(Pattern p1)
	{
		this.p1=p1;
	}
	public void  run() {
		              //   p1.print();
						p1.display('*');
						
	                 }
}