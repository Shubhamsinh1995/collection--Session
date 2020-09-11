package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries=new ArrayList<>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking bad");
		tvSeries.add("The big bang theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("prison Break");
		System.out.println();
	
      System.out.println(" 1 ---print using forEach loop and lambda expression-----");
      tvSeries.forEach(shows -> {
    	  System.out.println(shows);
      });
      System.out.println();
      
      System.out.println(" 2 ---print using Iterator-----");
      Iterator<String> it=tvSeries.iterator();
      while(it.hasNext()) {
    	  String show=it.next();
    	  System.out.println(show);
    	  }
      System.out.println();
      
      System.out.println(" 3 ---print using  Iterator and java 8 forEachRemaining and lambda expression-----");
      it=tvSeries.iterator();
      it.forEachRemaining( series -> {
    	 System.out.println(series); 
      });
      System.out.println();
      
      System.out.println(" 4 ----using  Advanced for loop----");
      for(String s:tvSeries) {
    	  System.out.println(s);
      }
      System.out.println();
      
      System.out.println(" 5 ----print using for loop with index ----");
      for(int i=0;i<tvSeries.size();i++) {
    	 System.out.println(tvSeries.get(i)); 
      }
      System.out.println();
      
      System.out.println(" 6 ----print using a listIterator to traverse in both direction ----");
      ListIterator<String> lst=tvSeries.listIterator(tvSeries.size());
      while(lst.hasPrevious()) {
    	  String string=lst.previous();
    	  System.out.println(string);
    	  
      }
	}

}
