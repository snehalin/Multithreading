
public class CardPrinting extends Thread {
	VenueDeide t1;
	CardPrinting(VenueDeide t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		System.out.println("Card Printing");

}
}