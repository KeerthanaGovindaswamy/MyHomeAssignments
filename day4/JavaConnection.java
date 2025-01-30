package week2.day4;
//normal class
public class JavaConnection extends MySQLConnection implements DataBaseConnection{

	public static void main(String[] args) {
		//create object for this concrete class JavaConnection
		JavaConnection jcObj =new JavaConnection();
		jcObj.disconnect();
		jcObj.connect();
		jcObj.executeUpdate();
		jcObj.executeQuery();
		jcObj.query();//since this class is the child class for MysqlConnection all the methods in parent class gets called here

	}
//all the unimplemented methods from interface gets implemented here
	//same method name called in various classes hence override
	@Override
	public void connect() {
		System.out.println("Coonection is succesfull");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}
	@Override
	public void executeQuery() {
		System.out.println("the unimplemented method from abstract class gets added here");
		
	}

}
