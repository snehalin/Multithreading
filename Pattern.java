
public class Pattern {

	//two ways to synchronize
	 // 1.By using  synchronized method
	//2.By using synchronized block
	 
	/*
	 * void print() { for(int j=1;j<=10;j++) {
	 * System.out.print(Thread.currentThread().getName()); } }
	 */
	void display(char ch)
	{
		 synchronized(this)//synchronized block
		 {
			 	for(int i=1;i<=5;i++)
			 			{
			 				for(int j=1;j<=5;j++)
			 					{
			 						System.out.print(ch);
			 						}
			 				System.out.println();
			 			}
		 }
		/* for(int j=1;j<=10;j++)
			{
				System.out.print(Thread.currentThread().getName());
				}*/ 
		 
		 
		 
	}}
