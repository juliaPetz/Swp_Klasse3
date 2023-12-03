package inheritance;

public class Bear extends Animal {

	private String type;
	private String color;
	private boolean sleepWinter;
	
	public Bear() {
		super();
	}
	
	public Bear(String name, String preferredFood, int noOfLegs, String category,
			String type, String color, boolean sleepWinter) {
		super(name, preferredFood, noOfLegs, category);
		this.type = type;
		this.color = color;
		this.sleepWinter = sleepWinter;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isSleepWinter() {
		return sleepWinter;
	}
	public void setSleepWinter(boolean sleepWinter) {
		this.sleepWinter = sleepWinter;
	}
	
	public String toString() {
		return super.toString() + "\n\t type: " + this.type +
				"\n\t color: " + this.color + "\n\t sleeps during winter: " +
				this.sleepWinter;
	}
	
	public void makeNoise() {
		System.out.println(this.getName() + " makes roar!");
	}
	
	
}
