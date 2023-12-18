package CoderTanu;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
	
		
		int arr[] = {11,2,3,45};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		

		//without comparable , Exception in thread "main" java.lang.ClassCastException: class CoderTanu.Employee cannot be cast to class java.lang.Comparable (CoderTanu.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//		Employee[] emp= new Employee[4];
//		emp[0]=new Employee(1,"Radha");
//		emp[1]= new Employee(2, "krishna");
//		emp[2]= new Employee(3, "shiva");
//		emp[3]=new Employee(4, "parvati");
//		
//		Arrays.sort(emp);
//		System.out.println(Arrays.toString(emp));
//		
		//comparator
		
		Employee[] emp= new Employee[4];
		emp[0]=new Employee(11,"Radha");
		emp[1]= new Employee(2, "Krishna");
		emp[2]= new Employee(3, "Shiva");
		emp[3]=new Employee(45, "Parvati");
		
		Arrays.sort(emp , Employee.newEmp);
		System.out.println(Arrays.toString(emp));
		
	}

}
