package step2_If;

import java.util.Scanner;

public class _3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = scanner.nextInt();
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			System.out.println("1");
		else
			System.out.println("0");
	}

}
