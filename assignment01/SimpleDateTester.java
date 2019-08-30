package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		
		SimpleDate newDate = SimpleDate.of(2019, 8, 26);
		SimpleDate newDate2 = SimpleDate.of(1930, 6, 21);
		
		System.out.println("Date 2 is Before Date 1: " + newDate.before(newDate2));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("SimpleDateOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");
			
			output.println("Date 2 is Before Date 1: " + newDate.before(newDate2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
