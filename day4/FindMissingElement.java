package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*- Declare an array {1, 2, 3, 4, 10, 6, 8}.
- Do a comparison check if there is a gap in the sequence of numbers.
- Print the numbers that are missing.
*/
public class FindMissingElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> listArr = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			listArr.add(i, arr[i]);
		}
		System.out.println("List is : "+listArr);//[1,2,3,4,10,6,8]
		//sort the list
		Collections.sort(listArr);
		System.out.println("After sorting : "  + listArr);// [1, 2, 3, 4, 6, 8, 10]
		//print the missed numbers from list
		//to get the missed numbers iterate through list
		for(int i=0;i<listArr.size()-1;i++) {//checking only till index before the last index
			int num = listArr.get(i);
			int checkNum = num+1;
			
			if(checkNum == listArr.get(i+1)) {//get[7]
				
			}else {
				System.out.println("Missed number is :" +checkNum);
			}
			
		}

	}

}
