package listConcept;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	
	String name;
	int age;
	int salary;
	String dept;

	 public Emp(String name, int age, int salary, String dept){
		 this.name=name;
		 this.age=age;
		 this.salary=salary;
		 this.dept=dept;	
	}
	 
	 
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}


	public static void main(String[] args) {
		
		// Emp class object
		List<Emp> e=new ArrayList<Emp>();
         e.add(new Emp("shubham", 25, 25000, "QA"));
         e.add(new Emp("shubhangi", 27, 28000, "dev"));
         e.add(new Emp("Vikas", 26, 25000, "Analist"));
         
         for(Emp emp:e) {
         System.out.println(emp);
         }
	}

}
