
public class ThreadOne extends Thread{
PatternNew p;
	ThreadOne(PatternNew p)
	{
		this.p=p;
	}
	public void run()
	{
		p.print('*');
	}
}
