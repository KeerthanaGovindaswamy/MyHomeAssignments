package week1.day4;

public class ChangeOddIndex {
//Change the odd index of a given String to uppercase with the input : String test = “changeme”;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "changeme";
		char[] chArr = txt.toCharArray();
		for(int i=0;i<=chArr.length-1;i++) {
		//	System.out.println(chArr[i]);
		//	char ch = txt.charAt(i);
			if(i%2!=0) {
			char ch =	Character.toUpperCase(chArr[i]);//to convert char to uppercase
			String rem = " ";
		//	System.out.println(ch);
			chArr[i]=ch;
			}
			System.out.println(chArr[i]);
		}
	//	String newTxt = chArr.toString();
	//	System.out.println(chArr.toString());

	}

}
