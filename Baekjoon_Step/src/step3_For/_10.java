package step3_For;

import java.util.Scanner;

public class _10 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("별의 개수를 입력하세요");
		int n = scanner.nextInt();
		if(n >= 1 && n <= 100)
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int j2 = 0; j2 < j ; j2++) {
						System.out.print(" ");
					}
				
				for (int j2 = 0; j2 < j; j2++) {
					System.out.println("*");
				}
				}
				System.out.println();
			}
		else
			System.out.println("1부터 100 사이의 개수를 입력하세요");
	}

}
