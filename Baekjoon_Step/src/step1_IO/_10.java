package step1_IO;

import java.util.Scanner;

public class _10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A 입력 : ");
		int a = scanner.nextInt();
		System.out.print("정수 B 입력 : ");
		int b = scanner.nextInt();
		System.out.print("정수 C 입력 : ");
		int c = scanner.nextInt();
		System.out.println("(A+B)%C = " + ((a + b) % c) + "\n((A%C) + (B%C))%C = " + ((a % c) + (b % c)) % c
				+ "\n(A×B)%C = " + (a * b) % c + "\n((A%C) × (B%C))%C = " + (((a % c) * (b % c)) % c));
	}

}
