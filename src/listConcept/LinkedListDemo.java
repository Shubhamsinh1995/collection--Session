package listConcept;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList();
		ll.add("math");
		ll.add("chemistry");
		ll.add("Bio");
		ll.add("archetech");
		System.out.println(ll);
		System.out.println("size of ll is: "+ll.size());
		System.out.println();
          
		// addFirst
		ll.addFirst("engineering");
		System.out.println(ll);
		System.out.println("size of ll is: "+ll.size());
		System.out.println();
		
		//addLast
		ll.addLast("electronics");
		System.out.println(ll);
		System.out.println("size of ll is: "+ll.size());
		System.out.println();
		
		//remove method
         ll.removeFirst();
         System.out.println("First element removed "+ll);
         System.out.println();
         ll.removeLast();
         System.out.println("Last element removed"+ll);
         System.out.println();
         
         //remove at particular index
         ll.remove(3);
         System.out.println(ll);
         System.out.println();
         
         //to set an element
         ll.set(2, "subjects");
         System.out.println(ll);
         System.out.println();
         
        // to fetch the element at particular index
         System.out.println(ll.get(1));
         System.out.println();
         
         Deque<String> ll1=new LinkedList();
         ll1.add("comp");
 		ll1.add("zoology");
 		ll1.add("botny");
 		ll1.add("mech");
 		 ll.addAll(ll1);
         System.out.println(ll);
         System.out.println();
     
         
         System.out.println("First element is: "+ll.getFirst());
         System.out.println();
        
         System.out.println("Last element is: "+ll.getLast());
         System.out.println();
        
         
         // to print the LinkedList element
           System.out.println("***Using for Loop***");
           for(int i=0;i<ll.size();i++) {
        	   System.out.println(ll.get(i));
        	 }
           System.out.println();
           System.out.println("***Using Advanced for Loop***");
           for(String s:ll) {
        	   System.out.println(s);
           }
           System.out.println();
           System.out.println("***Using Iterator***");
          Iterator<String> it=ll.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next());
          }
         }

}
