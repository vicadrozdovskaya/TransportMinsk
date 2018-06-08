package by.drozdovskaya.transporminsk.entity;

public class Subway extends Railway {

	private String typeOfComfort;
	private boolean isWiFi;

	public Subway() {

	}

	public Subway(double speed, String startStation, String endStation, double distance, double price, String name,
			int numberOfWagons, String typeOfComfort, boolean isWiFi) {
		super(speed, startStation, endStation, distance, price, name, numberOfWagons);
		this.typeOfComfort = typeOfComfort;
		this.isWiFi = isWiFi;
	}

	public String getTypeOfComfort() {
		return typeOfComfort;
	}

	public void setTypeOfComfort(String typeOfComfort) {
		this.typeOfComfort = typeOfComfort;
	}

	public boolean isWiFi() {
		return isWiFi;
	}

	public void setWiFi(boolean isWiFi) {
		this.isWiFi = isWiFi;
	}

	@Override
	public String toString() {
		return "Subway [typeOfComfort=" + typeOfComfort + ", isWiFi=" + isWiFi + "]" + super.toString();
	}

}
