package step2_If;

import java.util.Scanner;

public class _4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x의 값 입력 : ");
		int x = scanner.nextInt();
		System.out.print("y의 값 입력 : ");
		int y = scanner.nextInt();
		if (x > 0 && y > 0)
			System.out.println("1");
		else if (x > 0 && y < 0)
			System.out.println("4");
		else if (x < 0 && y > 0)
			System.out.println("2");
		else if (x < 0 && y < 0)
			System.out.println("3");
	}

}
