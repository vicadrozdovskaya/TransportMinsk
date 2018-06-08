package by.drozdovskaya.transportminsk.entity.railway;

public class Tram extends Railway {

	private String typeOfPantograph;

	public Tram() {

	}

	public Tram(double speed, String startStation, String endStation, double distance, double price, String name,
			int numberOfWagons, String typeOfPantograph) {
		super(speed, startStation, endStation, distance, price, name, numberOfWagons);
		this.typeOfPantograph = typeOfPantograph;
	}

	public String getTypeOfPantograph() {
		return typeOfPantograph;
	}

	public void setTypeOfPantograph(String typeOfPantograph) {
		this.typeOfPantograph = typeOfPantograph;
	}

	@Override
	public String toString() {
		return "Tram [typeOfPantograph=" + typeOfPantograph + "]" + super.toString();
	}

}
