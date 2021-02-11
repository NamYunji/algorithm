package ch01;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 4개 입력");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		System.out.println(max4(a, b, c, d));
	}

	static int max4(int a, int b, int c, int d) {

		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;

		return max;
	}
}
