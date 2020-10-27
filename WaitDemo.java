
public class WaitDemo {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Thread_1 t1=new Thread_1(c1);
	    Thread_2 t2=new Thread_2(c1);
		t2.start();
		t1.start();
		
	}

}
