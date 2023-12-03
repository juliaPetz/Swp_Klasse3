package hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student {

	private UUID id;
	private String firstName;
	private String lastName;
	private Address address;
	private LocalDate birthDate;
	private Gender gender;
	private ArrayList<Parent> parents;
	
	
	
	public Student(String firstName, String lastName, Address address, LocalDate birthDate, Gender gender) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthDate;
		this.gender = gender;
		this.parents = new ArrayList<Parent>();
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
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
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public ArrayList<Parent> getParents() {
		return parents;
	}
	public void setParents(ArrayList<Parent> parents) {
		this.parents = parents;
	}
	
	public void addParent(Parent parent) {
		if(!this.parents.contains(parent)) {
			this.parents.add(parent);
		}
	}
	
	public void removeParent(Parent parent) {
		this.parents.remove(parent);
	}
	
	public String toString() {
		return "Student: " + this.firstName + " " + this.lastName + "\n" 
				+ "\t " + this.birthDate + " \n\t " + this.gender + "\n"
				+ "\t " + this.address;
	}
	
}
