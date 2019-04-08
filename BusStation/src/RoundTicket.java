
public class RoundTicket extends SystemTickets {
	
	private double priceOfTicket = 75;
	
	public RoundTicket(int ticketsNum ,String typeName,double price) {
		super("Round Ticket",10);
		this.priceOfTicket = price;	
	}
	
	public double showPrice() {
		return priceOfTicket;
	}
}
