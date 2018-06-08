package by.drozdovskaya.transporminsk.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import by.drozdovskaya.transporminsk.entity.Transport;

public class LogicOfTransport {

	private List<Transport> transport;

	public LogicOfTransport() {
		this.transport = new ArrayList<Transport>();
	}

	public List<Transport> getTransport() {
		return transport;
	}

	public void setTransport(List<Transport> transport) {
		this.transport = transport;
	}

	public void printTransport() {
		for (Transport t : this.transport) {
			System.out.println(t);
		}
		;
	}

	public List<Transport> filterByPoints(String start, String end) {
		for (int i = 0; i < this.transport.size() - 1; i++) {
			boolean isSorted = false;
			while (!isSorted) {
				isSorted = true;
				if (transport.get(i).getStartStation().equals(start) && transport.get(i).getEndStation().equals(end)) {
					if (!transport.get(i).getStartStation().contains(transport.get(i + 1).getStartStation())) {
						isSorted = false;
						Transport tr = transport.get(i);
						transport.set(i, transport.get(i + 1));
						transport.set(i + 1, tr);
						if (i != 0)
							i--;
					}

				}
			}
		}
		System.out.println("Sorted by destinations\n");
		return this.transport;

	}

	public List<Transport> sortBySpeed(String begin, String end) {
		filterByPoints(begin, end);
		for (int i = 0; i < this.transport.size() - 1; i++) {
			boolean isSorted = false;
			while (!isSorted) {
				isSorted = true;
				if (transport.get(i).getStartStation().equals(begin) && transport.get(i).getEndStation().equals(end)) {
					if (transport.get(i).getSpeed() > transport.get(i + 1).getSpeed()) {
						isSorted = false;
						Transport tr = transport.get(i);
						transport.set(i, transport.get(i + 1));
						transport.set(i + 1, tr);
						if (i != 0)
							i--;
					}
				}
			}
		}
		System.out.println("Sorted by Speed\n");

		return this.transport;
	}

	public List<Transport> sortByPrice() {
		for (int i = 0; i < transport.size() - 1; i++) {
			boolean isSorted = false;
			while (!isSorted) {
				isSorted = true;
				if (transport.get(i).getPrice() > transport.get(i + 1).getPrice()) {
					isSorted = false;
					Transport tr = transport.get(i);
					transport.set(i, transport.get(i + 1));
					transport.set(i + 1, tr);
					if (i != 0)
						i--;

				}
			}
		}
		return this.transport;
	}

}
