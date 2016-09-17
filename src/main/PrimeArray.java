package main;

import java.util.ArrayList;

public class PrimeArray {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public ArrayList<Integer> getList() {
		for (int i = 1; i <= 1000; i++) {
			int counter = 0;

			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter++;
				}
			}

			if (counter == 2) {
				numbers.add(i);
			}
		}
		return numbers;
	}
}
