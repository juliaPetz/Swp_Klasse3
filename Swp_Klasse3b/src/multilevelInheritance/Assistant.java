package multilevelInheritance;

public class Assistant extends Employee {

	private String department;

	public Assistant(String firstName, String lastName, double salary, String department) {
		super(firstName, lastName, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return super.toString() + "\n\t [Assistant] in department " + this.department;
	}
	
	public void stateRole() {
		System.out.println("I'm an assistant!");
	}
}
