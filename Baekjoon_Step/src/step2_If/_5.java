package step2_If;

import java.util.Scanner;

public class _5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간 입력 : ");
		int time = scanner.nextInt();
		if (0 <= time && 23 >= time) {
			System.out.print("분 입력 : ");
			int minute = scanner.nextInt();
			if (0 <= minute && 59 >= minute) {
				int totalM = time * 60 + minute;
				int minus45 = totalM - 45;
				int a = minus45 / 60;
				int b = minus45 % 60;
				System.out.println(a + " " + b);
			} else
				System.out.println("0부터 59사이의 분을 입력하세요");
		} else
			System.out.println("0부터 23사이의 시간을 입력하세요");
	}

}
