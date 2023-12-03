package carRental;

import java.util.ArrayList;

public class CarRental {

	private ArrayList<Car> cars;
	
	public CarRental() {
		this.cars = new ArrayList<Car>();
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	/**
	 * 
	 * @param car
	 */
	public void addCar(Car car) {
		this.cars.add(car);
	}
	
	/**
	 * 
	 * @param car
	 */
	public void removeCar(Car car) {
		this.cars.remove(car);
	}
	
	public void printCarList() {
		for(Car c : this.cars) {
			System.out.println(c);
		}
	}
	
	public void printAvailableCars() {
		for(Car c : this.cars) {
			// c.isBorrowed() == false
			if(!c.isBorrowed() && !c.isReserved()) {
				System.out.println(c);
			}
		}
	}
	
	public ArrayList<Car> getCarsWithClassification(String classification){
		ArrayList<Car> tmp = new ArrayList<Car>();
		for(Car c : this.cars) {
			if(c.getClassification().equals(classification)) {
				tmp.add(c);
			}
		}
		return tmp;
	}
	
	public double calculateTotalRevenue() {
		double sumTotal = 0;
		for(Car c : this.cars) {
			sumTotal = sumTotal + c.calculateLendingCosts();
		}
		return sumTotal;
	}
	
	
}
