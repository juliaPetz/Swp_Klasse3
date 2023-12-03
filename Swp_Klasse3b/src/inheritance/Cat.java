package inheritance;

public class Cat extends Animal{
	
	private String color;
	private boolean purring;
	private boolean hunter;
	private String type;
	
	public Cat() {
		super();
	}
	
	
	
	public Cat(String name, String preferredFood, int noOfLegs, String category,
			String color, boolean purring, boolean hunter, String type) {
		super(name, preferredFood, noOfLegs, category);
		this.color = color;
		this.purring = purring;
		this.hunter = hunter;
		this.type = type;
	}



	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPurring() {
		return purring;
	}
	public void setPurring(boolean purring) {
		this.purring = purring;
	}
	public boolean isHunter() {
		return hunter;
	}
	public void setHunter(boolean hunter) {
		this.hunter = hunter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return super.toString() +
				"\n\t color: " + this.color + 
				"\n\t purring: " + this.purring +
				"\n\t is hunter: " + this.hunter + 
				"\n\t type: " + this.type;
	}
	
	public void makeNoise() {
		System.out.println(this.getName() + " makes miau!");
	}

}
