package by.drozdovskaya.transporminsk.entity;

public class Bus extends Auto {

	private String routeNamber;

	public Bus() {

	}

	public Bus(double speed, String startStation, String endStation, double distance, double price, String brand,
			String typeEngine, String typeTransmission, String routeNamber) {
		super(speed, startStation, endStation, distance, price, brand, typeEngine, typeTransmission);
		this.routeNamber = routeNamber;
	}

	public String getRouteNamber() {
		return routeNamber;
	}

	public void setRouteNamber(String routeNamber) {
		this.routeNamber = routeNamber;
	}

	@Override
	public String toString() {
		return "Bus [routeNamber=" + routeNamber + "]" + super.toString();
	}

}
