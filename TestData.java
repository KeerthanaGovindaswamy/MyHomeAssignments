package week2.day3;
//understanding single level inheritance
//superclass is testdata
public class TestData {
	String userName="Kikie";
	String passWord="Jsrk@2017";
	public void enterCredentials(){
	
	System.out.println("The credentials are : " + userName + " and "+ passWord);
	}
	public void navigateToHomePage() {
		System.out.println("Navigated to home page");
	}
public static void main(String[]args) {
	TestData tdObj = new TestData();//creating object to call methods of class
	tdObj.enterCredentials();
	tdObj.navigateToHomePage();
}

}
