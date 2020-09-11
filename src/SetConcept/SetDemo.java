package SetConcept;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// Duplicate elements are not allowed
		// hashSet not follow the order/sequence
		//HashSet is a class which implements Set interface
		
       Set<Integer> s=new HashSet<>();
       s.add(45);
       s.add(57);
       s.add(32);
       s.add(89);
       System.out.println("size is:"+s.size());
       System.out.println("values in the set are::"+s);
       System.out.println("***OR***");
       
       //print all the values in hashSet
       for(int t:s) {
    	   System.out.println(t);
       }
       System.out.println("-------------------------");
       
       Set<String> st=new HashSet<>();
       st.add("mayuri");
       st.add("shubham");  
       st.add("surbhi");
       st.add("naveen");
      System.out.println(st.isEmpty());
      System.out.println(st.contains("shubham"));
      System.out.println();
      
      
      // to print all the values in the hashSet
      for(String sr:st) {
      System.out.println(sr);
      }   
      System.out.println();
       
     // s.equals("surbi");
      System.out.println(s.equals("surbi"));
      System.out.println();
      
     System.out.println(st.remove("naveen"));
     //.out.println(st);
      System.out.println();
      System.out.println("------------------------------------------------");
      System.out.println();
      
      
      //*** TreeSet concept****/////
      //duplicate elements are not allowed
      // follow the sequence
      //TreeSet implements SortedSet interface which extends Set Interface
       
      System.out.println("***Treeset Concept***");
      Set<Integer> t=new TreeSet<>();
      t.add(54);
      t.add(43);
      t.add(78);
      t.add(89);
      t.add(44);
      t.add(76);
      
      // to print all the elements of treeSet
      for(int i:t) {
    	  System.out.println(i);
      }
      System.out.println();
      
      Set<Integer> t1=new TreeSet<>();
      t1.add(56);
      t1.add(59);
      t1.add(53);
      t1.add(90);
      t1.add(44);
      t1.add(14);
      t.addAll(t1);
      System.out.println(t);
	}

}
