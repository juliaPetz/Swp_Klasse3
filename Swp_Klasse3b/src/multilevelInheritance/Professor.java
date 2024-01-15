package multilevelInheritance;

public class Professor extends Employee {
	
	private WorkingField workingField;
	private Major major;
	
	public Professor(String firstName, String lastName, double salary, WorkingField workingField, Major major) {
		super(firstName, lastName, salary);
		this.workingField = workingField;
		this.major = major;
	}
	
	public WorkingField getWorkingField() {
		return workingField;
	}
	public void setWorkingField(WorkingField workingField) {
		this.workingField = workingField;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "\n\t [Professor] with working field " + this.workingField + " in " + this.major;
	}
	
	public void stateRole() {
		System.out.println("I'm a professor!");
	}
}
