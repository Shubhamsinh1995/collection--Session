package listConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrListConcept {

	public static void main(String[] args) {
		
		
		// ArrayList is a class which implements List interface which extends Collection interface
		//ArrayList >> dynamic Array
		// follow insertion order
		//duplicate element is allowed
		
		ArrayList<Integer> ar=new ArrayList<Integer>(); //  <> this symbol is called generic in in collectoin 
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		//ar.add("shubham");
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
			System.out.println();
			
			ArrayList<String> ar1=new ArrayList<String>(); //generic for Wrapper class is String
			ar1.add("shubham");
			ar1.add("selenium");
			System.out.println(ar1.size());
			for(int k=0;k<ar1.size();k++) {
				System.out.println(ar1.get(k));
			}
			    System.out.println();
			    
				// Employee class object
			    System.out.println("***Employee class object***");
				Employee e1=new Employee("shubham", 25, "dev");
				Employee e2=new Employee("rohan12", 24, "QA");
				Employee e3=new Employee("shu1234", 23, "Analist");
				
				ArrayList<Employee> ar2=new ArrayList<Employee>();
				ar2.add(e1);
				ar2.add(e2);
				ar2.add(e3);
				
				//iterator to traverse the value
				Iterator<Employee> it=ar2.iterator();
				while(it.hasNext()) {
					Employee emp=it.next(); //to fetch the next value
					System.out.print(emp.name);
                     System.out.print("  ");
					System.out.print(emp.age);
			          System.out.print("  ");
					System.out.print(emp.dept);
					System.out.println();
				}
				
				
				  System.out.println("**** addAll() concept***");
				  
				  ArrayList<String> ar3=new ArrayList<String>();
					ar3.add("shubham");
					ar3.add("test");
					ar3.add("selenium");
				
					 ArrayList<String> ar4=new ArrayList<String>();
						ar4.add("java");
						ar4.add("c");
						
						ar3.addAll(ar4);
						System.out.println(ar3);
						System.out.println();
						
					System.out.println("**** removeAll() concept***");	
					  ar3.removeAll(ar4);
					  System.out.println(ar3);
					  System.out.println();
					  
					  
					  System.out.println("**** retainAll() concept***");
					  
					  ArrayList<String> ar7=new ArrayList<String>();
					  ar7.add("shubham");
					  ar7.add("java");
					  ar7.add("selenium");
					
					  ArrayList<String> ar8=new ArrayList<String>();
					  ar8.add("java");
					  ar8.add("c");
							
					  ar7.retainAll(ar8);
					  System.out.println(ar7);
					  
					  List<Integer> values=new ArrayList<Integer>();
					  values.add(3);
					  values.add(4);
					  values.add(33);
					  values.add(55);
					  values.add(21);
					  values.add(1);
					  values.add(9);
					  values.add(3, 99);
					  System.out.println(values);
					 Collections.sort(values);  //for sorting the element

					  values.forEach(System.out::println); //stream API ... lambda expression
					  
					  List<Integer> value=new ArrayList<Integer>();
					  value.add(3);
					  value.add(4);
					  value.add(33);
					  value.add(21);
					  value.add(9);
					  
					  System.out.println(value.contains(21));
					  System.out.println(value.isEmpty());
					  //System.out.println(value.remove(6));
					  System.out.println(value.size());
			}
			
		}
		

	

