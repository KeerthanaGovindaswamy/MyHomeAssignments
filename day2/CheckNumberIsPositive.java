package week1.day2;

import java.util.Scanner;

//A number is positive if it is greater than zero (\(>0\)) and negative if it is less than zero (\(<0\)). 
public class CheckNumberIsPositive {

	public static void main(String[] args) {
		//initialize var with int datatypes
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scanObj.nextInt();
		if(a >0) {
			System.out.println("positive number");
		}else {
			System.out.println("Negative number");
		}

	}

}
