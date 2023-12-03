package inheritance;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal("Bob", "Meat", 4, "cannine");
		Cat c = new Cat("Lilli", "Milk", 4, "felline", "Black", true, false, "British");
		c.setColor("White");
		Animal a1 = new Cat("Nemo", "Milk", 4, "felline", "Black", true, true, "British");
		Fish f = new Fish("Bill", "Fish food", 0, "fish", "Clown Fish", true, true);
		Bear b = new Bear("Bruno", "Meat", 4, "bear", "Grizzly", "Brown", true);
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a);
		animals.add(c);
		animals.add(a1);
		animals.add(f);
		animals.add(b);
		
		for(Animal animal : animals) {
			//System.out.println(animal);
			animal.makeNoise();
		}
		
		

	}

}
