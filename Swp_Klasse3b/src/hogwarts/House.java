package hogwarts;

import java.util.ArrayList;

public class House {
	
	private String name;
	private String slogan;
	private int housePoints;
	private Teacher houseTeacher;
	private ArrayList<Student> students;
	private ArrayList<Student> prefects;
	private ArrayList<Student> quidditchTeam;
	
	
	
	public House(String name, String slogan, int housePoints, Teacher houseTeacher) {
		this.name = name;
		this.slogan = slogan;
		this.housePoints = housePoints;
		this.houseTeacher = houseTeacher;
		this.students = new ArrayList<Student>();
		this.prefects = new ArrayList<Student>();
		this.quidditchTeam = new ArrayList<Student>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public int getHousePoints() {
		return housePoints;
	}
	public void setHousePoints(int housePoints) {
		this.housePoints = housePoints;
	}
	public Teacher getHouseTeacher() {
		return houseTeacher;
	}
	public void setHouseTeacher(Teacher houseTeacher) {
		this.houseTeacher = houseTeacher;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Student> getPrefects() {
		return prefects;
	}
	public void setPrefects(ArrayList<Student> prefects) {
		this.prefects = prefects;
	}
	public ArrayList<Student> getQuidditchTeam() {
		return quidditchTeam;
	}
	public void setQuidditchTeam(ArrayList<Student> quidditchTeam) {
		this.quidditchTeam = quidditchTeam;
	}
	
	public void addStudent(Student student) {
		if(!this.students.contains(student)) {
			this.students.add(student);
		}
	}
	
	public void expellStudent(Student student) {
		this.students.remove(student);
	}
	
	public void addPrefect(Student student) {
		if(this.prefects.size() < 2 && !this.prefects.contains(student)
				&& this.students.contains(student)) {
			this.prefects.add(student);
		}
	}
	
	public void removePrefect(Student student) {
		this.prefects.remove(student);
	}
	
	public void addQuidditchTeamMember(Student student) {
		if(this.quidditchTeam.size() < 11 && !this.quidditchTeam.contains(student)
				&& this.students.contains(student)) {
			this.quidditchTeam.add(student);
		}
	}
	
	public void removeQuidditchTeamMember(Student student) {
		this.quidditchTeam.remove(student);
	}
	
	public String toString() {
		return "House:  " + this.name + "\n\t" + this.slogan
				+ "\n\tHousePoints: " + this.housePoints;
	}
	
	public void printStudents() {
		System.out.println(this.name);
		for(Student s : this.students) {
			System.out.println(s);
		}
	}
	
	public void printPrefects() {
		System.out.println("Prefects from: " + this.name);
		for(Student s : this.prefects) {
			System.out.println(s);
		}
	}
	
	public void printQuidditchTeamMembers() {
		System.out.println("Quidditch-Team of " + this.name);
		for(Student s : this.quidditchTeam) {
			System.out.println(s);
		}
	}
	
	public void addHousePoints(Teacher teacher, int housePoints) {
		this.housePoints += housePoints;
	}
	
	public void removeHousePoints(Teacher teacher, int housePoints) {
		this.housePoints -= housePoints;
	}
	
	public void addHousePoints(Student student, int housePoints) {
		if(this.prefects.contains(student)) {
			this.housePoints += housePoints;
		}
	}
	
	public void removeHousePoints(Student student, int housePoints) {
		if(this.prefects.contains(student)) {
			this.housePoints -= housePoints;
		}
	}
	
	
	

}
