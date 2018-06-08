package by.drozdovskaya.transporminsk.entity;

public abstract class Transport {
	
	private double speed;
	private String startStation;
	private String endStation;
	private double distance;
	private double price;

	public Transport() {

	}

	public Transport(double speed, String startStation, String endStation, double distance, double price) {
		this.speed = speed;
		this.startStation = startStation;
		this.endStation = endStation;
		this.distance = distance;
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void moveTo();

	@Override
	public String toString() {
		return "Transport [speed=" + speed + ", startStation=" + startStation + ", endStation=" + endStation
				+ ", distance=" + distance + ", price=" + price + "]" + super.toString();
	}
	
	


}
