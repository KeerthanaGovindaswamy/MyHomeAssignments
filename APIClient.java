package week2.day3;
//to understand method overloading
//method overloading is same class same method name but different arguments 
public class APIClient {
	public void sendRequest(String endPoint) {//method with one argument
		System.out.println("Method with single argument : " +endPoint);
	}
    public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {//same method with three arguments
    	System.out.println("Method with triple arguments : " +endPoint + ',' + requestBody + ',' + requestStatus);
	}

	public static void main(String[] args) {
		APIClient apiObj = new APIClient();
		apiObj.sendRequest("https://api.twitter.com");
		apiObj.sendRequest("https://api.twitter.com","req body", true);
		

	}

}
