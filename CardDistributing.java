
public class CardDistributing extends Thread {
	CardPrinting t2;
	CardDistributing(CardPrinting t2)
	{
		this.t2=t2;
	}
	public void run()
	{
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++)
		System.out.println("Card Distributing");
		
	}

}
