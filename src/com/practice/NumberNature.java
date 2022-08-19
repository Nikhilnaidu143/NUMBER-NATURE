package com.practice;

import java.util.Scanner;

/**
 * 
 * @author nikhils4
 *
 *         problem statement : 2. Read a number from console and output if it is
 *         a perfect number or a perfect square or a prime number or an even or
 *         odd number.
 */

public class NumberNature {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int N = input.nextInt();
		input.close();

		NumberNature numNature = new NumberNature();

		numNature.findNumberNature(N);
	}

	public void findNumberNature(int N) {
		if (numberEvenOrOdd(N)) {
			System.out.println(N + " is even number.");
		} else {
			System.out.println(N + " is odd number.");
		}

		if (checkNumberPrimeOrNot(N) == 2) {
			System.out.println(N + " is prime number.");
		} else {
			System.out.println(N + " is not a prime number.");
		}

		if (checkNumberPerfectOrNot(N) == N) {
			System.out.println(N + " is perfect number");
		} else {
			System.out.println(N + " is not a perfect number.");
		}

		if (checkNumberIsPerfectSquareOrNot(N)) {
			System.out.println(N + " is a perfect square.");
		} else {
			System.out.println(N + " is not a perfect square.");
		}

	}

	public boolean numberEvenOrOdd(int N) {
		return (N % 2 == 0) ? true : false;
	}

	public int checkNumberPrimeOrNot(int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

	public int checkNumberPerfectOrNot(int N) {
		int sum = 0;
		for (int i = 1; i < N; i++) {
			if (N % i == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		return sum;
	}

	public int squareRootOfANumber(int N) {
		int index = 1; // we can use Math.Sqrt(Number) method also to find squareRoot of a number.
		int count = 0;
		while (N > 0) {
			if (!numberEvenOrOdd(index)) {
				N -= index;
				index++;
				count++;
			} else {
				index++;
				continue;
			}
		}
		return count;
	}

	public boolean checkNumberIsPerfectSquareOrNot(int N) {
		int squareRootOfNumber = squareRootOfANumber(N);
		return (squareRootOfNumber * squareRootOfNumber == N) ? true : false;
	}
}
