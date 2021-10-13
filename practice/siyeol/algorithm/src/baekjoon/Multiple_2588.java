package baekjoon;

import java.util.*;

public class Multiple_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; b < 1; i++) {
			System.out.println(a * (b % 10));
			b = b / 10;
		}
		
		
		
		

	}

}
