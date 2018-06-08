package by.drozdovskaya.transporminsk.logic;

import java.util.ArrayList;
import java.util.List;
import by.drozdovskaya.transporminsk.entity.Transport;

public class LogicOfTransport {

	public LogicOfTransport() {

	}

	public void printTransport(List<Transport> transport) {
		System.out.println("Print transport :");
		for (Transport t : transport) {
			System.out.println(t);
		}
		System.out.println();
	}

	public List<Transport> filterByPoints(List<Transport> transport, String start, String end) {
		List<Transport> filteredTransport = new ArrayList<Transport>();
		for (int i = 0; i < transport.size(); i++) {
			if (transport.get(i).getStartStation().equals(start) && transport.get(i).getEndStation().equals(end)) {
				filteredTransport.add(transport.get(i));
			}
		}
		System.out.println("Sorted by destinations");
		return filteredTransport;

	}

	public void sortBySpeed(List<Transport> transport, String begin, String end) {
		List<Transport> sortBySpeed = new ArrayList<Transport>();
		sortBySpeed = filterByPoints(transport, begin, end);
		for (int i = 0; i < sortBySpeed.size() - 1; i++) {
			boolean isSorted = false;
			while (!isSorted) {
			isSorted = true;
					if (sortBySpeed.get(i).getSpeed() > sortBySpeed.get(i + 1).getSpeed()) {
						isSorted = false;
						Transport tr = sortBySpeed.get(i);
						sortBySpeed.set(i, sortBySpeed.get(i + 1));
						sortBySpeed.set(i + 1, tr);
						if (i != 0)
							i--;
				}
			}
		}
		System.out.println("Sorted by Speed from " + begin + " to " + end + "\n");
		this.printTransport(sortBySpeed);

	}

	public void sortByPrice(List<Transport> transport) {
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
		System.out.println("Sorted by Price\n");
		this.printTransport(transport);
	}

}
