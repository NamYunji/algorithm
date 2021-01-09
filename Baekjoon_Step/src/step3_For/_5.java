package step3_For;

import java.util.Scanner;

public class _5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int n = scanner.nextInt();
		if (n <= 100_000)
			for (int i = 1; i < n + 1; i++) {
				System.out.println(i);
			}
		else
			System.out.println("100,000이하의 수를 입력하세요");
	}

}
