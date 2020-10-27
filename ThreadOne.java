
public class ThreadOne extends Thread{
Pattern p1;
	ThreadOne(Pattern p1)
	{
		this.p1=p1;
	}
	
	public void run()
	{
		p1.print('*');
		p1.display();
	}
}
