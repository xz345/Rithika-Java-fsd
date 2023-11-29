package practice_project5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collectionImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("************************");
System.out.println("ArrayList Implementation");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Benz");
		cars.add("Audi");
		System.out.println("ArrayList:"+cars);
		
		//access an item
		System.out.println(cars.get(1));
		
		//update an item
		String car1=cars.set(0,"Lamborgini");
		System.out.println("After Updating"+cars);
		
		
		//remove an element
		System.out.println(cars.remove(2));
		
		//Finding arrayList size
		int len=cars.size();
		System.out.println("The length of arrayList: "+len);
        
		System.out.println("************************");

		System.out.println();
				
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector Implementation");
	      Vector<Integer> vecv = new Vector();
	      vecv.addElement(15); 
	      vecv.addElement(30); 
	      vecv.addElement(40);
	      System.out.println(vecv);
	      
	      vecv.remove(1);
	      
	      for (int i = 0; i < vecv.size(); i++)
	    	  
	            // Printing elements one by one
	            System.out.print(vecv.get(i) + " ");
	    
	
		System.out.println("************************");

	      
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Abishek");  
	      names.add("Sahithi"); 
	      names.add("Medi");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	  
//	       remove an element
	       
	      names.remove("Sahithi");
	      }
	      

	}

}
