import java.util.ArrayList;


public class test {

	public static void main(String[] args) {
		
		ArrayList<Integer> testList = new ArrayList<Integer>();
		
		testList.add(5);
		testList.add(1);
		testList.add(2);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		
		//System.out.println(testList.get(0));
		//testList.remove(0);
		//System.out.println(testList.get(0));
		
		for(int i = 0;i<testList.size();i++) {
			System.out.println(testList.get(i));
		}

	}

}
