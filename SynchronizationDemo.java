
public class SynchronizationDemo {

	public static void main(String[] args) {
	Pattern p1=new Pattern();	
		
		ThreadOne t1=new ThreadOne(p1);
		ThreadTwo t2=new ThreadTwo(p1);
		
		t1.start();
		t2.start();
	}

}
