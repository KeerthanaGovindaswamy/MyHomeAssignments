package week1.day3;

public class Library {
	//addBook method
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	//issue book method
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		//object creation
		Library bookAdd=new Library();
		System.out.println(bookAdd.addBook("Harrypotter"));
		bookAdd.issueBook();
		

	}

}
