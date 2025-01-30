package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
Add the collection to a list
Iterate the values in the list
Print the required output as Wipro, HCL, CTS, Aspire Systems*/
public class SortingUsingCollection {

	public static void main(String[] args) {
		//declare string array;
		String [] arr =  {"HCL", "Wipro", "Aspire Systems","CTS"};
		List<String> listStrarr = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			listStrarr.add(i, arr[i]);
		}
		System.out.println(listStrarr);
		//Reverse the given collection of String elements
		//sort the arrayList
		Collections.sort(listStrarr);//aspire,cts,hcl,wipro
		System.out.println("After sorting " + listStrarr);
		//iterate from last index to get reverse list
		int size = listStrarr.size();
		System.out.println(size);
		List<String> reverseList = new ArrayList<String>();
		for(int i=size-1;i>=0;i--) {
		//int j=0;
			String str=listStrarr.get(i);
			System.out.println(str);
			reverseList.add(str);
		//	j++;
		}
		System.out.println(reverseList);
	}

}
