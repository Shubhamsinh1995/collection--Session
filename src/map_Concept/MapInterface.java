package map_Concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map interface
		//it stores values on the basis of Key-Value pair
		//it contains only unique element
		//extends AbstractMap
		//it contains one null Key and multiple null value 
		//it maintains no order
		//HashMap is non synchronized --not thread safe
		//Concurrent modification exception --fail fast condition
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "shubham");
		hm.put(2, "joy");
		hm.put(3, "vinod");
		hm.put(4, "selenium");
		System.out.println(hm.get(2));
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		System.out.println("----------------------");
		
		for(Entry<Integer,String> m:hm.entrySet()) {
			//System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(m);
		}
		System.out.println("---------------");
		
		System.out.println("Before removing::"+hm);
		hm.remove(2);
		System.out.println("After removing::"+hm);
		System.out.println("------------------");
		
		Map<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee ep1=new Employee("ashwin",43,"dev");
		Employee ep2=new Employee("shreyya",45,"tester");
		Employee ep3=new Employee("akasf",44,"system");
		
		emp.put(1, ep1);
		emp.put(2, ep2);
		emp.put(3, ep3);
		for(Entry<Integer,Employee> m:emp.entrySet()) {
			int key=m.getKey();     //*****
			Employee e=m.getValue();//*****
			System.out.println("Employee "+key+":"+" "+e.name+"  "+e.age+"  "+e.dept);
		}
	}

}
