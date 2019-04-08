
public class SystemTickets {
	
	private String typeName;
	
	int numberOfTickets ;
	
	
	 public SystemTickets(String typeName,int numberOfTickets) {
		 
		 this.typeName = typeName;
		 this.numberOfTickets=numberOfTickets;
	 }

	 
	 public int pickTicket() {
		 return numberOfTickets --;
	 }
	 
	 public int cancelTicket() {
		 return numberOfTickets ++;
	 }
	
	
}
