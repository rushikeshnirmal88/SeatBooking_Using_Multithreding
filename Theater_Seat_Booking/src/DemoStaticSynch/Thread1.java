package DemoStaticSynch;

public class Thread1 extends Thread{

	 BookTheaterSeat b;
	int seats;
	
	public Thread1(BookTheaterSeat b, int seats) {
		super();
		this.b = b;
		this.seats = seats;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		b.bookTicket(seats);
	}
	

}
