package step2_If;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-10,000부터 10,000사이의 정수 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if ((a > -10_000 && a < +10_000) && (b > -10_000 && b < +10_000)) {
			if (a > b)
				System.out.println(">");
			else if (a < b)
				System.out.println("<");
			else
				System.out.println("==");
		} else
			System.out.println("잘못입력하셨습니다. 범위를 다시 확인하세요.");

	}
}
