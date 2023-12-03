package inheritance;

public class Animal {
	
	private String name;
	private String preferredFood;
	private int noOfLegs;
	private String category;
	
	public Animal() {}
	
	public Animal(String name, String preferredFood, int noOfLegs, String category) {
		this.name = name;
		this.preferredFood = preferredFood;
		this.noOfLegs = noOfLegs;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreferredFood() {
		return preferredFood;
	}
	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		return "Animal: "  + this.name +
				"\n\t preferred food: " + this.preferredFood +
				"\n\t number of legs: " + this.noOfLegs + 
				"\n\t category: " + this.category;
	}
	
	public void makeNoise() {
		System.out.println(this.name + " makes ____________");
	}
	

}
