package step3_For;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("테스트 케이스할 개수를 입력하세요");
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.print("A, B를 입력 : ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println("A+B=" + (a + b));
		}

	}

}
