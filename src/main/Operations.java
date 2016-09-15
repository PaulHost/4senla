package main;

import java.util.ArrayList;

public class Operations {

	public ArrayList<Integer> squar(ArrayList<Integer> list) {
		ArrayList<Integer> squars = new ArrayList<>();
		for (int i = 1; i < list.size(); i += 2) {
			squars.add((int) Math.pow(list.get(i), 2));
		}
		return squars;
	}

	public ArrayList<Integer> cub(ArrayList<Integer> list) {
		ArrayList<Integer> cubs = new ArrayList<>();
		for (int i = 4; i < list.size(); i += 5) {
			cubs.add((int) Math.pow(list.get(i), 3));
		}
		return cubs;
	}

	public double average(ArrayList<Integer> list) {

		int i = 0;
		double summ = 0;
		for (Integer elem : list) {
			if (elem.toString().endsWith("1") || elem.toString().endsWith("3")) {
				summ += elem;
				i++;
			}
		}
		return summ / i;
	}

	public String concatenation(ArrayList<Integer> list) {

		String conc = "";
		for (Integer elem : list) {
			if (elem.toString().length() == 3) {
				conc += elem;
			}
		}
		return conc;
	}
}
