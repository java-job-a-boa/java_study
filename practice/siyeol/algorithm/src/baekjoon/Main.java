package baekjoon;

import java.util.*;

public class Main {
// �ݺ������� Ǯ �� ���� ������...?
// ���� ���� sc�� �ҵ����ִ°� ŷ�޳� ��¥;
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
