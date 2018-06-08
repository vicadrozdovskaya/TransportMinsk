package by.drozdovskaya.transportminsk.entity.water;

import by.drozdovskaya.transportminsk.entity.Transport;

public abstract class Water extends Transport {
	
	private String tripGoal;

	public Water() {

	}

	public Water(double speed, String startStation, String endStation, double distance, double price, String tripGoal) {
		super(speed, startStation, endStation, distance, price);
		this.tripGoal = tripGoal;
	}

	public String getTripGoal() {
		return tripGoal;
	}

	public void setTripGoal(String tripGoal) {
		this.tripGoal = tripGoal;
	}

	@Override
	public void moveTo() {
		System.out.println("swim");

	}

	@Override
	public String toString() {
		return "Water [tripGoal=" + tripGoal + "]" + super.toString();
	}

}
