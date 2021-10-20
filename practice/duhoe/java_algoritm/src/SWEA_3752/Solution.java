package SWEA_3752;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Solution {
    static int T, N, arr[], result;
    static  HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("./input_data/3752/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case < T+1; test_case++){
            set.clear();
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            set.add(0);

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++){
                int num = Integer.parseInt(st.nextToken());
                HashSet<Integer> temp = new HashSet<>(set);
                for (Integer j : temp){
                    set.add(j+num);
                }
            }

            result = set.size();

            System.out.println("#"+test_case+" "+result);
        }
    }
}
