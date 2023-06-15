package DemoStaticSynch;

public class BookTheaterSeat 
{
	static int total_seat=27;
	
	 static synchronized void bookTicket(int seats)
	{
		if(total_seat>=seats)
		{
			System.out.println("Seat Booked  By--->"+Thread.currentThread().getName()+" "+seats);
			
			total_seat=total_seat-seats;
			
			System.out.println("Availabe Seats are :"+total_seat);
					
		}
		else
		{
			System.out.println("Seats Cant Book Avilable Seats Are "+total_seat );
		}
	}

}
