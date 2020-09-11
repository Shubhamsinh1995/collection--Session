package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratingWays {

	public static void main(String[] args) {
		
         ArrayList<String> ar=new ArrayList<String>();
         ar.add("shubham");
         ar.add("baiyas");
         ar.add("amol");
         ar.add("jadish");
         
       //by using forEach loop and lambada expression
         System.out.println("**** using forEach loop and lambada expression***");
         ar.forEach(name -> {
        	 System.out.println(name);
         });
         System.out.println("-------------------");
         
         // by using iterator,lambada exp  and forEachRemaining() method
         System.out.println("**** using iterator, lambada exp and forEachRemaining() method***");
        Iterator<String> it= ar.iterator();
        it.forEachRemaining(action -> {
        	System.out.println(action);
        });
        System.out.println("-------------------");
        
        //by using advanced for loop
        System.out.println("*****using advanced for loop*******");
        for(String s:ar) {
        	System.out.println(s);
        }
        System.out.println("-------------------");
        
        // by using Listiterator() to traverse in both direction
        System.out.println("***using ListIterator****");
        ListIterator<String> ls=ar.listIterator(ar.size());
        while(ls.hasPrevious()) {
        	System.out.println(ls.previous());
        }
    
        
        
	}

}
