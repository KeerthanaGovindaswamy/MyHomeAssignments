package week1.day4;

import java.util.Arrays;

public class StringAnagram {
//example: str1="stops" str2="potss"
	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		if(str1.length()==str2.length()) {
			System.out.println("Length matches check for the anagram");
			//convert each string into charArr[]
			char[] chArr1 = str1.toCharArray();//stores as a char
			char[] chArr2 = str2.toCharArray();//stores as a char
			//sort the array
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			//System.out.println("After sorting");
			for(int i=0;i<=chArr1.length-1;i++) {
				System.out.println(chArr1[i]);
					System.out.println(chArr2[i]);
					if(chArr1[i]==chArr2[i]) {
						System.out.println("The given char macthes");
					}else {
						System.out.println("The given char does not match");
					}
				}
			System.out.println("The given strings are Anagram");
			}else {
				System.out.println("The given strings are not Anagram");
			}
		}

	}


