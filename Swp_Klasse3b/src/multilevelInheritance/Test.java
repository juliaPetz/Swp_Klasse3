package multilevelInheritance;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Person
        Person person1 = new Person("Alice", "Smith");
        Person person2 = new Person("Bob", "Johnson");
        Person person3 = new Person("Eva", "Brown");
        

        // Student
        Student student1 = new Student("Charlie", "Garcia", Major.Engineering);
        Student student2 = new Student("Diana", "Lopez", Major.Biology);
        Student student3 = new Student("Frank", "Chen", Major.Mathematics);
        
        // Employee
        Employee employee1 = new Employee("Grace", "Wong", 50000);
        Employee employee2 = new Employee("Henry", "Nguyen", 60000);
        Employee employee3 = new Employee("Irene", "Kim", 55000);
        
        // Professor
        Professor professor1 = new Professor("Jack", "Miller", 80000, WorkingField.Research, Major.Physics);
        Professor professor2 = new Professor("Kate", "Anderson", 75000, WorkingField.Teaching, Major.Economy);
        Professor professor3 = new Professor("Liam", "Gonzalez", 82000, WorkingField.Practice, Major.Chemistry);
        
        // Assistant
        Assistant assistant1 = new Assistant("Mia", "Parker", 35000, "Administration");
        Assistant assistant2 = new Assistant("Noah", "Hernandez", 32000, "HR");
        Assistant assistant3 = new Assistant("Olivia", "Adams", 34000, "Finance");
        
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(employee1);
        persons.add(employee2);
        persons.add(employee3);
        persons.add(professor1);
        persons.add(professor2);
        persons.add(professor3);
        persons.add(assistant1);
        persons.add(assistant2);
        persons.add(assistant3);
        
        for(Person p : persons) {
        	if(p instanceof Employee) {
        		// (Employee) = Cast (Objekt wird zu diesem Datentyp
        		// umgewandelt)
        		((Employee) p).increaseSalary(300);
        	}
        }
        
        // alle Studenten bekommen 30 ECTS addiert
        for(Person p : persons) {
        	if(p instanceof Student) {
        		((Student) p).increaseEcts(30);
        	}
        }
    }

}
