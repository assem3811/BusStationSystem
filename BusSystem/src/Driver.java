
public class Driver extends Employee {

int numberOfTrips = 0;
	
	// Parent arrguments: String name,int age,String gender,String address
	
	public Driver(int numberOfTrips,String name,int age,String gender,String address) {
		super(name,age,gender,address);
		this.numberOfTrips = numberOfTrips;
	}

	public Driver() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumOfTrips() {
		return numberOfTrips;
	}
}
