package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dapob1 = new DateAndPlaceOfBirth(2000, 01, 01, "Charlotte", "NC", "USA");
		DateAndPlaceOfBirth dapob2 = new DateAndPlaceOfBirth(1955, 05, 15, "Seattle", "WA", "USA");
		DateAndPlaceOfBirth dapob3 = new DateAndPlaceOfBirth(1977, 03, 22, "Naples", "FL", "USA");
		DateAndPlaceOfBirth dapob4 = new DateAndPlaceOfBirth(1994, 03, 22, "Montreal", "Canada");
		DateAndPlaceOfBirth dapob5 = new DateAndPlaceOfBirth(1994, 03, 22, "Monterrey", "Mexico");
		System.out.println(dapob1);
		System.out.println(dapob2);
		System.out.println(dapob3);
		System.out.println(dapob4);
		System.out.println(dapob5);
		
		System.out.println("\nTests for olderThan method: ");
		System.out.print(dapob1.olderThan(dapob2) + " ");
		System.out.print(dapob1.olderThan(dapob3) + " ");
		System.out.print(dapob1.olderThan(dapob4) + " ");
		System.out.println(dapob1.olderThan(dapob5));
		System.out.print(dapob2.olderThan(dapob1) + " ");
		System.out.print(dapob2.olderThan(dapob3) + " ");
		System.out.print(dapob2.olderThan(dapob4) + " ");
		System.out.println(dapob2.olderThan(dapob5));
		System.out.print(dapob3.olderThan(dapob1) + " ");
		System.out.print(dapob3.olderThan(dapob2) + " ");
		System.out.print(dapob3.olderThan(dapob4) + " ");
		System.out.println(dapob3.olderThan(dapob5));
		System.out.print(dapob4.olderThan(dapob1) + " ");
		System.out.print(dapob4.olderThan(dapob2) + " ");
		System.out.print(dapob4.olderThan(dapob3) + " ");
		System.out.println(dapob4.olderThan(dapob5));
		System.out.print(dapob5.olderThan(dapob1) + " ");
		System.out.print(dapob5.olderThan(dapob2) + " ");
		System.out.print(dapob5.olderThan(dapob3) + " ");
		System.out.println(dapob5.olderThan(dapob4));
		
		System.out.println("\nTests for youngerThan method: ");
		System.out.print(dapob1.youngerThan(dapob2) + " ");
		System.out.print(dapob1.youngerThan(dapob3) + " ");
		System.out.print(dapob1.youngerThan(dapob4) + " ");
		System.out.println(dapob1.youngerThan(dapob5));
		System.out.print(dapob2.youngerThan(dapob1) + " ");
		System.out.print(dapob2.youngerThan(dapob3) + " ");
		System.out.print(dapob2.youngerThan(dapob4) + " ");
		System.out.println(dapob2.youngerThan(dapob5));
		System.out.print(dapob3.youngerThan(dapob1) + " ");
		System.out.print(dapob3.youngerThan(dapob2) + " ");
		System.out.print(dapob3.youngerThan(dapob4) + " ");
		System.out.println(dapob3.youngerThan(dapob5));
		System.out.print(dapob4.youngerThan(dapob1) + " ");
		System.out.print(dapob4.youngerThan(dapob2) + " ");
		System.out.print(dapob4.youngerThan(dapob3) + " ");
		System.out.println(dapob4.youngerThan(dapob5));
		System.out.print(dapob5.youngerThan(dapob1) + " ");
		System.out.print(dapob5.youngerThan(dapob2) + " ");
		System.out.print(dapob5.youngerThan(dapob3) + " ");
		System.out.println(dapob5.youngerThan(dapob4));
		
		System.out.println("\nTests for hasSameBirthDateAs method: ");
		System.out.print(dapob1.hasSameBirthDateAs(dapob2) + " ");
		System.out.print(dapob1.hasSameBirthDateAs(dapob3) + " ");
		System.out.print(dapob1.hasSameBirthDateAs(dapob4) + " ");
		System.out.println(dapob1.hasSameBirthDateAs(dapob5));
		System.out.print(dapob2.hasSameBirthDateAs(dapob1) + " ");
		System.out.print(dapob2.hasSameBirthDateAs(dapob3) + " ");
		System.out.print(dapob2.hasSameBirthDateAs(dapob4) + " ");
		System.out.println(dapob2.hasSameBirthDateAs(dapob5));
		System.out.print(dapob3.hasSameBirthDateAs(dapob1) + " ");
		System.out.print(dapob3.hasSameBirthDateAs(dapob2) + " ");
		System.out.print(dapob3.hasSameBirthDateAs(dapob4) + " ");
		System.out.println(dapob3.hasSameBirthDateAs(dapob5));
		System.out.print(dapob4.hasSameBirthDateAs(dapob1) + " ");
		System.out.print(dapob4.hasSameBirthDateAs(dapob2) + " ");
		System.out.print(dapob4.hasSameBirthDateAs(dapob3) + " ");
		System.out.println(dapob4.hasSameBirthDateAs(dapob5));
		System.out.print(dapob5.hasSameBirthDateAs(dapob1) + " ");
		System.out.print(dapob5.hasSameBirthDateAs(dapob2) + " ");
		System.out.print(dapob5.hasSameBirthDateAs(dapob3) + " ");
		System.out.println(dapob5.hasSameBirthDateAs(dapob4));
		
		System.out.println("\nTests for hasSameBirthDayAs method: ");
		System.out.print(dapob1.hasSameBirthDayAs(dapob2) + " ");
		System.out.print(dapob1.hasSameBirthDayAs(dapob3) + " ");
		System.out.print(dapob1.hasSameBirthDayAs(dapob4) + " ");
		System.out.println(dapob1.hasSameBirthDayAs(dapob5));
		System.out.print(dapob2.hasSameBirthDayAs(dapob1) + " ");
		System.out.print(dapob2.hasSameBirthDayAs(dapob3) + " ");
		System.out.print(dapob2.hasSameBirthDayAs(dapob4) + " ");
		System.out.println(dapob2.hasSameBirthDayAs(dapob5));
		System.out.print(dapob3.hasSameBirthDayAs(dapob1) + " ");
		System.out.print(dapob3.hasSameBirthDayAs(dapob2) + " ");
		System.out.print(dapob3.hasSameBirthDayAs(dapob4) + " ");
		System.out.println(dapob3.hasSameBirthDayAs(dapob5));
		System.out.print(dapob4.hasSameBirthDayAs(dapob1) + " ");
		System.out.print(dapob4.hasSameBirthDayAs(dapob2) + " ");
		System.out.print(dapob4.hasSameBirthDayAs(dapob3) + " ");
		System.out.println(dapob4.hasSameBirthDayAs(dapob5));
		System.out.print(dapob5.hasSameBirthDayAs(dapob1) + " ");
		System.out.print(dapob5.hasSameBirthDayAs(dapob2) + " ");
		System.out.print(dapob5.hasSameBirthDayAs(dapob3) + " ");
		System.out.println(dapob5.hasSameBirthDayAs(dapob4));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("PlaceDOBOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

			DateAndPlaceOfBirth dapob12 = new DateAndPlaceOfBirth(2000, 01, 01, "Charlotte", "NC", "USA");
			DateAndPlaceOfBirth dapob22 = new DateAndPlaceOfBirth(1955, 05, 15, "Seattle", "WA", "USA");
			DateAndPlaceOfBirth dapob32 = new DateAndPlaceOfBirth(1977, 03, 22, "Naples", "FL", "USA");
			DateAndPlaceOfBirth dapob42 = new DateAndPlaceOfBirth(1994, 03, 22, "Montreal", "Canada");
			DateAndPlaceOfBirth dapob52 = new DateAndPlaceOfBirth(1994, 03, 22, "Monterrey", "Mexico");
			output.println(dapob12);
			output.println(dapob22);
			output.println(dapob32);
			output.println(dapob42);
			output.println(dapob52);
			
			output.println("\nTests for olderThan method: ");
			output.print(dapob1.olderThan(dapob2) + " ");
			output.print(dapob1.olderThan(dapob3) + " ");
			output.print(dapob1.olderThan(dapob4) + " ");
			output.println(dapob1.olderThan(dapob5));
			output.print(dapob2.olderThan(dapob1) + " ");
			output.print(dapob2.olderThan(dapob3) + " ");
			output.print(dapob2.olderThan(dapob4) + " ");
			output.println(dapob2.olderThan(dapob5));
			output.print(dapob3.olderThan(dapob1) + " ");
			output.print(dapob3.olderThan(dapob2) + " ");
			output.print(dapob3.olderThan(dapob4) + " ");
			output.println(dapob3.olderThan(dapob5));
			output.print(dapob4.olderThan(dapob1) + " ");
			output.print(dapob4.olderThan(dapob2) + " ");
			output.print(dapob4.olderThan(dapob3) + " ");
			output.println(dapob4.olderThan(dapob5));
			output.print(dapob5.olderThan(dapob1) + " ");
			output.print(dapob5.olderThan(dapob2) + " ");
			output.print(dapob5.olderThan(dapob3) + " ");
			output.println(dapob5.olderThan(dapob4));
			
			output.println("\nTests for youngerThan method: ");
			output.print(dapob1.youngerThan(dapob2) + " ");
			output.print(dapob1.youngerThan(dapob3) + " ");
			output.print(dapob1.youngerThan(dapob4) + " ");
			output.println(dapob1.youngerThan(dapob5));
			output.print(dapob2.youngerThan(dapob1) + " ");
			output.print(dapob2.youngerThan(dapob3) + " ");
			output.print(dapob2.youngerThan(dapob4) + " ");
			output.println(dapob2.youngerThan(dapob5));
			output.print(dapob3.youngerThan(dapob1) + " ");
			output.print(dapob3.youngerThan(dapob2) + " ");
			output.print(dapob3.youngerThan(dapob4) + " ");
			output.println(dapob3.youngerThan(dapob5));
			output.print(dapob4.youngerThan(dapob1) + " ");
			output.print(dapob4.youngerThan(dapob2) + " ");
			output.print(dapob4.youngerThan(dapob3) + " ");
			output.println(dapob4.youngerThan(dapob5));
			output.print(dapob5.youngerThan(dapob1) + " ");
			output.print(dapob5.youngerThan(dapob2) + " ");
			output.print(dapob5.youngerThan(dapob3) + " ");
			output.println(dapob5.youngerThan(dapob4));
			
			output.println("\nTests for hasSameBirthDateAs method: ");
			output.print(dapob1.hasSameBirthDateAs(dapob2) + " ");
			output.print(dapob1.hasSameBirthDateAs(dapob3) + " ");
			output.print(dapob1.hasSameBirthDateAs(dapob4) + " ");
			output.println(dapob1.hasSameBirthDateAs(dapob5));
			output.print(dapob2.hasSameBirthDateAs(dapob1) + " ");
			output.print(dapob2.hasSameBirthDateAs(dapob3) + " ");
			output.print(dapob2.hasSameBirthDateAs(dapob4) + " ");
			output.println(dapob2.hasSameBirthDateAs(dapob5));
			output.print(dapob3.hasSameBirthDateAs(dapob1) + " ");
			output.print(dapob3.hasSameBirthDateAs(dapob2) + " ");
			output.print(dapob3.hasSameBirthDateAs(dapob4) + " ");
			output.println(dapob3.hasSameBirthDateAs(dapob5));
			output.print(dapob4.hasSameBirthDateAs(dapob1) + " ");
			output.print(dapob4.hasSameBirthDateAs(dapob2) + " ");
			output.print(dapob4.hasSameBirthDateAs(dapob3) + " ");
			output.println(dapob4.hasSameBirthDateAs(dapob5));
			output.print(dapob5.hasSameBirthDateAs(dapob1) + " ");
			output.print(dapob5.hasSameBirthDateAs(dapob2) + " ");
			output.print(dapob5.hasSameBirthDateAs(dapob3) + " ");
			output.println(dapob5.hasSameBirthDateAs(dapob4));
			
			output.println("\nTests for hasSameBirthDayAs method: ");
			output.print(dapob1.hasSameBirthDayAs(dapob2) + " ");
			output.print(dapob1.hasSameBirthDayAs(dapob3) + " ");
			output.print(dapob1.hasSameBirthDayAs(dapob4) + " ");
			output.println(dapob1.hasSameBirthDayAs(dapob5));
			output.print(dapob2.hasSameBirthDayAs(dapob1) + " ");
			output.print(dapob2.hasSameBirthDayAs(dapob3) + " ");
			output.print(dapob2.hasSameBirthDayAs(dapob4) + " ");
			output.println(dapob2.hasSameBirthDayAs(dapob5));
			output.print(dapob3.hasSameBirthDayAs(dapob1) + " ");
			output.print(dapob3.hasSameBirthDayAs(dapob2) + " ");
			output.print(dapob3.hasSameBirthDayAs(dapob4) + " ");
			output.println(dapob3.hasSameBirthDayAs(dapob5));
			output.print(dapob4.hasSameBirthDayAs(dapob1) + " ");
			output.print(dapob4.hasSameBirthDayAs(dapob2) + " ");
			output.print(dapob4.hasSameBirthDayAs(dapob3) + " ");
			output.println(dapob4.hasSameBirthDayAs(dapob5));
			output.print(dapob5.hasSameBirthDayAs(dapob1) + " ");
			output.print(dapob5.hasSameBirthDayAs(dapob2) + " ");
			output.print(dapob5.hasSameBirthDayAs(dapob3) + " ");
			output.println(dapob5.hasSameBirthDayAs(dapob4));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
