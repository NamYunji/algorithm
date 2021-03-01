package step5_array;

import java.util.Scanner;

public class _7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = null;
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			System.out.println();
			for (int j = 0; j < b; j++) {
				arr[j] = sc.nextInt();
				int sum = 0;
				sum += arr[j];
			}
		}
	}

}
