package assignment01;

public class Person {
	private String firstNames;
	private String lastNames;
	private int ssn;
	private DateAndPlaceOfBirth placeDob;
	private StreetUSAddress address;
	
	public Person(String fstNames, String lstNames, String ssnString, 
			DateAndPlaceOfBirth pdob, StreetUSAddress addr) {
		firstNames = fstNames;
		lastNames = lstNames;
		var str = ssnString.trim().replace("-", "");
		while(str.charAt(0)=='0') {
			str = str.substring(1);
		}
		try {
			ssn = Integer.parseInt(str);
		}catch(NumberFormatException ex) {
			System.out.println("Bad format for the SSN, please only digits or use '-' separators");
			throw new IllegalArgumentException("This entry is not acceptable: " + ssnString);
		}
		placeDob = pdob;
		address = addr;
	}
	
	public String getFirstNames() {
		return firstNames;
	}
	public String getLastNames() {
		return lastNames;
	}
	public String getSSN() {
			String str = String.format("%09d", ssn);
			return str.substring(0,3) + "-" + str.substring(3,5) + "-" + str.substring(5); 
			//return String.format("%03d-%02d-%04d", ssn/1000000,ssn%1000000/10000, ssn%10000);
	}
	public DateAndPlaceOfBirth getPlaceDob() {
		return placeDob;
	}
	public StreetUSAddress getAddress() {
		return address;
	}
	@Override
	public String toString() {
			return String.format("%s %s %s, \n%s \n%s", firstNames, lastNames, "(" + ssn + ")", placeDob,
					address);
		}
	}

