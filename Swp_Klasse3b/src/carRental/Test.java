package carRental;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car("Porsche", "AWD", "Sportwagen", 2000);
		Car car1 = car;
		Car car2 = new Car("Audi", "RWD", "Familienauto", 500);
//		System.out.println(car);
//		car.borrowCar(10);
//		System.out.println(car.calculateLendingCosts());
//		car.borrowCar(5);
		CarRental cr = new CarRental();
		cr.addCar(car);
		cr.addCar(car);
		cr.addCar(car);
		cr.addCar(car1);
		
		//cr.removeCar(car);
		car.setCarBrand("Ferrari");
		car1.setCarBrand("Fiat");
		cr.printCarList();
		System.out.println(car.equals(car1));
		System.out.println(car.equals(car2));
	}

}
