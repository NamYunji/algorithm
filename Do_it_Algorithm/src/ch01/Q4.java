package ch01;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수 3개 입력");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	System.out.println("중앙값 : " + med(a, b, c));
	}
	
	
	static int med(int a, int b, int c) {
		//a >= b
		if(a >= b) {
			if( b >= c) return b;
			if( c >= a) return a;
			else return c;
		}
		
		//b > a
		else if (a > c) return a;
		//b > a
		else if (b > c) return c;
		//b > a
		else return b;
	}
}
