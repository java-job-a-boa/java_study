package swea_1954;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
    static boolean is_valid(int r, int c, int N, int[][] arr){
        return ((0 <= r) && (r < N) && (0 <= c ) && (c < N) && (arr[r][c] == 0));
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("./input_data/1954/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1; test_case < T+1; test_case++)
        {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            int i = 0;
            int j = -1;
            int direction = 0;
            int n = 1;

            while (n <= N*N){
                int ni = i + dy[direction];
                int nj = j + dx[direction];

                if (is_valid(ni, nj, N, arr)){
                    arr[ni][nj] = n;
                    i = ni;
                    j = nj;
                    n++;
                }
                else{
                    direction = (direction+1)%4;
                }
            }
            System.out.println("#"+test_case);
            for (int r = 0; r < N; r++){
                for (int c = 0; c < N; c++){
                    System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }
        }
    }
}
