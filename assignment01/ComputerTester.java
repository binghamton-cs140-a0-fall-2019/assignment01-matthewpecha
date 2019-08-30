package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
		Computer disk1 = new Computer("Dell", "Intel", 8, 500, false, 200);
		Computer disk2 = new Computer("Asus", "AMD", 16, 2000, false, 700);
		Computer disk3 = new Computer("Apple", "Intel", 8, 120, true, 1300);
		Computer disk4 = new Computer("HP", "AMD", 32, 5000, true, 1700);
		System.out.println(disk1);
		System.out.println(disk2);
		System.out.println(disk3);
		System.out.println(disk4);
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("ComputerOutput.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			
		Computer disk12 = new Computer("Dell", "Intel", 8, 500, false, 200);
		Computer disk22 = new Computer("Asus", "AMD", 16, 2000, false, 700);
		Computer disk32 = new Computer("Apple", "Intel", 8, 120, true, 1300);
		Computer disk42 = new Computer("HP", "AMD", 32, 5000, true, 1700);
		output.println(disk12);
	    output.println(disk22);
		output.println(disk32);
		output.println(disk42);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
