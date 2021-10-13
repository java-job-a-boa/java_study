package algorithm_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine().strip();
		StringTokenizer stk = new StringTokenizer(st, " ");
		System.out.print(stk.countTokens());
	}
}
