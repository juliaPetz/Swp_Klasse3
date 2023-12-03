package carRental;

public class Car {
	
	private String carBrand;
	private String driveType;
	private String classification;
	private boolean borrowed;
	private boolean reserved;
	private int lendingTime;
	private double price;
	
	
	
	public Car(String carBrand, String driveType, String classification, double price) {
		this.carBrand = carBrand;
		this.driveType = driveType;
		this.classification = classification;
		this.price = price;
		this.borrowed = false;
		this.reserved = false;
		this.lendingTime = 0;
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getDriveType() {
		return driveType;
	}
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public int getLendingTime() {
		return lendingTime;
	}
	public void setLendingTime(int lendingTime) {
		this.lendingTime = lendingTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String tmp = "Automarke: " + this.carBrand + "\n";
		tmp = tmp + "\t Klassifizierung: " + this.classification + "\n";
		tmp = tmp + "\t Preis: " + this.price;
		return tmp;
	}
	
	/**
	 * Method calculates lending costs based on
	 * price and lending time.
	 * 
	 * @return calculated lending costs
	 */
	public double calculateLendingCosts() {
		return this.price * this.lendingTime;
	}
	
	/**
	 * Method checks if car can be borrowed and
	 * borrows car if possible.
	 * 
	 * @param lendingTime - time in days
	 * @return true if possible, false if not possible
	 */
	public boolean borrowCar(int lendingTime) {
		if(this.borrowed == false && this.reserved == false) {
			this.borrowed = true;
			this.lendingTime = lendingTime;
			System.out.println("Entlehnung war erfolgreich!");
			return true;
		} else if(this.borrowed == true) {
			System.err.println("Auto bereits verliehen!");
			return false;
		} else {
			System.err.println("Auto ist reserviert!");
			return false;
		}
	}
	/**
	 * Method returns car and calculates lending costs.
	 * 
	 * @return true, if possible - false, if not possible
	 */
	public boolean returnCar() {
		if(this.borrowed == true) {
			System.out.println("Das Auto wurde erfolgreich zurückgegeben.");
			System.out.println("Die Kosten betragen: " + this.calculateLendingCosts());
			this.borrowed = false;
			this.lendingTime = 0;
			return true;
		} else {
			System.out.println("Auto ist nicht entliehen!");
			return false;
		}
	}
//	public boolean returnCar() {
//		System.out.println("Kosten: " + this.calculateLendingCosts());
//		System.out.println("Rücknahme erfolgreich!");
//		this.borrowed = false;
//		this.lendingTime = 0;
//		return true;
//	}
	
	/**
	 * Method reserves car (only one reservation at time possible).
	 * 
	 * @return true, if possible - false, if not possible
	 */
	public boolean reserveCar() {
		if(this.reserved == false) {
			this.reserved = true;
			System.out.println("Auto erfolgreich reserviert!");
			return true;
		} else {
			System.out.println("Auto ist bereits reserviert!");
			return false;
		}
	}
	
	public boolean equals(Car car) {
		if(this.carBrand.equals(car.getCarBrand())
				&& this.classification.equals(car.getClassification())
				&& this.driveType.equals(car.getDriveType())) {
			return true;
		}
		return false;
	}
	
	

}
