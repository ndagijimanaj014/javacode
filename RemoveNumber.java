package Javacode;

import java.util.Arrays;

public class RemoveNumber {
	public static void MissingNum() {
//You are given an integer array containing 1 to n but one of 
//the number from 1 to n in the array is missing. 
//You need to provide optimum solution to find the missing number.
//Number can not be repeated in the arry.
		int[] arr1={7,5,6,1,4,2};
		int[]a= new int[arr1.length-1];
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=5) {
			  a[j]=arr1[i];
				j++;
				
				
			}
			
			
		}
		System.out.println(Arrays.toString(a));
		
		
	}

	public static void main(String[] args) {
		MissingNum();
		

	}

}
