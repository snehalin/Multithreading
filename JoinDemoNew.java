
public class JoinDemoNew {

	public static void main(String[] args) {
		VenueDeide t1=new VenueDeide();
		CardPrinting t2=new CardPrinting(t1);
		CardDistributing t3=new CardDistributing(t2);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
