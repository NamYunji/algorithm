package step3_For;

import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("테스트 케이스의 개수 입력 : ");
		int t = scanner.nextInt();
		for (int i = 1; i < t + 1; i++) {
			System.out.print("정수 A와 B 입력 : ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (0 < a && b < 10)
				System.out.println("Case #" + i + " : " + a + " + " + b + " = " + (a + b));
			else
				System.out.println("A는 0보다 크고, B는 10보다 작아야 합니다.");
		}
	}
}
