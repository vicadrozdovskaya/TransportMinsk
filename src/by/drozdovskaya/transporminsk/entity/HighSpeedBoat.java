package by.drozdovskaya.transporminsk.entity;

public class HighSpeedBoat extends Water {
	
	private double maxDistance;

	public HighSpeedBoat() {

	}

	public HighSpeedBoat(double speed, String startStation, String endStation, double distance, double price,
			String tripGoal, double maxDistance ) {
		super(speed, startStation, endStation, distance, price, tripGoal);
		this.maxDistance = maxDistance;
	}

	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}

	@Override
	public String toString() {
		return "HighSpeedBoat [maxDistance=" + maxDistance + "]" + super.toString();
	}
	
	

}
