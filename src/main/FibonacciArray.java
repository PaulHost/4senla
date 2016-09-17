package main;

import java.util.ArrayList;

public class FibonacciArray {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public ArrayList<Integer> getList() {

		int x = 0;
		int y = 1;
		int fib;

		for (int i = 2; i <= 1000; i++) {
			fib = x + y;
			if (fib > 1000) {
				break;
			}
			numbers.add(fib);
			x = y;
			y = fib;
		}
		return numbers;

	}
}
