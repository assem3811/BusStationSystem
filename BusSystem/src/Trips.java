import java.util.ArrayList;

public class Trips {
	
	int tripIndex;
	String source;
	String destination;
	String tripDate;
	String tripTime;
 

	private static ArrayList<String> tripsList = new ArrayList<String>(); 
	public Trips(int tripIndex,String source,String destination,String tripDate,String tripTime) {

		
		this.tripIndex = tripIndex;
		this.source = source;
		this.destination = destination;
		this.tripDate = tripDate;
		this.tripTime = tripTime;
	}
	
	public void storeMyTrip(int index,String details) {
		tripsList.add(index, details);
	}
	
}
