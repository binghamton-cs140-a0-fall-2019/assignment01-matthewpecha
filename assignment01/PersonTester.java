package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth(1990, 01, 14, "Fort Worth", "Texas", "USA");
		StreetUSAddress address1 = new StreetUSAddress("40 Jimmy Road", "Condo 313", "Portland", "Oregon", "97035");
		Person newPerson = new Person("Michael", "Cera", "112-23-3334", person1, address1);

		System.out.println(newPerson);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("PersonOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");
			
			DateAndPlaceOfBirth person2 = new DateAndPlaceOfBirth(1945, 05, 29, "Binghamton", "NY", "USA");
			StreetUSAddress address2 = new StreetUSAddress("17 Lane Drive", "Apt 04", "Portland", "Oregon", "97035");
			Person newPerson2 = new Person("Michael", "Cera Sr.", "211-32-4333", person2, address2);

			output.println(newPerson2);
		
		

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
