package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	//fibbonacci series = 0,1,1,2,3,5
	//num1=0;num2=1
	//num3=num1+num2
	//iterate through for loop
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<=3;i++) {
			num3=num1+num2;//num3=0+1//num3=1+1//num3=1+2//num3=2+3
			num1=num2; //num1=1//num1=1//num1=2//num1=2
			num2=num3;//num2=1//num2=2//num2=3//num2=5
			System.out.println(num3);
		}
}
}
