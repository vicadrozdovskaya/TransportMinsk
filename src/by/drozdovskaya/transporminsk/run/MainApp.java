package by.drozdovskaya.transporminsk.run;

import by.drozdovskaya.transporminsk.entity.Bus;
import by.drozdovskaya.transporminsk.entity.Helicopter;
import by.drozdovskaya.transporminsk.entity.HighSpeedBoat;
import by.drozdovskaya.transporminsk.entity.Subway;
import by.drozdovskaya.transporminsk.entity.Taxi;
import by.drozdovskaya.transporminsk.entity.Transport;
import by.drozdovskaya.transporminsk.logic.LogicOfTransport;

public class MainApp {
	
	public static void main(String []arg0) {
		Transport transport1 = new Taxi(70, "A", "B",30, 89,"Opel","electro","auto", 4.0);
		Transport transport2 = new Bus(40, "A", "B",30, 19,"Belaz","electro","auto", "100");
		Transport transport3 = new HighSpeedBoat(150, "C", "D",50, 95, "tourism", 100);
		Transport transport4 = new Helicopter(500, "A", "B",30, 117, 2, 6);
		Transport transport5 = new Subway(90, "C", "D",100, 25, "Subway", 10, "Economy", true );
		LogicOfTransport tr = new LogicOfTransport();
		tr.getTransport().add(transport1);
		tr.getTransport().add(transport3);
		tr.getTransport().add(transport5);
		tr.getTransport().add(transport4);
		tr.getTransport().add(transport2);
		tr.printTransport();
		tr.sortBySpeed("A", "B");
		tr.printTransport();
		tr.sortByPrice();
		tr.printTransport();
		System.out.println();
		transport1.moveTo();
	}

}
