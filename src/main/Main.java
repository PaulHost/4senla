package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Программа умеет:");
		
		System.out.println("a) вычисляет простые числа в пределах от 1 до 1000");
		ArrayList<Integer> primeList = new PrimeArray().getList();
		System.out.println(primeList);
		
		System.out.println("b) вычисляет числа Фибоначчи в пределах от 1 до 10000");
		ArrayList<Integer> febList = new FibonacciArray().getList();
		System.out.println(febList);
		
		System.out.println("c) возводит в квадрат каждое второе число из массива простых чисел");
		ArrayList<Integer> squar = new Operations().squar(primeList);
		System.out.println("squar");
		
		System.out.println("d) возводит в куб каждое пятое число из массива простых чисел");
		ArrayList<Integer> cub = new Operations().cub(primeList);
		System.out.println(cub);
		
		System.out.println("е) находит среднее арифметическое из массива простых чисел, которые заканчиваются на 1 или 3");
		double average = new Operations().average(primeList);
		System.out.println(average);
		
		System.out.println("f) трёхзначные числа из массива чисел Фибоначчи сложить в строку");
		String concatenation = new Operations().concatenation(febList);
		System.out.println(concatenation);
		
	}

}
