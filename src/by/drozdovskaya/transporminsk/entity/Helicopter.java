package by.drozdovskaya.transporminsk.entity;

public class Helicopter extends Air {
	
	private int numberOfSeats;

	public Helicopter() {

	}

	public Helicopter(double speed, String startStation, String endStation, double distance, double price,
			int quantityOfEngine, int numberOfSeats) {
		super(speed, startStation, endStation, distance, price, quantityOfEngine);
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Helicopter [numberOfSeats=" + numberOfSeats + "]" + super.toString();
	}
	
	

}
