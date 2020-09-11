package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries=new ArrayList<>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking bad");
		tvSeries.add("The big bang theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("prison Break");
		System.out.println();
	
       System.out.println("****[ Using for each loop and lambda expression ]****");
       tvSeries.forEach(shows -> {
    	   System.out.println(shows);
       });
       
       System.out.println();
       
       System.out.println("*****[ Using Iterator ]******");
       Iterator<String> it=tvSeries.iterator();
       while(it.hasNext()) {
    	   String s=it.next();
    	   System.out.println(s);
    	  }
       System.out.println();
       
       System.out.println("*** using java 8 for eachReamaining and lambda expression****");
       it=tvSeries.iterator();
       it.forEachRemaining(show -> {
    	   System.out.println(show);
       });
       System.out.println();
       
       System.out.println("****using Advanced for loop*****");
       for(String string:tvSeries) {
    	   System.out.println(string);
       }
       System.out.println();
       
       System.out.println("**** Using simple for loop with index*******");
       for(int i=0;i<tvSeries.size();i++) {
    	   System.out.println(tvSeries.get(i));
       }
       System.out.println();
       
       System.out.println("***Using listIterator to traverse in both direction*****");
       ListIterator<String> ls=tvSeries.listIterator(tvSeries.size());
       while(ls.hasPrevious()) {
    	   String string=ls.previous();
    	   System.out.println(string);
       }
	}

}
