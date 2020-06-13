package reservation.system;

public class TicketBookingThread extends Thread {
	
	private TicketCounter  ticketcounter;
	private String Passengername;
	private int noofseatstobook;
	
	
	public TicketBookingThread(TicketCounter ticketcounter,String Passengername,int noofseatstobook) {
		
		this.ticketcounter = ticketcounter;
		this.Passengername = Passengername;
		this.noofseatstobook = noofseatstobook;
	}
public void run() {
		
		ticketcounter.bookTicket(Passengername,noofseatstobook);
	}

}
