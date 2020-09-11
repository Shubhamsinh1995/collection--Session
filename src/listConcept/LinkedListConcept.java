package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test");
		ll.add("selenium");
		ll.add("qtp");
		ll.add("RPA");
		System.out.println(ll);
		
		//get element at index
		System.out.println(ll.get(1));
		
		//add first and last
		ll.addFirst("shubham");
		ll.addLast("baiyas");
		System.out.println(ll);
		
		//remove at index
		ll.remove(0);
		System.out.println(ll);
		
		//set element
		ll.set(0, "shubham");
		System.out.println(ll);
		
		//remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//how to print all the values of linkedlist
		//using for loop
		System.out.println("*** using for loop ***");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//using advanced forloop
		System.out.println("*** using advanced for loop***");
		for(String i:ll) {
			System.out.println(i);
		}
		
		//using itrrator
		System.out.println("***using iterator***");
		Iterator<String> it=ll.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	     //using while loop
	     System.out.println("*****using while loop*****");
	     int num=0;
	     while(ll.size()>num) {
	    	 System.out.println(ll.get(num));
	    	 num++;
	      }
		}

	}


