package M2Activity6;

public abstract class Vehicle {

	private final int numberOfWheels;
	private final String brand;

		protected Vehicle(int numberOfWheels, String brand) {
	        this.numberOfWheels = numberOfWheels;
	        this.brand = brand;
	    }

	    public int getNumberOfWheels() {
	        return numberOfWheels;
	    }

	    public String getBrand() {
	        return brand;
	    }

	   
	    public abstract void startEngine();


	    public void destroy() {
	        System.out.println("Destroying vehicle of brand: " + brand + " with " + numberOfWheels + " wheels.");
	    }

}
