package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {3,2,11,4,6,7};
		List<Integer> arrList = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			arrList.add(i, arr[i]);
		}
		System.out.println(arrList);
		Collections.sort(arrList);
		System.out.println(arrList);
		//use get method to print the required element using index
		int largestNum = arrList.get(arrList.size()-2);
		System.out.println(largestNum);

	}

}
