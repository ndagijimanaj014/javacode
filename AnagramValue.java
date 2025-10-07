package Javacode;

public class AnagramValue {

	public static void main(String[] args) {
		//	Given two strings s and t, return true if t is an anagram of s, and false otherwise.
			//String s= "anagram";
			//String t= "nagaram";
			//rearranging the letters of a different word
			System.out.println(isAnagram("anagram","nagaram"));
		}
		public static boolean isAnagram(String s,String t) {
			if(s.length()!=t.length()) {
				return false;
				
			}
			int count[]= new int[26];
			for(int i=0;i<s.length();i++) {
				count[s.charAt(i)-'a']++;
				count[t.charAt(i)-'a']--;
				}
			for(int i=0;i<26;i++) {
			if(!count.equals(0)) {
				//System.out.println("is not Anagram");
				return false;
			}	
			}
			//System.out.println("is Anagram");
			return true;
			
		}

}
