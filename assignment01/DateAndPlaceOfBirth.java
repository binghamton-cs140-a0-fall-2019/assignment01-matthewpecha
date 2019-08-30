package assignment01;
import java.time.LocalDate;

public class DateAndPlaceOfBirth {
	private LocalDate dateOfBirth;
	private String placeOfBirth;
	
	public DateAndPlaceOfBirth(
			int yearOfBirth,
			int monthOfBirth,
			int dayOfBirth,
			String cityOfBirth,
			String stateOfBirth,
			String countryBirth) {
		
		dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		placeOfBirth = cityOfBirth + ", " + stateOfBirth + ", " + countryBirth;
	}
	
	public DateAndPlaceOfBirth(
			int yearOfBirth,
			int monthOfBirth,
			int dayOfBirth,
			String cityOfBirth,
			String countryBirth) {
		
		dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
		placeOfBirth = cityOfBirth + ", " + countryBirth;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public boolean olderThan(DateAndPlaceOfBirth other) {
		return dateOfBirth.isBefore(other.dateOfBirth);
	}
	public boolean youngerThan(DateAndPlaceOfBirth other) {
		return dateOfBirth.isAfter(other.dateOfBirth);
	}
	public boolean hasSameBirthDateAs(DateAndPlaceOfBirth other) {
		return dateOfBirth.isEqual(other.dateOfBirth);
	}
	public boolean hasSameBirthDayAs(DateAndPlaceOfBirth other) {
		if (dateOfBirth.getMonth() == other.getDateOfBirth().getMonth()
				&& dateOfBirth.getDayOfMonth() == other.getDateOfBirth().getDayOfMonth()) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Date and Place of birth: " + dateOfBirth + ", " + placeOfBirth;
	}
}

