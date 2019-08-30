package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress address1 = new StreetUSAddress("123 Main St", "Apt 01", "Binghamton", "NY", "13905");
		StreetUSAddress address2 = new StreetUSAddress("74 Dog Avenue", "", "Binghamton", "NY", "13901");
		
		System.out.println(address1 + "\n");
		System.out.println(address2);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("USAddressOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		StreetUSAddress address12 = new StreetUSAddress("321 Secondary St", "Apt 15", "Binghamton", "NY", "13903");
		StreetUSAddress address22 = new StreetUSAddress("16 Cat Circle", "", "Binghamton", "NY", "13902");
			
		output.println(address12 + "\n");
		output.println(address22);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
