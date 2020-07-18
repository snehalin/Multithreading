
public class CardPrint extends Thread{
 VenueDecide v1;
 
 CardPrint(VenueDecide v1)
 {
	 this.v1=v1;
 }
	public void run()
	{
		try {
			v1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		System.out.println("Card Printing");
	}

}
