
public class ThreadTwo extends Thread{
	PatternNew p;
	ThreadTwo(PatternNew p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print('a');
	}
}


