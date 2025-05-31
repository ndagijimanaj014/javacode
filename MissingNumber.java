package Javacode;

public class MissingNumber {

	public static void main(String[] args) {
		//Find the Missing number
		 int[] a = {1,2,3,4,5,6,8,9,10};
		int n=10;
		int sumOfNnumber=sumOfNnumber(n);
        int sumOfElements= sumOfElements(a);
        int missingNumber=sumOfNnumber-sumOfElements;
        System.out.println("the missing number is:"+missingNumber);
	}
	public static int sumOfNnumber(int n) {
		int sum= (n*(n+1))/2;
		return sum;
	}
	public static int sumOfElements(int[]nums) {
		int sum= 0;
		for(int i=0;i<nums.length;i++) {
			sum= sum+nums[i];
				
		}
		return sum;
		
	}


}
