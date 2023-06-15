package DemoStaticSynch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookTheaterSeat b1= new BookTheaterSeat();
		
		Thread1 t= new Thread1(b1,5);
		t.start();
		t.setName("Rushi");
		
		
		Thread2 t2= new Thread2(b1,4);
		t2.start();
		t2.setName("Omkar");
		
		
		
		
		
BookTheaterSeat b2= new BookTheaterSeat();
		
		Thread1 t3= new Thread1(b1,5);
		t3.start();
		t3.setName("Pratik");
		
		
		Thread2 t4= new Thread2(b1,14);
		t4.start();
		t4.setName("Siddharth");
		
	}

}
