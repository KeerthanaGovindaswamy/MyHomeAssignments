package week1.day2;

public class PrintOddNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print only odd numbers
		//1,3,5,7,9
		int num[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num.length;i++){//0<10
		if(num[i]%2 != 0){
		System.out.println(num[i]);
		}
		}

	}

}
