package week2.day4;

import java.util.ArrayList;
import java.util.List;

//Find intersection of numbers using list interface
//- Declare an array for {3, 2, 11, 4, 6, 7}
//- Declare another array for {1, 2, 8, 4, 9, 7}
//- Compare both the arrays
//- Print the values if they are equal
public class ToUnderstandListInterface {
	
	

	public static void main(String[]args) {
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		List<Integer> listArr1 = new ArrayList<Integer>();
		//add array elements to list
		for(int i=0;i<arr1.length;i++) {
			listArr1.add(i, arr1[i]);//adding the arr element to list
		//	System.out.println(listArr1);
		}
		List<Integer> listArr2 = new ArrayList<Integer>();
		//add array elements to list
		for(int i=0;i<arr2.length;i++) {
			listArr2.add(i, arr2[i]);
		//	System.out.println(listArr2);
/*[3]
[3, 2]
[3, 2, 11]
[3, 2, 11, 4]
[3, 2, 11, 4, 6]
[3, 2, 11, 4, 6, 7]
[1]
[1, 2]
[1, 2, 8]
[1, 2, 8, 4]
[1, 2, 8, 4, 9]
[1, 2, 8, 4, 9, 7]*/
			int listArrSize1 = listArr1.size();
			int listArrSize2 = listArr2.size();
			for(int j=0;j<listArrSize1;j++) {
				for(int k=0;k<listArrSize2;k++) {
					if(listArr1.get(j) == listArr2.get(k)) {
						System.out.println("Equal : " + listArr1.get(j) +',' + listArr2.get(k) );
					}/*else {
						System.out.println("Not Equal : " + listArr1.get(j) +',' + listArr2.get(k) );
					}*/
				}
				
			}
		}
		}

	

}
