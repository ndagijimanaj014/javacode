package Javacode;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

	public static void main(String[] args) {
		//AGiven an integer array nums, return true 
			//if any value appears at least twice in the array,
			//and return false if every element is distinct.
			int[] a= {1,6,2,2,3,4,5};
			containsDuplicate(a);
		}
		public static boolean containsDuplicate(int[]nums) {
			Set<Integer> set= new HashSet<>();
			for(int i=0;i<nums.length;i++) {
				if(set.contains(nums[i])) {
					System.out.println(" is contains duplicate");
					return true;
					
					
				} else {
					set.add(nums[i]);
				}
				
			}
			System.out.println(" is not contains duplicate");
			return false;
			
		}
}
