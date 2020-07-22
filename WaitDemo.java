
public class WaitDemo {

	public static void main(String[] args) {
	Circle c1=new Circle();
	ThreadOne t1=new ThreadOne(c1);
	ThreadTwo t2=new ThreadTwo(c1);
	ThreadThree t3=new ThreadThree(c1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
