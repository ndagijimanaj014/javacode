package Javacode;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercises {

	public static void main(String[] args) {
//		Print numbers from 1 to 15, but:
//			•	Print “Fizz” if divisible by 3//3,6,9,12,15
//			•	Print “Buzz” if divisible by 5//5,10,15
//			•	Print “FizzBuzz” if divisible by both//1
		//int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=1;i<15;i++) {
			
			if(i%3==0) {
				System.out.println("FIZZ");
				
			} else if(i%5==0) {
				System.out.println("BUZZ");
				
			} else {
				if(i%3==0 && i%5==0) {
					System.out.println("FIZZBUZZ");
				}
				
			
			}
			
		}
	
}
}	
		
			
		

	
		
