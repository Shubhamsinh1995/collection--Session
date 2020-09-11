package map_Concept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		
      //it is similar to HashMap but it is synchronized
		//stores the value on the basis of key-value
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1, "tom");
		ht.put(2, "jerry");
		ht.put(3, "carry");
		ht.put(4, "jenny");
		System.out.println(ht);
		System.out.println("-------");
		ht.put(5, "jenny");
		ht.put(6, "carry");
		ht.put(7, "jerry");
		ht.put(8, "tom");
		System.out.println(ht);
		System.out.println("-----------------");
		
		// Create a clone copy/shallow copy
		Hashtable<Integer,String> ht2 =new Hashtable<Integer,String>();
		 ht2=(Hashtable)ht.clone();
		 System.out.println("values in ht2 is: "+ht2);
		 System.out.println();
		 
		 if(ht2.equals(ht)) {
			 System.out.println("both are equals");
			 System.out.println();
		 }
		 
		 // print all the values from hashtable using Enumeration--elements() method
		 Enumeration e=ht.elements();
		 while(e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		 }
		 System.out.println();
		 
		 //get all the values from hashtable using entrySet() method
		Set s= ht.entrySet();
		System.out.println(s);
		System.out.println();
		 
		 //clear method
	    ht.clear();
		System.out.println(ht);
		System.out.println();
		
		Map<Integer,String> st =new Hashtable<Integer,String>();
		st.put(1, "tom");
		st.put(2, "jerry");
		st.put(3, "carry");
		st.put(4, "jenny");
		
		if(st.containsValue("jerry"))
		System.out.println("found value");
		System.out.println("-----------------");
		
		
	}

}
