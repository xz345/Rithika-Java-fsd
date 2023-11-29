package practice_project6;

import java.util.HashMap;
import java.util.Map;

public class MapsImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create hashmap for employeeName and salary
		Map<String, Double> employee=new HashMap<>();
		
		employee.put("Abishek",19000.0);
		employee.put("Tharun",18500.0);
		employee.put("Saran",19500.0);
		
		System.out.println("************************");

		//Retrieve values by key
		double salaryTharun=employee.get("Tharun");
		
		System.out.println("Salary of Tharun is: "+salaryTharun);
		
		System.out.println("************************");

		//check key exists in Map
		
		boolean keyInMap=employee.containsKey("sachiin");
		System.out.println("Key Contains 'sachin': "+keyInMap);
		
		//remove a pair using key
		
		employee.remove("abishek");
		
		
		System.out.println("************************");

		//access keys of map
		System.out.println("keys of employee Hashmap : "+employee.keySet());
		
		System.out.println("************************");

		//access values of map
		System.out.println("values of employee Hashmap : "+employee.values());
		
		
		
		System.out.println("************************");

		 // Iterate over the map and display all key-value pairs
        System.out.println("All key-value pairs:");
        for (Map.Entry<String, Double> entry : employee.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
		
		System.out.println("************************");

		int expectedLength=3;
		
		int actualSize=employee.size();
		
		assert actualSize==expectedLength:"Map size is incorrect";
		
		
	}

}
