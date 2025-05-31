package Javacode;

public class palindromeornot {

	public static void main(String[] args) {
		String n="dadu";
		//isPalindrome(n);
		
		System.out.println(isPalindrome(n));

	}
	public static boolean isPalindrome(String a) {
		
		int left=0;
		int right=a.length()-1;
		while(left<right) {
			
			
		
		while(left<right&&!Character.isLetterOrDigit(a.charAt(right))) {
			right--;
			
		}
		while(left<right&&!Character.isLetterOrDigit(a.charAt(left))) {
			left++;
			
		}
		if(Character.toLowerCase(a.charAt(right))!=Character.toLowerCase(a.charAt(left))) {
			System.out.println("is not palindrome");
			return false;
			
		} 

		left++;
		right--;
			
		}
		System.out.println("is palindrome");
		return true;
	}
	
	
	

}
