package step3_For;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int dan = scanner.nextInt();
		if (dan >=1 && dan <=9)
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		else
			System.out.println("1부터 9까지의 수를 입력해주세요");
	}
	

}
