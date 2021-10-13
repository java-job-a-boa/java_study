package swea_2105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int N, mat[][];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case < T+1; test_case++){
            N = Integer.parseInt(br.readLine());
            mat = new int[N][N];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++){
                    mat[i][j] = Integer.parseInt(st.nextToken());
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
