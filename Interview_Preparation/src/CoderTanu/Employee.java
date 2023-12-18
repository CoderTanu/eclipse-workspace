package CoderTanu;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int id;
	
	private String name;
	
	Employee(int id , String name){
		this.id=id;
		this.name=name;
	}
	
	//getter
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	//setter
	
	public int setId(int id) {
		return this.id;
	}
	
	
	public String setName(String name) {
		return this.name;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id -o.id ;
	}

	//comparator
	
	public static Comparator<Employee> newEmp = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	
	
	
}
