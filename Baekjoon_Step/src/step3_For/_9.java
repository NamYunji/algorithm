package step3_For;

import java.util.Scanner;

public class _9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("별 개수 입력 : ");
		int n = scanner.nextInt();
		if (n >= 1 && n <= 100)
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	
		else
		System.out.println("별의 개수는 1부터 100 사이여야 합니다.");
		}
	}

