
public class Drivers extends Employee {

	int numberOfTrips = 0;
	
	// Parent arrguments: String name,int age,String gender,String address
	
	public Drivers(int numberOfTrips,String name,int age,String gender,String address) {
		super(name,age,gender,address);
		this.numberOfTrips = numberOfTrips;
	}

	public Drivers() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumOfTrips() {
		return numberOfTrips;
	}

}
