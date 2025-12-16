package M2Activity6;

public class M2Activity6 {

	public static void main(String[] args) {
		
		Car car = new Car("Honda");
	    Truck truck = new Truck("Volvo", 10);
	     
	    car.startEngine();
	    car.refuel();
	    System.out.println("Car brand: " + car.getBrand() + ", wheels: " + car.getNumberOfWheels());
	    destroyVehicle(car);
	        
	    System.out.println("****************************");
	    truck.startEngine();
	    truck.refuel();
	    System.out.println("Truck brand: " + truck.getBrand() + ", wheels: " + truck.getNumberOfWheels());
	    destroyVehicle(truck);
	    }

	    
	    private static void destroyVehicle(Vehicle vehicle) {
	        vehicle.destroy();
	    }
}
