package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
	int num=10;
	//if given num is divsible by 1 and itseld it is prime
	//check if it is divisible by number between 1 and 3 i.e 2
	//i it is divisible by 2 then it is not prime
	int n = 2;
	boolean prime=true;
	for(int i=n;i<=num-1;i++) {
		if(num%i == 0) {
			System.out.println("It is not prime");	
			prime=false;
			break;
		}
		
	}
    System.out.println(prime);
		
	}

}
