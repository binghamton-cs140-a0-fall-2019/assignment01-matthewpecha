package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth(1990, 01, 14, "Fort Worth", "Texas", "USA");
		StreetUSAddress address1 = new StreetUSAddress("40 Jimmy Road", "Condo 313", "Portland", "Oregon", "97035");
		Person newPerson = new Person("Michael", "Cera", "112-23-3334", person1, address1);
		
		ComputerOwner compOwner = new ComputerOwner(newPerson);
		
		Computer comp1 = new Computer("Dell", "Intel", 8, 500, false, 200);
		Computer comp2 = new Computer("Asus", "AMD", 16, 2000, false, 700);
		Computer comp3 = new Computer("Apple", "Intel", 8, 120, true, 1300);
		Computer comp4 = new Computer("HP", "AMD", 32, 5000, true, 1700);
		
		compOwner.addComputer(comp1);
		compOwner.addComputer(comp2);
		compOwner.addComputer(comp3);
		compOwner.addComputer(comp4);
		
		System.out.println("Owner with four computers:\n");
		System.out.println(compOwner);
		
		compOwner.removeComputer(1);
		compOwner.removeComputer(2);
		
		System.out.println("\nOwner with two computers:\n");
		System.out.println(compOwner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("ComputerOwnerOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

			DateAndPlaceOfBirth person12 = new DateAndPlaceOfBirth(1990, 01, 14, "Fort Worth", "Texas", "USA");
			StreetUSAddress address12 = new StreetUSAddress("40 Jimmy Road", "Condo 313", "Portland", "Oregon", "97035");
			Person newPerson2 = new Person("Michael", "Cera", "112-23-3334", person12, address12);
			
			ComputerOwner compOwner2 = new ComputerOwner(newPerson2);
			
			Computer comp12 = new Computer("Dell", "Intel", 8, 500, false, 200);
			Computer comp22 = new Computer("Asus", "AMD", 16, 2000, false, 700);
			Computer comp32 = new Computer("Apple", "Intel", 8, 120, true, 1300);
			Computer comp42 = new Computer("HP", "AMD", 32, 5000, true, 1700);
			
			compOwner.addComputer(comp12);
			compOwner.addComputer(comp22);
			compOwner.addComputer(comp32);
			compOwner.addComputer(comp42);
			
			output.println("Owner with four computers:\n");
			output.println(compOwner2);
			
			compOwner.removeComputer(1);
			compOwner.removeComputer(2);
			
			output.println("\nOwner with two computers:\n");
			output.println(compOwner2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
