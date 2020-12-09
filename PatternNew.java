
public class PatternNew {

	  void print(char c)
		{
		  for(int j=1;j<15;j++)
			 {
		 
			 System.out.print(Thread.currentThread().getName());
			 }
		  
		  synchronized(this)
		  {
			 for(int i=1;i<5;i++) { 
				 for(int j=1;j<5;j++)
				 {
			 
				 System.out.print(c);
				 }
			 System.out.println();
			}
		  }
}
}
