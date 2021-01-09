package step3_For;

import java.util.Scanner;

public class _6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int n = scanner.nextInt();
		if (n <= 100_000)
			for (int i = 0; i < n; i++) {
				System.out.println(n - i);
			}
		else
			System.out.println("100,000이하의 수를 입력하세요");
	}
}
