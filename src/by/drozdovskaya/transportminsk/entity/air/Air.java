package by.drozdovskaya.transportminsk.entity.air;

import by.drozdovskaya.transportminsk.entity.Transport;

public abstract class Air extends Transport {
	
	private int quantityOfEngine;
	
	public Air() {

	}



	public Air(double speed, String startStation, String endStation, double distance, double price, int quantityOfEngine) {
		super(speed, startStation, endStation, distance, price);
		this.quantityOfEngine = quantityOfEngine;
	}

	public int getQuantityOfEngine() {
		return quantityOfEngine;
	}

	public void setQuantityOfEngine(int quantityOfEngine) {
		this.quantityOfEngine = quantityOfEngine;
	}

	@Override
	public void moveTo() {
		System.out.println("fly");

	}



	@Override
	public String toString() {
		return "Air [quantityOfEngine=" + quantityOfEngine + "]" + super.toString();
	}
	

}
