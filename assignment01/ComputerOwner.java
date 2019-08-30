package assignment01;
import java.util.ArrayList;
import java.util.List;

public class ComputerOwner {
	private Person owner;
	private List<Computer> computers = new ArrayList<>();
	
	public ComputerOwner(Person owner) {
		this.owner = owner;
	}
	public Person getOwner() {
		return owner;
	}
	public List<Computer> getComputers(){
		return computers;
	}
	public void addComputer(Computer comp) {
		computers.add(comp);
	}
	public void removeComputer(int i) {
		computers.remove(i);
	}
	@Override
	public String toString() {
		return "Computer List: \nOwner: " + owner + "\nComputers: " + computers;
	}
}

