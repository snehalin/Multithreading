
public class SynchroniszeDemo {

	public static void main(String[] args) {
		
		//If multiple treads trying to access same object then data inconsistency
		//problem may occure to ovoid that we can use synchronized keyword 
		//for method or for block
		Pattern p1=new Pattern();
		MyThread1 t1=new MyThread1(p1);
		MyThread2 t2=new MyThread2(p1);
		
		t1.start();
		t2.start();
		
	}

}
