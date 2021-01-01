package step1_IO;

import java.util.Scanner;

public class _9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A 입력 : ");
		double a = scanner.nextInt();
		System.out.print("정수 B 입력 : ");
		double b = scanner.nextInt();
		System.out.println("A+B = " + (a + b) + "\nA-B = " + (a - b) + "\nA*B = " + (a * b) + "\nA/B = " + (a / b)
				+ "\nA%B = " + (a % b));
	}

}
