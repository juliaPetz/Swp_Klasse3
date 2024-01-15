package multilevelInheritance;

public class Student extends Person {

	public int ects;
	public Major major;
	
	public Student(String firstName, String lastName, Major major) {
		super(firstName, lastName);
		this.ects = 0;
		this.major = major;
	}
	
	public int getEcts() {
		return ects;
	}
	public void setEcts(int ects) {
		this.ects = ects;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	
	// überschreibt toString von Person
	public String toString() {
		return "Student: " + super.toString() + " | Major: " + this.major + " | ECTS: " + this.ects;
	}
	
	public void stateRole() {
		System.out.println("I'm a student!");
	}
	
	public void increaseEcts(int amount) {
		this.ects += amount;
	}
	
	public void decreaseEcts(int amount) {
		this.ects -= amount;
	}
	
}
