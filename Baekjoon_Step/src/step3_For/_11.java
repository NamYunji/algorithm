package step3_For;

import java.util.Scanner;

public class _11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("개수를 입력하세요");
		int n = scanner.nextInt();
		System.out.println("기준 숫자를 입력하세요");
		int x = scanner.nextInt();
		String count = " ";
		for (int i = 0; i < n; i++) {
			System.out.println("정수를 입력하세요");
			int y = scanner.nextInt();
			if (y < x) {
				count += y + " ";
			}
		}
		System.out.println(count);
	}
}