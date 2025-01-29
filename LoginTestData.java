package week2.day3;
//subcalss of Testdata class
public class LoginTestData extends TestData {//child class or subclass

	public String enterUsername(String name) {
		System.out.println("The username is : " + name);
		return name;
	}
	public String enterPassword(String pass) {
		System.out.println("The passowrd is : " + pass);
		return pass;
	}
	public static void main(String[] args) {
		LoginTestData loginObj = new LoginTestData();//creating obj for child class
		loginObj.enterCredentials();//calling the super class methods by child class object
		String name = loginObj.userName; //using this obj to access variables of the super class
		String pass = loginObj.passWord;//using this obj to access variables of the super class
		loginObj.enterUsername(name);
		loginObj.enterPassword(pass);
		

	}

}
