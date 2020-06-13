package reservation.client;

import reservation.system.TicketBookingThread;
import reservation.system.TicketCounter;

public class Test {
	
	public static void main(String[]args) {
		
		TicketCounter ticketcouter = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(ticketcouter,"saibaba",30);
		TicketBookingThread t2 = new TicketBookingThread(ticketcouter,"saibabababa",70);
		TicketBookingThread t3 = new TicketBookingThread(ticketcouter,"sai",40);
		TicketBookingThread t4 = new TicketBookingThread(ticketcouter,"venkateshwara",3);
		TicketBookingThread t5 = new TicketBookingThread(ticketcouter,"hanuman",1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	
}
}