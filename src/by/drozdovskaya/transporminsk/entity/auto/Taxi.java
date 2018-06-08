package by.drozdovskaya.transporminsk.entity.auto;

public class Taxi extends Auto {
	
	private double raiting;

	public Taxi() {

	}

	public Taxi(double speed, String startStation, String endStation, double distance, double price, String brand,
			String typeEngine, String typeTransmission, double raiting) {
		super(speed, startStation, endStation, distance, price, brand, typeEngine, typeTransmission);
		this.raiting = raiting;
	}

	public double getRaiting() {
		return raiting;
	}

	public void setRaiting(double raiting) {
		this.raiting = raiting;
	}

	@Override
	public String toString() {
		return "Taxi [raiting=" + raiting + "]" + super.toString();
	}
	
	

	
	

}
