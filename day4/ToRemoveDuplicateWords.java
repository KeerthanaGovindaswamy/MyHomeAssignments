package week1.day4;

public class ToRemoveDuplicateWords {
//String text = “We learn Java basics as part of java sessions in java week1”;
//	Expected output: “We learn Java basics as part of sessions in week1”
//split using space--->after split string array will be formed
	//iterate through array using for loop compare i=0 and i=0+1
	//if matches replace the word with null values
	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		//split
		String[] strArr = text.split(" ");
		for(int i=0;i<=strArr.length-1;i++) {
		//	System.out.println("i " + i + strArr[i]);
			for(int j=i+1;j<=strArr.length-1;j++) {
		//		System.out.println("j " + j + strArr[j]);
				if(strArr[i].equalsIgnoreCase(strArr[j])) {//to compare the content of string .equals is used
				count++;
				strArr[j]="";
				}
			}
		}
		if(count>=1) {
			for(int i=0;i<=strArr.length-1;i++) {
				System.out.println(strArr[i]);
			}
			
		}

	}

}
