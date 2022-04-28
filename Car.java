/**
 * Lab 10 Car Class
 * @author Gabe Bowman
 *
 */
public class Car extends Vehicle {
	 
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers) {
		super(aMake, aModel, aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.doors == otherCar.getDoors()) {
			if(this.passengers == otherCar.getPassengers()) {
				return super.equals(other);
			}
		}
		
		return false;
	}
	
	public Car copy() {
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.getDoors();
		int thePassengers = this.getPassengers();
		
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return theCopy;
	}
	
}