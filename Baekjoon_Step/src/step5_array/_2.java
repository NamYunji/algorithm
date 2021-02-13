package step5_array;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//정수 9개를 입력받음
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("정수 입력 : ");
			arr[i] = scanner.nextInt();
		}
		
		int max = arr[0];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
		
	}

}
