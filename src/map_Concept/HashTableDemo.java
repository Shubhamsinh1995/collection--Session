package map_Concept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		//hashtable is similar to hashcode but it is synchronized i.e. it is thread safe
		// it contains only unique value
		//stores the values on the basis of key-value pair
		//In hashtable key is treated as object and object has hashcode which is has 32 bit value
		
		
		Hashtable<String,String> ht=new Hashtable<>();
		System.out.println();
		ht.put("A", "selenium");
		ht.put("B","automation");
		ht.put("c ", "Testing");
		ht.put("D", "CompleteTesting");
	 System.out.println(ht);
         System.out.println();
         System.out.println(ht.get("B"));
         System.out.println(ht.get("A"));
         System.out.println(ht.get("D"));
         System.out.println();
         
         Hashtable<String,String> ht1=new Hashtable<>();
         ht1.put("A", "selenium");
 		ht1.put("B","automation");
 		ht1.put("c ", "Testing");
 		ht1.put("D", "CompleteTesting");
 		
 		
 		// equals method
 		if(ht1.equals(ht))
 			System.out.println("both are equals");
 		System.out.println();
 		
 		// contains value method
 		if(ht1.containsValue("automation"))
 			System.out.println("Value found");
 		System.out.println();
 		
 		//print all the value from Hashtable--using----enumeration--elements() method *****
             Enumeration e=ht1.elements();
 		System.out.println("print all the values from enumeration ");
 		while(e.hasMoreElements()) {
 			System.out.println(e.nextElement());
 			
 		}
 		System.out.println();
 		
 			// cloning       *****
 			Hashtable<String,String> ht2=new Hashtable<>();
 			ht2=(Hashtable)ht1.clone();
 			System.out.println("values from ht1 "+ht1);
 			System.out.println("values from ht2"+ht2);
 			
 			// clear
 		ht1.clear();
 		System.out.println("values from ht1 "+ht1);
	    System.out.println("values from ht2"+ht2);
	    System.out.println();
	    
	    //get all the value from hashtable using --entrySet() method which is a set of hashtable values  *****
	    Set s=ht.entrySet();
	    System.out.println(s);
	    System.out.println();
	    
	    //get the hashcode of hashtable object
	   System.out.println( ht.hashCode());
	}

}
