package step4_while;

import java.util.Scanner;

public class _3 {
	
	public static void main(String[] args) {
	int n,i;
	int temp = 0;

	Scanner sc = new Scanner(System.in);
	System.out.print("정수입력 :");

	n = sc.nextInt();
	
	for(i=1;i<=n;i++) temp += i ;
	System.out.println(temp);
		
	}

}


