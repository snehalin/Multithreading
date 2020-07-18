
public class CardDistribute extends Thread{
 CardPrint c1;
 CardDistribute(CardPrint c1)
 {
	 this.c1=c1;
 }
	public void run()
	{
		try {
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		System.out.println("Card Distributing");
	}

}
