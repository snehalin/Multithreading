
public class JoinDemo {

	public static void main(String[] args) {
		VenueDecide v1=new VenueDecide();
		CardPrint c1=new CardPrint(v1);
		CardDistribute d1=new CardDistribute(c1);
		
		v1.start();
		c1.start();
		d1.start();

	}

}
