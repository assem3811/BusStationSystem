import java.util.ArrayList;

public class Trips {
	
	static int tripIndex ;
	int ticketsOfTrip;
	public static ArrayList<String> tripsOnSystem = new ArrayList<>(1000);
	
	public void addTrip(int index,String tripDetails) {
		tripsOnSystem.add(index, tripDetails);
	}
	
	public void removeTrip(int index) {
		tripsOnSystem.remove(index);
	}
	
	public ArrayList<String> showTrips() {
		return this.tripsOnSystem;
	}
	
	public void setTicketsNum(int ticketsNum) {
		this.ticketsOfTrip = ticketsNum;
	}
}
