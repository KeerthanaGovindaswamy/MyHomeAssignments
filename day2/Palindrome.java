package week1.day2;

public class Palindrome {
//A number that remains unchanged when its digits are reversed is called a Palindrome number
	public static void main(String[] args) {
		int ip=11;
		int op=0;
		int k;
	//	System.out.println("ip " + ip);
		for(int i=ip;i>0;i=k) {
			k=i/10;
		//	System.out.println("k "   + k);
			int j = i % 10;
		//	System.out.println("j "   + j);
			op=(op*10)+j;
		//	System.out.println("op "   + op);
		//	System.out.println("ip " + ip);
		//	System.out.println("op " + op);
			
		}
		
		if (ip == op) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}
	}

}
