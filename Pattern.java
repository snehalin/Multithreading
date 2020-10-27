
public class Pattern {

	void display()
	{
		for(int j=1;j<15;j++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	
	synchronized  void print(char c)
	{
		 
		 for(int i=1;i<5;i++) { 
			 for(int j=1;j<5;j++) {
		 
			 System.out.print(c); }
		 System.out.println(); }
		 
		/* 
		 for(int j=1;j<15;j++)
			{
				System.out.println(Thread.currentThread().getName());
			}
		 
		 
		
		  synchronized(this) {for(int i=1;i<5;i++) { for(int j=1;j<5;j++) {
		 * System.out.print(c); } System.out.println(); } }
		 */
	
}
}
