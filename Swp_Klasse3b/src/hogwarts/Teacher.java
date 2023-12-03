package hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Teacher {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private Address address;
	private LocalDate birthDate;
	private Gender gender;
	private int gringottsNumber;
	private ArrayList<String> subjects;
	
	
	
	public Teacher(String firstName, String lastName, Address address, LocalDate birthDate, Gender gender,
			int gringottsNumber) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthDate;
		this.gender = gender;
		this.gringottsNumber = gringottsNumber;
		this.subjects = new ArrayList<String>();
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
	public int getGringottsNumber() {
		return gringottsNumber;
	}
	public void setGringottsNumber(int gringottsNumber) {
		this.gringottsNumber = gringottsNumber;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		String tmp = "Teacher: " + firstName + " " + lastName + "\n\t " 
				+ address + "\n\t "
				+ birthDate + "\n\t " + gender + "\n\t Gringotts: " 
				+ gringottsNumber + "\n\t Subjects: ";
		for(String s : this.subjects) {
			tmp = tmp + s + " ";
		}
		return tmp;
	}
	public void addSubject(String subject) {
		if(!this.subjects.contains(subject)) {
			this.subjects.add(subject);
		}
	}
	
	public void removeSubject(String subject) {
		this.subjects.remove(subject);
	}
}
