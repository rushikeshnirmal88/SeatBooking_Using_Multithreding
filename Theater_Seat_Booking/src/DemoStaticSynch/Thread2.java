package DemoStaticSynch;

public class Thread2 extends Thread
{
	BookTheaterSeat b;
	int seats;
	
	public Thread2(BookTheaterSeat b, int seats) {
		super();
		this.b = b;
		this.seats = seats;
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		
		b.bookTicket(seats);
		
	}
}
