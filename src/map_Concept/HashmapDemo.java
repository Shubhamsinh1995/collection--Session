package map_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Admin");
		map.put(2, "QA");
		map.put(3, "Dev");
		map.put(4, "selenium");
		 System.out.println(map.get(1));
		 System.out.println(map.get(3));
		 System.out.println();
		 
		 // How to Iterate hashMap
		 for(Entry<Integer, String> m:map.entrySet()) {
			// System.out.println(m.getKey()+" "+m.getValue());
			 System.out.println(m);
		 }
		 System.out.println("************");
		 
		 // remove method
		 System.out.println("Before removing "+map);
		 map.remove(4);
		 System.out.println("After removing "+map);
		 System.out.println("******************");
		 
		 Map<Integer,Employee> emp=new HashMap<>();
		 Employee e1=new Employee("akash", 33, "qualiyt");
		 Employee e2=new Employee("vaibhav", 32, "devlopment");
		 Employee e3=new Employee("raghav", 31, "maintanance");
		 Employee e4=new Employee("revas", 30, "production");
		 
		 emp.put(1, e1);
		 emp.put(2, e2);
		 emp.put(3, e3);
		 emp.put(4, e4);
		 
		 
		 //Note: Entry is a interface and entrySet is method which contain both key and value in it.
		 for(Entry<Integer, Employee> xyz:emp.entrySet()){
			int key= xyz.getKey();
			Employee e=xyz.getValue();
			System.out.println(e.name+" "+e.age+" "+e.dept);
		 }
			 
		 }
	}


