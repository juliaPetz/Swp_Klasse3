package hogwarts;

import java.time.LocalDate;

public class Test {


	public static void main(String[] args) {
		
		Address a1 = new Address("Private Drive", 4, 5678, "Little Whining", "UK");
		System.out.println(a1);
		Parent p1 = new Parent("Lilli", "Potter", a1, Gender.FEMALE);
		System.out.println(p1);
		Student s1 = new Student("Harry", "Potter", a1, LocalDate.of(1980, 7, 31), Gender.MALE);
		System.out.println(s1);
		Address a2 = new Address("Spinner's End", 3, 3456, "Cokeworth", "UK");
		Teacher t1 = new Teacher("Severus", "Snape", a2, LocalDate.of(1960, 1, 9), Gender.MALE, 456);
		t1.addSubject("Potions");
		t1.addSubject("DADA");
		System.out.println(t1);
		House slytherin = new House("Slytherin", "die Listigen", 0, t1);
		System.out.println(slytherin);
		slytherin.addStudent(s1);
		slytherin.printStudents();
		
	}

}
