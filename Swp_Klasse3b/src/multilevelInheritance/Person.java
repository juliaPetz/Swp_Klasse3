package multilevelInheritance;

import java.util.UUID;

public class Person {

	private UUID id;
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public UUID getId() {
		return id;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public void stateRole() {
		System.out.println("I'm a person!");
	}
	
}
