package by.drozdovskaya.transportminsk.entity.auto;

public class Electrobus extends Auto {

	private int capacityOfBattary;

	public Electrobus() {

	}

	public Electrobus(double speed, String startStation, String endStation, double distance, double price, String brand,
			String typeEngine, String typeTransmission, int capacityOfBattary) {
		super(speed, startStation, endStation, distance, price, brand, typeEngine, typeTransmission);
		this.capacityOfBattary = capacityOfBattary;

	}

	public int getCapacityOfBattary() {
		return capacityOfBattary;
	}

	public void setCapacityOfBattary(int capacityOfBattary) {
		this.capacityOfBattary = capacityOfBattary;
	}

	@Override
	public String toString() {
		return "Electrobus [capacityOfBattary=" + capacityOfBattary + "]" + super.toString();
	}

}
