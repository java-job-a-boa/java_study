package baekjoon;

import java.util.*;

public class Main {
// 반복문으로 풀 수 있지 않을까...?
// ㄹㅇ 저거 sc에 불들어와있는거 킹받네 진짜;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(b <= 1) {
			System.out.println(a * (b % 10));
			b = b / 10;
		}
		
		

	}

}
