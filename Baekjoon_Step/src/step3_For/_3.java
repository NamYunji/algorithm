package step3_For;

import java.util.Scanner;

public class _3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = scanner.nextInt();
		int sum = 0;
		if (1 <= n && n <= 10_000) {
			for (int i = 1; i < n + 1; i++) {
				sum += i;
			}
			System.out.println(sum);

		} else
			System.out.println("1부터 10,000사이의 정수를 입력하세요.");
	}
}
