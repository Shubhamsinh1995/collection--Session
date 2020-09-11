package SetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		
		 Set<Integer> set=new HashSet<>();
	       set.add(45);
	       set.add(57);
	       set.add(32);
	       set.add(89);
	      // System.out.println("size is:"+s.size());
	       System.out.println("values in the set are::"+set);
	       System.out.println("******");
	       
	       // Convert set into List
	     List<Integer> list=new ArrayList<>(set); // here we pass the object of Set Interface
           System.out.println(list.get(2));
           System.out.println(list.get(3));
	}

}
