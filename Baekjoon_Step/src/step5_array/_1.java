package step5_array;

import java.util.Scanner;

public class _1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 개수 입력 : ");
		int arr[] = new int[scanner.nextInt()];
		System.out.println("정수 입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) max = arr[j];
			if (arr[j] < min) min = arr[j];				
		}
		System.out.println("max : " + max + ", min : " + min);
	}
}
