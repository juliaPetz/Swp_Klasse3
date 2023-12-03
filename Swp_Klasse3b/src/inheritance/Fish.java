package inheritance;

public class Fish extends Animal{

	private String type;
	private boolean eatable;
	private boolean saltWater;
	
	public Fish() {
		super();
	}
	
	public Fish(String name, String preferredFood, int noOfLegs, String category,
			String type, boolean eatable, boolean saltWater) {
		super(name, preferredFood, noOfLegs, category);
		this.type = type;
		this.eatable = eatable;
		this.saltWater = saltWater;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isEatable() {
		return eatable;
	}
	public void setEatable(boolean eatable) {
		this.eatable = eatable;
	}
	public boolean isSaltWater() {
		return saltWater;
	}
	public void setSaltWater(boolean saltWater) {
		this.saltWater = saltWater;
	}
	
	public String toString() {
		return super.toString() + 
				"\n\t type: " + this.type +
				"\n\t is eatable: " + this.eatable +
				"\n\t lives in salt water: " + this.saltWater;
	}
	
	public void makeNoise() {
		System.out.println(this.getName() + " makes blub blub!");
	}
	
}
