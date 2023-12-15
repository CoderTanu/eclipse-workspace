package CoderTanu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfSecondLargestNo {
	
	

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n= sc.nextInt();
		//array created
		int arr[]= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//arraylist to store the values
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		
		
		for(int i=0; i<n; i++) {
			if(i%2 ==0 ) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		
		
		Collections.sort(even);
		for(int e: even) {
		System.out.print(e +" ");
		System.out.println();
		
		}
		Collections.sort(odd);
		for(int o:odd) {
			System.out.print(o +"");
			System.out.println();
		}
		
		
		
		int evenV = even.get(even.size()-2);
		int oddV = even.get(odd.size()-2);
		System.out.println(evenV+oddV);
	

	}

}
