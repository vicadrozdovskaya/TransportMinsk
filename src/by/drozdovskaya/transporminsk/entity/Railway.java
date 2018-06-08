package by.drozdovskaya.transporminsk.entity;

public abstract class Railway extends Transport {
	
	private String name;
	private int numberOfWagons;
	
	public Railway() {
		
	}

	public Railway(double speed, String startStation, String endStation, double distance, double price, String name,
			int numberOfWagons ) {
		super(speed, startStation, endStation, distance, price);
		this.name = name;
		this.numberOfWagons = numberOfWagons;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfWagons() {
		return numberOfWagons;
	}



	public void setNumberOfWagons(int numberOfWagons) {
		this.numberOfWagons = numberOfWagons;
	}



	@Override
	public void moveTo() {
		System.out.println("go chuh-chuh");

	}

	@Override
	public String toString() {
		return "Railway [name=" + name + ", numberOfWagons=" + numberOfWagons + "]" + super.toString();
	}

}
