package week1.day4;



public class ReverseOddWords {
//split string with space as delimiter
//loop through string array and find the odd index of the string
	//and reverse the string by for loop
	public static void main(String[] args) {
		String text="I am an apple";
		String[] arrText = text.split(" ");
		for(int i=0;i<=arrText.length-1;i++) {
		//	System.out.println(arrText[i]);
			if(i%2!=0) {
			//	System.out.println("Index is odd : " + i);
			//	System.out.println("Word of odd index : " + arrText[i]);
				char[] arrChar=arrText[i].toCharArray();//converting to char array to reverse
				for(int j=arrChar.length-1;j>=0;j--) {
					System.out.println(arrChar[j]);
				}
			}else {
				System.out.println(arrText[i] );
			//	String newArr=new String(arrText[i]);
			}
		}
	}

}
