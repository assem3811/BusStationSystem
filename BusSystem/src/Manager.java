import java.util.HashMap;
import java.awt.List;
import java.util.ArrayList;

public class Manager extends Employee {
	
	HashMap tripMap = new HashMap<Integer, String>();
	
	public void addTrip(int index,String details) {
		tripMap.put(index, details);
	}
	
	public void removeTrip(int index) {
		tripMap.remove(index);
	}
	
	public void showTrip(int index) {
		System.out.println(tripMap.get(index));
	}
	
}
