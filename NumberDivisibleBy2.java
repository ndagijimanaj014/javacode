package Javacode;

public class NumberDivisibleBy2 {
	public static void DivisibleNumber(){
		/*
		 * 1.Iterate through number 1 to 100 If the number is divisible by 2 print an
		 * output "Divisible by 2" If number is divisible by 7 print an output
		 * "Divisible by 7" If number is divisible by 14, print an output
		 * "Divisible by 14", at this time it should not print "Divisible by 2" or
		 * "Divisible by 7"in java conding?
		 */ 
		System.out.println("the number divisible by2:");
		for(int i=0;i<=100;i++) {
			
			if(i%2==0) {
				System.out.println(i+",");
				
			}
			
			
			}
		System.out.println("the number divisible by7:");
		for(int i=0;i<=100;i++) {
			
			if(i%7==0) {
				System.out.println(i+",");
				
			}
			
			
			}
		System.out.println("the number divisible by2&7:");
		for(int i=0;i<=100;i++) {
			
			if(i%2==0&&i%7==0) {
				System.out.println(i+",");
				
			}
			
			
			}
		System.out.println("the number should not divisible by2:");
		for(int i=0;i<=100;i++) {
			
			if(i%2!=0) {
				System.out.println(i+",");
				
			}
			
			
			}
		System.out.println("the number should not divisible by7:");
		for(int i=0;i<=100;i++) {
			
			if(i%7!=0) {
				System.out.println(i+",");
				
			}
			
			
			}
		
						
			
		}
		
	

	public static void main(String[] args) {
		
		DivisibleNumber();

	}

}
