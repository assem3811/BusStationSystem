
public class SingleTicket extends SystemTickets {
	
	private double priceOfTicket=100;
	
	public SingleTicket(int ticketsNum ,String typeName,double price) {
		
		super("Single Ticket",10);
		this.priceOfTicket=price;
	}
	
	 
	 public double showPrice() {
		 return priceOfTicket;
	 
}
}
