package by.drozdovskaya.transportminsk.run;

import java.util.ArrayList;
import java.util.List;

import by.drozdovskaya.transportminsk.entity.Transport;
import by.drozdovskaya.transportminsk.entity.air.Helicopter;
import by.drozdovskaya.transportminsk.entity.auto.Bus;
import by.drozdovskaya.transportminsk.entity.auto.Electrobus;
import by.drozdovskaya.transportminsk.entity.auto.Taxi;
import by.drozdovskaya.transportminsk.entity.railway.Subway;
import by.drozdovskaya.transportminsk.entity.railway.Tram;
import by.drozdovskaya.transportminsk.entity.water.HighSpeedBoat;
import by.drozdovskaya.transportminsk.logic.LogicOfTransport;

public class MainApp {
	
	public static void main(String []arg0) {
		Transport transport1 = new Taxi(70, "A", "B",30, 89,"Opel","electro","auto", 4.0);
		Transport transport2 = new Bus(40, "A", "B",30, 19,"Belaz","electro","auto", "100");
		Transport transport3 = new HighSpeedBoat(150, "C", "D",50, 95, "tourism", 100);
		Transport transport4 = new Helicopter(500, "A", "B",30, 117, 2, 6);
		Transport transport5 = new Subway(90, "C", "D",100, 25, "Subway", 10, "Economy", true );
		Transport transport6 = new Tram(40, "A", "D",100, 25, "Subway", 10, "Pantograph" );
		Transport transport7 = new Electrobus(60, "A", "B",30, 19,"Belaz","electro","auto", 660 );
		List<Transport> transport = new ArrayList<Transport>();
		LogicOfTransport tr = new LogicOfTransport();
		transport.add(transport1);
		transport.add(transport3);
		transport.add(transport5);
		transport.add(transport4);
		transport.add(transport2);
		transport.add(transport6);
		transport.add(transport7);
		tr.printTransport(transport);
		tr.sortBySpeed(transport,"A", "B");
		tr.sortByPrice(transport);
	}

}
