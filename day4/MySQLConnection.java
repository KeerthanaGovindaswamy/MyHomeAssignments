package week2.day4;
//abstract class
//can have abstract methods also normal methods
public abstract class MySQLConnection implements DataBaseConnection{
	public void query() {//normal method
		System.out.println("Normal method from abstract class");
	}
	public  abstract void executeQuery();//with abstract keyword method
	public void connect() {
		System.out.println("Connection is succesfull");
	}
	public void disconnect() {
		System.out.println("Disconnected");
	}
	public void executeUpdate() {
		System.out.println("Updated");
	}
	

}
