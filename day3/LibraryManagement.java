package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib=new Library(); //Class objects can be created within the main method of the same class as well as in a different class.
		System.out.println(lib.addBook("Hobbits"));
		lib.issueBook();

	}

}
