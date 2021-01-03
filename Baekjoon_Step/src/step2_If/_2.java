package step2_If;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시험점수를 입력하세요 : ");
		int score = scanner.nextInt();
		if (score >= 90 && score <= 100)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");

	}

}
