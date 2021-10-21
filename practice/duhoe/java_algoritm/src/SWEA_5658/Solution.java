package SWEA_5658;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Solution {
    static int T, N, K;
    static String S;
    static char[] arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case < T + 1; test_case++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());


            S = br.readLine();
            arr = S.toCharArray();
            HashSet<String> set = new HashSet<>();
            for (int k = 0; k < N/4; k++){
                for (int i = 0; i < 4; i++){
                    String temp = "";
                    for (int j = 0; j < N/4; j++){
                        temp = temp + arr[(N/4)*i + j];
                    }
                    set.add(temp);
                }
                char temp_num = arr[0];
                for (int i = 0; i < N-1; i++){
                    arr[i] = arr[i+1];
                }
                arr[N-1] = temp_num;
            }
            int L = set.size();
            Integer[] result = new Integer[L];
            int x = 0;
            for (String s:set){
                result[x] = Integer.parseInt(s, 16);
                x++;
            }
            Arrays.sort(result, Collections.reverseOrder());

            System.out.println("#"+test_case+" "+result[K-1]);
        }
    }
}
