package step1_IO;

import java.util.Scanner;

public class _7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 A 입력 : ");
		int a = scanner.nextInt();
		System.out.print("정수 B 입력 : ");
		int b = scanner.nextInt();
		System.out.println("A*B = " + (a * b));
	}

}
