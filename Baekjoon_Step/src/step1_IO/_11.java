package step1_IO;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세 자리 자연수 A 입력 : ");
		int a = scanner.nextInt();
		System.out.print("세 자리 자연수 B 입력 : ");
		int b = scanner.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * (b / 10 % 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
}
