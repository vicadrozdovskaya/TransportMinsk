package by.drozdovskaya.transporminsk.entity;

public abstract class Auto extends Transport {
	
	private String brand;
	private String typeEngine;
	private String typeTransmission;

	
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Auto(double speed, String startStation, String endStation, double distance, double price) {
		super(speed, startStation, endStation, distance, price);
	
	}


	public Auto(double speed, String startStation, String endStation, double distance, double price, String brand, String typeEngine, String typeTransmission) {
		super(speed, startStation, endStation, distance, price);
		this.brand = brand;
		this.typeEngine = typeEngine;
		this.typeTransmission = typeTransmission;
	}


	@Override
	public void moveTo() {
		System.out.println("move");

	}


	@Override
	public String toString() {
		return "Auto [brand=" + brand + ", typeEngine=" + typeEngine + ", typeTransmission=" + typeTransmission + "]" + super.toString();
	}
	

}
