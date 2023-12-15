package CoderTanu;

import java.util.Scanner;

public class DifferenceofSum {
	
	public static int differenceofSum(int m, int n) {
		
		int divisibleSum=0; int notDivisibleSum=0;
		
		for(int i=0; i<=n; i++) {
			
			if(!(i%m==0)) {
				notDivisibleSum += i;
			}else {
				divisibleSum += i;
			}
			
			
		}
		
		
		
		return Math.abs(notDivisibleSum-divisibleSum);
	}

	
	
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the vlaue of m: ");
		int m=sc.nextInt();
		System.out.println("Enter the vlaue of n: ");
		int n=sc.nextInt();
		
		int d =differenceofSum(m,n);
		System.out.println(d);
		
	}

	
}
