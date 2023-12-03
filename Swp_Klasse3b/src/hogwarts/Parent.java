package hogwarts;

public class Parent {

	private String firstName;
	private String lastName;
	private Address address;
	private Gender gender;
	
	public Parent(String firstName, String lastName, Address address, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Parent: " + firstName + " " + lastName + ", " + address + ", "
				+ gender;
	}
	
	
	
}
