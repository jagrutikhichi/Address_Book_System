package AddressBook;

public class Contacts {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	Long zipCode;
	Long phoneNumber;
	String email;
	public Contacts(String firstName, String lastName, String address, String city, String state, Long zipCode,
			Long phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
