package main;

import java.util.ArrayList;

public class FibonacciArray {
	public ArrayList<Integer> getList() {
		ArrayList<Integer> fibonacciSeries = new ArrayList<>();

		int x = 0;
		int y = 1;
		int fib;

		for (int i = 2; i < 1000; i++) {
			fib = x + y;
			if (fib > 1000) {
				break;
			}
			fibonacciSeries.add(fib);
			x = y;
			y = fib;
		}
		return fibonacciSeries;

	}
}
