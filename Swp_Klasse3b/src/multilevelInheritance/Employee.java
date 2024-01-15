package multilevelInheritance;

public class Employee extends Person {
	
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee: " + super.toString();
	}
	
	public void stateRole() {
		System.out.println("I'm an employee!");
	}
	
	public void increaseSalary(double amount) {
		this.salary += amount;
	}
	
	public void decreaseSalary(double amount) {
		this.salary -= amount;
	}

}
