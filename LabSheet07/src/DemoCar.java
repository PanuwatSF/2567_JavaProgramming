
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		
		car.showDetails();
		car.showMilage();
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		System.out.println();
		System.out.println("Update Car Details");
		car.showDetails();
		System.out.println();
		car.setCompanyName(null);
		car.setModelName(null);
		car.setYear(0);
	
	
	}

}
