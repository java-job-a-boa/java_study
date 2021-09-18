package algorithm_0912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int n_3, n_4, n_5, n_6;
		n_3 = a * (b%10);
		n_4 = (a * (b%100) - n_3) / 10;
		n_5 = a * (b/100);
		n_6 = a * b;
		System.out.println(n_3);
		System.out.println(n_4);
		System.out.println(n_5);
		System.out.println(n_6);
	}
}
