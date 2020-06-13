package reservation.system;

public class TicketCounter {

	
	private int availableseats = 100;

	
	
	public  synchronized  void bookTicket(String pname,int nooftickets) {
		
		if((availableseats>=nooftickets) && (nooftickets>0)){
			System.out.println(pname+": "+nooftickets+": tickets"+" :"+"booked succesfully");
			availableseats = availableseats-nooftickets;
			
		}
		else {
			System.out.println("no seats are available");
		}
		
		
	}
}



	
		
	
