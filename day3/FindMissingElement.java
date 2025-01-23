package week1.day3;

import java.util.Arrays;

public class FindMissingElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the missing num from array
		int arr[]= {1,4,3,2,8,6,7};
		
		int len = arr.length;
	//	System.out.println("Length of an array " + len);
	//	int highValue=arr[len-1];
	//	System.out.println(highValue);
		//sort the array
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int i=0;i<len;i++) {
			
			System.out.println(arr[i] + " ");
		}
		int n=1;
		for(int i=0;i<len-1;i++) {
			if(arr[i]!= n) {
				System.out.println(n + " is missing ");
				i--;
			
			}
			n++;
		}
		
		
		

	}

}
