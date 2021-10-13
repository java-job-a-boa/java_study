package algorithm_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String st = br.readLine();
			int len = st.length();
			int[] arr = new int[len];
			int answer = 0;
			
			for(int j=0; j<len; j++) {
				char c = st.charAt(j);
				if(c=='O') {
					if(j==0) {
						arr[0] = 1;
						answer++;
					}else {
						arr[j] = arr[j-1]+1;
						answer += arr[j];
					}
				}
				else {
					arr[j] = 0;
				}
			}
			System.out.println(answer);
		}
		
		
	}
}
