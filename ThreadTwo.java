
public class ThreadTwo extends Thread{

	Pattern p1;
	ThreadTwo(Pattern p1)
	{
		this.p1=p1;
	}
	public void run()
	{
		p1.print('#');
		p1.display();
	}
}


